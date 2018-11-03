/**
 */
package roverml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GPS Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roverml.GPSTrigger#getPosition <em>Position</em>}</li>
 *   <li>{@link roverml.GPSTrigger#getX <em>X</em>}</li>
 *   <li>{@link roverml.GPSTrigger#getY <em>Y</em>}</li>
 *   <li>{@link roverml.GPSTrigger#getGps <em>Gps</em>}</li>
 * </ul>
 *
 * @see roverml.RovermlPackage#getGPSTrigger()
 * @model
 * @generated
 */
public interface GPSTrigger extends Triggered {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' reference.
	 * @see #setPosition(Position)
	 * @see roverml.RovermlPackage#getGPSTrigger_Position()
	 * @model
	 * @generated
	 */
	Position getPosition();

	/**
	 * Sets the value of the '{@link roverml.GPSTrigger#getPosition <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Position value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(float)
	 * @see roverml.RovermlPackage#getGPSTrigger_X()
	 * @model required="true"
	 * @generated
	 */
	float getX();

	/**
	 * Sets the value of the '{@link roverml.GPSTrigger#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(float value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(float)
	 * @see roverml.RovermlPackage#getGPSTrigger_Y()
	 * @model required="true"
	 * @generated
	 */
	float getY();

	/**
	 * Sets the value of the '{@link roverml.GPSTrigger#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(float value);

	/**
	 * Returns the value of the '<em><b>Gps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gps</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gps</em>' reference.
	 * @see #setGps(GPS)
	 * @see roverml.RovermlPackage#getGPSTrigger_Gps()
	 * @model
	 * @generated
	 */
	GPS getGps();

	/**
	 * Sets the value of the '{@link roverml.GPSTrigger#getGps <em>Gps</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gps</em>' reference.
	 * @see #getGps()
	 * @generated
	 */
	void setGps(GPS value);

} // GPSTrigger
