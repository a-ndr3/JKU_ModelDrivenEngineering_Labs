/**
 */
package robocodeSirius.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import robocodeSirius.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see robocodeSirius.RobocodeSiriusPackage
 * @generated
 */
public class RobocodeSiriusValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RobocodeSiriusValidator INSTANCE = new RobocodeSiriusValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "robocodeSirius";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobocodeSiriusValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return RobocodeSiriusPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case RobocodeSiriusPackage.ROBOT:
			return validateRobot((Robot) value, diagnostics, context);
		case RobocodeSiriusPackage.EVENT:
			return validateEvent((Event) value, diagnostics, context);
		case RobocodeSiriusPackage.ACTION:
			return validateAction((Action) value, diagnostics, context);
		case RobocodeSiriusPackage.ADVANCED_ROBOT:
			return validateAdvancedRobot((AdvancedRobot) value, diagnostics, context);
		case RobocodeSiriusPackage.RANGE_CONTROL_ROBOT:
			return validateRangeControlRobot((RangeControlRobot) value, diagnostics, context);
		case RobocodeSiriusPackage.ROBOT_DESIGN:
			return validateRobotDesign((RobotDesign) value, diagnostics, context);
		case RobocodeSiriusPackage.EVENT_TYPE:
			return validateEventType((EventType) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRobot(Robot robot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(robot, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(robot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(robot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(robot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(robot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(robot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(robot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(robot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(robot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRobot_UniqueEventHandlers(robot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRobot_NoCustomEvent(robot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRobot_ForbiddenActionsForRobot(robot, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the UniqueEventHandlers constraint of '<em>Robot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROBOT__UNIQUE_EVENT_HANDLERS__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Cant set more than 1 event of each type',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tself.eventsHandled->isUnique(eventType)\n" + "}.status";

	/**
	 * Validates the UniqueEventHandlers constraint of '<em>Robot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRobot_UniqueEventHandlers(Robot robot, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(RobocodeSiriusPackage.Literals.ROBOT, robot, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "UniqueEventHandlers",
				ROBOT__UNIQUE_EVENT_HANDLERS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the NoCustomEvent constraint of '<em>Robot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROBOT__NO_CUSTOM_EVENT__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Robot cant have custom events',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tself.oclIsTypeOf(Robot) implies self.eventsHandled->forAll(e | e.eventType <> EventType::Custom)\n"
			+ "}.status";

	/**
	 * Validates the NoCustomEvent constraint of '<em>Robot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRobot_NoCustomEvent(Robot robot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(RobocodeSiriusPackage.Literals.ROBOT, robot, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "NoCustomEvent", ROBOT__NO_CUSTOM_EVENT__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the ForbiddenActionsForRobot constraint of '<em>Robot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROBOT__FORBIDDEN_ACTIONS_FOR_ROBOT__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Forbidden actions for this kind of Robot',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tself.oclIsTypeOf(Robot) or self.oclIsTypeOf(AdvancedRobot) implies\t\n"
			+ "\t\t\t\tself.runActions->forAll(a | a.functionName <> 'setTurnRate' and a.functionName <> 'setGunTurnRotationRate' and a.functionName <> 'setVelocityRate' and a.functionName <> 'setRadarRotationRate') and\n"
			+ "\t\t\t\t\tself.infiniteLoopActions->forAll(a | a.functionName <> 'setTurnRate' and a.functionName <> 'setGunTurnRotationRate' and a.functionName <> 'setVelocityRate' and a.functionName <> 'setRadarRotationRate') and\n"
			+ "\t\t\t\t\t\tself.eventsHandled.actions->forAll(a | a.functionName <> 'setTurnRate' and a.functionName <> 'setGunTurnRotationRate' and a.functionName <> 'setVelocityRate' and a.functionName <> 'setRadarRotationRate')\n"
			+ "}.status";

	/**
	 * Validates the ForbiddenActionsForRobot constraint of '<em>Robot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRobot_ForbiddenActionsForRobot(Robot robot, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(RobocodeSiriusPackage.Literals.ROBOT, robot, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "ForbiddenActionsForRobot",
				ROBOT__FORBIDDEN_ACTIONS_FOR_ROBOT__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvent(Event event, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(event, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(event, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(event, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(event, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(event, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(event, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(event, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(event, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(event, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEvent_DeathEventActionsCheck(event, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the DeathEventActionsCheck constraint of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EVENT__DEATH_EVENT_ACTIONS_CHECK__EEXPRESSION = "\n"
			+ "  \t\t\t self.eventType = EventType::Death implies (self.eventType = EventType::Death and self.actions->notEmpty())";

	/**
	 * Validates the DeathEventActionsCheck constraint of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvent_DeathEventActionsCheck(Event event, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(RobocodeSiriusPackage.Literals.EVENT, event, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "DeathEventActionsCheck",
				EVENT__DEATH_EVENT_ACTIONS_CHECK__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction(Action action, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(action, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvancedRobot(AdvancedRobot advancedRobot, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(advancedRobot, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(advancedRobot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(advancedRobot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(advancedRobot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(advancedRobot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(advancedRobot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(advancedRobot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(advancedRobot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(advancedRobot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRobot_UniqueEventHandlers(advancedRobot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRobot_NoCustomEvent(advancedRobot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRobot_ForbiddenActionsForRobot(advancedRobot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAdvancedRobot_AdvancedRobotBulletHitHandling(advancedRobot, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the AdvancedRobotBulletHitHandling constraint of '<em>Advanced Robot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ADVANCED_ROBOT__ADVANCED_ROBOT_BULLET_HIT_HANDLING__EEXPRESSION = "\n"
			+ "  \t\t\tself.oclIsTypeOf(AdvancedRobot) implies self.eventsHandled->exists(e | e.eventType = EventType::BulletHit and e.actions->forAll(a | a.functionName <> ''))";

	/**
	 * Validates the AdvancedRobotBulletHitHandling constraint of '<em>Advanced Robot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvancedRobot_AdvancedRobotBulletHitHandling(AdvancedRobot advancedRobot,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(RobocodeSiriusPackage.Literals.ADVANCED_ROBOT, advancedRobot, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "AdvancedRobotBulletHitHandling",
				ADVANCED_ROBOT__ADVANCED_ROBOT_BULLET_HIT_HANDLING__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE,
				0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeControlRobot(RangeControlRobot rangeControlRobot, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rangeControlRobot, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(rangeControlRobot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(rangeControlRobot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(rangeControlRobot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(rangeControlRobot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(rangeControlRobot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(rangeControlRobot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(rangeControlRobot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(rangeControlRobot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRobot_UniqueEventHandlers(rangeControlRobot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRobot_NoCustomEvent(rangeControlRobot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRobot_ForbiddenActionsForRobot(rangeControlRobot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAdvancedRobot_AdvancedRobotBulletHitHandling(rangeControlRobot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRangeControlRobot_RangeControlRobotEventsAmount(rangeControlRobot, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the RangeControlRobotEventsAmount constraint of '<em>Range Control Robot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RANGE_CONTROL_ROBOT__RANGE_CONTROL_ROBOT_EVENTS_AMOUNT__EEXPRESSION = "\n"
			+ "  \t\t\tself.eventsHandled->collect(e | e.eventType)->asSet()->size() >= 2";

	/**
	 * Validates the RangeControlRobotEventsAmount constraint of '<em>Range Control Robot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeControlRobot_RangeControlRobotEventsAmount(RangeControlRobot rangeControlRobot,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(RobocodeSiriusPackage.Literals.RANGE_CONTROL_ROBOT, rangeControlRobot, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "RangeControlRobotEventsAmount",
				RANGE_CONTROL_ROBOT__RANGE_CONTROL_ROBOT_EVENTS_AMOUNT__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRobotDesign(RobotDesign robotDesign, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(robotDesign, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventType(EventType eventType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //RobocodeSiriusValidator
