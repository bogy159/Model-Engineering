/**
 */
package roverml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distance Sensor Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roverml.DistanceSensorTrigger#getLength <em>Length</em>}</li>
 *   <li>{@link roverml.DistanceSensorTrigger#getDist <em>Dist</em>}</li>
 *   <li>{@link roverml.DistanceSensorTrigger#getDistancesensor <em>Distancesensor</em>}</li>
 * </ul>
 *
 * @see roverml.RovermlPackage#getDistanceSensorTrigger()
 * @model
 * @generated
 */
public interface DistanceSensorTrigger extends Triggered {
	/**
	 * Returns the value of the '<em><b>Length</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' reference.
	 * @see #setLength(Length)
	 * @see roverml.RovermlPackage#getDistanceSensorTrigger_Length()
	 * @model
	 * @generated
	 */
	Length getLength();

	/**
	 * Sets the value of the '{@link roverml.DistanceSensorTrigger#getLength <em>Length</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' reference.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(Length value);

	/**
	 * Returns the value of the '<em><b>Dist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dist</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dist</em>' attribute.
	 * @see #setDist(double)
	 * @see roverml.RovermlPackage#getDistanceSensorTrigger_Dist()
	 * @model required="true"
	 * @generated
	 */
	double getDist();

	/**
	 * Sets the value of the '{@link roverml.DistanceSensorTrigger#getDist <em>Dist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dist</em>' attribute.
	 * @see #getDist()
	 * @generated
	 */
	void setDist(double value);

	/**
	 * Returns the value of the '<em><b>Distancesensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distancesensor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distancesensor</em>' reference.
	 * @see #setDistancesensor(DistanceSensor)
	 * @see roverml.RovermlPackage#getDistanceSensorTrigger_Distancesensor()
	 * @model
	 * @generated
	 */
	DistanceSensor getDistancesensor();

	/**
	 * Sets the value of the '{@link roverml.DistanceSensorTrigger#getDistancesensor <em>Distancesensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distancesensor</em>' reference.
	 * @see #getDistancesensor()
	 * @generated
	 */
	void setDistancesensor(DistanceSensor value);

} // DistanceSensorTrigger
