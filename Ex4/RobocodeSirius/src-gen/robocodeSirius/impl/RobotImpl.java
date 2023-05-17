/**
 */
package robocodeSirius.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import robocodeSirius.Action;
import robocodeSirius.Event;
import robocodeSirius.RobocodeSiriusPackage;
import robocodeSirius.Robot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Robot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robocodeSirius.impl.RobotImpl#getName <em>Name</em>}</li>
 *   <li>{@link robocodeSirius.impl.RobotImpl#getEventsHandled <em>Events Handled</em>}</li>
 *   <li>{@link robocodeSirius.impl.RobotImpl#getRunActions <em>Run Actions</em>}</li>
 *   <li>{@link robocodeSirius.impl.RobotImpl#getInfiniteLoopActions <em>Infinite Loop Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RobotImpl extends MinimalEObjectImpl.Container implements Robot {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEventsHandled() <em>Events Handled</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventsHandled()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> eventsHandled;

	/**
	 * The cached value of the '{@link #getRunActions() <em>Run Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> runActions;

	/**
	 * The cached value of the '{@link #getInfiniteLoopActions() <em>Infinite Loop Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfiniteLoopActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> infiniteLoopActions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RobotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobocodeSiriusPackage.Literals.ROBOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobocodeSiriusPackage.ROBOT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Event> getEventsHandled() {
		if (eventsHandled == null) {
			eventsHandled = new EObjectResolvingEList<Event>(Event.class, this,
					RobocodeSiriusPackage.ROBOT__EVENTS_HANDLED);
		}
		return eventsHandled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Action> getRunActions() {
		if (runActions == null) {
			runActions = new EObjectContainmentEList<Action>(Action.class, this,
					RobocodeSiriusPackage.ROBOT__RUN_ACTIONS);
		}
		return runActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Action> getInfiniteLoopActions() {
		if (infiniteLoopActions == null) {
			infiniteLoopActions = new EObjectContainmentEList<Action>(Action.class, this,
					RobocodeSiriusPackage.ROBOT__INFINITE_LOOP_ACTIONS);
		}
		return infiniteLoopActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RobocodeSiriusPackage.ROBOT__RUN_ACTIONS:
			return ((InternalEList<?>) getRunActions()).basicRemove(otherEnd, msgs);
		case RobocodeSiriusPackage.ROBOT__INFINITE_LOOP_ACTIONS:
			return ((InternalEList<?>) getInfiniteLoopActions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RobocodeSiriusPackage.ROBOT__NAME:
			return getName();
		case RobocodeSiriusPackage.ROBOT__EVENTS_HANDLED:
			return getEventsHandled();
		case RobocodeSiriusPackage.ROBOT__RUN_ACTIONS:
			return getRunActions();
		case RobocodeSiriusPackage.ROBOT__INFINITE_LOOP_ACTIONS:
			return getInfiniteLoopActions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RobocodeSiriusPackage.ROBOT__NAME:
			setName((String) newValue);
			return;
		case RobocodeSiriusPackage.ROBOT__EVENTS_HANDLED:
			getEventsHandled().clear();
			getEventsHandled().addAll((Collection<? extends Event>) newValue);
			return;
		case RobocodeSiriusPackage.ROBOT__RUN_ACTIONS:
			getRunActions().clear();
			getRunActions().addAll((Collection<? extends Action>) newValue);
			return;
		case RobocodeSiriusPackage.ROBOT__INFINITE_LOOP_ACTIONS:
			getInfiniteLoopActions().clear();
			getInfiniteLoopActions().addAll((Collection<? extends Action>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case RobocodeSiriusPackage.ROBOT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case RobocodeSiriusPackage.ROBOT__EVENTS_HANDLED:
			getEventsHandled().clear();
			return;
		case RobocodeSiriusPackage.ROBOT__RUN_ACTIONS:
			getRunActions().clear();
			return;
		case RobocodeSiriusPackage.ROBOT__INFINITE_LOOP_ACTIONS:
			getInfiniteLoopActions().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case RobocodeSiriusPackage.ROBOT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case RobocodeSiriusPackage.ROBOT__EVENTS_HANDLED:
			return eventsHandled != null && !eventsHandled.isEmpty();
		case RobocodeSiriusPackage.ROBOT__RUN_ACTIONS:
			return runActions != null && !runActions.isEmpty();
		case RobocodeSiriusPackage.ROBOT__INFINITE_LOOP_ACTIONS:
			return infiniteLoopActions != null && !infiniteLoopActions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RobotImpl
