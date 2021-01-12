# SeRoNet-Tooling-ROS-Mixed-Port

<a id="top"/> 

[![License](https://img.shields.io/badge/License-BSD%203--Clause-blue.svg)](https://opensource.org/licenses/BSD-3-Clause)
[![Build](https://travis-ci.org/seronet-project/SeRoNet-Tooling-ROS-Mixed-Port.svg?branch=master)](https://travis-ci.org/github/seronet-project/SeRoNet-Tooling-ROS-Mixed-Port) 

This repository holds the implementation of the SeRoNet ROS-Mixed-Port component as part of the the SeRoNet Tooling, its eclipse facilities, and related examples. 

The SeRoNet Tooling is developed by the SeRoNet Project consortium: http://www.seronet-projekt.de

The ROS Mixed-Port Component is developed by:
* Service Robotics Research Center of Ulm University of Applied Sciences
* Fraunhofer Institute for Manufacturing Engineering and Automation IPA

**CAUTION: This software is a preview for the purpose of technology demonstration. It is experimental and comes with no support. Use at your own risk.**


The implementation of the SeRoNet ROS-Mixed-Port component is realized as a Domain-Specific Language (DSL):

- **RosInterfacesPool**: This is a stand-alone DSL that defines a pool of ROS interface specifications that is used to select the ROS-related communication interfaces of a SeRoNet Mixed-Port component.

Technical Maintainer: [**ipa-nhg**](https://github.com/ipa-nhg/) (**Nadia Hammoudeh Garcia**, **Fraunhofer IPA**) and [**alex-lotz**](https://github.com/alex-lotz) (**Alex Lotz**, **Technische Hochschule Ulm (THU)**)

## Minimal System Requirements

For building the java sources **Maven** and **Java 11** are required as a minimum. Moreover, the download script (see below) uses the "wget" tool. All these tools can be installed in Ubuntu with a terminal like this:

```sh
sudo apt install maven wget openjdk-11-jdk
```

Please make sure that java 11 is set as the default version in case you have installed multiple versions in parallel.

## Installation Instructions

The sources in this repository can be built headless using **Maven** and **Java 11**. To build the sources a standard maven command can be used from within the root directory of this repository:

```sh
$ mvn clean verify
```

The maven script internally uses three external Eclipse repository sources:

* [Eclipse Modeling Tools (2020-09)](https://download.eclipse.org/releases/2020-09)
* [Eclipse SmartMDSD Toolchain (2020-09)](https://download.eclipse.org/smartmdsd/updates/nightly/v3.x/2020-09)
* [IPA-ROS tools (latest)](http://ros-model.seronet-project.de/updatesite/latest)

If you want to open the plugin sources from this repository in Eclipse for modification, the repository offers a useful **bash script** that downloads the right Eclipse version and automatically installs all required Eclipse plugins. The script can be called like this (from the root path of this repository):

```sh
$ ./scripts/download-SeRoNet-dev.sh /tmp
```

You can change the argument "/tmp" to any other target location where the eclipse has to be downloaded to. After download, simply start the new eclipse instance, select a workspace and import all plugins from this repository. Please notice, the bash script will automatically download "**Eclipse Modeling Tools 2020-09**" (this is the currently supported version).



## Useful Links

The Eclipse plugins in this repository are part of the SeRoNet Tooling and are not supposed to be used stand-alone.
* A tutorial how to use the Mixed-Port-Component can be found here: [Development of a Mixed-Port-Component](https://wiki.servicerobotik-ulm.de/tutorials:ros:mixed-port-component-ros)

* A tutorial how to use the transformed ROS Messages and Services to SeRoNet Communication objects automatically can be found here: [Automatic Transformation of Communication Objects](de.seronet_projekt.ros.componentGateway.generator/README.md)

* Parts of this work have been created in research and development projects funded within the scope of the “PAiCE Digitale Technologien für die Wirtschaft” technology programme run by the Federal Ministry for Economic Affairs and Energy in Germany and is managed by the DLR project management agency „Gesellschaft, Innovation, Technologie - Informationstechnologien/Elektromobilität“ at the German Aerospace Center in Cologne. The authors of this work are solely responsible for the content of this work.*

<a href="#top">top</a>


