/**
 */
package roverml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import roverml.DistanceSensor;
import roverml.DistanceSensorTrigger;
import roverml.Length;
import roverml.RovermlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distance Sensor Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link roverml.impl.DistanceSensorTriggerImpl#getLength <em>Length</em>}</li>
 *   <li>{@link roverml.impl.DistanceSensorTriggerImpl#getDist <em>Dist</em>}</li>
 *   <li>{@link roverml.impl.DistanceSensorTriggerImpl#getDistancesensor <em>Distancesensor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DistanceSensorTriggerImpl extends TriggeredImpl implements DistanceSensorTrigger {
	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected Length length;

	/**
	 * The default value of the '{@link #getDist() <em>Dist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDist()
	 * @generated
	 * @ordered
	 */
	protected static final double DIST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDist() <em>Dist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDist()
	 * @generated
	 * @ordered
	 */
	protected double dist = DIST_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDistancesensor() <em>Distancesensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistancesensor()
	 * @generated
	 * @ordered
	 */
	protected DistanceSensor distancesensor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistanceSensorTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RovermlPackage.Literals.DISTANCE_SENSOR_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Length getLength() {
		if (length != null && length.eIsProxy()) {
			InternalEObject oldLength = (InternalEObject) length;
			length = (Length) eResolveProxy(oldLength);
			if (length != oldLength) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RovermlPackage.DISTANCE_SENSOR_TRIGGER__LENGTH, oldLength, length));
			}
		}
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Length basicGetLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(Length newLength) {
		Length oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RovermlPackage.DISTANCE_SENSOR_TRIGGER__LENGTH,
					oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDist() {
		return dist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDist(double newDist) {
		double oldDist = dist;
		dist = newDist;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RovermlPackage.DISTANCE_SENSOR_TRIGGER__DIST, oldDist,
					dist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistanceSensor getDistancesensor() {
		if (distancesensor != null && distancesensor.eIsProxy()) {
			InternalEObject oldDistancesensor = (InternalEObject) distancesensor;
			distancesensor = (DistanceSensor) eResolveProxy(oldDistancesensor);
			if (distancesensor != oldDistancesensor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RovermlPackage.DISTANCE_SENSOR_TRIGGER__DISTANCESENSOR, oldDistancesensor, distancesensor));
			}
		}
		return distancesensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistanceSensor basicGetDistancesensor() {
		return distancesensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistancesensor(DistanceSensor newDistancesensor) {
		DistanceSensor oldDistancesensor = distancesensor;
		distancesensor = newDistancesensor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RovermlPackage.DISTANCE_SENSOR_TRIGGER__DISTANCESENSOR, oldDistancesensor, distancesensor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RovermlPackage.DISTANCE_SENSOR_TRIGGER__LENGTH:
			if (resolve)
				return getLength();
			return basicGetLength();
		case RovermlPackage.DISTANCE_SENSOR_TRIGGER__DIST:
			return getDist();
		case RovermlPackage.DISTANCE_SENSOR_TRIGGER__DISTANCESENSOR:
			if (resolve)
				return getDistancesensor();
			return basicGetDistancesensor();
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
		case RovermlPackage.DISTANCE_SENSOR_TRIGGER__LENGTH:
			setLength((Length) newValue);
			return;
		case RovermlPackage.DISTANCE_SENSOR_TRIGGER__DIST:
			setDist((Double) newValue);
			return;
		case RovermlPackage.DISTANCE_SENSOR_TRIGGER__DISTANCESENSOR:
			setDistancesensor((DistanceSensor) newValue);
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
		case RovermlPackage.DISTANCE_SENSOR_TRIGGER__LENGTH:
			setLength((Length) null);
			return;
		case RovermlPackage.DISTANCE_SENSOR_TRIGGER__DIST:
			setDist(DIST_EDEFAULT);
			return;
		case RovermlPackage.DISTANCE_SENSOR_TRIGGER__DISTANCESENSOR:
			setDistancesensor((DistanceSensor) null);
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
		case RovermlPackage.DISTANCE_SENSOR_TRIGGER__LENGTH:
			return length != null;
		case RovermlPackage.DISTANCE_SENSOR_TRIGGER__DIST:
			return dist != DIST_EDEFAULT;
		case RovermlPackage.DISTANCE_SENSOR_TRIGGER__DISTANCESENSOR:
			return distancesensor != null;
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
		result.append(" (dist: ");
		result.append(dist);
		result.append(')');
		return result.toString();
	}

} //DistanceSensorTriggerImpl
