/**
 */
package rosInterfacesPool;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see rosInterfacesPool.RosInterfacesPoolPackage
 * @generated
 */
public interface RosInterfacesPoolFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RosInterfacesPoolFactory eINSTANCE = rosInterfacesPool.impl.RosInterfacesPoolFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ros Interfaces Pool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ros Interfaces Pool</em>'.
	 * @generated
	 */
	RosInterfacesPool createRosInterfacesPool();

	/**
	 * Returns a new object of class '<em>Ros Publisher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ros Publisher</em>'.
	 * @generated
	 */
	RosPublisher createRosPublisher();

	/**
	 * Returns a new object of class '<em>Ros Subscriber</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ros Subscriber</em>'.
	 * @generated
	 */
	RosSubscriber createRosSubscriber();

	/**
	 * Returns a new object of class '<em>Ros Srv Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ros Srv Server</em>'.
	 * @generated
	 */
	RosSrvServer createRosSrvServer();

	/**
	 * Returns a new object of class '<em>Ros Srv Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ros Srv Client</em>'.
	 * @generated
	 */
	RosSrvClient createRosSrvClient();

	/**
	 * Returns a new object of class '<em>Ros Action Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ros Action Server</em>'.
	 * @generated
	 */
	RosActionServer createRosActionServer();

	/**
	 * Returns a new object of class '<em>Ros Action Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ros Action Client</em>'.
	 * @generated
	 */
	RosActionClient createRosActionClient();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RosInterfacesPoolPackage getRosInterfacesPoolPackage();

} //RosInterfacesPoolFactory
