/*
 * generated by Xtext 2.16.0
 */
package de.seronet_projekt.ros.interfaces.pool.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import de.seronet_projekt.ros.interfaces.pool.ide.contentassist.antlr.internal.InternalRosInterfacesPoolParser;
import de.seronet_projekt.ros.interfaces.pool.services.RosInterfacesPoolGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class RosInterfacesPoolParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(RosInterfacesPoolGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, RosInterfacesPoolGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getRosInterfaceAccess().getAlternatives(), "rule__RosInterface__Alternatives");
			builder.put(grammarAccess.getRosTopicAccess().getAlternatives(), "rule__RosTopic__Alternatives");
			builder.put(grammarAccess.getRosServiceAccess().getAlternatives(), "rule__RosService__Alternatives");
			builder.put(grammarAccess.getRosActionAccess().getAlternatives(), "rule__RosAction__Alternatives");
			builder.put(grammarAccess.getRosInterfacesPoolAccess().getGroup(), "rule__RosInterfacesPool__Group__0");
			builder.put(grammarAccess.getRosPublisherAccess().getGroup(), "rule__RosPublisher__Group__0");
			builder.put(grammarAccess.getRosSubscriberAccess().getGroup(), "rule__RosSubscriber__Group__0");
			builder.put(grammarAccess.getRosSrvServerAccess().getGroup(), "rule__RosSrvServer__Group__0");
			builder.put(grammarAccess.getRosSrvClientAccess().getGroup(), "rule__RosSrvClient__Group__0");
			builder.put(grammarAccess.getRosActionServerAccess().getGroup(), "rule__RosActionServer__Group__0");
			builder.put(grammarAccess.getRosActionClientAccess().getGroup(), "rule__RosActionClient__Group__0");
			builder.put(grammarAccess.getRosInterfacesPoolAccess().getInterfacesAssignment_3(), "rule__RosInterfacesPool__InterfacesAssignment_3");
			builder.put(grammarAccess.getRosPublisherAccess().getNameAssignment_1(), "rule__RosPublisher__NameAssignment_1");
			builder.put(grammarAccess.getRosPublisherAccess().getTopicNameAssignment_4(), "rule__RosPublisher__TopicNameAssignment_4");
			builder.put(grammarAccess.getRosPublisherAccess().getTypeAssignment_6(), "rule__RosPublisher__TypeAssignment_6");
			builder.put(grammarAccess.getRosSubscriberAccess().getNameAssignment_1(), "rule__RosSubscriber__NameAssignment_1");
			builder.put(grammarAccess.getRosSubscriberAccess().getTopicNameAssignment_4(), "rule__RosSubscriber__TopicNameAssignment_4");
			builder.put(grammarAccess.getRosSubscriberAccess().getTypeAssignment_6(), "rule__RosSubscriber__TypeAssignment_6");
			builder.put(grammarAccess.getRosSrvServerAccess().getNameAssignment_1(), "rule__RosSrvServer__NameAssignment_1");
			builder.put(grammarAccess.getRosSrvServerAccess().getSrvNameAssignment_4(), "rule__RosSrvServer__SrvNameAssignment_4");
			builder.put(grammarAccess.getRosSrvServerAccess().getTypeAssignment_6(), "rule__RosSrvServer__TypeAssignment_6");
			builder.put(grammarAccess.getRosSrvClientAccess().getNameAssignment_1(), "rule__RosSrvClient__NameAssignment_1");
			builder.put(grammarAccess.getRosSrvClientAccess().getSrvNameAssignment_4(), "rule__RosSrvClient__SrvNameAssignment_4");
			builder.put(grammarAccess.getRosSrvClientAccess().getTypeAssignment_6(), "rule__RosSrvClient__TypeAssignment_6");
			builder.put(grammarAccess.getRosActionServerAccess().getNameAssignment_1(), "rule__RosActionServer__NameAssignment_1");
			builder.put(grammarAccess.getRosActionServerAccess().getActionNameAssignment_4(), "rule__RosActionServer__ActionNameAssignment_4");
			builder.put(grammarAccess.getRosActionServerAccess().getTypeAssignment_6(), "rule__RosActionServer__TypeAssignment_6");
			builder.put(grammarAccess.getRosActionClientAccess().getNameAssignment_1(), "rule__RosActionClient__NameAssignment_1");
			builder.put(grammarAccess.getRosActionClientAccess().getActionNameAssignment_4(), "rule__RosActionClient__ActionNameAssignment_4");
			builder.put(grammarAccess.getRosActionClientAccess().getTypeAssignment_6(), "rule__RosActionClient__TypeAssignment_6");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private RosInterfacesPoolGrammarAccess grammarAccess;

	@Override
	protected InternalRosInterfacesPoolParser createParser() {
		InternalRosInterfacesPoolParser result = new InternalRosInterfacesPoolParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public RosInterfacesPoolGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RosInterfacesPoolGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
