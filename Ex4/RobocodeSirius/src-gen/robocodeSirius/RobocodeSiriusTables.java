/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /RobocodeSirius/model/robocodeSirius.ecore
 * using:
 *   /RobocodeSirius/model/robocodeSirius.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package robocodeSirius;

import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
// import robocodeSirius.RobocodeSiriusTables;

/**
 * RobocodeSiriusTables provides the dispatch tables for the robocodeSirius for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class RobocodeSiriusTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(RobocodeSiriusPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			RobocodeSiriusTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RobocodeSiriusTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Action = new EcoreExecutorType(RobocodeSiriusPackage.Literals.ACTION, PACKAGE, 0);
		public static final EcoreExecutorType _AdvancedRobot = new EcoreExecutorType(RobocodeSiriusPackage.Literals.ADVANCED_ROBOT, PACKAGE, 0);
		public static final EcoreExecutorType _Event = new EcoreExecutorType(RobocodeSiriusPackage.Literals.EVENT, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _EventType = new EcoreExecutorEnumeration(RobocodeSiriusPackage.Literals.EVENT_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _RangeControlRobot = new EcoreExecutorType(RobocodeSiriusPackage.Literals.RANGE_CONTROL_ROBOT, PACKAGE, 0);
		public static final EcoreExecutorType _Robot = new EcoreExecutorType(RobocodeSiriusPackage.Literals.ROBOT, PACKAGE, 0);
		public static final EcoreExecutorType _RobotDesign = new EcoreExecutorType(RobocodeSiriusPackage.Literals.ROBOT_DESIGN, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Action,
			_AdvancedRobot,
			_Event,
			_EventType,
			_RangeControlRobot,
			_Robot,
			_RobotDesign
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RobocodeSiriusTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Action__Action = new ExecutorFragment(Types._Action, RobocodeSiriusTables.Types._Action);
		private static final ExecutorFragment _Action__OclAny = new ExecutorFragment(Types._Action, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Action__OclElement = new ExecutorFragment(Types._Action, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _AdvancedRobot__AdvancedRobot = new ExecutorFragment(Types._AdvancedRobot, RobocodeSiriusTables.Types._AdvancedRobot);
		private static final ExecutorFragment _AdvancedRobot__OclAny = new ExecutorFragment(Types._AdvancedRobot, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AdvancedRobot__OclElement = new ExecutorFragment(Types._AdvancedRobot, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _AdvancedRobot__Robot = new ExecutorFragment(Types._AdvancedRobot, RobocodeSiriusTables.Types._Robot);

		private static final ExecutorFragment _Event__Event = new ExecutorFragment(Types._Event, RobocodeSiriusTables.Types._Event);
		private static final ExecutorFragment _Event__OclAny = new ExecutorFragment(Types._Event, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Event__OclElement = new ExecutorFragment(Types._Event, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _EventType__EventType = new ExecutorFragment(Types._EventType, RobocodeSiriusTables.Types._EventType);
		private static final ExecutorFragment _EventType__OclAny = new ExecutorFragment(Types._EventType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EventType__OclElement = new ExecutorFragment(Types._EventType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _EventType__OclEnumeration = new ExecutorFragment(Types._EventType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _EventType__OclType = new ExecutorFragment(Types._EventType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _RangeControlRobot__AdvancedRobot = new ExecutorFragment(Types._RangeControlRobot, RobocodeSiriusTables.Types._AdvancedRobot);
		private static final ExecutorFragment _RangeControlRobot__OclAny = new ExecutorFragment(Types._RangeControlRobot, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _RangeControlRobot__OclElement = new ExecutorFragment(Types._RangeControlRobot, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _RangeControlRobot__RangeControlRobot = new ExecutorFragment(Types._RangeControlRobot, RobocodeSiriusTables.Types._RangeControlRobot);
		private static final ExecutorFragment _RangeControlRobot__Robot = new ExecutorFragment(Types._RangeControlRobot, RobocodeSiriusTables.Types._Robot);

		private static final ExecutorFragment _Robot__OclAny = new ExecutorFragment(Types._Robot, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Robot__OclElement = new ExecutorFragment(Types._Robot, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Robot__Robot = new ExecutorFragment(Types._Robot, RobocodeSiriusTables.Types._Robot);

		private static final ExecutorFragment _RobotDesign__OclAny = new ExecutorFragment(Types._RobotDesign, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _RobotDesign__OclElement = new ExecutorFragment(Types._RobotDesign, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _RobotDesign__RobotDesign = new ExecutorFragment(Types._RobotDesign, RobocodeSiriusTables.Types._RobotDesign);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RobocodeSiriusTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RobocodeSiriusTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RobocodeSiriusTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Action__comment = new EcoreExecutorProperty(RobocodeSiriusPackage.Literals.ACTION__COMMENT, Types._Action, 0);
		public static final ExecutorProperty _Action__functionName = new EcoreExecutorProperty(RobocodeSiriusPackage.Literals.ACTION__FUNCTION_NAME, Types._Action, 1);
		public static final ExecutorProperty _Action__parameters = new EcoreExecutorProperty(RobocodeSiriusPackage.Literals.ACTION__PARAMETERS, Types._Action, 2);
		public static final ExecutorProperty _Action__Event__actions = new ExecutorPropertyWithImplementation("Event", Types._Action, 3, new EcoreLibraryOppositeProperty(RobocodeSiriusPackage.Literals.EVENT__ACTIONS));
		public static final ExecutorProperty _Action__Robot__infiniteLoopActions = new ExecutorPropertyWithImplementation("Robot", Types._Action, 4, new EcoreLibraryOppositeProperty(RobocodeSiriusPackage.Literals.ROBOT__INFINITE_LOOP_ACTIONS));
		public static final ExecutorProperty _Action__Robot__runActions = new ExecutorPropertyWithImplementation("Robot", Types._Action, 5, new EcoreLibraryOppositeProperty(RobocodeSiriusPackage.Literals.ROBOT__RUN_ACTIONS));

		public static final ExecutorProperty _Event__actions = new EcoreExecutorProperty(RobocodeSiriusPackage.Literals.EVENT__ACTIONS, Types._Event, 0);
		public static final ExecutorProperty _Event__eventType = new EcoreExecutorProperty(RobocodeSiriusPackage.Literals.EVENT__EVENT_TYPE, Types._Event, 1);
		public static final ExecutorProperty _Event__Robot__eventsHandled = new ExecutorPropertyWithImplementation("Robot", Types._Event, 2, new EcoreLibraryOppositeProperty(RobocodeSiriusPackage.Literals.ROBOT__EVENTS_HANDLED));
		public static final ExecutorProperty _Event__RobotDesign__events = new ExecutorPropertyWithImplementation("RobotDesign", Types._Event, 3, new EcoreLibraryOppositeProperty(RobocodeSiriusPackage.Literals.ROBOT_DESIGN__EVENTS));

		public static final ExecutorProperty _Robot__eventsHandled = new EcoreExecutorProperty(RobocodeSiriusPackage.Literals.ROBOT__EVENTS_HANDLED, Types._Robot, 0);
		public static final ExecutorProperty _Robot__infiniteLoopActions = new EcoreExecutorProperty(RobocodeSiriusPackage.Literals.ROBOT__INFINITE_LOOP_ACTIONS, Types._Robot, 1);
		public static final ExecutorProperty _Robot__name = new EcoreExecutorProperty(RobocodeSiriusPackage.Literals.ROBOT__NAME, Types._Robot, 2);
		public static final ExecutorProperty _Robot__runActions = new EcoreExecutorProperty(RobocodeSiriusPackage.Literals.ROBOT__RUN_ACTIONS, Types._Robot, 3);
		public static final ExecutorProperty _Robot__RobotDesign__robot = new ExecutorPropertyWithImplementation("RobotDesign", Types._Robot, 4, new EcoreLibraryOppositeProperty(RobocodeSiriusPackage.Literals.ROBOT_DESIGN__ROBOT));

		public static final ExecutorProperty _RobotDesign__events = new EcoreExecutorProperty(RobocodeSiriusPackage.Literals.ROBOT_DESIGN__EVENTS, Types._RobotDesign, 0);
		public static final ExecutorProperty _RobotDesign__robot = new EcoreExecutorProperty(RobocodeSiriusPackage.Literals.ROBOT_DESIGN__ROBOT, Types._RobotDesign, 1);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RobocodeSiriusTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Action =
			{
				Fragments._Action__OclAny /* 0 */,
				Fragments._Action__OclElement /* 1 */,
				Fragments._Action__Action /* 2 */
			};
		private static final int /*@NonNull*/ [] __Action = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _AdvancedRobot =
			{
				Fragments._AdvancedRobot__OclAny /* 0 */,
				Fragments._AdvancedRobot__OclElement /* 1 */,
				Fragments._AdvancedRobot__Robot /* 2 */,
				Fragments._AdvancedRobot__AdvancedRobot /* 3 */
			};
		private static final int /*@NonNull*/ [] __AdvancedRobot = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Event =
			{
				Fragments._Event__OclAny /* 0 */,
				Fragments._Event__OclElement /* 1 */,
				Fragments._Event__Event /* 2 */
			};
		private static final int /*@NonNull*/ [] __Event = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EventType =
			{
				Fragments._EventType__OclAny /* 0 */,
				Fragments._EventType__OclElement /* 1 */,
				Fragments._EventType__OclType /* 2 */,
				Fragments._EventType__OclEnumeration /* 3 */,
				Fragments._EventType__EventType /* 4 */
			};
		private static final int /*@NonNull*/ [] __EventType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _RangeControlRobot =
			{
				Fragments._RangeControlRobot__OclAny /* 0 */,
				Fragments._RangeControlRobot__OclElement /* 1 */,
				Fragments._RangeControlRobot__Robot /* 2 */,
				Fragments._RangeControlRobot__AdvancedRobot /* 3 */,
				Fragments._RangeControlRobot__RangeControlRobot /* 4 */
			};
		private static final int /*@NonNull*/ [] __RangeControlRobot = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Robot =
			{
				Fragments._Robot__OclAny /* 0 */,
				Fragments._Robot__OclElement /* 1 */,
				Fragments._Robot__Robot /* 2 */
			};
		private static final int /*@NonNull*/ [] __Robot = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _RobotDesign =
			{
				Fragments._RobotDesign__OclAny /* 0 */,
				Fragments._RobotDesign__OclElement /* 1 */,
				Fragments._RobotDesign__RobotDesign /* 2 */
			};
		private static final int /*@NonNull*/ [] __RobotDesign = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Action.initFragments(_Action, __Action);
			Types._AdvancedRobot.initFragments(_AdvancedRobot, __AdvancedRobot);
			Types._Event.initFragments(_Event, __Event);
			Types._EventType.initFragments(_EventType, __EventType);
			Types._RangeControlRobot.initFragments(_RangeControlRobot, __RangeControlRobot);
			Types._Robot.initFragments(_Robot, __Robot);
			Types._RobotDesign.initFragments(_RobotDesign, __RobotDesign);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RobocodeSiriusTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Action__Action = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Action__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Action__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _AdvancedRobot__AdvancedRobot = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AdvancedRobot__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AdvancedRobot__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AdvancedRobot__Robot = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Event__Event = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Event__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Event__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EventType__EventType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EventType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EventType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EventType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EventType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _RangeControlRobot__RangeControlRobot = {};
		private static final ExecutorOperation /*@NonNull*/ [] _RangeControlRobot__AdvancedRobot = {};
		private static final ExecutorOperation /*@NonNull*/ [] _RangeControlRobot__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _RangeControlRobot__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _RangeControlRobot__Robot = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Robot__Robot = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Robot__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Robot__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _RobotDesign__RobotDesign = {};
		private static final ExecutorOperation /*@NonNull*/ [] _RobotDesign__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _RobotDesign__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Action__Action.initOperations(_Action__Action);
			Fragments._Action__OclAny.initOperations(_Action__OclAny);
			Fragments._Action__OclElement.initOperations(_Action__OclElement);

			Fragments._AdvancedRobot__AdvancedRobot.initOperations(_AdvancedRobot__AdvancedRobot);
			Fragments._AdvancedRobot__OclAny.initOperations(_AdvancedRobot__OclAny);
			Fragments._AdvancedRobot__OclElement.initOperations(_AdvancedRobot__OclElement);
			Fragments._AdvancedRobot__Robot.initOperations(_AdvancedRobot__Robot);

			Fragments._Event__Event.initOperations(_Event__Event);
			Fragments._Event__OclAny.initOperations(_Event__OclAny);
			Fragments._Event__OclElement.initOperations(_Event__OclElement);

			Fragments._EventType__EventType.initOperations(_EventType__EventType);
			Fragments._EventType__OclAny.initOperations(_EventType__OclAny);
			Fragments._EventType__OclElement.initOperations(_EventType__OclElement);
			Fragments._EventType__OclEnumeration.initOperations(_EventType__OclEnumeration);
			Fragments._EventType__OclType.initOperations(_EventType__OclType);

			Fragments._RangeControlRobot__AdvancedRobot.initOperations(_RangeControlRobot__AdvancedRobot);
			Fragments._RangeControlRobot__OclAny.initOperations(_RangeControlRobot__OclAny);
			Fragments._RangeControlRobot__OclElement.initOperations(_RangeControlRobot__OclElement);
			Fragments._RangeControlRobot__RangeControlRobot.initOperations(_RangeControlRobot__RangeControlRobot);
			Fragments._RangeControlRobot__Robot.initOperations(_RangeControlRobot__Robot);

			Fragments._Robot__OclAny.initOperations(_Robot__OclAny);
			Fragments._Robot__OclElement.initOperations(_Robot__OclElement);
			Fragments._Robot__Robot.initOperations(_Robot__Robot);

			Fragments._RobotDesign__OclAny.initOperations(_RobotDesign__OclAny);
			Fragments._RobotDesign__OclElement.initOperations(_RobotDesign__OclElement);
			Fragments._RobotDesign__RobotDesign.initOperations(_RobotDesign__RobotDesign);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RobocodeSiriusTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Action = {
			RobocodeSiriusTables.Properties._Action__comment,
			RobocodeSiriusTables.Properties._Action__functionName,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RobocodeSiriusTables.Properties._Action__parameters
		};

		private static final ExecutorProperty /*@NonNull*/ [] _AdvancedRobot = {
			RobocodeSiriusTables.Properties._Robot__eventsHandled,
			RobocodeSiriusTables.Properties._Robot__infiniteLoopActions,
			RobocodeSiriusTables.Properties._Robot__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RobocodeSiriusTables.Properties._Robot__runActions
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Event = {
			RobocodeSiriusTables.Properties._Event__actions,
			RobocodeSiriusTables.Properties._Event__eventType,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EventType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _RangeControlRobot = {
			RobocodeSiriusTables.Properties._Robot__eventsHandled,
			RobocodeSiriusTables.Properties._Robot__infiniteLoopActions,
			RobocodeSiriusTables.Properties._Robot__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RobocodeSiriusTables.Properties._Robot__runActions
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Robot = {
			RobocodeSiriusTables.Properties._Robot__eventsHandled,
			RobocodeSiriusTables.Properties._Robot__infiniteLoopActions,
			RobocodeSiriusTables.Properties._Robot__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RobocodeSiriusTables.Properties._Robot__runActions
		};

		private static final ExecutorProperty /*@NonNull*/ [] _RobotDesign = {
			RobocodeSiriusTables.Properties._RobotDesign__events,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RobocodeSiriusTables.Properties._RobotDesign__robot
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Action__Action.initProperties(_Action);
			Fragments._AdvancedRobot__AdvancedRobot.initProperties(_AdvancedRobot);
			Fragments._Event__Event.initProperties(_Event);
			Fragments._EventType__EventType.initProperties(_EventType);
			Fragments._RangeControlRobot__RangeControlRobot.initProperties(_RangeControlRobot);
			Fragments._Robot__Robot.initProperties(_Robot);
			Fragments._RobotDesign__RobotDesign.initProperties(_RobotDesign);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RobocodeSiriusTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _EventType__BulletHit = new EcoreExecutorEnumerationLiteral(RobocodeSiriusPackage.Literals.EVENT_TYPE.getEEnumLiteral("BulletHit"), Types._EventType, 0);
		public static final EcoreExecutorEnumerationLiteral _EventType__BulletMissed = new EcoreExecutorEnumerationLiteral(RobocodeSiriusPackage.Literals.EVENT_TYPE.getEEnumLiteral("BulletMissed"), Types._EventType, 1);
		public static final EcoreExecutorEnumerationLiteral _EventType__Death = new EcoreExecutorEnumerationLiteral(RobocodeSiriusPackage.Literals.EVENT_TYPE.getEEnumLiteral("Death"), Types._EventType, 2);
		public static final EcoreExecutorEnumerationLiteral _EventType__HitByBullet = new EcoreExecutorEnumerationLiteral(RobocodeSiriusPackage.Literals.EVENT_TYPE.getEEnumLiteral("HitByBullet"), Types._EventType, 3);
		public static final EcoreExecutorEnumerationLiteral _EventType__HitRobot = new EcoreExecutorEnumerationLiteral(RobocodeSiriusPackage.Literals.EVENT_TYPE.getEEnumLiteral("HitRobot"), Types._EventType, 4);
		public static final EcoreExecutorEnumerationLiteral _EventType__HitWall = new EcoreExecutorEnumerationLiteral(RobocodeSiriusPackage.Literals.EVENT_TYPE.getEEnumLiteral("HitWall"), Types._EventType, 5);
		public static final EcoreExecutorEnumerationLiteral _EventType__ScannedRobot = new EcoreExecutorEnumerationLiteral(RobocodeSiriusPackage.Literals.EVENT_TYPE.getEEnumLiteral("ScannedRobot"), Types._EventType, 6);
		public static final EcoreExecutorEnumerationLiteral _EventType__Win = new EcoreExecutorEnumerationLiteral(RobocodeSiriusPackage.Literals.EVENT_TYPE.getEEnumLiteral("Win"), Types._EventType, 7);
		public static final EcoreExecutorEnumerationLiteral _EventType__Custom = new EcoreExecutorEnumerationLiteral(RobocodeSiriusPackage.Literals.EVENT_TYPE.getEEnumLiteral("Custom"), Types._EventType, 8);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _EventType = {
			_EventType__BulletHit,
			_EventType__BulletMissed,
			_EventType__Death,
			_EventType__HitByBullet,
			_EventType__HitRobot,
			_EventType__HitWall,
			_EventType__ScannedRobot,
			_EventType__Win,
			_EventType__Custom
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._EventType.initLiterals(_EventType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RobocodeSiriusTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new RobocodeSiriusTables();
	}

	private RobocodeSiriusTables() {
		super(RobocodeSiriusPackage.eNS_URI);
	}
}
