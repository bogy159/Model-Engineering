/**
 */
package roverml.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see roverml.RovermlPackage
 * @generated
 */
public class RovermlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RovermlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RovermlSwitch() {
		if (modelPackage == null) {
			modelPackage = RovermlPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case RovermlPackage.SYSTEM: {
			roverml.System system = (roverml.System) theEObject;
			T result = caseSystem(system);
			if (result == null)
				result = caseNamedElement(system);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RovermlPackage.ROVER: {
			Rover rover = (Rover) theEObject;
			T result = caseRover(rover);
			if (result == null)
				result = caseNamedElement(rover);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RovermlPackage.PROGRAM: {
			Program program = (Program) theEObject;
			T result = caseProgram(program);
			if (result == null)
				result = caseNamedElement(program);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RovermlPackage.NAMED_ELEMENT: {
			NamedElement namedElement = (NamedElement) theEObject;
			T result = caseNamedElement(namedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RovermlPackage.COMPONENT: {
			Component component = (Component) theEObject;
			T result = caseComponent(component);
			if (result == null)
				result = caseNamedElement(component);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RovermlPackage.SENSOR: {
			Sensor sensor = (Sensor) theEObject;
			T result = caseSensor(sensor);
			if (result == null)
				result = caseComponent(sensor);
			if (result == null)
				result = caseNamedElement(sensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RovermlPackage.ACTUATOR: {
			Actuator actuator = (Actuator) theEObject;
			T result = caseActuator(actuator);
			if (result == null)
				result = caseComponent(actuator);
			if (result == null)
				result = caseNamedElement(actuator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RovermlPackage.GPS: {
			GPS gps = (GPS) theEObject;
			T result = caseGPS(gps);
			if (result == null)
				result = caseSensor(gps);
			if (result == null)
				result = caseComponent(gps);
			if (result == null)
				result = caseNamedElement(gps);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RovermlPackage.COMPASS: {
			Compass compass = (Compass) theEObject;
			T result = caseCompass(compass);
			if (result == null)
				result = caseSensor(compass);
			if (result == null)
				result = caseComponent(compass);
			if (result == null)
				result = caseNamedElement(compass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RovermlPackage.DISTANCE_SENSOR: {
			DistanceSensor distanceSensor = (DistanceSensor) theEObject;
			T result = caseDistanceSensor(distanceSensor);
			if (result == null)
				result = caseSensor(distanceSensor);
			if (result == null)
				result = caseComponent(distanceSensor);
			if (result == null)
				result = caseNamedElement(distanceSensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RovermlPackage.MOTOR: {
			Motor motor = (Motor) theEObject;
			T result = caseMotor(motor);
			if (result == null)
				result = caseActuator(motor);
			if (result == null)
				result = caseComponent(motor);
			if (result == null)
				result = caseNamedElement(motor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RovermlPackage.LIGHT: {
			Light light = (Light) theEObject;
			T result = caseLight(light);
			if (result == null)
				result = caseActuator(light);
			if (result == null)
				result = caseComponent(light);
			if (result == null)
				result = caseNamedElement(light);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RovermlPackage.BLOCK: {
			Block block = (Block) theEObject;
			T result = caseBlock(block);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RovermlPackage.COMMAND: {
			Command command = (Command) theEObject;
			T result = caseCommand(command);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RovermlPackage.TRANSITION: {
			Transition transition = (Transition) theEObject;
			T result = caseTransition(transition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RovermlPackage.SET_LIGHT_COLOR: {
			SetLightColor setLightColor = (SetLightColor) theEObject;
			T result = caseSetLightColor(setLightColor);
			if (result == null)
				result = caseCommand(setLightColor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RovermlPackage.WAIT: {
			Wait wait = (Wait) theEObject;
			T result = caseWait(wait);
			if (result == null)
				result = caseCommand(wait);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RovermlPackage.MOVE: {
			Move move = (Move) theEObject;
			T result = caseMove(move);
			if (result == null)
				result = caseCommand(move);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RovermlPackage.ROTATE: {
			Rotate rotate = (Rotate) theEObject;
			T result = caseRotate(rotate);
			if (result == null)
				result = caseCommand(rotate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RovermlPackage.TERMINATE: {
			Terminate terminate = (Terminate) theEObject;
			T result = caseTerminate(terminate);
			if (result == null)
				result = caseCommand(terminate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RovermlPackage.REPEAT: {
			Repeat repeat = (Repeat) theEObject;
			T result = caseRepeat(repeat);
			if (result == null)
				result = caseCommand(repeat);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RovermlPackage.TRIGGERED: {
			Triggered triggered = (Triggered) theEObject;
			T result = caseTriggered(triggered);
			if (result == null)
				result = caseTransition(triggered);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RovermlPackage.REGULAR: {
			Regular regular = (Regular) theEObject;
			T result = caseRegular(regular);
			if (result == null)
				result = caseTransition(regular);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RovermlPackage.DISTANCE_SENSOR_TRIGGER: {
			DistanceSensorTrigger distanceSensorTrigger = (DistanceSensorTrigger) theEObject;
			T result = caseDistanceSensorTrigger(distanceSensorTrigger);
			if (result == null)
				result = caseTriggered(distanceSensorTrigger);
			if (result == null)
				result = caseTransition(distanceSensorTrigger);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RovermlPackage.COMPASS_TRIGGER: {
			CompassTrigger compassTrigger = (CompassTrigger) theEObject;
			T result = caseCompassTrigger(compassTrigger);
			if (result == null)
				result = caseTriggered(compassTrigger);
			if (result == null)
				result = caseTransition(compassTrigger);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RovermlPackage.GPS_TRIGGER: {
			GPSTrigger gpsTrigger = (GPSTrigger) theEObject;
			T result = caseGPSTrigger(gpsTrigger);
			if (result == null)
				result = caseTriggered(gpsTrigger);
			if (result == null)
				result = caseTransition(gpsTrigger);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RovermlPackage.QUANTITY: {
			Quantity quantity = (Quantity) theEObject;
			T result = caseQuantity(quantity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RovermlPackage.SINGLE_QUANTITY: {
			SingleQuantity singleQuantity = (SingleQuantity) theEObject;
			T result = caseSingleQuantity(singleQuantity);
			if (result == null)
				result = caseQuantity(singleQuantity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RovermlPackage.POSITION: {
			Position position = (Position) theEObject;
			T result = casePosition(position);
			if (result == null)
				result = caseQuantity(position);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RovermlPackage.TIME: {
			Time time = (Time) theEObject;
			T result = caseTime(time);
			if (result == null)
				result = caseSingleQuantity(time);
			if (result == null)
				result = caseQuantity(time);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RovermlPackage.VELOCITY: {
			Velocity velocity = (Velocity) theEObject;
			T result = caseVelocity(velocity);
			if (result == null)
				result = caseSingleQuantity(velocity);
			if (result == null)
				result = caseQuantity(velocity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RovermlPackage.LENGTH: {
			Length length = (Length) theEObject;
			T result = caseLength(length);
			if (result == null)
				result = caseSingleQuantity(length);
			if (result == null)
				result = caseQuantity(length);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RovermlPackage.ANGLE: {
			Angle angle = (Angle) theEObject;
			T result = caseAngle(angle);
			if (result == null)
				result = caseSingleQuantity(angle);
			if (result == null)
				result = caseQuantity(angle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystem(roverml.System object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rover</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rover</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRover(Rover object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgram(Program object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensor(Sensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actuator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActuator(Actuator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GPS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GPS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGPS(GPS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompass(Compass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distance Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distance Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDistanceSensor(DistanceSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Motor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Motor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMotor(Motor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Light</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Light</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLight(Light object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommand(Command object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Light Color</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Light Color</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetLightColor(SetLightColor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wait</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wait</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWait(Wait object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMove(Move object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotate(Rotate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminate(Terminate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repeat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repeat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepeat(Repeat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Triggered</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Triggered</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriggered(Triggered object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regular</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regular</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegular(Regular object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distance Sensor Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distance Sensor Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDistanceSensorTrigger(DistanceSensorTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compass Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compass Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompassTrigger(CompassTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GPS Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GPS Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGPSTrigger(GPSTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantity(Quantity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Quantity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleQuantity(SingleQuantity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePosition(Position object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTime(Time object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Velocity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Velocity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVelocity(Velocity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Length</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Length</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLength(Length object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngle(Angle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RovermlSwitch
