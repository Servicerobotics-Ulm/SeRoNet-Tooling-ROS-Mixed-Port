/**
 */
package rosInterfacesPool.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.smartmdsd.ecore.base.mixedport.AbstractMixedPortDefinition;
import org.eclipse.smartmdsd.ecore.base.mixedport.MixedPortROSBase;

import rosInterfacesPool.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see rosInterfacesPool.RosInterfacesPoolPackage
 * @generated
 */
public class RosInterfacesPoolSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RosInterfacesPoolPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RosInterfacesPoolSwitch() {
		if (modelPackage == null) {
			modelPackage = RosInterfacesPoolPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RosInterfacesPoolPackage.ROS_INTERFACES_POOL: {
				RosInterfacesPool rosInterfacesPool = (RosInterfacesPool)theEObject;
				T result = caseRosInterfacesPool(rosInterfacesPool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RosInterfacesPoolPackage.ROS_TOPIC: {
				RosTopic rosTopic = (RosTopic)theEObject;
				T result = caseRosTopic(rosTopic);
				if (result == null) result = caseRosInterface(rosTopic);
				if (result == null) result = caseMixedPortROSBase(rosTopic);
				if (result == null) result = caseAbstractMixedPortDefinition(rosTopic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RosInterfacesPoolPackage.ROS_SERVICE: {
				RosService rosService = (RosService)theEObject;
				T result = caseRosService(rosService);
				if (result == null) result = caseRosInterface(rosService);
				if (result == null) result = caseMixedPortROSBase(rosService);
				if (result == null) result = caseAbstractMixedPortDefinition(rosService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RosInterfacesPoolPackage.ROS_PUBLISHER: {
				RosPublisher rosPublisher = (RosPublisher)theEObject;
				T result = caseRosPublisher(rosPublisher);
				if (result == null) result = caseRosTopic(rosPublisher);
				if (result == null) result = caseRosInterface(rosPublisher);
				if (result == null) result = caseMixedPortROSBase(rosPublisher);
				if (result == null) result = caseAbstractMixedPortDefinition(rosPublisher);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RosInterfacesPoolPackage.ROS_SUBSCRIBER: {
				RosSubscriber rosSubscriber = (RosSubscriber)theEObject;
				T result = caseRosSubscriber(rosSubscriber);
				if (result == null) result = caseRosTopic(rosSubscriber);
				if (result == null) result = caseRosInterface(rosSubscriber);
				if (result == null) result = caseMixedPortROSBase(rosSubscriber);
				if (result == null) result = caseAbstractMixedPortDefinition(rosSubscriber);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RosInterfacesPoolPackage.ROS_SRV_SERVER: {
				RosSrvServer rosSrvServer = (RosSrvServer)theEObject;
				T result = caseRosSrvServer(rosSrvServer);
				if (result == null) result = caseRosService(rosSrvServer);
				if (result == null) result = caseRosInterface(rosSrvServer);
				if (result == null) result = caseMixedPortROSBase(rosSrvServer);
				if (result == null) result = caseAbstractMixedPortDefinition(rosSrvServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RosInterfacesPoolPackage.ROS_SRV_CLIENT: {
				RosSrvClient rosSrvClient = (RosSrvClient)theEObject;
				T result = caseRosSrvClient(rosSrvClient);
				if (result == null) result = caseRosService(rosSrvClient);
				if (result == null) result = caseRosInterface(rosSrvClient);
				if (result == null) result = caseMixedPortROSBase(rosSrvClient);
				if (result == null) result = caseAbstractMixedPortDefinition(rosSrvClient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RosInterfacesPoolPackage.ROS_INTERFACE: {
				RosInterface rosInterface = (RosInterface)theEObject;
				T result = caseRosInterface(rosInterface);
				if (result == null) result = caseMixedPortROSBase(rosInterface);
				if (result == null) result = caseAbstractMixedPortDefinition(rosInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RosInterfacesPoolPackage.ROS_ACTION_SERVER: {
				RosActionServer rosActionServer = (RosActionServer)theEObject;
				T result = caseRosActionServer(rosActionServer);
				if (result == null) result = caseRosAction(rosActionServer);
				if (result == null) result = caseRosInterface(rosActionServer);
				if (result == null) result = caseMixedPortROSBase(rosActionServer);
				if (result == null) result = caseAbstractMixedPortDefinition(rosActionServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RosInterfacesPoolPackage.ROS_ACTION_CLIENT: {
				RosActionClient rosActionClient = (RosActionClient)theEObject;
				T result = caseRosActionClient(rosActionClient);
				if (result == null) result = caseRosAction(rosActionClient);
				if (result == null) result = caseRosInterface(rosActionClient);
				if (result == null) result = caseMixedPortROSBase(rosActionClient);
				if (result == null) result = caseAbstractMixedPortDefinition(rosActionClient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RosInterfacesPoolPackage.ROS_ACTION: {
				RosAction rosAction = (RosAction)theEObject;
				T result = caseRosAction(rosAction);
				if (result == null) result = caseRosInterface(rosAction);
				if (result == null) result = caseMixedPortROSBase(rosAction);
				if (result == null) result = caseAbstractMixedPortDefinition(rosAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ros Interfaces Pool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ros Interfaces Pool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRosInterfacesPool(RosInterfacesPool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ros Topic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ros Topic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRosTopic(RosTopic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ros Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ros Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRosService(RosService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ros Publisher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ros Publisher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRosPublisher(RosPublisher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ros Subscriber</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ros Subscriber</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRosSubscriber(RosSubscriber object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ros Srv Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ros Srv Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRosSrvServer(RosSrvServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ros Srv Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ros Srv Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRosSrvClient(RosSrvClient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ros Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ros Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRosInterface(RosInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ros Action Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ros Action Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRosActionServer(RosActionServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ros Action Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ros Action Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRosActionClient(RosActionClient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ros Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ros Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRosAction(RosAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Mixed Port Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Mixed Port Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMixedPortDefinition(AbstractMixedPortDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mixed Port ROS Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mixed Port ROS Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMixedPortROSBase(MixedPortROSBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RosInterfacesPoolSwitch
