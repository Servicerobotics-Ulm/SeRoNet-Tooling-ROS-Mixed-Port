package de.seronet_projekt.xtend.ROS.generator

import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinition
import com.google.inject.Inject

class ROS_package {
	@Inject extension MixedPortROSGenHelpers;
	
	def compileRosPackage(ComponentDefinition comp) 
	'''
	<package format="2">
	  <name>ros_«comp.name.toLowerCase»</name>
	  <version>0.0.0</version>
	  <description>The ros_«comp.name.toLowerCase» package</description>

	  <license>Apache 2.0</license>

	  <!-- <url type="website">http://wiki.ros.org/system_test</url> -->

	  <maintainer email="jane.doe@example.com">Jane Doe</maintainer>
	  <author email="jane.doe@example.com">Jane Doe</author>
	

	  <buildtool_depend>catkin</buildtool_depend>
	  <depend>roscpp</depend>
	  «FOR pack: comp.allPackageStrings»
	  <depend>«pack»</depend>
	  «ENDFOR»

	</package>
	'''
}