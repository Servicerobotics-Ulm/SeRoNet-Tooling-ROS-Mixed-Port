/**
 */
package rosInterfacesPool.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import rosInterfacesPool.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RosInterfacesPoolFactoryImpl extends EFactoryImpl implements RosInterfacesPoolFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RosInterfacesPoolFactory init() {
		try {
			RosInterfacesPoolFactory theRosInterfacesPoolFactory = (RosInterfacesPoolFactory)EPackage.Registry.INSTANCE.getEFactory(RosInterfacesPoolPackage.eNS_URI);
			if (theRosInterfacesPoolFactory != null) {
				return theRosInterfacesPoolFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RosInterfacesPoolFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RosInterfacesPoolFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RosInterfacesPoolPackage.ROS_INTERFACES_POOL: return createRosInterfacesPool();
			case RosInterfacesPoolPackage.ROS_PUBLISHER: return createRosPublisher();
			case RosInterfacesPoolPackage.ROS_SUBSCRIBER: return createRosSubscriber();
			case RosInterfacesPoolPackage.ROS_SRV_SERVER: return createRosSrvServer();
			case RosInterfacesPoolPackage.ROS_SRV_CLIENT: return createRosSrvClient();
			case RosInterfacesPoolPackage.ROS_ACTION_SERVER: return createRosActionServer();
			case RosInterfacesPoolPackage.ROS_ACTION_CLIENT: return createRosActionClient();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RosInterfacesPool createRosInterfacesPool() {
		RosInterfacesPoolImpl rosInterfacesPool = new RosInterfacesPoolImpl();
		return rosInterfacesPool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RosPublisher createRosPublisher() {
		RosPublisherImpl rosPublisher = new RosPublisherImpl();
		return rosPublisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RosSubscriber createRosSubscriber() {
		RosSubscriberImpl rosSubscriber = new RosSubscriberImpl();
		return rosSubscriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RosSrvServer createRosSrvServer() {
		RosSrvServerImpl rosSrvServer = new RosSrvServerImpl();
		return rosSrvServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RosSrvClient createRosSrvClient() {
		RosSrvClientImpl rosSrvClient = new RosSrvClientImpl();
		return rosSrvClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RosActionServer createRosActionServer() {
		RosActionServerImpl rosActionServer = new RosActionServerImpl();
		return rosActionServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RosActionClient createRosActionClient() {
		RosActionClientImpl rosActionClient = new RosActionClientImpl();
		return rosActionClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RosInterfacesPoolPackage getRosInterfacesPoolPackage() {
		return (RosInterfacesPoolPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RosInterfacesPoolPackage getPackage() {
		return RosInterfacesPoolPackage.eINSTANCE;
	}

} //RosInterfacesPoolFactoryImpl
