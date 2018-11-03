/**
 */
package roverml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Triggered</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roverml.Triggered#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see roverml.RovermlPackage#getTriggered()
 * @model
 * @generated
 */
public interface Triggered extends Transition {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see #setOperator(char)
	 * @see roverml.RovermlPackage#getTriggered_Operator()
	 * @model
	 * @generated
	 */
	char getOperator();

	/**
	 * Sets the value of the '{@link roverml.Triggered#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(char value);

} // Triggered
