/**
 */
package robocodeSirius;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see robocodeSirius.RobocodeSiriusFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface RobocodeSiriusPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "robocodeSirius";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/robocodeSirius";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "robocodeSirius";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RobocodeSiriusPackage eINSTANCE = robocodeSirius.impl.RobocodeSiriusPackageImpl.init();

	/**
	 * The meta object id for the '{@link robocodeSirius.impl.RobotImpl <em>Robot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robocodeSirius.impl.RobotImpl
	 * @see robocodeSirius.impl.RobocodeSiriusPackageImpl#getRobot()
	 * @generated
	 */
	int ROBOT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Events Handled</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__EVENTS_HANDLED = 1;

	/**
	 * The feature id for the '<em><b>Run Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__RUN_ACTIONS = 2;

	/**
	 * The feature id for the '<em><b>Infinite Loop Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__INFINITE_LOOP_ACTIONS = 3;

	/**
	 * The number of structural features of the '<em>Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robocodeSirius.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robocodeSirius.impl.EventImpl
	 * @see robocodeSirius.impl.RobocodeSiriusPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 1;

	/**
	 * The feature id for the '<em><b>Event Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__EVENT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ACTIONS = 1;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robocodeSirius.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robocodeSirius.impl.ActionImpl
	 * @see robocodeSirius.impl.RobocodeSiriusPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 2;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__COMMENT = 0;

	/**
	 * The feature id for the '<em><b>Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__FUNCTION_NAME = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__PARAMETERS = 2;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robocodeSirius.impl.AdvancedRobotImpl <em>Advanced Robot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robocodeSirius.impl.AdvancedRobotImpl
	 * @see robocodeSirius.impl.RobocodeSiriusPackageImpl#getAdvancedRobot()
	 * @generated
	 */
	int ADVANCED_ROBOT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCED_ROBOT__NAME = ROBOT__NAME;

	/**
	 * The feature id for the '<em><b>Events Handled</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCED_ROBOT__EVENTS_HANDLED = ROBOT__EVENTS_HANDLED;

	/**
	 * The feature id for the '<em><b>Run Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCED_ROBOT__RUN_ACTIONS = ROBOT__RUN_ACTIONS;

	/**
	 * The feature id for the '<em><b>Infinite Loop Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCED_ROBOT__INFINITE_LOOP_ACTIONS = ROBOT__INFINITE_LOOP_ACTIONS;

	/**
	 * The number of structural features of the '<em>Advanced Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCED_ROBOT_FEATURE_COUNT = ROBOT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Advanced Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCED_ROBOT_OPERATION_COUNT = ROBOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robocodeSirius.impl.RangeControlRobotImpl <em>Range Control Robot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robocodeSirius.impl.RangeControlRobotImpl
	 * @see robocodeSirius.impl.RobocodeSiriusPackageImpl#getRangeControlRobot()
	 * @generated
	 */
	int RANGE_CONTROL_ROBOT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_CONTROL_ROBOT__NAME = ADVANCED_ROBOT__NAME;

	/**
	 * The feature id for the '<em><b>Events Handled</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_CONTROL_ROBOT__EVENTS_HANDLED = ADVANCED_ROBOT__EVENTS_HANDLED;

	/**
	 * The feature id for the '<em><b>Run Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_CONTROL_ROBOT__RUN_ACTIONS = ADVANCED_ROBOT__RUN_ACTIONS;

	/**
	 * The feature id for the '<em><b>Infinite Loop Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_CONTROL_ROBOT__INFINITE_LOOP_ACTIONS = ADVANCED_ROBOT__INFINITE_LOOP_ACTIONS;

	/**
	 * The number of structural features of the '<em>Range Control Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_CONTROL_ROBOT_FEATURE_COUNT = ADVANCED_ROBOT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Range Control Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_CONTROL_ROBOT_OPERATION_COUNT = ADVANCED_ROBOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robocodeSirius.impl.RobotDesignImpl <em>Robot Design</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robocodeSirius.impl.RobotDesignImpl
	 * @see robocodeSirius.impl.RobocodeSiriusPackageImpl#getRobotDesign()
	 * @generated
	 */
	int ROBOT_DESIGN = 5;

	/**
	 * The feature id for the '<em><b>Robot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_DESIGN__ROBOT = 0;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_DESIGN__EVENTS = 1;

	/**
	 * The number of structural features of the '<em>Robot Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_DESIGN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Robot Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_DESIGN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robocodeSirius.EventType <em>Event Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robocodeSirius.EventType
	 * @see robocodeSirius.impl.RobocodeSiriusPackageImpl#getEventType()
	 * @generated
	 */
	int EVENT_TYPE = 6;

	/**
	 * Returns the meta object for class '{@link robocodeSirius.Robot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robot</em>'.
	 * @see robocodeSirius.Robot
	 * @generated
	 */
	EClass getRobot();

	/**
	 * Returns the meta object for the attribute '{@link robocodeSirius.Robot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see robocodeSirius.Robot#getName()
	 * @see #getRobot()
	 * @generated
	 */
	EAttribute getRobot_Name();

	/**
	 * Returns the meta object for the reference list '{@link robocodeSirius.Robot#getEventsHandled <em>Events Handled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Events Handled</em>'.
	 * @see robocodeSirius.Robot#getEventsHandled()
	 * @see #getRobot()
	 * @generated
	 */
	EReference getRobot_EventsHandled();

	/**
	 * Returns the meta object for the containment reference list '{@link robocodeSirius.Robot#getRunActions <em>Run Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Run Actions</em>'.
	 * @see robocodeSirius.Robot#getRunActions()
	 * @see #getRobot()
	 * @generated
	 */
	EReference getRobot_RunActions();

	/**
	 * Returns the meta object for the containment reference list '{@link robocodeSirius.Robot#getInfiniteLoopActions <em>Infinite Loop Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Infinite Loop Actions</em>'.
	 * @see robocodeSirius.Robot#getInfiniteLoopActions()
	 * @see #getRobot()
	 * @generated
	 */
	EReference getRobot_InfiniteLoopActions();

	/**
	 * Returns the meta object for class '{@link robocodeSirius.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see robocodeSirius.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link robocodeSirius.Event#getEventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Type</em>'.
	 * @see robocodeSirius.Event#getEventType()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_EventType();

	/**
	 * Returns the meta object for the containment reference list '{@link robocodeSirius.Event#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see robocodeSirius.Event#getActions()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Actions();

	/**
	 * Returns the meta object for class '{@link robocodeSirius.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see robocodeSirius.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link robocodeSirius.Action#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see robocodeSirius.Action#getComment()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Comment();

	/**
	 * Returns the meta object for the attribute '{@link robocodeSirius.Action#getFunctionName <em>Function Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function Name</em>'.
	 * @see robocodeSirius.Action#getFunctionName()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_FunctionName();

	/**
	 * Returns the meta object for the attribute '{@link robocodeSirius.Action#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameters</em>'.
	 * @see robocodeSirius.Action#getParameters()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Parameters();

	/**
	 * Returns the meta object for class '{@link robocodeSirius.AdvancedRobot <em>Advanced Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Advanced Robot</em>'.
	 * @see robocodeSirius.AdvancedRobot
	 * @generated
	 */
	EClass getAdvancedRobot();

	/**
	 * Returns the meta object for class '{@link robocodeSirius.RangeControlRobot <em>Range Control Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Control Robot</em>'.
	 * @see robocodeSirius.RangeControlRobot
	 * @generated
	 */
	EClass getRangeControlRobot();

	/**
	 * Returns the meta object for class '{@link robocodeSirius.RobotDesign <em>Robot Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robot Design</em>'.
	 * @see robocodeSirius.RobotDesign
	 * @generated
	 */
	EClass getRobotDesign();

	/**
	 * Returns the meta object for the containment reference list '{@link robocodeSirius.RobotDesign#getRobot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Robot</em>'.
	 * @see robocodeSirius.RobotDesign#getRobot()
	 * @see #getRobotDesign()
	 * @generated
	 */
	EReference getRobotDesign_Robot();

	/**
	 * Returns the meta object for the containment reference list '{@link robocodeSirius.RobotDesign#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see robocodeSirius.RobotDesign#getEvents()
	 * @see #getRobotDesign()
	 * @generated
	 */
	EReference getRobotDesign_Events();

	/**
	 * Returns the meta object for enum '{@link robocodeSirius.EventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Event Type</em>'.
	 * @see robocodeSirius.EventType
	 * @generated
	 */
	EEnum getEventType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RobocodeSiriusFactory getRobocodeSiriusFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link robocodeSirius.impl.RobotImpl <em>Robot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robocodeSirius.impl.RobotImpl
		 * @see robocodeSirius.impl.RobocodeSiriusPackageImpl#getRobot()
		 * @generated
		 */
		EClass ROBOT = eINSTANCE.getRobot();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT__NAME = eINSTANCE.getRobot_Name();

		/**
		 * The meta object literal for the '<em><b>Events Handled</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT__EVENTS_HANDLED = eINSTANCE.getRobot_EventsHandled();

		/**
		 * The meta object literal for the '<em><b>Run Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT__RUN_ACTIONS = eINSTANCE.getRobot_RunActions();

		/**
		 * The meta object literal for the '<em><b>Infinite Loop Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT__INFINITE_LOOP_ACTIONS = eINSTANCE.getRobot_InfiniteLoopActions();

		/**
		 * The meta object literal for the '{@link robocodeSirius.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robocodeSirius.impl.EventImpl
		 * @see robocodeSirius.impl.RobocodeSiriusPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Event Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__EVENT_TYPE = eINSTANCE.getEvent_EventType();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__ACTIONS = eINSTANCE.getEvent_Actions();

		/**
		 * The meta object literal for the '{@link robocodeSirius.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robocodeSirius.impl.ActionImpl
		 * @see robocodeSirius.impl.RobocodeSiriusPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__COMMENT = eINSTANCE.getAction_Comment();

		/**
		 * The meta object literal for the '<em><b>Function Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__FUNCTION_NAME = eINSTANCE.getAction_FunctionName();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__PARAMETERS = eINSTANCE.getAction_Parameters();

		/**
		 * The meta object literal for the '{@link robocodeSirius.impl.AdvancedRobotImpl <em>Advanced Robot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robocodeSirius.impl.AdvancedRobotImpl
		 * @see robocodeSirius.impl.RobocodeSiriusPackageImpl#getAdvancedRobot()
		 * @generated
		 */
		EClass ADVANCED_ROBOT = eINSTANCE.getAdvancedRobot();

		/**
		 * The meta object literal for the '{@link robocodeSirius.impl.RangeControlRobotImpl <em>Range Control Robot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robocodeSirius.impl.RangeControlRobotImpl
		 * @see robocodeSirius.impl.RobocodeSiriusPackageImpl#getRangeControlRobot()
		 * @generated
		 */
		EClass RANGE_CONTROL_ROBOT = eINSTANCE.getRangeControlRobot();

		/**
		 * The meta object literal for the '{@link robocodeSirius.impl.RobotDesignImpl <em>Robot Design</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robocodeSirius.impl.RobotDesignImpl
		 * @see robocodeSirius.impl.RobocodeSiriusPackageImpl#getRobotDesign()
		 * @generated
		 */
		EClass ROBOT_DESIGN = eINSTANCE.getRobotDesign();

		/**
		 * The meta object literal for the '<em><b>Robot</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT_DESIGN__ROBOT = eINSTANCE.getRobotDesign_Robot();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT_DESIGN__EVENTS = eINSTANCE.getRobotDesign_Events();

		/**
		 * The meta object literal for the '{@link robocodeSirius.EventType <em>Event Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robocodeSirius.EventType
		 * @see robocodeSirius.impl.RobocodeSiriusPackageImpl#getEventType()
		 * @generated
		 */
		EEnum EVENT_TYPE = eINSTANCE.getEventType();

	}

} //RobocodeSiriusPackage
