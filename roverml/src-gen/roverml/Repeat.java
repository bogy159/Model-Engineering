/**
 */
package roverml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roverml.Repeat#getNumberOfReps <em>Number Of Reps</em>}</li>
 *   <li>{@link roverml.Repeat#getCommands <em>Commands</em>}</li>
 * </ul>
 *
 * @see roverml.RovermlPackage#getRepeat()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='indefRepeats regularTransCount'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot indefRepeats='if self.numberOfReps = -1 and self.outgoingTransitions -&gt; select(t: Transition | t.source -&gt; exists(m | m.oclIsTypeOf(Repeat) = true)) -&gt; notEmpty() then true elseif \n\t\tself.numberOfReps &lt;&gt; -1 then true else false endif' regularTransCount='self.outgoingTransitions -&gt; select(m | m.oclIsTypeOf(Regular) = true) -&gt; size() &lt;= 1'"
 * @generated
 */
public interface Repeat extends Command {
	/**
	 * Returns the value of the '<em><b>Number Of Reps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Reps</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Reps</em>' attribute.
	 * @see #setNumberOfReps(int)
	 * @see roverml.RovermlPackage#getRepeat_NumberOfReps()
	 * @model required="true"
	 * @generated
	 */
	int getNumberOfReps();

	/**
	 * Sets the value of the '{@link roverml.Repeat#getNumberOfReps <em>Number Of Reps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Reps</em>' attribute.
	 * @see #getNumberOfReps()
	 * @generated
	 */
	void setNumberOfReps(int value);

	/**
	 * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
	 * The list contents are of type {@link roverml.Command}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commands</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' containment reference list.
	 * @see roverml.RovermlPackage#getRepeat_Commands()
	 * @model containment="true"
	 * @generated
	 */
	EList<Command> getCommands();

} // Repeat
