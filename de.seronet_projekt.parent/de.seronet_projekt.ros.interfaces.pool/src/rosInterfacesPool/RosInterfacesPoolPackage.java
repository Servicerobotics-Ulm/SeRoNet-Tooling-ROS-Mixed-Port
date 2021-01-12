/**
 */
package rosInterfacesPool;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.smartmdsd.ecore.base.mixedport.MixedportPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see rosInterfacesPool.RosInterfacesPoolFactory
 * @model kind="package"
 * @generated
 */
public interface RosInterfacesPoolPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rosInterfacesPool";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.seronet-projekt.de/rosInterfacesPool";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rosInterfacesPool";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RosInterfacesPoolPackage eINSTANCE = rosInterfacesPool.impl.RosInterfacesPoolPackageImpl.init();

	/**
	 * The meta object id for the '{@link rosInterfacesPool.impl.RosInterfacesPoolImpl <em>Ros Interfaces Pool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rosInterfacesPool.impl.RosInterfacesPoolImpl
	 * @see rosInterfacesPool.impl.RosInterfacesPoolPackageImpl#getRosInterfacesPool()
	 * @generated
	 */
	int ROS_INTERFACES_POOL = 0;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_INTERFACES_POOL__INTERFACES = 0;

	/**
	 * The number of structural features of the '<em>Ros Interfaces Pool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_INTERFACES_POOL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Ros Interfaces Pool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_INTERFACES_POOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rosInterfacesPool.impl.RosInterfaceImpl <em>Ros Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rosInterfacesPool.impl.RosInterfaceImpl
	 * @see rosInterfacesPool.impl.RosInterfacesPoolPackageImpl#getRosInterface()
	 * @generated
	 */
	int ROS_INTERFACE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_INTERFACE__NAME = MixedportPackage.MIXED_PORT_ROS_BASE__NAME;

	/**
	 * The number of structural features of the '<em>Ros Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_INTERFACE_FEATURE_COUNT = MixedportPackage.MIXED_PORT_ROS_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ros Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_INTERFACE_OPERATION_COUNT = MixedportPackage.MIXED_PORT_ROS_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rosInterfacesPool.impl.RosTopicImpl <em>Ros Topic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rosInterfacesPool.impl.RosTopicImpl
	 * @see rosInterfacesPool.impl.RosInterfacesPoolPackageImpl#getRosTopic()
	 * @generated
	 */
	int ROS_TOPIC = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_TOPIC__NAME = ROS_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Topic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_TOPIC__TOPIC_NAME = ROS_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_TOPIC__TYPE = ROS_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ros Topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_TOPIC_FEATURE_COUNT = ROS_INTERFACE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ros Topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_TOPIC_OPERATION_COUNT = ROS_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rosInterfacesPool.impl.RosServiceImpl <em>Ros Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rosInterfacesPool.impl.RosServiceImpl
	 * @see rosInterfacesPool.impl.RosInterfacesPoolPackageImpl#getRosService()
	 * @generated
	 */
	int ROS_SERVICE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE__NAME = ROS_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Srv Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE__SRV_NAME = ROS_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE__TYPE = ROS_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ros Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_FEATURE_COUNT = ROS_INTERFACE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ros Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_OPERATION_COUNT = ROS_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rosInterfacesPool.impl.RosPublisherImpl <em>Ros Publisher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rosInterfacesPool.impl.RosPublisherImpl
	 * @see rosInterfacesPool.impl.RosInterfacesPoolPackageImpl#getRosPublisher()
	 * @generated
	 */
	int ROS_PUBLISHER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PUBLISHER__NAME = ROS_TOPIC__NAME;

	/**
	 * The feature id for the '<em><b>Topic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PUBLISHER__TOPIC_NAME = ROS_TOPIC__TOPIC_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PUBLISHER__TYPE = ROS_TOPIC__TYPE;

	/**
	 * The number of structural features of the '<em>Ros Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PUBLISHER_FEATURE_COUNT = ROS_TOPIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ros Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PUBLISHER_OPERATION_COUNT = ROS_TOPIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rosInterfacesPool.impl.RosSubscriberImpl <em>Ros Subscriber</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rosInterfacesPool.impl.RosSubscriberImpl
	 * @see rosInterfacesPool.impl.RosInterfacesPoolPackageImpl#getRosSubscriber()
	 * @generated
	 */
	int ROS_SUBSCRIBER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SUBSCRIBER__NAME = ROS_TOPIC__NAME;

	/**
	 * The feature id for the '<em><b>Topic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SUBSCRIBER__TOPIC_NAME = ROS_TOPIC__TOPIC_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SUBSCRIBER__TYPE = ROS_TOPIC__TYPE;

	/**
	 * The number of structural features of the '<em>Ros Subscriber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SUBSCRIBER_FEATURE_COUNT = ROS_TOPIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ros Subscriber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SUBSCRIBER_OPERATION_COUNT = ROS_TOPIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rosInterfacesPool.impl.RosSrvServerImpl <em>Ros Srv Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rosInterfacesPool.impl.RosSrvServerImpl
	 * @see rosInterfacesPool.impl.RosInterfacesPoolPackageImpl#getRosSrvServer()
	 * @generated
	 */
	int ROS_SRV_SERVER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SRV_SERVER__NAME = ROS_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Srv Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SRV_SERVER__SRV_NAME = ROS_SERVICE__SRV_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SRV_SERVER__TYPE = ROS_SERVICE__TYPE;

	/**
	 * The number of structural features of the '<em>Ros Srv Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SRV_SERVER_FEATURE_COUNT = ROS_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ros Srv Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SRV_SERVER_OPERATION_COUNT = ROS_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rosInterfacesPool.impl.RosSrvClientImpl <em>Ros Srv Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rosInterfacesPool.impl.RosSrvClientImpl
	 * @see rosInterfacesPool.impl.RosInterfacesPoolPackageImpl#getRosSrvClient()
	 * @generated
	 */
	int ROS_SRV_CLIENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SRV_CLIENT__NAME = ROS_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Srv Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SRV_CLIENT__SRV_NAME = ROS_SERVICE__SRV_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SRV_CLIENT__TYPE = ROS_SERVICE__TYPE;

	/**
	 * The number of structural features of the '<em>Ros Srv Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SRV_CLIENT_FEATURE_COUNT = ROS_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ros Srv Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SRV_CLIENT_OPERATION_COUNT = ROS_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rosInterfacesPool.impl.RosActionImpl <em>Ros Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rosInterfacesPool.impl.RosActionImpl
	 * @see rosInterfacesPool.impl.RosInterfacesPoolPackageImpl#getRosAction()
	 * @generated
	 */
	int ROS_ACTION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_ACTION__NAME = ROS_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_ACTION__ACTION_NAME = ROS_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_ACTION__TYPE = ROS_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ros Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_ACTION_FEATURE_COUNT = ROS_INTERFACE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ros Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_ACTION_OPERATION_COUNT = ROS_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rosInterfacesPool.impl.RosActionServerImpl <em>Ros Action Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rosInterfacesPool.impl.RosActionServerImpl
	 * @see rosInterfacesPool.impl.RosInterfacesPoolPackageImpl#getRosActionServer()
	 * @generated
	 */
	int ROS_ACTION_SERVER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_ACTION_SERVER__NAME = ROS_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_ACTION_SERVER__ACTION_NAME = ROS_ACTION__ACTION_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_ACTION_SERVER__TYPE = ROS_ACTION__TYPE;

	/**
	 * The number of structural features of the '<em>Ros Action Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_ACTION_SERVER_FEATURE_COUNT = ROS_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ros Action Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_ACTION_SERVER_OPERATION_COUNT = ROS_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rosInterfacesPool.impl.RosActionClientImpl <em>Ros Action Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rosInterfacesPool.impl.RosActionClientImpl
	 * @see rosInterfacesPool.impl.RosInterfacesPoolPackageImpl#getRosActionClient()
	 * @generated
	 */
	int ROS_ACTION_CLIENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_ACTION_CLIENT__NAME = ROS_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_ACTION_CLIENT__ACTION_NAME = ROS_ACTION__ACTION_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_ACTION_CLIENT__TYPE = ROS_ACTION__TYPE;

	/**
	 * The number of structural features of the '<em>Ros Action Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_ACTION_CLIENT_FEATURE_COUNT = ROS_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ros Action Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_ACTION_CLIENT_OPERATION_COUNT = ROS_ACTION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link rosInterfacesPool.RosInterfacesPool <em>Ros Interfaces Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ros Interfaces Pool</em>'.
	 * @see rosInterfacesPool.RosInterfacesPool
	 * @generated
	 */
	EClass getRosInterfacesPool();

	/**
	 * Returns the meta object for the containment reference list '{@link rosInterfacesPool.RosInterfacesPool#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaces</em>'.
	 * @see rosInterfacesPool.RosInterfacesPool#getInterfaces()
	 * @see #getRosInterfacesPool()
	 * @generated
	 */
	EReference getRosInterfacesPool_Interfaces();

	/**
	 * Returns the meta object for class '{@link rosInterfacesPool.RosTopic <em>Ros Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ros Topic</em>'.
	 * @see rosInterfacesPool.RosTopic
	 * @generated
	 */
	EClass getRosTopic();

	/**
	 * Returns the meta object for the attribute '{@link rosInterfacesPool.RosTopic#getTopicName <em>Topic Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic Name</em>'.
	 * @see rosInterfacesPool.RosTopic#getTopicName()
	 * @see #getRosTopic()
	 * @generated
	 */
	EAttribute getRosTopic_TopicName();

	/**
	 * Returns the meta object for the attribute '{@link rosInterfacesPool.RosTopic#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see rosInterfacesPool.RosTopic#getType()
	 * @see #getRosTopic()
	 * @generated
	 */
	EAttribute getRosTopic_Type();

	/**
	 * Returns the meta object for class '{@link rosInterfacesPool.RosService <em>Ros Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ros Service</em>'.
	 * @see rosInterfacesPool.RosService
	 * @generated
	 */
	EClass getRosService();

	/**
	 * Returns the meta object for the attribute '{@link rosInterfacesPool.RosService#getSrvName <em>Srv Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Srv Name</em>'.
	 * @see rosInterfacesPool.RosService#getSrvName()
	 * @see #getRosService()
	 * @generated
	 */
	EAttribute getRosService_SrvName();

	/**
	 * Returns the meta object for the attribute '{@link rosInterfacesPool.RosService#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see rosInterfacesPool.RosService#getType()
	 * @see #getRosService()
	 * @generated
	 */
	EAttribute getRosService_Type();

	/**
	 * Returns the meta object for class '{@link rosInterfacesPool.RosPublisher <em>Ros Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ros Publisher</em>'.
	 * @see rosInterfacesPool.RosPublisher
	 * @generated
	 */
	EClass getRosPublisher();

	/**
	 * Returns the meta object for class '{@link rosInterfacesPool.RosSubscriber <em>Ros Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ros Subscriber</em>'.
	 * @see rosInterfacesPool.RosSubscriber
	 * @generated
	 */
	EClass getRosSubscriber();

	/**
	 * Returns the meta object for class '{@link rosInterfacesPool.RosSrvServer <em>Ros Srv Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ros Srv Server</em>'.
	 * @see rosInterfacesPool.RosSrvServer
	 * @generated
	 */
	EClass getRosSrvServer();

	/**
	 * Returns the meta object for class '{@link rosInterfacesPool.RosSrvClient <em>Ros Srv Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ros Srv Client</em>'.
	 * @see rosInterfacesPool.RosSrvClient
	 * @generated
	 */
	EClass getRosSrvClient();

	/**
	 * Returns the meta object for class '{@link rosInterfacesPool.RosInterface <em>Ros Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ros Interface</em>'.
	 * @see rosInterfacesPool.RosInterface
	 * @generated
	 */
	EClass getRosInterface();

	/**
	 * Returns the meta object for class '{@link rosInterfacesPool.RosActionServer <em>Ros Action Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ros Action Server</em>'.
	 * @see rosInterfacesPool.RosActionServer
	 * @generated
	 */
	EClass getRosActionServer();

	/**
	 * Returns the meta object for class '{@link rosInterfacesPool.RosActionClient <em>Ros Action Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ros Action Client</em>'.
	 * @see rosInterfacesPool.RosActionClient
	 * @generated
	 */
	EClass getRosActionClient();

	/**
	 * Returns the meta object for class '{@link rosInterfacesPool.RosAction <em>Ros Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ros Action</em>'.
	 * @see rosInterfacesPool.RosAction
	 * @generated
	 */
	EClass getRosAction();

	/**
	 * Returns the meta object for the attribute '{@link rosInterfacesPool.RosAction#getActionName <em>Action Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Name</em>'.
	 * @see rosInterfacesPool.RosAction#getActionName()
	 * @see #getRosAction()
	 * @generated
	 */
	EAttribute getRosAction_ActionName();

	/**
	 * Returns the meta object for the attribute '{@link rosInterfacesPool.RosAction#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see rosInterfacesPool.RosAction#getType()
	 * @see #getRosAction()
	 * @generated
	 */
	EAttribute getRosAction_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RosInterfacesPoolFactory getRosInterfacesPoolFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link rosInterfacesPool.impl.RosInterfacesPoolImpl <em>Ros Interfaces Pool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rosInterfacesPool.impl.RosInterfacesPoolImpl
		 * @see rosInterfacesPool.impl.RosInterfacesPoolPackageImpl#getRosInterfacesPool()
		 * @generated
		 */
		EClass ROS_INTERFACES_POOL = eINSTANCE.getRosInterfacesPool();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_INTERFACES_POOL__INTERFACES = eINSTANCE.getRosInterfacesPool_Interfaces();

		/**
		 * The meta object literal for the '{@link rosInterfacesPool.impl.RosTopicImpl <em>Ros Topic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rosInterfacesPool.impl.RosTopicImpl
		 * @see rosInterfacesPool.impl.RosInterfacesPoolPackageImpl#getRosTopic()
		 * @generated
		 */
		EClass ROS_TOPIC = eINSTANCE.getRosTopic();

		/**
		 * The meta object literal for the '<em><b>Topic Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_TOPIC__TOPIC_NAME = eINSTANCE.getRosTopic_TopicName();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_TOPIC__TYPE = eINSTANCE.getRosTopic_Type();

		/**
		 * The meta object literal for the '{@link rosInterfacesPool.impl.RosServiceImpl <em>Ros Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rosInterfacesPool.impl.RosServiceImpl
		 * @see rosInterfacesPool.impl.RosInterfacesPoolPackageImpl#getRosService()
		 * @generated
		 */
		EClass ROS_SERVICE = eINSTANCE.getRosService();

		/**
		 * The meta object literal for the '<em><b>Srv Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_SERVICE__SRV_NAME = eINSTANCE.getRosService_SrvName();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_SERVICE__TYPE = eINSTANCE.getRosService_Type();

		/**
		 * The meta object literal for the '{@link rosInterfacesPool.impl.RosPublisherImpl <em>Ros Publisher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rosInterfacesPool.impl.RosPublisherImpl
		 * @see rosInterfacesPool.impl.RosInterfacesPoolPackageImpl#getRosPublisher()
		 * @generated
		 */
		EClass ROS_PUBLISHER = eINSTANCE.getRosPublisher();

		/**
		 * The meta object literal for the '{@link rosInterfacesPool.impl.RosSubscriberImpl <em>Ros Subscriber</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rosInterfacesPool.impl.RosSubscriberImpl
		 * @see rosInterfacesPool.impl.RosInterfacesPoolPackageImpl#getRosSubscriber()
		 * @generated
		 */
		EClass ROS_SUBSCRIBER = eINSTANCE.getRosSubscriber();

		/**
		 * The meta object literal for the '{@link rosInterfacesPool.impl.RosSrvServerImpl <em>Ros Srv Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rosInterfacesPool.impl.RosSrvServerImpl
		 * @see rosInterfacesPool.impl.RosInterfacesPoolPackageImpl#getRosSrvServer()
		 * @generated
		 */
		EClass ROS_SRV_SERVER = eINSTANCE.getRosSrvServer();

		/**
		 * The meta object literal for the '{@link rosInterfacesPool.impl.RosSrvClientImpl <em>Ros Srv Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rosInterfacesPool.impl.RosSrvClientImpl
		 * @see rosInterfacesPool.impl.RosInterfacesPoolPackageImpl#getRosSrvClient()
		 * @generated
		 */
		EClass ROS_SRV_CLIENT = eINSTANCE.getRosSrvClient();

		/**
		 * The meta object literal for the '{@link rosInterfacesPool.impl.RosInterfaceImpl <em>Ros Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rosInterfacesPool.impl.RosInterfaceImpl
		 * @see rosInterfacesPool.impl.RosInterfacesPoolPackageImpl#getRosInterface()
		 * @generated
		 */
		EClass ROS_INTERFACE = eINSTANCE.getRosInterface();

		/**
		 * The meta object literal for the '{@link rosInterfacesPool.impl.RosActionServerImpl <em>Ros Action Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rosInterfacesPool.impl.RosActionServerImpl
		 * @see rosInterfacesPool.impl.RosInterfacesPoolPackageImpl#getRosActionServer()
		 * @generated
		 */
		EClass ROS_ACTION_SERVER = eINSTANCE.getRosActionServer();

		/**
		 * The meta object literal for the '{@link rosInterfacesPool.impl.RosActionClientImpl <em>Ros Action Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rosInterfacesPool.impl.RosActionClientImpl
		 * @see rosInterfacesPool.impl.RosInterfacesPoolPackageImpl#getRosActionClient()
		 * @generated
		 */
		EClass ROS_ACTION_CLIENT = eINSTANCE.getRosActionClient();

		/**
		 * The meta object literal for the '{@link rosInterfacesPool.impl.RosActionImpl <em>Ros Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rosInterfacesPool.impl.RosActionImpl
		 * @see rosInterfacesPool.impl.RosInterfacesPoolPackageImpl#getRosAction()
		 * @generated
		 */
		EClass ROS_ACTION = eINSTANCE.getRosAction();

		/**
		 * The meta object literal for the '<em><b>Action Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_ACTION__ACTION_NAME = eINSTANCE.getRosAction_ActionName();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_ACTION__TYPE = eINSTANCE.getRosAction_Type();

	}

} //RosInterfacesPoolPackage
