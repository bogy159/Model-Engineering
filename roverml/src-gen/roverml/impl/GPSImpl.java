/**
 */
package roverml.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import roverml.GPS;
import roverml.RovermlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GPS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link roverml.impl.GPSImpl#getX <em>X</em>}</li>
 *   <li>{@link roverml.impl.GPSImpl#getY <em>Y</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GPSImpl extends SensorImpl implements GPS {
	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected EList<Float> x;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected EList<Float> y;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GPSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RovermlPackage.Literals.GPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Float> getX() {
		if (x == null) {
			x = new EDataTypeEList<Float>(Float.class, this, RovermlPackage.GPS__X);
		}
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Float> getY() {
		if (y == null) {
			y = new EDataTypeEList<Float>(Float.class, this, RovermlPackage.GPS__Y);
		}
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RovermlPackage.GPS__X:
			return getX();
		case RovermlPackage.GPS__Y:
			return getY();
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
		case RovermlPackage.GPS__X:
			getX().clear();
			getX().addAll((Collection<? extends Float>) newValue);
			return;
		case RovermlPackage.GPS__Y:
			getY().clear();
			getY().addAll((Collection<? extends Float>) newValue);
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
		case RovermlPackage.GPS__X:
			getX().clear();
			return;
		case RovermlPackage.GPS__Y:
			getY().clear();
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
		case RovermlPackage.GPS__X:
			return x != null && !x.isEmpty();
		case RovermlPackage.GPS__Y:
			return y != null && !y.isEmpty();
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

} //GPSImpl
