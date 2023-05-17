/**
 */
package robocodeSirius;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robocodeSirius.Event#getEventType <em>Event Type</em>}</li>
 *   <li>{@link robocodeSirius.Event#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see robocodeSirius.RobocodeSiriusPackage#getEvent()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='DeathEventActionsCheck'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot DeathEventActionsCheck='\n  \t\t\t self.eventType = EventType::Death implies (self.eventType = EventType::Death and self.actions-&gt;notEmpty())'"
 * @generated
 */
public interface Event extends EObject {
	/**
	 * Returns the value of the '<em><b>Event Type</b></em>' attribute.
	 * The default value is <code>"Custom"</code>.
	 * The literals are from the enumeration {@link robocodeSirius.EventType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Type</em>' attribute.
	 * @see robocodeSirius.EventType
	 * @see #setEventType(EventType)
	 * @see robocodeSirius.RobocodeSiriusPackage#getEvent_EventType()
	 * @model default="Custom"
	 * @generated
	 */
	EventType getEventType();

	/**
	 * Sets the value of the '{@link robocodeSirius.Event#getEventType <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Type</em>' attribute.
	 * @see robocodeSirius.EventType
	 * @see #getEventType()
	 * @generated
	 */
	void setEventType(EventType value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link robocodeSirius.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see robocodeSirius.RobocodeSiriusPackage#getEvent_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

} // Event
