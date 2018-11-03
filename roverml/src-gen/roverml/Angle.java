/**
 */
package roverml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Angle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roverml.Angle#getUnits <em>Units</em>}</li>
 * </ul>
 *
 * @see roverml.RovermlPackage#getAngle()
 * @model
 * @generated
 */
public interface Angle extends SingleQuantity {
	/**
	 * Returns the value of the '<em><b>Units</b></em>' attribute.
	 * The literals are from the enumeration {@link roverml.AngleUnits}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' attribute.
	 * @see roverml.AngleUnits
	 * @see #setUnits(AngleUnits)
	 * @see roverml.RovermlPackage#getAngle_Units()
	 * @model required="true" transient="true"
	 * @generated
	 */
	AngleUnits getUnits();

	/**
	 * Sets the value of the '{@link roverml.Angle#getUnits <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units</em>' attribute.
	 * @see roverml.AngleUnits
	 * @see #getUnits()
	 * @generated
	 */
	void setUnits(AngleUnits value);

} // Angle
