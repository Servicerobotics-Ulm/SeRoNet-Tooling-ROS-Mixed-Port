package de.seronet_projekt.xtend.ROS.generator

import com.google.inject.Inject
import rosInterfacesPool.RosSrvClient
import rosInterfacesPool.RosPublisher
import rosInterfacesPool.RosSubscriber
import rosInterfacesPool.RosSrvServer
import org.eclipse.smartmdsd.ecore.component.seronetExtension.MixedPortROS
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinition
import rosInterfacesPool.RosActionClient
import rosInterfacesPool.RosActionServer

class ROS_main {
	@Inject extension CopyrightHelpers;
	@Inject extension MixedPortROSGenHelpers;
	
	def getRosMainFilename(ComponentDefinition comp) { comp.name+".cpp" }
	
	def compileRosMain(ComponentDefinition comp) 
	'''
		«copyright»
		
		#include <ros/ros.h>
		«IF comp.hasActionClients»
		#include <actionlib/client/simple_action_client.h>
		«ENDIF»
		«IF comp.hasActionServers»
		#include <actionlib/server/simple_action_server.h>
		«ENDIF»
		«FOR port: comp.allROSPorts»
		#include <«port.packageString»/«port.messageString».h>
		«ENDFOR»
		
		«FOR srvClient: comp.allROSPorts.filter[it.port instanceof RosSrvServer]»
			bool  «srvClient.name»_cb («srvClient.packageString»::«srvClient.messageString»::Request &req, «srvClient.packageString»::«srvClient.messageString»::Response &res){
			  return true;
			}
			
		«ENDFOR»
		
		«FOR pub: comp.allROSPorts.filter[it.port instanceof RosSubscriber]»
			void  «pub.name»_cb (const «pub.packageString»::«pub.messageString»::ConstPtr &msg) {
				
			}
			
		«ENDFOR»
		
		int main(int argc, char **argv)
		{
			ros::init(argc, argv, "ros_gateway");
			ros::NodeHandle n;
			
			«FOR port: comp.allROSPorts»
				«port.compilePortSelection»
			«ENDFOR»
			
			ros::spin();
		
			return 0;
		}
	'''
	
	def compilePortSelection(MixedPortROS mrp) {
		val port = mrp.port
		switch (port) {
			RosPublisher: '''ros::Publisher «port.name»_pub = n.advertise<«mrp.packageString»::«mrp.messageString»>("«port.topicName»", 10);'''
			RosSubscriber: '''ros::Subscriber «port.name»_sub = n.subscribe("«port.topicName»", 10, «mrp.name»_cb);'''
			RosSrvClient: '''ros::ServiceClient «port.name» = n.serviceClient<«mrp.packageString»::«mrp.messageString»>("«port.srvName»");'''
			RosSrvServer: '''ros::ServiceServer «port.name» = n.advertiseService("«port.srvName»", «port.name»_cb);'''
			RosActionClient: '''actionlib::SimpleActionClient<«mrp.packageString»::«mrp.messageString»> «port.name»_client(n, "«port.name»", true);'''
			RosActionServer: '''actionlib::SimpleActionServer<«mrp.packageString»::«mrp.messageString»> «port.name»_server(n, "«port.name»", false);'''
		}
	}
}