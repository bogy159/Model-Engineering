/**
 */
package roverml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roverml.Program#getRoverExec <em>Rover Exec</em>}</li>
 *   <li>{@link roverml.Program#getBlocks <em>Blocks</em>}</li>
 * </ul>
 *
 * @see roverml.RovermlPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Rover Exec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rover Exec</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rover Exec</em>' reference.
	 * @see #setRoverExec(Rover)
	 * @see roverml.RovermlPackage#getProgram_RoverExec()
	 * @model
	 * @generated
	 */
	Rover getRoverExec();

	/**
	 * Sets the value of the '{@link roverml.Program#getRoverExec <em>Rover Exec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rover Exec</em>' reference.
	 * @see #getRoverExec()
	 * @generated
	 */
	void setRoverExec(Rover value);

	/**
	 * Returns the value of the '<em><b>Blocks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocks</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocks</em>' containment reference.
	 * @see #setBlocks(Block)
	 * @see roverml.RovermlPackage#getProgram_Blocks()
	 * @model containment="true"
	 * @generated
	 */
	Block getBlocks();

	/**
	 * Sets the value of the '{@link roverml.Program#getBlocks <em>Blocks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blocks</em>' containment reference.
	 * @see #getBlocks()
	 * @generated
	 */
	void setBlocks(Block value);

} // Program
