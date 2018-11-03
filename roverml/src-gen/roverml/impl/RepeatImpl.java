/**
 */
package roverml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import roverml.Command;
import roverml.Repeat;
import roverml.RovermlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repeat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link roverml.impl.RepeatImpl#getNumberOfReps <em>Number Of Reps</em>}</li>
 *   <li>{@link roverml.impl.RepeatImpl#getCommands <em>Commands</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepeatImpl extends CommandImpl implements Repeat {
	/**
	 * The default value of the '{@link #getNumberOfReps() <em>Number Of Reps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfReps()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_REPS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfReps() <em>Number Of Reps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfReps()
	 * @generated
	 * @ordered
	 */
	protected int numberOfReps = NUMBER_OF_REPS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCommands() <em>Commands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommands()
	 * @generated
	 * @ordered
	 */
	protected EList<Command> commands;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepeatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RovermlPackage.Literals.REPEAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfReps() {
		return numberOfReps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfReps(int newNumberOfReps) {
		int oldNumberOfReps = numberOfReps;
		numberOfReps = newNumberOfReps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RovermlPackage.REPEAT__NUMBER_OF_REPS,
					oldNumberOfReps, numberOfReps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Command> getCommands() {
		if (commands == null) {
			commands = new EObjectContainmentEList<Command>(Command.class, this, RovermlPackage.REPEAT__COMMANDS);
		}
		return commands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RovermlPackage.REPEAT__COMMANDS:
			return ((InternalEList<?>) getCommands()).basicRemove(otherEnd, msgs);
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
		case RovermlPackage.REPEAT__NUMBER_OF_REPS:
			return getNumberOfReps();
		case RovermlPackage.REPEAT__COMMANDS:
			return getCommands();
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
		case RovermlPackage.REPEAT__NUMBER_OF_REPS:
			setNumberOfReps((Integer) newValue);
			return;
		case RovermlPackage.REPEAT__COMMANDS:
			getCommands().clear();
			getCommands().addAll((Collection<? extends Command>) newValue);
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
		case RovermlPackage.REPEAT__NUMBER_OF_REPS:
			setNumberOfReps(NUMBER_OF_REPS_EDEFAULT);
			return;
		case RovermlPackage.REPEAT__COMMANDS:
			getCommands().clear();
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
		case RovermlPackage.REPEAT__NUMBER_OF_REPS:
			return numberOfReps != NUMBER_OF_REPS_EDEFAULT;
		case RovermlPackage.REPEAT__COMMANDS:
			return commands != null && !commands.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (numberOfReps: ");
		result.append(numberOfReps);
		result.append(')');
		return result.toString();
	}

} //RepeatImpl
