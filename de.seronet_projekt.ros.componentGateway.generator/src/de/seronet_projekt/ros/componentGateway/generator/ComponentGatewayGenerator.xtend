package de.seronet_projekt.ros.componentGateway.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import componentInterface.ComponentInterface
import org.eclipse.xtext.generator.IOutputConfigurationProvider
import org.eclipse.xtext.generator.OutputConfiguration
import java.util.Set

class CustomOutputProvider implements IOutputConfigurationProvider {
	public final static String SERONET_OUTPUT = "SERONET_OUTPUT"
	
	override Set<OutputConfiguration> getOutputConfigurations() {
		var OutputConfiguration seronet_config = new OutputConfiguration(SERONET_OUTPUT)
		seronet_config.setDescription("SERONET_OUTPUT");
		seronet_config.setOutputDirectory("./src-gen/SeRoNetComponent/");
		seronet_config.setOverrideExistingResources(true);
		seronet_config.setCreateOutputDirectory(true);
		seronet_config.setCleanUpDerivedResources(true);
		seronet_config.setSetDerivedProperty(true);
		return newHashSet(seronet_config)
	}
}

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class ComponentGatewayGenerator extends AbstractGenerator {

 	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (componentinterface : resource.allContents.toIterable.filter(ComponentInterface)){
				fsa.generateFile(componentinterface.name+".gateway.rosinterfacespool",CustomOutputProvider::SERONET_OUTPUT,componentinterface.compile)
		}
	}
		
	def compile (ComponentInterface componentinterface)
	'''
RosInterfacesPool {
	«FOR pub:componentinterface.rospublisher»
	RosSubscriber «checkname(pub.name)»_sub { topicName "«pub.name»" type "«pub.publisher.message.package.name».«pub.publisher.message.name»" }
	«ENDFOR»
	«FOR sub:componentinterface.rossubscriber»
	RosPublisher «checkname(sub.name)»_pub { topicName "«sub.name»" type "«sub.subscriber.message.package.name».«sub.subscriber.message.name»" }
	«ENDFOR»
	«FOR srvserver:componentinterface.rosserviceserver»
	RosSrvClient «checkname(srvserver.name)»_srvcli { srvName "«srvserver.name»" type "«srvserver.srvserver.service.package.name».«srvserver.srvserver.service.name»" }
	«ENDFOR»
	«FOR srvclient:componentinterface.rosserviceclient»
	RosSrvServer «checkname(srvclient.name)»_srvser { srvName "«srvclient.name»" type "«srvclient.srvclient.service.package.name».«srvclient.srvclient.service.name»" }
	«ENDFOR»
	«FOR actionserver:componentinterface.rosactionserver»
	RosActionClient «checkname(actionserver.name)»_actcli { actionName "«actionserver.name»" type "«actionserver.actserver.action.package.name».«actionserver.actserver.action.name»" }
	«ENDFOR»
	«FOR actionclient:componentinterface.rosactionclient»
	RosActionServer «checkname(actionclient.name)»_actser { actionName "«actionclient.name»" type "«actionclient.actclient.action.package.name».«actionclient.actclient.action.name»" }
	«ENDFOR»
}
	'''


def String checkname(String name){
	if (name.contains("/"))
		return name.replace("/","_")
	else
		return name
}	
}
