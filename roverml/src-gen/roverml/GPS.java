/**
 */
package roverml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GPS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roverml.GPS#getX <em>X</em>}</li>
 *   <li>{@link roverml.GPS#getY <em>Y</em>}</li>
 * </ul>
 *
 * @see roverml.RovermlPackage#getGPS()
 * @model
 * @generated
 */
public interface GPS extends Sensor {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Float}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute list.
	 * @see roverml.RovermlPackage#getGPS_X()
	 * @model unique="false"
	 * @generated
	 */
	EList<Float> getX();

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Float}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute list.
	 * @see roverml.RovermlPackage#getGPS_Y()
	 * @model unique="false"
	 * @generated
	 */
	EList<Float> getY();

} // GPS
