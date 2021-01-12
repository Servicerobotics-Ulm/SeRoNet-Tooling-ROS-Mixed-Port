/**
 */
package rosInterfacesPool;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ros Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rosInterfacesPool.RosAction#getActionName <em>Action Name</em>}</li>
 *   <li>{@link rosInterfacesPool.RosAction#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see rosInterfacesPool.RosInterfacesPoolPackage#getRosAction()
 * @model abstract="true"
 * @generated
 */
public interface RosAction extends RosInterface {
	/**
	 * Returns the value of the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Name</em>' attribute.
	 * @see #setActionName(String)
	 * @see rosInterfacesPool.RosInterfacesPoolPackage#getRosAction_ActionName()
	 * @model required="true"
	 * @generated
	 */
	String getActionName();

	/**
	 * Sets the value of the '{@link rosInterfacesPool.RosAction#getActionName <em>Action Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Name</em>' attribute.
	 * @see #getActionName()
	 * @generated
	 */
	void setActionName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see rosInterfacesPool.RosInterfacesPoolPackage#getRosAction_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link rosInterfacesPool.RosAction#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // RosAction
