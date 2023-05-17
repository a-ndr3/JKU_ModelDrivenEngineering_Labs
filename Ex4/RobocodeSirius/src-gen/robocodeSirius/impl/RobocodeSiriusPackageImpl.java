/**
 */
package robocodeSirius.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import robocodeSirius.Action;
import robocodeSirius.AdvancedRobot;
import robocodeSirius.Event;
import robocodeSirius.EventType;
import robocodeSirius.RangeControlRobot;
import robocodeSirius.RobocodeSiriusFactory;
import robocodeSirius.RobocodeSiriusPackage;
import robocodeSirius.Robot;
import robocodeSirius.RobotDesign;

import robocodeSirius.util.RobocodeSiriusValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RobocodeSiriusPackageImpl extends EPackageImpl implements RobocodeSiriusPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass robotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass advancedRobotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeControlRobotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass robotDesignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eventTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see robocodeSirius.RobocodeSiriusPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RobocodeSiriusPackageImpl() {
		super(eNS_URI, RobocodeSiriusFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link RobocodeSiriusPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RobocodeSiriusPackage init() {
		if (isInited)
			return (RobocodeSiriusPackage) EPackage.Registry.INSTANCE.getEPackage(RobocodeSiriusPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRobocodeSiriusPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RobocodeSiriusPackageImpl theRobocodeSiriusPackage = registeredRobocodeSiriusPackage instanceof RobocodeSiriusPackageImpl
				? (RobocodeSiriusPackageImpl) registeredRobocodeSiriusPackage
				: new RobocodeSiriusPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theRobocodeSiriusPackage.createPackageContents();

		// Initialize created meta-data
		theRobocodeSiriusPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theRobocodeSiriusPackage, new EValidator.Descriptor() {
			@Override
			public EValidator getEValidator() {
				return RobocodeSiriusValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theRobocodeSiriusPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RobocodeSiriusPackage.eNS_URI, theRobocodeSiriusPackage);
		return theRobocodeSiriusPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRobot() {
		return robotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRobot_Name() {
		return (EAttribute) robotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRobot_EventsHandled() {
		return (EReference) robotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRobot_RunActions() {
		return (EReference) robotEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRobot_InfiniteLoopActions() {
		return (EReference) robotEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvent_EventType() {
		return (EAttribute) eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEvent_Actions() {
		return (EReference) eventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAction_Comment() {
		return (EAttribute) actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAction_FunctionName() {
		return (EAttribute) actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAction_Parameters() {
		return (EAttribute) actionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdvancedRobot() {
		return advancedRobotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRangeControlRobot() {
		return rangeControlRobotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRobotDesign() {
		return robotDesignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRobotDesign_Robot() {
		return (EReference) robotDesignEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRobotDesign_Events() {
		return (EReference) robotDesignEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEventType() {
		return eventTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RobocodeSiriusFactory getRobocodeSiriusFactory() {
		return (RobocodeSiriusFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		robotEClass = createEClass(ROBOT);
		createEAttribute(robotEClass, ROBOT__NAME);
		createEReference(robotEClass, ROBOT__EVENTS_HANDLED);
		createEReference(robotEClass, ROBOT__RUN_ACTIONS);
		createEReference(robotEClass, ROBOT__INFINITE_LOOP_ACTIONS);

		eventEClass = createEClass(EVENT);
		createEAttribute(eventEClass, EVENT__EVENT_TYPE);
		createEReference(eventEClass, EVENT__ACTIONS);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__COMMENT);
		createEAttribute(actionEClass, ACTION__FUNCTION_NAME);
		createEAttribute(actionEClass, ACTION__PARAMETERS);

		advancedRobotEClass = createEClass(ADVANCED_ROBOT);

		rangeControlRobotEClass = createEClass(RANGE_CONTROL_ROBOT);

		robotDesignEClass = createEClass(ROBOT_DESIGN);
		createEReference(robotDesignEClass, ROBOT_DESIGN__ROBOT);
		createEReference(robotDesignEClass, ROBOT_DESIGN__EVENTS);

		// Create enums
		eventTypeEEnum = createEEnum(EVENT_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		advancedRobotEClass.getESuperTypes().add(this.getRobot());
		rangeControlRobotEClass.getESuperTypes().add(this.getAdvancedRobot());

		// Initialize classes, features, and operations; add parameters
		initEClass(robotEClass, Robot.class, "Robot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRobot_Name(), ecorePackage.getEString(), "name", null, 1, 1, Robot.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRobot_EventsHandled(), this.getEvent(), null, "eventsHandled", null, 0, -1, Robot.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRobot_RunActions(), this.getAction(), null, "runActions", null, 0, -1, Robot.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRobot_InfiniteLoopActions(), this.getAction(), null, "infiniteLoopActions", null, 0, -1,
				Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvent_EventType(), this.getEventType(), "eventType", "Custom", 0, 1, Event.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvent_Actions(), this.getAction(), null, "actions", null, 0, -1, Event.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, Action.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_FunctionName(), ecorePackage.getEString(), "functionName", null, 1, 1, Action.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_Parameters(), ecorePackage.getEString(), "parameters", null, 0, 1, Action.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(advancedRobotEClass, AdvancedRobot.class, "AdvancedRobot", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(rangeControlRobotEClass, RangeControlRobot.class, "RangeControlRobot", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(robotDesignEClass, RobotDesign.class, "RobotDesign", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRobotDesign_Robot(), this.getRobot(), null, "robot", null, 0, -1, RobotDesign.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRobotDesign_Events(), this.getEvent(), null, "events", null, 0, -1, RobotDesign.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(eventTypeEEnum, EventType.class, "EventType");
		addEEnumLiteral(eventTypeEEnum, EventType.BULLET_HIT);
		addEEnumLiteral(eventTypeEEnum, EventType.BULLET_MISSED);
		addEEnumLiteral(eventTypeEEnum, EventType.DEATH);
		addEEnumLiteral(eventTypeEEnum, EventType.HIT_BY_BULLET);
		addEEnumLiteral(eventTypeEEnum, EventType.HIT_ROBOT);
		addEEnumLiteral(eventTypeEEnum, EventType.HIT_WALL);
		addEEnumLiteral(eventTypeEEnum, EventType.SCANNED_ROBOT);
		addEEnumLiteral(eventTypeEEnum, EventType.WIN);
		addEEnumLiteral(eventTypeEEnum, EventType.CUSTOM);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation(this, source, new String[] { "ecore", "http://www.eclipse.org/emf/2002/Ecore" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source,
				new String[] { "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
						"settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "validationDelegates",
						"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot" });
		addAnnotation(robotEClass, source,
				new String[] { "constraints", "UniqueEventHandlers NoCustomEvent ForbiddenActionsForRobot" });
		addAnnotation(eventEClass, source, new String[] { "constraints", "DeathEventActionsCheck" });
		addAnnotation(advancedRobotEClass, source, new String[] { "constraints", "AdvancedRobotBulletHitHandling" });
		addAnnotation(rangeControlRobotEClass, source, new String[] { "constraints", "RangeControlRobotEventsAmount" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(robotEClass, source, new String[] { "UniqueEventHandlers",
				"Tuple {\n\tmessage : String = \'Cant set more than 1 event of each type\',\n\tstatus : Boolean = \n\t\t\tself.eventsHandled->isUnique(eventType)\n}.status",
				"NoCustomEvent",
				"Tuple {\n\tmessage : String = \'Robot cant have custom events\',\n\tstatus : Boolean = \n\t\t\tself.oclIsTypeOf(Robot) implies self.eventsHandled->forAll(e | e.eventType <> EventType::Custom)\n}.status",
				"ForbiddenActionsForRobot",
				"Tuple {\n\tmessage : String = \'Forbidden actions for this kind of Robot\',\n\tstatus : Boolean = \n\t\t\tself.oclIsTypeOf(Robot) or self.oclIsTypeOf(AdvancedRobot) implies\t\n\t\t\t\tself.runActions->forAll(a | a.functionName <> \'setTurnRate\' and a.functionName <> \'setGunTurnRotationRate\' and a.functionName <> \'setVelocityRate\' and a.functionName <> \'setRadarRotationRate\') and\n\t\t\t\t\tself.infiniteLoopActions->forAll(a | a.functionName <> \'setTurnRate\' and a.functionName <> \'setGunTurnRotationRate\' and a.functionName <> \'setVelocityRate\' and a.functionName <> \'setRadarRotationRate\') and\n\t\t\t\t\t\tself.eventsHandled.actions->forAll(a | a.functionName <> \'setTurnRate\' and a.functionName <> \'setGunTurnRotationRate\' and a.functionName <> \'setVelocityRate\' and a.functionName <> \'setRadarRotationRate\')\n}.status" });
		addAnnotation(robotEClass, new boolean[] { true }, "http://www.eclipse.org/emf/2002/GenModel", new String[] {});
		addAnnotation(eventEClass, source, new String[] { "DeathEventActionsCheck",
				"\n  \t\t\t self.eventType = EventType::Death implies (self.eventType = EventType::Death and self.actions->notEmpty())" });
		addAnnotation(eventEClass, new boolean[] { true }, "http://www.eclipse.org/emf/2002/GenModel",
				new String[] { "documentation", "Implemented death event has to have at least one action" });
		addAnnotation(advancedRobotEClass, source, new String[] { "AdvancedRobotBulletHitHandling",
				"\n  \t\t\tself.oclIsTypeOf(AdvancedRobot) implies self.eventsHandled->exists(e | e.eventType = EventType::BulletHit and e.actions->forAll(a | a.functionName <> \'\'))" });
		addAnnotation(advancedRobotEClass, new boolean[] { true }, "http://www.eclipse.org/emf/2002/GenModel",
				new String[] { "documentation",
						"Advanced robot has to have bullet hit event and actions are not supposed to be empty" });
		addAnnotation(rangeControlRobotEClass, source, new String[] { "RangeControlRobotEventsAmount",
				"\n  \t\t\tself.eventsHandled->collect(e | e.eventType)->asSet()->size() >= 2" });
		addAnnotation(rangeControlRobotEClass, new boolean[] { true }, "http://www.eclipse.org/emf/2002/GenModel",
				new String[] { "documentation", "RangeControl bot suppose to have at least 2 events when created" });
	}

} //RobocodeSiriusPackageImpl
