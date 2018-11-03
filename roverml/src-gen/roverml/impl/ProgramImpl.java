/**
 */
package roverml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import roverml.Block;
import roverml.Program;
import roverml.Rover;
import roverml.RovermlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link roverml.impl.ProgramImpl#getRoverExec <em>Rover Exec</em>}</li>
 *   <li>{@link roverml.impl.ProgramImpl#getBlocks <em>Blocks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramImpl extends NamedElementImpl implements Program {
	/**
	 * The cached value of the '{@link #getRoverExec() <em>Rover Exec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoverExec()
	 * @generated
	 * @ordered
	 */
	protected Rover roverExec;

	/**
	 * The cached value of the '{@link #getBlocks() <em>Blocks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocks()
	 * @generated
	 * @ordered
	 */
	protected Block blocks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RovermlPackage.Literals.PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rover getRoverExec() {
		if (roverExec != null && roverExec.eIsProxy()) {
			InternalEObject oldRoverExec = (InternalEObject) roverExec;
			roverExec = (Rover) eResolveProxy(oldRoverExec);
			if (roverExec != oldRoverExec) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RovermlPackage.PROGRAM__ROVER_EXEC,
							oldRoverExec, roverExec));
			}
		}
		return roverExec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rover basicGetRoverExec() {
		return roverExec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoverExec(Rover newRoverExec) {
		Rover oldRoverExec = roverExec;
		roverExec = newRoverExec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RovermlPackage.PROGRAM__ROVER_EXEC, oldRoverExec,
					roverExec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getBlocks() {
		return blocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlocks(Block newBlocks, NotificationChain msgs) {
		Block oldBlocks = blocks;
		blocks = newBlocks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RovermlPackage.PROGRAM__BLOCKS, oldBlocks, newBlocks);
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
	public void setBlocks(Block newBlocks) {
		if (newBlocks != blocks) {
			NotificationChain msgs = null;
			if (blocks != null)
				msgs = ((InternalEObject) blocks).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RovermlPackage.PROGRAM__BLOCKS, null, msgs);
			if (newBlocks != null)
				msgs = ((InternalEObject) newBlocks).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RovermlPackage.PROGRAM__BLOCKS, null, msgs);
			msgs = basicSetBlocks(newBlocks, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RovermlPackage.PROGRAM__BLOCKS, newBlocks,
					newBlocks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RovermlPackage.PROGRAM__BLOCKS:
			return basicSetBlocks(null, msgs);
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
		case RovermlPackage.PROGRAM__ROVER_EXEC:
			if (resolve)
				return getRoverExec();
			return basicGetRoverExec();
		case RovermlPackage.PROGRAM__BLOCKS:
			return getBlocks();
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
		case RovermlPackage.PROGRAM__ROVER_EXEC:
			setRoverExec((Rover) newValue);
			return;
		case RovermlPackage.PROGRAM__BLOCKS:
			setBlocks((Block) newValue);
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
		case RovermlPackage.PROGRAM__ROVER_EXEC:
			setRoverExec((Rover) null);
			return;
		case RovermlPackage.PROGRAM__BLOCKS:
			setBlocks((Block) null);
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
		case RovermlPackage.PROGRAM__ROVER_EXEC:
			return roverExec != null;
		case RovermlPackage.PROGRAM__BLOCKS:
			return blocks != null;
		}
		return super.eIsSet(featureID);
	}

} //ProgramImpl
