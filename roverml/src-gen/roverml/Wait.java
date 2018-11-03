/**
 */
package roverml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wait</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roverml.Wait#getTime <em>Time</em>}</li>
 *   <li>{@link roverml.Wait#getTimeUnit <em>Time Unit</em>}</li>
 * </ul>
 *
 * @see roverml.RovermlPackage#getWait()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='timeNotNegative regularTransCount'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot timeNotNegative='self.time &gt;= 0' regularTransCount='self.outgoingTransitions -&gt; select(m | m.oclIsTypeOf(Regular) = true) -&gt; size() &lt;= 1'"
 * @generated
 */
public interface Wait extends Command {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(int)
	 * @see roverml.RovermlPackage#getWait_Time()
	 * @model required="true"
	 * @generated
	 */
	int getTime();

	/**
	 * Sets the value of the '{@link roverml.Wait#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(int value);

	/**
	 * Returns the value of the '<em><b>Time Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Unit</em>' containment reference.
	 * @see #setTimeUnit(Time)
	 * @see roverml.RovermlPackage#getWait_TimeUnit()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Time getTimeUnit();

	/**
	 * Sets the value of the '{@link roverml.Wait#getTimeUnit <em>Time Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Unit</em>' containment reference.
	 * @see #getTimeUnit()
	 * @generated
	 */
	void setTimeUnit(Time value);

} // Wait
