/**
 */
package rosInterfacesPool;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ros Topic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rosInterfacesPool.RosTopic#getTopicName <em>Topic Name</em>}</li>
 *   <li>{@link rosInterfacesPool.RosTopic#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see rosInterfacesPool.RosInterfacesPoolPackage#getRosTopic()
 * @model abstract="true"
 * @generated
 */
public interface RosTopic extends RosInterface {
	/**
	 * Returns the value of the '<em><b>Topic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic Name</em>' attribute.
	 * @see #setTopicName(String)
	 * @see rosInterfacesPool.RosInterfacesPoolPackage#getRosTopic_TopicName()
	 * @model required="true"
	 * @generated
	 */
	String getTopicName();

	/**
	 * Sets the value of the '{@link rosInterfacesPool.RosTopic#getTopicName <em>Topic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic Name</em>' attribute.
	 * @see #getTopicName()
	 * @generated
	 */
	void setTopicName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see rosInterfacesPool.RosInterfacesPoolPackage#getRosTopic_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link rosInterfacesPool.RosTopic#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // RosTopic
