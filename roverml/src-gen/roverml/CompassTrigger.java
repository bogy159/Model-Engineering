/**
 */
package roverml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compass Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roverml.CompassTrigger#getAngles <em>Angles</em>}</li>
 *   <li>{@link roverml.CompassTrigger#getAngle <em>Angle</em>}</li>
 *   <li>{@link roverml.CompassTrigger#getCompass <em>Compass</em>}</li>
 * </ul>
 *
 * @see roverml.RovermlPackage#getCompassTrigger()
 * @model
 * @generated
 */
public interface CompassTrigger extends Triggered {
	/**
	 * Returns the value of the '<em><b>Angles</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angles</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angles</em>' reference.
	 * @see #setAngles(Angle)
	 * @see roverml.RovermlPackage#getCompassTrigger_Angles()
	 * @model
	 * @generated
	 */
	Angle getAngles();

	/**
	 * Sets the value of the '{@link roverml.CompassTrigger#getAngles <em>Angles</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angles</em>' reference.
	 * @see #getAngles()
	 * @generated
	 */
	void setAngles(Angle value);

	/**
	 * Returns the value of the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle</em>' attribute.
	 * @see #setAngle(int)
	 * @see roverml.RovermlPackage#getCompassTrigger_Angle()
	 * @model required="true"
	 * @generated
	 */
	int getAngle();

	/**
	 * Sets the value of the '{@link roverml.CompassTrigger#getAngle <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' attribute.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(int value);

	/**
	 * Returns the value of the '<em><b>Compass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compass</em>' reference.
	 * @see #setCompass(Compass)
	 * @see roverml.RovermlPackage#getCompassTrigger_Compass()
	 * @model
	 * @generated
	 */
	Compass getCompass();

	/**
	 * Sets the value of the '{@link roverml.CompassTrigger#getCompass <em>Compass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compass</em>' reference.
	 * @see #getCompass()
	 * @generated
	 */
	void setCompass(Compass value);

} // CompassTrigger
