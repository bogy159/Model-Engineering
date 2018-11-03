/**
 */
package roverml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roverml.Move#getLength <em>Length</em>}</li>
 *   <li>{@link roverml.Move#getVelocity <em>Velocity</em>}</li>
 *   <li>{@link roverml.Move#getVelocityUnits <em>Velocity Units</em>}</li>
 *   <li>{@link roverml.Move#getLengthUnits <em>Length Units</em>}</li>
 * </ul>
 *
 * @see roverml.RovermlPackage#getMove()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='velocityNotZero indefinitelyTrigg regularTransCount'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot velocityNotZero='self.velocity &lt;&gt; 0' indefinitelyTrigg='if length = 0.0 and self.outgoingTransitions -&gt; forAll(m | m.oclIsKindOf(Triggered) = true) then true elseif length &lt;&gt; 0.0 then true else false endif' regularTransCount='self.outgoingTransitions -&gt; select(m | m.oclIsTypeOf(Regular) = true) -&gt; size() &lt;= 1'"
 * @generated
 */
public interface Move extends Command {
	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(double)
	 * @see roverml.RovermlPackage#getMove_Length()
	 * @model required="true"
	 * @generated
	 */
	double getLength();

	/**
	 * Sets the value of the '{@link roverml.Move#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(double value);

	/**
	 * Returns the value of the '<em><b>Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Velocity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Velocity</em>' attribute.
	 * @see #setVelocity(double)
	 * @see roverml.RovermlPackage#getMove_Velocity()
	 * @model required="true"
	 * @generated
	 */
	double getVelocity();

	/**
	 * Sets the value of the '{@link roverml.Move#getVelocity <em>Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Velocity</em>' attribute.
	 * @see #getVelocity()
	 * @generated
	 */
	void setVelocity(double value);

	/**
	 * Returns the value of the '<em><b>Velocity Units</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Velocity Units</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Velocity Units</em>' containment reference.
	 * @see #setVelocityUnits(Velocity)
	 * @see roverml.RovermlPackage#getMove_VelocityUnits()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Velocity getVelocityUnits();

	/**
	 * Sets the value of the '{@link roverml.Move#getVelocityUnits <em>Velocity Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Velocity Units</em>' containment reference.
	 * @see #getVelocityUnits()
	 * @generated
	 */
	void setVelocityUnits(Velocity value);

	/**
	 * Returns the value of the '<em><b>Length Units</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length Units</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length Units</em>' containment reference.
	 * @see #setLengthUnits(Length)
	 * @see roverml.RovermlPackage#getMove_LengthUnits()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Length getLengthUnits();

	/**
	 * Sets the value of the '{@link roverml.Move#getLengthUnits <em>Length Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length Units</em>' containment reference.
	 * @see #getLengthUnits()
	 * @generated
	 */
	void setLengthUnits(Length value);

} // Move
