/**
 */
package robocodeSirius;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Event Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see robocodeSirius.RobocodeSiriusPackage#getEventType()
 * @model
 * @generated
 */
public enum EventType implements Enumerator {
	/**
	 * The '<em><b>Bullet Hit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BULLET_HIT_VALUE
	 * @generated
	 * @ordered
	 */
	BULLET_HIT(8, "BulletHit", "BulletHit"),

	/**
	 * The '<em><b>Bullet Missed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BULLET_MISSED_VALUE
	 * @generated
	 * @ordered
	 */
	BULLET_MISSED(1, "BulletMissed", "BulletMissed"),

	/**
	 * The '<em><b>Death</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEATH_VALUE
	 * @generated
	 * @ordered
	 */
	DEATH(2, "Death", "Death"),

	/**
	 * The '<em><b>Hit By Bullet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIT_BY_BULLET_VALUE
	 * @generated
	 * @ordered
	 */
	HIT_BY_BULLET(3, "HitByBullet", "HitByBullet"),

	/**
	 * The '<em><b>Hit Robot</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIT_ROBOT_VALUE
	 * @generated
	 * @ordered
	 */
	HIT_ROBOT(4, "HitRobot", "HitRobot"),

	/**
	 * The '<em><b>Hit Wall</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIT_WALL_VALUE
	 * @generated
	 * @ordered
	 */
	HIT_WALL(5, "HitWall", "HitWall"),

	/**
	 * The '<em><b>Scanned Robot</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCANNED_ROBOT_VALUE
	 * @generated
	 * @ordered
	 */
	SCANNED_ROBOT(6, "ScannedRobot", "ScannedRobot"),

	/**
	 * The '<em><b>Win</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIN_VALUE
	 * @generated
	 * @ordered
	 */
	WIN(7, "Win", "Win"),

	/**
	 * The '<em><b>Custom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM(0, "Custom", "Custom");

	/**
	 * The '<em><b>Bullet Hit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BULLET_HIT
	 * @model name="BulletHit"
	 * @generated
	 * @ordered
	 */
	public static final int BULLET_HIT_VALUE = 8;

	/**
	 * The '<em><b>Bullet Missed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BULLET_MISSED
	 * @model name="BulletMissed"
	 * @generated
	 * @ordered
	 */
	public static final int BULLET_MISSED_VALUE = 1;

	/**
	 * The '<em><b>Death</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEATH
	 * @model name="Death"
	 * @generated
	 * @ordered
	 */
	public static final int DEATH_VALUE = 2;

	/**
	 * The '<em><b>Hit By Bullet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIT_BY_BULLET
	 * @model name="HitByBullet"
	 * @generated
	 * @ordered
	 */
	public static final int HIT_BY_BULLET_VALUE = 3;

	/**
	 * The '<em><b>Hit Robot</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIT_ROBOT
	 * @model name="HitRobot"
	 * @generated
	 * @ordered
	 */
	public static final int HIT_ROBOT_VALUE = 4;

	/**
	 * The '<em><b>Hit Wall</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIT_WALL
	 * @model name="HitWall"
	 * @generated
	 * @ordered
	 */
	public static final int HIT_WALL_VALUE = 5;

	/**
	 * The '<em><b>Scanned Robot</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCANNED_ROBOT
	 * @model name="ScannedRobot"
	 * @generated
	 * @ordered
	 */
	public static final int SCANNED_ROBOT_VALUE = 6;

	/**
	 * The '<em><b>Win</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIN
	 * @model name="Win"
	 * @generated
	 * @ordered
	 */
	public static final int WIN_VALUE = 7;

	/**
	 * The '<em><b>Custom</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM
	 * @model name="Custom"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM_VALUE = 0;

	/**
	 * An array of all the '<em><b>Event Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EventType[] VALUES_ARRAY = new EventType[] { BULLET_HIT, BULLET_MISSED, DEATH, HIT_BY_BULLET,
			HIT_ROBOT, HIT_WALL, SCANNED_ROBOT, WIN, CUSTOM, };

	/**
	 * A public read-only list of all the '<em><b>Event Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EventType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Event Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EventType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EventType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Event Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EventType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EventType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Event Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EventType get(int value) {
		switch (value) {
		case BULLET_HIT_VALUE:
			return BULLET_HIT;
		case BULLET_MISSED_VALUE:
			return BULLET_MISSED;
		case DEATH_VALUE:
			return DEATH;
		case HIT_BY_BULLET_VALUE:
			return HIT_BY_BULLET;
		case HIT_ROBOT_VALUE:
			return HIT_ROBOT;
		case HIT_WALL_VALUE:
			return HIT_WALL;
		case SCANNED_ROBOT_VALUE:
			return SCANNED_ROBOT;
		case WIN_VALUE:
			return WIN;
		case CUSTOM_VALUE:
			return CUSTOM;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EventType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
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
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //EventType
