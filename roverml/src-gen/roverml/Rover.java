/**
 */
package roverml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rover</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roverml.Rover#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see roverml.RovermlPackage#getRover()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueComponentNames minNumMotors'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot uniqueComponentNames='self.components -&gt; forAll(c1, c2 | c1 &lt;&gt; c2 implies c1.name &lt;&gt; c2.name)' minNumMotors='self.components -&gt; exists(m | m.oclIsTypeOf(Motor) = true)'"
 * @generated
 */
public interface Rover extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link roverml.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see roverml.RovermlPackage#getRover_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponents();

} // Rover
