/**
 */
package roverml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import roverml.Length;
import roverml.Move;
import roverml.RovermlPackage;
import roverml.Velocity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Move</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link roverml.impl.MoveImpl#getLength <em>Length</em>}</li>
 *   <li>{@link roverml.impl.MoveImpl#getVelocity <em>Velocity</em>}</li>
 *   <li>{@link roverml.impl.MoveImpl#getVelocityUnits <em>Velocity Units</em>}</li>
 *   <li>{@link roverml.impl.MoveImpl#getLengthUnits <em>Length Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MoveImpl extends CommandImpl implements Move {
	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final double LENGTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected double length = LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getVelocity() <em>Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVelocity()
	 * @generated
	 * @ordered
	 */
	protected static final double VELOCITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVelocity() <em>Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVelocity()
	 * @generated
	 * @ordered
	 */
	protected double velocity = VELOCITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVelocityUnits() <em>Velocity Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVelocityUnits()
	 * @generated
	 * @ordered
	 */
	protected Velocity velocityUnits;

	/**
	 * The cached value of the '{@link #getLengthUnits() <em>Length Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLengthUnits()
	 * @generated
	 * @ordered
	 */
	protected Length lengthUnits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RovermlPackage.Literals.MOVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(double newLength) {
		double oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RovermlPackage.MOVE__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVelocity() {
		return velocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVelocity(double newVelocity) {
		double oldVelocity = velocity;
		velocity = newVelocity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RovermlPackage.MOVE__VELOCITY, oldVelocity,
					velocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Velocity getVelocityUnits() {
		return velocityUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVelocityUnits(Velocity newVelocityUnits, NotificationChain msgs) {
		Velocity oldVelocityUnits = velocityUnits;
		velocityUnits = newVelocityUnits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RovermlPackage.MOVE__VELOCITY_UNITS, oldVelocityUnits, newVelocityUnits);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVelocityUnits(Velocity newVelocityUnits) {
		if (newVelocityUnits != velocityUnits) {
			NotificationChain msgs = null;
			if (velocityUnits != null)
				msgs = ((InternalEObject) velocityUnits).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RovermlPackage.MOVE__VELOCITY_UNITS, null, msgs);
			if (newVelocityUnits != null)
				msgs = ((InternalEObject) newVelocityUnits).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RovermlPackage.MOVE__VELOCITY_UNITS, null, msgs);
			msgs = basicSetVelocityUnits(newVelocityUnits, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RovermlPackage.MOVE__VELOCITY_UNITS, newVelocityUnits,
					newVelocityUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Length getLengthUnits() {
		return lengthUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLengthUnits(Length newLengthUnits, NotificationChain msgs) {
		Length oldLengthUnits = lengthUnits;
		lengthUnits = newLengthUnits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RovermlPackage.MOVE__LENGTH_UNITS, oldLengthUnits, newLengthUnits);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLengthUnits(Length newLengthUnits) {
		if (newLengthUnits != lengthUnits) {
			NotificationChain msgs = null;
			if (lengthUnits != null)
				msgs = ((InternalEObject) lengthUnits).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RovermlPackage.MOVE__LENGTH_UNITS, null, msgs);
			if (newLengthUnits != null)
				msgs = ((InternalEObject) newLengthUnits).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RovermlPackage.MOVE__LENGTH_UNITS, null, msgs);
			msgs = basicSetLengthUnits(newLengthUnits, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RovermlPackage.MOVE__LENGTH_UNITS, newLengthUnits,
					newLengthUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RovermlPackage.MOVE__VELOCITY_UNITS:
			return basicSetVelocityUnits(null, msgs);
		case RovermlPackage.MOVE__LENGTH_UNITS:
			return basicSetLengthUnits(null, msgs);
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
		case RovermlPackage.MOVE__LENGTH:
			return getLength();
		case RovermlPackage.MOVE__VELOCITY:
			return getVelocity();
		case RovermlPackage.MOVE__VELOCITY_UNITS:
			return getVelocityUnits();
		case RovermlPackage.MOVE__LENGTH_UNITS:
			return getLengthUnits();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RovermlPackage.MOVE__LENGTH:
			setLength((Double) newValue);
			return;
		case RovermlPackage.MOVE__VELOCITY:
			setVelocity((Double) newValue);
			return;
		case RovermlPackage.MOVE__VELOCITY_UNITS:
			setVelocityUnits((Velocity) newValue);
			return;
		case RovermlPackage.MOVE__LENGTH_UNITS:
			setLengthUnits((Length) newValue);
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
		case RovermlPackage.MOVE__LENGTH:
			setLength(LENGTH_EDEFAULT);
			return;
		case RovermlPackage.MOVE__VELOCITY:
			setVelocity(VELOCITY_EDEFAULT);
			return;
		case RovermlPackage.MOVE__VELOCITY_UNITS:
			setVelocityUnits((Velocity) null);
			return;
		case RovermlPackage.MOVE__LENGTH_UNITS:
			setLengthUnits((Length) null);
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
		case RovermlPackage.MOVE__LENGTH:
			return length != LENGTH_EDEFAULT;
		case RovermlPackage.MOVE__VELOCITY:
			return velocity != VELOCITY_EDEFAULT;
		case RovermlPackage.MOVE__VELOCITY_UNITS:
			return velocityUnits != null;
		case RovermlPackage.MOVE__LENGTH_UNITS:
			return lengthUnits != null;
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
		result.append(" (length: ");
		result.append(length);
		result.append(", velocity: ");
		result.append(velocity);
		result.append(')');
		return result.toString();
	}

} //MoveImpl
