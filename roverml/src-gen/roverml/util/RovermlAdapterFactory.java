/**
 */
package roverml.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import roverml.Actuator;
import roverml.Angle;
import roverml.Block;
import roverml.Command;
import roverml.Compass;
import roverml.CompassTrigger;
import roverml.Component;
import roverml.DistanceSensor;
import roverml.DistanceSensorTrigger;
import roverml.GPS;
import roverml.GPSTrigger;
import roverml.Length;
import roverml.Light;
import roverml.Motor;
import roverml.Move;
import roverml.NamedElement;
import roverml.Position;
import roverml.Program;
import roverml.Quantity;
import roverml.Regular;
import roverml.Repeat;
import roverml.Rotate;
import roverml.Rover;
import roverml.RovermlPackage;
import roverml.Sensor;
import roverml.SetLightColor;
import roverml.SingleQuantity;
import roverml.Terminate;
import roverml.Time;
import roverml.Transition;
import roverml.Triggered;
import roverml.Velocity;
import roverml.Wait;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see roverml.RovermlPackage
 * @generated
 */
public class RovermlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RovermlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RovermlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RovermlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RovermlSwitch<Adapter> modelSwitch = new RovermlSwitch<Adapter>() {
		@Override
		public Adapter caseSystem(roverml.System object) {
			return createSystemAdapter();
		}

		@Override
		public Adapter caseRover(Rover object) {
			return createRoverAdapter();
		}

