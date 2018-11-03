/**
 */
package roverml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Length Units</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see roverml.RovermlPackage#getLengthUnits()
 * @model
 * @generated
 */
public enum LengthUnits implements Enumerator {
	/**
	 * The '<em><b>MILLIMETERS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MILLIMETERS_VALUE
	 * @generated
	 * @ordered
	 */
	MILLIMETERS(0, "MILLIMETERS", "MILLIMETERS"),

	/**
	 * The '<em><b>CENTIMETERS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CENTIMETERS_VALUE
	 * @generated
	 * @ordered
	 */
	CENTIMETERS(0, "CENTIMETERS", "CENTIMETERS"),

	/**
	 * The '<em><b>METERS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METERS_VALUE
	 * @generated
	 * @ordered
	 */
	METERS(0, "METERS", "METERS");

	/**
	 * The '<em><b>MILLIMETERS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MILLIMETERS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MILLIMETERS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MILLIMETERS_VALUE = 0;

	/**
	 * The '<em><b>CENTIMETERS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CENTIMETERS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CENTIMETERS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CENTIMETERS_VALUE = 0;

	/**
	 * The '<em><b>METERS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>METERS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #METERS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int METERS_VALUE = 0;

	/**
	 * An array of all the '<em><b>Length Units</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LengthUnits[] VALUES_ARRAY = new LengthUnits[] { MILLIMETERS, CENTIMETERS, METERS, };

	/**
	 * A public read-only list of all the '<em><b>Length Units</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LengthUnits> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Length Units</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LengthUnits get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LengthUnits result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Length Units</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LengthUnits getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LengthUnits result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Length Units</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LengthUnits get(int value) {
		switch (value) {
		case MILLIMETERS_VALUE:
			return MILLIMETERS;
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
	private LengthUnits(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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

} //LengthUnits
