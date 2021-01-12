/**
 */
package rosInterfacesPool.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rosInterfacesPool.RosInterface;
import rosInterfacesPool.RosInterfacesPool;
import rosInterfacesPool.RosInterfacesPoolPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ros Interfaces Pool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rosInterfacesPool.impl.RosInterfacesPoolImpl#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RosInterfacesPoolImpl extends MinimalEObjectImpl.Container implements RosInterfacesPool {
	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<RosInterface> interfaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RosInterfacesPoolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RosInterfacesPoolPackage.Literals.ROS_INTERFACES_POOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RosInterface> getInterfaces() {
		if (interfaces == null) {
			interfaces = new EObjectContainmentEList<RosInterface>(RosInterface.class, this, RosInterfacesPoolPackage.ROS_INTERFACES_POOL__INTERFACES);
		}
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RosInterfacesPoolPackage.ROS_INTERFACES_POOL__INTERFACES:
				return ((InternalEList<?>)getInterfaces()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RosInterfacesPoolPackage.ROS_INTERFACES_POOL__INTERFACES:
				return getInterfaces();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RosInterfacesPoolPackage.ROS_INTERFACES_POOL__INTERFACES:
				getInterfaces().clear();
				getInterfaces().addAll((Collection<? extends RosInterface>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RosInterfacesPoolPackage.ROS_INTERFACES_POOL__INTERFACES:
				getInterfaces().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RosInterfacesPoolPackage.ROS_INTERFACES_POOL__INTERFACES:
				return interfaces != null && !interfaces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RosInterfacesPoolImpl
