package de.seronet_projekt.xtend.ROS.generator.ext;

import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinition;
import org.eclipse.smartmdsd.xtend.smartsoft.generator.component.ComponentGeneratorExtension;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class ROSComponentGeneratorExtension implements ComponentGeneratorExtension {

	public static ComponentGeneratorExtension getInjectedExtensionImpl() {
		Injector injector = Guice.createInjector(new AbstractModule() {
			@Override
			protected void configure() {
				binder().bind(ComponentGeneratorExtension.class).to(ROSComponentGeneratorExtensionImpl.class);
			}
		});
		return injector.getInstance(ComponentGeneratorExtension.class);
	}
	
	private static ComponentGeneratorExtension impl = getInjectedExtensionImpl();
	
	@Override
	public String getExtensionName(ComponentDefinition component) {
		return impl.getExtensionName(component);
	}

	@Override
	public CharSequence getCMakeIncludes(ComponentDefinition component) {
		return impl.getCMakeIncludes(component);
	}

	@Override
	public CharSequence getCMakeTargetConfiguration(ComponentDefinition component) {
		return impl.getCMakeTargetConfiguration(component);
	}
	
	@Override
	public CharSequence getHeaderIncludes(ComponentDefinition component) {
		return impl.getHeaderIncludes(component);
	}
	
	@Override
	public CharSequence getClassMemberDefinition(ComponentDefinition component) {
		return impl.getClassMemberDefinition(component);
	}
	
	@Override
	public CharSequence getClassMemberConstruction(ComponentDefinition component) {
		return impl.getClassMemberConstruction(component);
	}
}
