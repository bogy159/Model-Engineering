/**
 */
package roverml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roverml.Time#getUnits <em>Units</em>}</li>
 * </ul>
 *
 * @see roverml.RovermlPackage#getTime()
 * @model
 * @generated
 */
public interface Time extends SingleQuantity {
	/**
	 * Returns the value of the '<em><b>Units</b></em>' attribute.
	 * The literals are from the enumeration {@link roverml.TimeUnits}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' attribute.
	 * @see roverml.TimeUnits
	 * @see #setUnits(TimeUnits)
	 * @see roverml.RovermlPackage#getTime_Units()
	 * @model required="true" transient="true"
	 * @generated
	 */
	TimeUnits getUnits();

	/**
	 * Sets the value of the '{@link roverml.Time#getUnits <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units</em>' attribute.
	 * @see roverml.TimeUnits
	 * @see #getUnits()
	 * @generated
	 */
	void setUnits(TimeUnits value);

} // Time
