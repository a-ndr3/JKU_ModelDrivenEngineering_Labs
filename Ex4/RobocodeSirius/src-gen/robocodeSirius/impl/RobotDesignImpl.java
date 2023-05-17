/**
 */
package robocodeSirius.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import robocodeSirius.Event;
import robocodeSirius.RobocodeSiriusPackage;
import robocodeSirius.Robot;
import robocodeSirius.RobotDesign;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Robot Design</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robocodeSirius.impl.RobotDesignImpl#getRobot <em>Robot</em>}</li>
 *   <li>{@link robocodeSirius.impl.RobotDesignImpl#getEvents <em>Events</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RobotDesignImpl extends MinimalEObjectImpl.Container implements RobotDesign {
	/**
	 * The cached value of the '{@link #getRobot() <em>Robot</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRobot()
	 * @generated
	 * @ordered
	 */
	protected EList<Robot> robot;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RobotDesignImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobocodeSiriusPackage.Literals.ROBOT_DESIGN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Robot> getRobot() {
		if (robot == null) {
			robot = new EObjectContainmentEList<Robot>(Robot.class, this, RobocodeSiriusPackage.ROBOT_DESIGN__ROBOT);
		}
		return robot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<Event>(Event.class, this, RobocodeSiriusPackage.ROBOT_DESIGN__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RobocodeSiriusPackage.ROBOT_DESIGN__ROBOT:
			return ((InternalEList<?>) getRobot()).basicRemove(otherEnd, msgs);
		case RobocodeSiriusPackage.ROBOT_DESIGN__EVENTS:
			return ((InternalEList<?>) getEvents()).basicRemove(otherEnd, msgs);
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
		case RobocodeSiriusPackage.ROBOT_DESIGN__ROBOT:
			return getRobot();
		case RobocodeSiriusPackage.ROBOT_DESIGN__EVENTS:
			return getEvents();
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
		case RobocodeSiriusPackage.ROBOT_DESIGN__ROBOT:
			getRobot().clear();
			getRobot().addAll((Collection<? extends Robot>) newValue);
			return;
		case RobocodeSiriusPackage.ROBOT_DESIGN__EVENTS:
			getEvents().clear();
			getEvents().addAll((Collection<? extends Event>) newValue);
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
		case RobocodeSiriusPackage.ROBOT_DESIGN__ROBOT:
			getRobot().clear();
			return;
		case RobocodeSiriusPackage.ROBOT_DESIGN__EVENTS:
			getEvents().clear();
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
		case RobocodeSiriusPackage.ROBOT_DESIGN__ROBOT:
			return robot != null && !robot.isEmpty();
		case RobocodeSiriusPackage.ROBOT_DESIGN__EVENTS:
			return events != null && !events.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RobotDesignImpl
