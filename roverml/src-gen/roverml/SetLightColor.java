/**
 */
package roverml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Light Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roverml.SetLightColor#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see roverml.RovermlPackage#getSetLightColor()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='regularTransCount'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot regularTransCount='self.outgoingTransitions -&gt; select(m | m.oclIsTypeOf(Regular) = true) -&gt; size() &lt;= 1'"
 * @generated
 */
public interface SetLightColor extends Command {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The literals are from the enumeration {@link roverml.Colours}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see roverml.Colours
	 * @see #setColor(Colours)
	 * @see roverml.RovermlPackage#getSetLightColor_Color()
	 * @model required="true" transient="true"
	 * @generated
	 */
	Colours getColor();

	/**
	 * Sets the value of the '{@link roverml.SetLightColor#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see roverml.Colours
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Colours value);

} // SetLightColor
