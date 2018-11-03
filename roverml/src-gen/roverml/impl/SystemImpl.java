/**
 */
package roverml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import roverml.Program;
import roverml.Rover;
import roverml.RovermlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link roverml.impl.SystemImpl#getPrograms <em>Programs</em>}</li>
 *   <li>{@link roverml.impl.SystemImpl#getRovers <em>Rovers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends NamedElementImpl implements roverml.System {
	/**
	 * The cached value of the '{@link #getPrograms() <em>Programs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrograms()
	 * @generated
	 * @ordered
	 */
	protected EList<Program> programs;

	/**
	 * The cached value of the '{@link #getRovers() <em>Rovers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRovers()
	 * @generated
	 * @ordered
	 */
	protected EList<Rover> rovers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RovermlPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Program> getPrograms() {
		if (programs == null) {
			programs = new EObjectContainmentEList<Program>(Program.class, this, RovermlPackage.SYSTEM__PROGRAMS);
		}
		return programs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rover> getRovers() {
		if (rovers == null) {
			rovers = new EObjectContainmentEList<Rover>(Rover.class, this, RovermlPackage.SYSTEM__ROVERS);
		}
		return rovers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RovermlPackage.SYSTEM__PROGRAMS:
			return ((InternalEList<?>) getPrograms()).basicRemove(otherEnd, msgs);
		case RovermlPackage.SYSTEM__ROVERS:
			return ((InternalEList<?>) getRovers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RovermlPackage.SYSTEM__PROGRAMS:
			return getPrograms();
		case RovermlPackage.SYSTEM__ROVERS:
			return getRovers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RovermlPackage.SYSTEM__PROGRAMS:
			getPrograms().clear();
			getPrograms().addAll((Collection<? extends Program>) newValue);
			return;
		case RovermlPackage.SYSTEM__ROVERS:
			getRovers().clear();
			getRovers().addAll((Collection<? extends Rover>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case RovermlPackage.SYSTEM__PROGRAMS:
			getPrograms().clear();
			return;
		case RovermlPackage.SYSTEM__ROVERS:
			getRovers().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case RovermlPackage.SYSTEM__PROGRAMS:
			return programs != null && !programs.isEmpty();
		case RovermlPackage.SYSTEM__ROVERS:
			return rovers != null && !rovers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemImpl
