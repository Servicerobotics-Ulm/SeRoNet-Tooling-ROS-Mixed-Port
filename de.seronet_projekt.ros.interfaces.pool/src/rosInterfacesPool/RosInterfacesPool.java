/**
 */
package rosInterfacesPool;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ros Interfaces Pool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rosInterfacesPool.RosInterfacesPool#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 *
 * @see rosInterfacesPool.RosInterfacesPoolPackage#getRosInterfacesPool()
 * @model
 * @generated
 */
public interface RosInterfacesPool extends EObject {
	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link rosInterfacesPool.RosInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' containment reference list.
	 * @see rosInterfacesPool.RosInterfacesPoolPackage#getRosInterfacesPool_Interfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<RosInterface> getInterfaces();

} // RosInterfacesPool