		@Override
		public Adapter caseProgram(Program object) {
			return createProgramAdapter();
		}

		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
		}

		@Override
		public Adapter caseComponent(Component object) {
			return createComponentAdapter();
		}

		@Override
		public Adapter caseSensor(Sensor object) {
			return createSensorAdapter();
		}

		@Override
		public Adapter caseActuator(Actuator object) {
			return createActuatorAdapter();
		}

		@Override
		public Adapter caseGPS(GPS object) {
			return createGPSAdapter();
		}

		@Override
		public Adapter caseCompass(Compass object) {
			return createCompassAdapter();
		}

		@Override
		public Adapter caseDistanceSensor(DistanceSensor object) {
			return createDistanceSensorAdapter();
		}

		@Override
		public Adapter caseMotor(Motor object) {
			return createMotorAdapter();
		}

		@Override
		public Adapter caseLight(Light object) {
			return createLightAdapter();
		}

		@Override
		public Adapter caseBlock(Block object) {
			return createBlockAdapter();
		}

		@Override
		public Adapter caseCommand(Command object) {
			return createCommandAdapter();
		}

		@Override
		public Adapter caseTransition(Transition object) {
			return createTransitionAdapter();
		}

		@Override
		public Adapter caseSetLightColor(SetLightColor object) {
			return createSetLightColorAdapter();
		}

		@Override
		public Adapter caseWait(Wait object) {
			return createWaitAdapter();
		}

		@Override
		public Adapter caseMove(Move object) {
			return createMoveAdapter();
		}

		@Override
		public Adapter caseRotate(Rotate object) {
			return createRotateAdapter();
		}

		@Override
		public Adapter caseTerminate(Terminate object) {
			return createTerminateAdapter();
		}

		@Override
		public Adapter caseRepeat(Repeat object) {
			return createRepeatAdapter();
		}

		@Override
		public Adapter caseTriggered(Triggered object) {
			return createTriggeredAdapter();
		}

		@Override
		public Adapter caseRegular(Regular object) {
			return createRegularAdapter();
		}

		@Override
		public Adapter caseDistanceSensorTrigger(DistanceSensorTrigger object) {
			return createDistanceSensorTriggerAdapter();
		}

		@Override
		public Adapter caseCompassTrigger(CompassTrigger object) {
			return createCompassTriggerAdapter();
		}

		@Override
		public Adapter caseGPSTrigger(GPSTrigger object) {
			return createGPSTriggerAdapter();
		}

		@Override
		public Adapter caseQuantity(Quantity object) {
			return createQuantityAdapter();
		}

		@Override
		public Adapter caseSingleQuantity(SingleQuantity object) {
			return createSingleQuantityAdapter();
		}

		@Override
		public Adapter casePosition(Position object) {
			return createPositionAdapter();
		}

		@Override
		public Adapter caseTime(Time object) {
			return createTimeAdapter();
		}

		@Override
		public Adapter caseVelocity(Velocity object) {
			return createVelocityAdapter();
		}

		@Override
		public Adapter caseLength(Length object) {
			return createLengthAdapter();
		}

		@Override
		public Adapter caseAngle(Angle object) {
			return createAngleAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link roverml.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roverml.System
	 * @generated
	 */
	public Adapter createSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roverml.Rover <em>Rover</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roverml.Rover
	 * @generated
	 */
	public Adapter createRoverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roverml.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roverml.Program
	 * @generated
	 */
	public Adapter createProgramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roverml.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roverml.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roverml.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roverml.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roverml.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roverml.Sensor
	 * @generated
	 */
	public Adapter createSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roverml.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roverml.Actuator
	 * @generated
	 */
	public Adapter createActuatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roverml.GPS <em>GPS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roverml.GPS
	 * @generated
	 */
	public Adapter createGPSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roverml.Compass <em>Compass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roverml.Compass
	 * @generated
	 */
	public Adapter createCompassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roverml.DistanceSensor <em>Distance Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roverml.DistanceSensor
	 * @generated
	 */
	public Adapter createDistanceSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roverml.Motor <em>Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roverml.Motor
	 * @generated
	 */
	public Adapter createMotorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roverml.Light <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roverml.Light
	 * @generated
	 */
	public Adapter createLightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roverml.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roverml.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roverml.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roverml.Command
	 * @generated
	 */
	public Adapter createCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roverml.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roverml.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roverml.SetLightColor <em>Set Light Color</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roverml.SetLightColor
	 * @generated
	 */
	public Adapter createSetLightColorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roverml.Wait <em>Wait</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roverml.Wait
	 * @generated
	 */
	public Adapter createWaitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roverml.Move <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roverml.Move
	 * @generated
	 */
	public Adapter createMoveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roverml.Rotate <em>Rotate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roverml.Rotate
	 * @generated
	 */
	public Adapter createRotateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roverml.Terminate <em>Terminate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roverml.Terminate
	 * @generated
	 */
	public Adapter createTerminateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roverml.Repeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roverml.Repeat
	 * @generated
	 */
	public Adapter createRepeatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roverml.Triggered <em>Triggered</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roverml.Triggered
	 * @generated
	 */
	public Adapter createTriggeredAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roverml.Regular <em>Regular</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roverml.Regular
	 * @generated
	 */
	public Adapter createRegularAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roverml.DistanceSensorTrigger <em>Distance Sensor Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roverml.DistanceSensorTrigger
	 * @generated
	 */
	public Adapter createDistanceSensorTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roverml.CompassTrigger <em>Compass Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roverml.CompassTrigger
	 * @generated
	 */
	public Adapter createCompassTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roverml.GPSTrigger <em>GPS Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roverml.GPSTrigger
	 * @generated
	 */
	public Adapter createGPSTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roverml.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roverml.Quantity
	 * @generated
	 */
	public Adapter createQuantityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roverml.SingleQuantity <em>Single Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roverml.SingleQuantity
	 * @generated
	 */
	public Adapter createSingleQuantityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roverml.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roverml.Position
	 * @generated
	 */
	public Adapter createPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roverml.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roverml.Time
	 * @generated
	 */
	public Adapter createTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roverml.Velocity <em>Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roverml.Velocity
	 * @generated
	 */
	public Adapter createVelocityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roverml.Length <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roverml.Length
	 * @generated
	 */
	public Adapter createLengthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roverml.Angle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roverml.Angle
	 * @generated
	 */
	public Adapter createAngleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RovermlAdapterFactory
