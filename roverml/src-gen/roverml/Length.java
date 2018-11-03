/**
 */
package roverml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Length</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roverml.Length#getUnits <em>Units</em>}</li>
 * </ul>
 *
 * @see roverml.RovermlPackage#getLength()
 * @model
 * @generated
 */
public interface Length extends SingleQuantity {
	/**
	 * Returns the value of the '<em><b>Units</b></em>' attribute.
	 * The literals are from the enumeration {@link roverml.LengthUnits}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' attribute.
	 * @see roverml.LengthUnits
	 * @see #setUnits(LengthUnits)
	 * @see roverml.RovermlPackage#getLength_Units()
	 * @model required="true" transient="true"
	 * @generated
	 */
	LengthUnits getUnits();

	/**
	 * Sets the value of the '{@link roverml.Length#getUnits <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units</em>' attribute.
	 * @see roverml.LengthUnits
	 * @see #getUnits()
	 * @generated
	 */
	void setUnits(LengthUnits value);

} // Length
