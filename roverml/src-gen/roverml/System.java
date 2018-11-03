/**
 */
package roverml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roverml.System#getPrograms <em>Programs</em>}</li>
 *   <li>{@link roverml.System#getRovers <em>Rovers</em>}</li>
 * </ul>
 *
 * @see roverml.RovermlPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Programs</b></em>' containment reference list.
	 * The list contents are of type {@link roverml.Program}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Programs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programs</em>' containment reference list.
	 * @see roverml.RovermlPackage#getSystem_Programs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Program> getPrograms();

	/**
	 * Returns the value of the '<em><b>Rovers</b></em>' containment reference list.
	 * The list contents are of type {@link roverml.Rover}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rovers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rovers</em>' containment reference list.
	 * @see roverml.RovermlPackage#getSystem_Rovers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rover> getRovers();

} // System
