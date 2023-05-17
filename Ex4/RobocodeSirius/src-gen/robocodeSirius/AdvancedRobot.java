/**
 */
package robocodeSirius;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Advanced Robot</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see robocodeSirius.RobocodeSiriusPackage#getAdvancedRobot()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AdvancedRobotBulletHitHandling'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot AdvancedRobotBulletHitHandling='\n  \t\t\tself.oclIsTypeOf(AdvancedRobot) implies self.eventsHandled-&gt;exists(e | e.eventType = EventType::BulletHit and e.actions-&gt;forAll(a | a.functionName &lt;&gt; \'\'))'"
 * @generated
 */
public interface AdvancedRobot extends Robot {
} // AdvancedRobot
