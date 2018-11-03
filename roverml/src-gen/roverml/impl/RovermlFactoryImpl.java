/**
 */
package roverml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import roverml.Actuator;
import roverml.Angle;
import roverml.AngleUnits;
import roverml.Block;
import roverml.Colours;
import roverml.Command;
import roverml.Compass;
import roverml.CompassTrigger;
import roverml.Component;
import roverml.DistanceSensor;
import roverml.DistanceSensorTrigger;
import roverml.GPS;
import roverml.GPSTrigger;
import roverml.Length;
import roverml.LengthUnits;
import roverml.Light;
import roverml.Motor;
import roverml.Move;
import roverml.Position;
import roverml.Program;
import roverml.Quantity;
import roverml.Regular;
import roverml.Repeat;
import roverml.Rotate;
import roverml.Rover;
import roverml.RovermlFactory;
import roverml.RovermlPackage;
import roverml.Sensor;
import roverml.SetLightColor;
import roverml.SingleQuantity;
import roverml.Terminate;
import roverml.Time;
import roverml.TimeUnits;
import roverml.Transition;
import roverml.Triggered;
import roverml.Velocity;
import roverml.VelocityUnits;
import roverml.Wait;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RovermlFactoryImpl extends EFactoryImpl implements RovermlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RovermlFactory init() {
		try {
			RovermlFactory theRovermlFactory = (RovermlFactory) EPackage.Registry.INSTANCE
					.getEFactory(RovermlPackage.eNS_URI);
			if (theRovermlFactory != null) {
				return theRovermlFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RovermlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RovermlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case RovermlPackage.SYSTEM:
			return createSystem();
		case RovermlPackage.ROVER:
			return createRover();
		case RovermlPackage.PROGRAM:
			return createProgram();
		case RovermlPackage.COMPONENT:
			return createComponent();
		case RovermlPackage.SENSOR:
			return createSensor();
		case RovermlPackage.ACTUATOR:
			return createActuator();
		case RovermlPackage.GPS:
			return createGPS();
		case RovermlPackage.COMPASS:
			return createCompass();
		case RovermlPackage.DISTANCE_SENSOR:
			return createDistanceSensor();
		case RovermlPackage.MOTOR:
			return createMotor();
		case RovermlPackage.LIGHT:
			return createLight();
		case RovermlPackage.BLOCK:
			return createBlock();
		case RovermlPackage.COMMAND:
			return createCommand();
		case RovermlPackage.TRANSITION:
			return createTransition();
		case RovermlPackage.SET_LIGHT_COLOR:
			return createSetLightColor();
		case RovermlPackage.WAIT:
			return createWait();
		case RovermlPackage.MOVE:
			return createMove();
		case RovermlPackage.ROTATE:
			return createRotate();
		case RovermlPackage.TERMINATE:
			return createTerminate();
		case RovermlPackage.REPEAT:
			return createRepeat();
		case RovermlPackage.TRIGGERED:
			return createTriggered();
		case RovermlPackage.REGULAR:
			return createRegular();
		case RovermlPackage.DISTANCE_SENSOR_TRIGGER:
			return createDistanceSensorTrigger();
		case RovermlPackage.COMPASS_TRIGGER:
			return createCompassTrigger();
		case RovermlPackage.GPS_TRIGGER:
			return createGPSTrigger();
		case RovermlPackage.QUANTITY:
			return createQuantity();
		case RovermlPackage.SINGLE_QUANTITY:
			return createSingleQuantity();
		case RovermlPackage.POSITION:
			return createPosition();
		case RovermlPackage.TIME:
			return createTime();
		case RovermlPackage.VELOCITY:
			return createVelocity();
		case RovermlPackage.LENGTH:
			return createLength();
		case RovermlPackage.ANGLE:
			return createAngle();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case RovermlPackage.TIME_UNITS:
			return createTimeUnitsFromString(eDataType, initialValue);
		case RovermlPackage.VELOCITY_UNITS:
			return createVelocityUnitsFromString(eDataType, initialValue);
		case RovermlPackage.LENGTH_UNITS:
			return createLengthUnitsFromString(eDataType, initialValue);
		case RovermlPackage.ANGLE_UNITS:
			return createAngleUnitsFromString(eDataType, initialValue);
		case RovermlPackage.COLOURS:
			return createColoursFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case RovermlPackage.TIME_UNITS:
			return convertTimeUnitsToString(eDataType, instanceValue);
		case RovermlPackage.VELOCITY_UNITS:
			return convertVelocityUnitsToString(eDataType, instanceValue);
		case RovermlPackage.LENGTH_UNITS:
			return convertLengthUnitsToString(eDataType, instanceValue);
		case RovermlPackage.ANGLE_UNITS:
			return convertAngleUnitsToString(eDataType, instanceValue);
		case RovermlPackage.COLOURS:
			return convertColoursToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public roverml.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rover createRover() {
		RoverImpl rover = new RoverImpl();
		return rover;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program createProgram() {
		ProgramImpl program = new ProgramImpl();
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor createSensor() {
		SensorImpl sensor = new SensorImpl();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actuator createActuator() {
		ActuatorImpl actuator = new ActuatorImpl();
		return actuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GPS createGPS() {
		GPSImpl gps = new GPSImpl();
		return gps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compass createCompass() {
		CompassImpl compass = new CompassImpl();
		return compass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistanceSensor createDistanceSensor() {
		DistanceSensorImpl distanceSensor = new DistanceSensorImpl();
		return distanceSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Motor createMotor() {
		MotorImpl motor = new MotorImpl();
		return motor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Light createLight() {
		LightImpl light = new LightImpl();
		return light;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command createCommand() {
		CommandImpl command = new CommandImpl();
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetLightColor createSetLightColor() {
		SetLightColorImpl setLightColor = new SetLightColorImpl();
		return setLightColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wait createWait() {
		WaitImpl wait = new WaitImpl();
		return wait;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Move createMove() {
		MoveImpl move = new MoveImpl();
		return move;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rotate createRotate() {
		RotateImpl rotate = new RotateImpl();
		return rotate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminate createTerminate() {
		TerminateImpl terminate = new TerminateImpl();
		return terminate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repeat createRepeat() {
		RepeatImpl repeat = new RepeatImpl();
		return repeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Triggered createTriggered() {
		TriggeredImpl triggered = new TriggeredImpl();
		return triggered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Regular createRegular() {
		RegularImpl regular = new RegularImpl();
		return regular;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistanceSensorTrigger createDistanceSensorTrigger() {
		DistanceSensorTriggerImpl distanceSensorTrigger = new DistanceSensorTriggerImpl();
		return distanceSensorTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompassTrigger createCompassTrigger() {
		CompassTriggerImpl compassTrigger = new CompassTriggerImpl();
		return compassTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GPSTrigger createGPSTrigger() {
		GPSTriggerImpl gpsTrigger = new GPSTriggerImpl();
		return gpsTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity createQuantity() {
		QuantityImpl quantity = new QuantityImpl();
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleQuantity createSingleQuantity() {
		SingleQuantityImpl singleQuantity = new SingleQuantityImpl();
		return singleQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position createPosition() {
		PositionImpl position = new PositionImpl();
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time createTime() {
		TimeImpl time = new TimeImpl();
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Velocity createVelocity() {
		VelocityImpl velocity = new VelocityImpl();
		return velocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Length createLength() {
		LengthImpl length = new LengthImpl();
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Angle createAngle() {
		AngleImpl angle = new AngleImpl();
		return angle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnits createTimeUnitsFromString(EDataType eDataType, String initialValue) {
		TimeUnits result = TimeUnits.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeUnitsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VelocityUnits createVelocityUnitsFromString(EDataType eDataType, String initialValue) {
		VelocityUnits result = VelocityUnits.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVelocityUnitsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LengthUnits createLengthUnitsFromString(EDataType eDataType, String initialValue) {
		LengthUnits result = LengthUnits.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLengthUnitsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngleUnits createAngleUnitsFromString(EDataType eDataType, String initialValue) {
		AngleUnits result = AngleUnits.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAngleUnitsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Colours createColoursFromString(EDataType eDataType, String initialValue) {
		Colours result = Colours.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColoursToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RovermlPackage getRovermlPackage() {
		return (RovermlPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RovermlPackage getPackage() {
		return RovermlPackage.eINSTANCE;
	}

} //RovermlFactoryImpl
