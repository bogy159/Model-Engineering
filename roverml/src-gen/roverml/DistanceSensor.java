/**
 */
package roverml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distance Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roverml.DistanceSensor#getDistance <em>Distance</em>}</li>
 * </ul>
 *
 * @see roverml.RovermlPackage#getDistanceSensor()
 * @model
 * @generated
 */
public interface DistanceSensor extends Sensor {
	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(double)
	 * @see roverml.RovermlPackage#getDistanceSensor_Distance()
	 * @model required="true"
	 * @generated
	 */
	double getDistance();

	/**
	 * Sets the value of the '{@link roverml.DistanceSensor#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(double value);

} // DistanceSensor
