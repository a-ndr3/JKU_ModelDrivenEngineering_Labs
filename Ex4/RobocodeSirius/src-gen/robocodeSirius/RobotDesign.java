/**
 */
package robocodeSirius;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robot Design</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robocodeSirius.RobotDesign#getRobot <em>Robot</em>}</li>
 *   <li>{@link robocodeSirius.RobotDesign#getEvents <em>Events</em>}</li>
 * </ul>
 *
 * @see robocodeSirius.RobocodeSiriusPackage#getRobotDesign()
 * @model
 * @generated
 */
public interface RobotDesign extends EObject {
	/**
	 * Returns the value of the '<em><b>Robot</b></em>' containment reference list.
	 * The list contents are of type {@link robocodeSirius.Robot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Robot</em>' containment reference list.
	 * @see robocodeSirius.RobocodeSiriusPackage#getRobotDesign_Robot()
	 * @model containment="true"
	 * @generated
	 */
	EList<Robot> getRobot();

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link robocodeSirius.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see robocodeSirius.RobocodeSiriusPackage#getRobotDesign_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvents();

} // RobotDesign
