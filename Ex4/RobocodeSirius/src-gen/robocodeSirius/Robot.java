/**
 */
package robocodeSirius;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robocodeSirius.Robot#getName <em>Name</em>}</li>
 *   <li>{@link robocodeSirius.Robot#getEventsHandled <em>Events Handled</em>}</li>
 *   <li>{@link robocodeSirius.Robot#getRunActions <em>Run Actions</em>}</li>
 *   <li>{@link robocodeSirius.Robot#getInfiniteLoopActions <em>Infinite Loop Actions</em>}</li>
 * </ul>
 *
 * @see robocodeSirius.RobocodeSiriusPackage#getRobot()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueEventHandlers NoCustomEvent ForbiddenActionsForRobot'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot UniqueEventHandlers='Tuple {\n\tmessage : String = \'Cant set more than 1 event of each type\',\n\tstatus : Boolean = \n\t\t\tself.eventsHandled-&gt;isUnique(eventType)\n}.status' NoCustomEvent='Tuple {\n\tmessage : String = \'Robot cant have custom events\',\n\tstatus : Boolean = \n\t\t\tself.oclIsTypeOf(Robot) implies self.eventsHandled-&gt;forAll(e | e.eventType &lt;&gt; EventType::Custom)\n}.status' ForbiddenActionsForRobot='Tuple {\n\tmessage : String = \'Forbidden actions for this kind of Robot\',\n\tstatus : Boolean = \n\t\t\tself.oclIsTypeOf(Robot) or self.oclIsTypeOf(AdvancedRobot) implies\t\n\t\t\t\tself.runActions-&gt;forAll(a | a.functionName &lt;&gt; \'setTurnRate\' and a.functionName &lt;&gt; \'setGunTurnRotationRate\' and a.functionName &lt;&gt; \'setVelocityRate\' and a.functionName &lt;&gt; \'setRadarRotationRate\') and\n\t\t\t\t\tself.infiniteLoopActions-&gt;forAll(a | a.functionName &lt;&gt; \'setTurnRate\' and a.functionName &lt;&gt; \'setGunTurnRotationRate\' and a.functionName &lt;&gt; \'setVelocityRate\' and a.functionName &lt;&gt; \'setRadarRotationRate\') and\n\t\t\t\t\t\tself.eventsHandled.actions-&gt;forAll(a | a.functionName &lt;&gt; \'setTurnRate\' and a.functionName &lt;&gt; \'setGunTurnRotationRate\' and a.functionName &lt;&gt; \'setVelocityRate\' and a.functionName &lt;&gt; \'setRadarRotationRate\')\n}.status'"
 * @generated
 */
public interface Robot extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see robocodeSirius.RobocodeSiriusPackage#getRobot_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link robocodeSirius.Robot#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Events Handled</b></em>' reference list.
	 * The list contents are of type {@link robocodeSirius.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events Handled</em>' reference list.
	 * @see robocodeSirius.RobocodeSiriusPackage#getRobot_EventsHandled()
	 * @model
	 * @generated
	 */
	EList<Event> getEventsHandled();

	/**
	 * Returns the value of the '<em><b>Run Actions</b></em>' containment reference list.
	 * The list contents are of type {@link robocodeSirius.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run Actions</em>' containment reference list.
	 * @see robocodeSirius.RobocodeSiriusPackage#getRobot_RunActions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getRunActions();

	/**
	 * Returns the value of the '<em><b>Infinite Loop Actions</b></em>' containment reference list.
	 * The list contents are of type {@link robocodeSirius.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infinite Loop Actions</em>' containment reference list.
	 * @see robocodeSirius.RobocodeSiriusPackage#getRobot_InfiniteLoopActions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getInfiniteLoopActions();

} // Robot
