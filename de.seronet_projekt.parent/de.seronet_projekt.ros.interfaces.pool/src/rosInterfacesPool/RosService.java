/**
 */
package rosInterfacesPool;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ros Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rosInterfacesPool.RosService#getSrvName <em>Srv Name</em>}</li>
 *   <li>{@link rosInterfacesPool.RosService#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see rosInterfacesPool.RosInterfacesPoolPackage#getRosService()
 * @model abstract="true"
 * @generated
 */
public interface RosService extends RosInterface {
	/**
	 * Returns the value of the '<em><b>Srv Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srv Name</em>' attribute.
	 * @see #setSrvName(String)
	 * @see rosInterfacesPool.RosInterfacesPoolPackage#getRosService_SrvName()
	 * @model required="true"
	 * @generated
	 */
	String getSrvName();

	/**
	 * Sets the value of the '{@link rosInterfacesPool.RosService#getSrvName <em>Srv Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Srv Name</em>' attribute.
	 * @see #getSrvName()
	 * @generated
	 */
	void setSrvName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see rosInterfacesPool.RosInterfacesPoolPackage#getRosService_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link rosInterfacesPool.RosService#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // RosService
