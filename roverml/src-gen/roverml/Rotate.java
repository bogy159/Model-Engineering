/**
 */
package roverml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roverml.Rotate#getAngle <em>Angle</em>}</li>
 *   <li>{@link roverml.Rotate#getAngleUnits <em>Angle Units</em>}</li>
 * </ul>
 *
 * @see roverml.RovermlPackage#getRotate()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='regularTransCount'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot regularTransCount='self.outgoingTransitions -&gt; select(m | m.oclIsTypeOf(Regular) = true) -&gt; size() &lt;= 1'"
 * @generated
 */
public interface Rotate extends Command {
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
	 * @see roverml.RovermlPackage#getRotate_Angle()
	 * @model required="true"
	 * @generated
	 */
	int getAngle();

	/**
	 * Sets the value of the '{@link roverml.Rotate#getAngle <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' attribute.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(int value);

	/**
	 * Returns the value of the '<em><b>Angle Units</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle Units</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle Units</em>' containment reference.
	 * @see #setAngleUnits(Angle)
	 * @see roverml.RovermlPackage#getRotate_AngleUnits()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Angle getAngleUnits();

	/**
	 * Sets the value of the '{@link roverml.Rotate#getAngleUnits <em>Angle Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Units</em>' containment reference.
	 * @see #getAngleUnits()
	 * @generated
	 */
	void setAngleUnits(Angle value);

} // Rotate
