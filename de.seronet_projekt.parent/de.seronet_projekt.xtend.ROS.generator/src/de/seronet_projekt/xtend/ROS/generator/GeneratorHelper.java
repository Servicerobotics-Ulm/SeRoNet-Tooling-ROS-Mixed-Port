//--------------------------------------------------------------------------
//
//  Copyright (C) 2018 Alex Lotz, Dennis Stampfer, Matthias Lutz
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
//
//        Servicerobotics Ulm
//        Christian Schlegel
//        University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//  This file is part of the SmartSoft MDSD Toolchain. 
//
// Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
//
// 1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
// 
// 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the 
//    documentation and/or other materials provided with the distribution.
// 
// 3. Neither the name of the copyright holder nor the names of its contributors may be used to endorse or promote products derived from this 
//    software without specific prior written permission.
// 
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, 
// THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS 
// BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF 
// SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN 
// CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
// POSSIBILITY OF SUCH DAMAGE.
//
//--------------------------------------------------------------------------

package de.seronet_projekt.xtend.ROS.generator;

import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.mwe.utils.DirectoryCleaner;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.generator.OutputConfiguration;

import com.google.inject.Injector;

public class GeneratorHelper {
	private final IProject project;
	private Injector injector;
	
	public GeneratorHelper(Injector injector, Resource resource) {
		this.injector = injector;
		project = getCurrentProjectFrom(resource);
	}
	
	public static IProject getCurrentProjectFrom(Resource resource) {
		return ResourcesPlugin.getWorkspace().getRoot().getProject(resource.getURI().segment(1));
	}
	
	public void createFolder(String outputConfigName) {
		createFolder(outputConfigName, injector, project);
	}
	
	public static void createFolder(String outputConfigName, Injector specificInjector, IProject specificProject) {
		OutputConfiguration config = getOutputConfiguration(outputConfigName, specificInjector);
		if(config != null) {
			String folderStr = config.getOutputDirectory();
			IFolder ifolder = specificProject.getFolder(folderStr);
			// create folder if it does not yet exist
			try {
				IProgressMonitor monitor = new NullProgressMonitor();
				if(!ifolder.exists()) {
					ifolder.create(true, true, monitor);
				}
				ifolder.setDerived(config.isSetDerivedProperty(), monitor);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void deleteFolder(String outputConfigName) {
		deleteFolder(outputConfigName, injector, project);
	}
	
	public static void deleteFolder(String outputConfigName, Injector specificInjector, IProject specificProject) {
		OutputConfiguration config = getOutputConfiguration(outputConfigName, specificInjector);
		if(config != null) {
			String folderStr = config.getOutputDirectory();
			IFolder ifolder = specificProject.getFolder(folderStr);
			// create folder if it does not yet exist
			try {
				IProgressMonitor monitor = new NullProgressMonitor();
				if(ifolder.exists()) {
					ifolder.delete(true, monitor);
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void invokeDirectoryCleaner() {
		invokeDirectoryCleaner(injector, project);
	}
	public static void invokeDirectoryCleaner(Injector specificInjector, IProject specificProject) {
		invokeDirectoryCleaner(IFileSystemAccess2.DEFAULT_OUTPUT, Collections.<String> emptyList(), specificInjector, specificProject);
	}
	public void invokeDirectoryCleaner(String outputConfigName) {
		invokeDirectoryCleaner(outputConfigName, injector, project);
	}
	public static void invokeDirectoryCleaner(String outputConfigName, Injector specificInjector, IProject specificProject) {
		invokeDirectoryCleaner(outputConfigName, Collections.<String> emptyList(), specificInjector, specificProject);
	}
	
	public void invokeDirectoryCleaner(String outputConfigName, Collection<String> excludes) {
		invokeDirectoryCleaner(outputConfigName, excludes, injector, project);
	}
	public static void invokeDirectoryCleaner(String outputConfigName, Collection<String> excludes, Injector specificInjector, IProject specificProject) {
		// create a new directory cleaner
		DirectoryCleaner directoryCleaner = new DirectoryCleaner();
		
		// add items to be excluded
		for(String exclude: excludes) {
			directoryCleaner.addExclude(exclude);
		}
		
		OutputConfiguration config = getOutputConfiguration(outputConfigName, specificInjector);
		if(config!= null) {
			// get project folder
			IFolder genFolder = specificProject.getFolder(config.getOutputDirectory());
			
			// create folder if it does not yet exist
			try {
				IProgressMonitor monitor = new NullProgressMonitor();
				if(!genFolder.exists()) {
					genFolder.create(true, true, monitor);
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
			
			// execute directory cleaner
			try {
				//System.out.println("Clean directory: "+genFolder.getLocation().toString());
				directoryCleaner.cleanFolder(genFolder.getLocation().toString());
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
	
	public IFileSystemAccess2 getConfiguredFileSystemAccess() {
		return getConfiguredFileSystemAccess(injector);
	}
	
	public IFileSystemAccess2 getConfiguredFileSystemAccess(Injector specificInjector) {
		return getConfiguredFileSystemAccess(specificInjector, project);
	}
	
	public static IFileSystemAccess2 getConfiguredFileSystemAccess(Injector specificInjector, IProject specificProject) {
		JavaIoFileSystemAccess fsa = specificInjector.getInstance(JavaIoFileSystemAccess.class);
		IOutputConfigurationProvider outCP = specificInjector.getInstance(IOutputConfigurationProvider.class);
		
		Set<OutputConfiguration> configs = outCP.getOutputConfigurations();
		
		Map<String, OutputConfiguration> outputs = new HashMap<String, OutputConfiguration>();
		for(OutputConfiguration c: configs) {
			outputs.put(c.getName(), c);
		}
		fsa.setOutputConfigurations(outputs);
		
		// set-up absolute paths for each configuration
		for(OutputConfiguration config: configs) {
			if(config.getName().equals(ExtendedOutputConfigurationProvider.PROJECT_ROOT_FOLDER)) {
				fsa.setOutputPath(config.getName(), specificProject.getLocation().toString());
			} else {
				String outputDirectory = config.getOutputDirectory();
				IFolder f = specificProject.getFolder(outputDirectory);	
				fsa.setOutputPath(config.getName(), f.getLocation().toString());
			}
		}
		
		return fsa;
	}
	
	public void refreshFolder(String outputConfigName, int depth) {
		refreshFolder(outputConfigName, depth, injector, project);
	}
	
	public static void refreshFolder(String outputConfigName, int depth, Injector specificInjector, IProject specificProject) {
		OutputConfiguration config = getOutputConfiguration(outputConfigName, specificInjector);
		if(config!= null) {
			try {
				// refresh src-gen folder to reflect generation changes
				IProgressMonitor monitor = new NullProgressMonitor();
				if(config.getName().equals(ExtendedOutputConfigurationProvider.PROJECT_ROOT_FOLDER)) {
					specificProject.refreshLocal(2, monitor);
				} else {
					specificProject.getFolder(config.getOutputDirectory()).refreshLocal(2, monitor);
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}
	
	public OutputConfiguration getOutputConfiguration(String outputConfigName) {
		return getOutputConfiguration(outputConfigName, injector);
	}
	
	public static OutputConfiguration getOutputConfiguration(String outputConfigName, Injector specificInjector) {
		IOutputConfigurationProvider outCP = specificInjector.getInstance(IOutputConfigurationProvider.class);
		Set<OutputConfiguration> configs = outCP.getOutputConfigurations();
		for(OutputConfiguration config: configs) {
			if(config.getName().equals(outputConfigName)) {
				return config;
			}
		}
		return null;
	}
}
