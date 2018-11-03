/**
 */
package roverml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import roverml.GPS;
import roverml.GPSTrigger;
import roverml.Position;
import roverml.RovermlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GPS Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link roverml.impl.GPSTriggerImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link roverml.impl.GPSTriggerImpl#getX <em>X</em>}</li>
 *   <li>{@link roverml.impl.GPSTriggerImpl#getY <em>Y</em>}</li>
 *   <li>{@link roverml.impl.GPSTriggerImpl#getGps <em>Gps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GPSTriggerImpl extends TriggeredImpl implements GPSTrigger {
	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Position position;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final float X_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected float x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final float Y_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected float y = Y_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGps() <em>Gps</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGps()
	 * @generated
	 * @ordered
	 */
	protected GPS gps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GPSTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RovermlPackage.Literals.GPS_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position getPosition() {
		if (position != null && position.eIsProxy()) {
			InternalEObject oldPosition = (InternalEObject) position;
			position = (Position) eResolveProxy(oldPosition);
			if (position != oldPosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RovermlPackage.GPS_TRIGGER__POSITION,
							oldPosition, position));
			}
		}
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position basicGetPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(Position newPosition) {
		Position oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RovermlPackage.GPS_TRIGGER__POSITION, oldPosition,
					position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(float newX) {
		float oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RovermlPackage.GPS_TRIGGER__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(float newY) {
		float oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RovermlPackage.GPS_TRIGGER__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GPS getGps() {
		if (gps != null && gps.eIsProxy()) {
			InternalEObject oldGps = (InternalEObject) gps;
			gps = (GPS) eResolveProxy(oldGps);
			if (gps != oldGps) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RovermlPackage.GPS_TRIGGER__GPS, oldGps,
							gps));
			}
		}
		return gps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GPS basicGetGps() {
		return gps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGps(GPS newGps) {
		GPS oldGps = gps;
		gps = newGps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RovermlPackage.GPS_TRIGGER__GPS, oldGps, gps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RovermlPackage.GPS_TRIGGER__POSITION:
			if (resolve)
				return getPosition();
			return basicGetPosition();
		case RovermlPackage.GPS_TRIGGER__X:
			return getX();
		case RovermlPackage.GPS_TRIGGER__Y:
			return getY();
		case RovermlPackage.GPS_TRIGGER__GPS:
			if (resolve)
				return getGps();
			return basicGetGps();
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
		case RovermlPackage.GPS_TRIGGER__POSITION:
			setPosition((Position) newValue);
			return;
		case RovermlPackage.GPS_TRIGGER__X:
			setX((Float) newValue);
			return;
		case RovermlPackage.GPS_TRIGGER__Y:
			setY((Float) newValue);
			return;
		case RovermlPackage.GPS_TRIGGER__GPS:
			setGps((GPS) newValue);
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
		case RovermlPackage.GPS_TRIGGER__POSITION:
			setPosition((Position) null);
			return;
		case RovermlPackage.GPS_TRIGGER__X:
			setX(X_EDEFAULT);
			return;
		case RovermlPackage.GPS_TRIGGER__Y:
			setY(Y_EDEFAULT);
			return;
		case RovermlPackage.GPS_TRIGGER__GPS:
			setGps((GPS) null);
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
		case RovermlPackage.GPS_TRIGGER__POSITION:
			return position != null;
		case RovermlPackage.GPS_TRIGGER__X:
			return x != X_EDEFAULT;
		case RovermlPackage.GPS_TRIGGER__Y:
			return y != Y_EDEFAULT;
		case RovermlPackage.GPS_TRIGGER__GPS:
			return gps != null;
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
		result.append(" (x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(')');
		return result.toString();
	}

} //GPSTriggerImpl
