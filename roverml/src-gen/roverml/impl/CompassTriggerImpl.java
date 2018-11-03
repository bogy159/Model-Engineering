/**
 */
package roverml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import roverml.Angle;
import roverml.Compass;
import roverml.CompassTrigger;
import roverml.RovermlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compass Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link roverml.impl.CompassTriggerImpl#getAngles <em>Angles</em>}</li>
 *   <li>{@link roverml.impl.CompassTriggerImpl#getAngle <em>Angle</em>}</li>
 *   <li>{@link roverml.impl.CompassTriggerImpl#getCompass <em>Compass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompassTriggerImpl extends TriggeredImpl implements CompassTrigger {
	/**
	 * The cached value of the '{@link #getAngles() <em>Angles</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngles()
	 * @generated
	 * @ordered
	 */
	protected Angle angles;

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
	 * The cached value of the '{@link #getCompass() <em>Compass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompass()
	 * @generated
	 * @ordered
	 */
	protected Compass compass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompassTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RovermlPackage.Literals.COMPASS_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Angle getAngles() {
		if (angles != null && angles.eIsProxy()) {
			InternalEObject oldAngles = (InternalEObject) angles;
			angles = (Angle) eResolveProxy(oldAngles);
			if (angles != oldAngles) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RovermlPackage.COMPASS_TRIGGER__ANGLES,
							oldAngles, angles));
			}
		}
		return angles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Angle basicGetAngles() {
		return angles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngles(Angle newAngles) {
		Angle oldAngles = angles;
		angles = newAngles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RovermlPackage.COMPASS_TRIGGER__ANGLES, oldAngles,
					angles));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RovermlPackage.COMPASS_TRIGGER__ANGLE, oldAngle,
					angle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compass getCompass() {
		if (compass != null && compass.eIsProxy()) {
			InternalEObject oldCompass = (InternalEObject) compass;
			compass = (Compass) eResolveProxy(oldCompass);
			if (compass != oldCompass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RovermlPackage.COMPASS_TRIGGER__COMPASS,
							oldCompass, compass));
			}
		}
		return compass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compass basicGetCompass() {
		return compass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompass(Compass newCompass) {
		Compass oldCompass = compass;
		compass = newCompass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RovermlPackage.COMPASS_TRIGGER__COMPASS, oldCompass,
					compass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RovermlPackage.COMPASS_TRIGGER__ANGLES:
			if (resolve)
				return getAngles();
			return basicGetAngles();
		case RovermlPackage.COMPASS_TRIGGER__ANGLE:
			return getAngle();
		case RovermlPackage.COMPASS_TRIGGER__COMPASS:
			if (resolve)
				return getCompass();
			return basicGetCompass();
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
		case RovermlPackage.COMPASS_TRIGGER__ANGLES:
			setAngles((Angle) newValue);
			return;
		case RovermlPackage.COMPASS_TRIGGER__ANGLE:
			setAngle((Integer) newValue);
			return;
		case RovermlPackage.COMPASS_TRIGGER__COMPASS:
			setCompass((Compass) newValue);
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
		case RovermlPackage.COMPASS_TRIGGER__ANGLES:
			setAngles((Angle) null);
			return;
		case RovermlPackage.COMPASS_TRIGGER__ANGLE:
			setAngle(ANGLE_EDEFAULT);
			return;
		case RovermlPackage.COMPASS_TRIGGER__COMPASS:
			setCompass((Compass) null);
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
		case RovermlPackage.COMPASS_TRIGGER__ANGLES:
			return angles != null;
		case RovermlPackage.COMPASS_TRIGGER__ANGLE:
			return angle != ANGLE_EDEFAULT;
		case RovermlPackage.COMPASS_TRIGGER__COMPASS:
			return compass != null;
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

} //CompassTriggerImpl
