/**
 */
package roverml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Velocity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roverml.Velocity#getUnits <em>Units</em>}</li>
 * </ul>
 *
 * @see roverml.RovermlPackage#getVelocity()
 * @model
 * @generated
 */
public interface Velocity extends SingleQuantity {
	/**
	 * Returns the value of the '<em><b>Units</b></em>' attribute.
	 * The literals are from the enumeration {@link roverml.VelocityUnits}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' attribute.
	 * @see roverml.VelocityUnits
	 * @see #setUnits(VelocityUnits)
	 * @see roverml.RovermlPackage#getVelocity_Units()
	 * @model required="true" transient="true"
	 * @generated
	 */
	VelocityUnits getUnits();

	/**
	 * Sets the value of the '{@link roverml.Velocity#getUnits <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units</em>' attribute.
	 * @see roverml.VelocityUnits
	 * @see #getUnits()
	 * @generated
	 */
	void setUnits(VelocityUnits value);

} // Velocity
