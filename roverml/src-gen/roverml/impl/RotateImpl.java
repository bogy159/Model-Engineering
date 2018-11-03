/**
 */
package roverml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import roverml.Angle;
import roverml.Rotate;
import roverml.RovermlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rotate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link roverml.impl.RotateImpl#getAngle <em>Angle</em>}</li>
 *   <li>{@link roverml.impl.RotateImpl#getAngleUnits <em>Angle Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RotateImpl extends CommandImpl implements Rotate {
	/**
	 * The default value of the '{@link #getAngle() <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected static final int ANGLE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAngle() <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected int angle = ANGLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAngleUnits() <em>Angle Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleUnits()
	 * @generated
	 * @ordered
	 */
	protected Angle angleUnits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RotateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RovermlPackage.Literals.ROTATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAngle() {
		return angle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngle(int newAngle) {
		int oldAngle = angle;
		angle = newAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RovermlPackage.ROTATE__ANGLE, oldAngle, angle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Angle getAngleUnits() {
		return angleUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngleUnits(Angle newAngleUnits, NotificationChain msgs) {
		Angle oldAngleUnits = angleUnits;
		angleUnits = newAngleUnits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RovermlPackage.ROTATE__ANGLE_UNITS, oldAngleUnits, newAngleUnits);
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
	public void setAngleUnits(Angle newAngleUnits) {
		if (newAngleUnits != angleUnits) {
			NotificationChain msgs = null;
			if (angleUnits != null)
				msgs = ((InternalEObject) angleUnits).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RovermlPackage.ROTATE__ANGLE_UNITS, null, msgs);
			if (newAngleUnits != null)
				msgs = ((InternalEObject) newAngleUnits).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RovermlPackage.ROTATE__ANGLE_UNITS, null, msgs);
			msgs = basicSetAngleUnits(newAngleUnits, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RovermlPackage.ROTATE__ANGLE_UNITS, newAngleUnits,
					newAngleUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RovermlPackage.ROTATE__ANGLE_UNITS:
			return basicSetAngleUnits(null, msgs);
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
		case RovermlPackage.ROTATE__ANGLE:
			return getAngle();
		case RovermlPackage.ROTATE__ANGLE_UNITS:
			return getAngleUnits();
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
		case RovermlPackage.ROTATE__ANGLE:
			setAngle((Integer) newValue);
			return;
		case RovermlPackage.ROTATE__ANGLE_UNITS:
			setAngleUnits((Angle) newValue);
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
		case RovermlPackage.ROTATE__ANGLE:
			setAngle(ANGLE_EDEFAULT);
			return;
		case RovermlPackage.ROTATE__ANGLE_UNITS:
			setAngleUnits((Angle) null);
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
		case RovermlPackage.ROTATE__ANGLE:
			return angle != ANGLE_EDEFAULT;
		case RovermlPackage.ROTATE__ANGLE_UNITS:
			return angleUnits != null;
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
		result.append(" (angle: ");
		result.append(angle);
		result.append(')');
		return result.toString();
	}

} //RotateImpl
