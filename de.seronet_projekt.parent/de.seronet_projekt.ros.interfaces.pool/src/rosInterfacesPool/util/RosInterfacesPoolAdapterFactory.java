/**
 */
package rosInterfacesPool.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.smartmdsd.ecore.base.mixedport.AbstractMixedPortDefinition;
import org.eclipse.smartmdsd.ecore.base.mixedport.MixedPortROSBase;

import rosInterfacesPool.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see rosInterfacesPool.RosInterfacesPoolPackage
 * @generated
 */
public class RosInterfacesPoolAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RosInterfacesPoolPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RosInterfacesPoolAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RosInterfacesPoolPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RosInterfacesPoolSwitch<Adapter> modelSwitch =
		new RosInterfacesPoolSwitch<Adapter>() {
			@Override
			public Adapter caseRosInterfacesPool(RosInterfacesPool object) {
				return createRosInterfacesPoolAdapter();
			}
			@Override
			public Adapter caseRosTopic(RosTopic object) {
				return createRosTopicAdapter();
			}
			@Override
			public Adapter caseRosService(RosService object) {
				return createRosServiceAdapter();
			}
			@Override
			public Adapter caseRosPublisher(RosPublisher object) {
				return createRosPublisherAdapter();
			}
			@Override
			public Adapter caseRosSubscriber(RosSubscriber object) {
				return createRosSubscriberAdapter();
			}
			@Override
			public Adapter caseRosSrvServer(RosSrvServer object) {
				return createRosSrvServerAdapter();
			}
			@Override
			public Adapter caseRosSrvClient(RosSrvClient object) {
				return createRosSrvClientAdapter();
			}
			@Override
			public Adapter caseRosInterface(RosInterface object) {
				return createRosInterfaceAdapter();
			}
			@Override
			public Adapter caseRosActionServer(RosActionServer object) {
				return createRosActionServerAdapter();
			}
			@Override
			public Adapter caseRosActionClient(RosActionClient object) {
				return createRosActionClientAdapter();
			}
			@Override
			public Adapter caseRosAction(RosAction object) {
				return createRosActionAdapter();
			}
			@Override
			public Adapter caseAbstractMixedPortDefinition(AbstractMixedPortDefinition object) {
				return createAbstractMixedPortDefinitionAdapter();
			}
			@Override
			public Adapter caseMixedPortROSBase(MixedPortROSBase object) {
				return createMixedPortROSBaseAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link rosInterfacesPool.RosInterfacesPool <em>Ros Interfaces Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rosInterfacesPool.RosInterfacesPool
	 * @generated
	 */
	public Adapter createRosInterfacesPoolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rosInterfacesPool.RosTopic <em>Ros Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rosInterfacesPool.RosTopic
	 * @generated
	 */
	public Adapter createRosTopicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rosInterfacesPool.RosService <em>Ros Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rosInterfacesPool.RosService
	 * @generated
	 */
	public Adapter createRosServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rosInterfacesPool.RosPublisher <em>Ros Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rosInterfacesPool.RosPublisher
	 * @generated
	 */
	public Adapter createRosPublisherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rosInterfacesPool.RosSubscriber <em>Ros Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rosInterfacesPool.RosSubscriber
	 * @generated
	 */
	public Adapter createRosSubscriberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rosInterfacesPool.RosSrvServer <em>Ros Srv Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rosInterfacesPool.RosSrvServer
	 * @generated
	 */
	public Adapter createRosSrvServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rosInterfacesPool.RosSrvClient <em>Ros Srv Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rosInterfacesPool.RosSrvClient
	 * @generated
	 */
	public Adapter createRosSrvClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rosInterfacesPool.RosInterface <em>Ros Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rosInterfacesPool.RosInterface
	 * @generated
	 */
	public Adapter createRosInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rosInterfacesPool.RosActionServer <em>Ros Action Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rosInterfacesPool.RosActionServer
	 * @generated
	 */
	public Adapter createRosActionServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rosInterfacesPool.RosActionClient <em>Ros Action Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rosInterfacesPool.RosActionClient
	 * @generated
	 */
	public Adapter createRosActionClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rosInterfacesPool.RosAction <em>Ros Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rosInterfacesPool.RosAction
	 * @generated
	 */
	public Adapter createRosActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.base.mixedport.AbstractMixedPortDefinition <em>Abstract Mixed Port Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.base.mixedport.AbstractMixedPortDefinition
	 * @generated
	 */
	public Adapter createAbstractMixedPortDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.base.mixedport.MixedPortROSBase <em>Mixed Port ROS Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.base.mixedport.MixedPortROSBase
	 * @generated
	 */
	public Adapter createMixedPortROSBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RosInterfacesPoolAdapterFactory
