/**
 */
package roverml.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

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
import roverml.TimeUnits;
import roverml.Transition;
import roverml.Triggered;
import roverml.Velocity;
import roverml.VelocityUnits;
import roverml.Wait;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see roverml.RovermlPackage
 * @generated
 */
public class RovermlValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RovermlValidator INSTANCE = new RovermlValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "roverml";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RovermlValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return RovermlPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case RovermlPackage.SYSTEM:
			return validateSystem((roverml.System) value, diagnostics, context);
		case RovermlPackage.ROVER:
			return validateRover((Rover) value, diagnostics, context);
		case RovermlPackage.PROGRAM:
			return validateProgram((Program) value, diagnostics, context);
		case RovermlPackage.NAMED_ELEMENT:
			return validateNamedElement((NamedElement) value, diagnostics, context);
		case RovermlPackage.COMPONENT:
			return validateComponent((Component) value, diagnostics, context);
		case RovermlPackage.SENSOR:
			return validateSensor((Sensor) value, diagnostics, context);
		case RovermlPackage.ACTUATOR:
			return validateActuator((Actuator) value, diagnostics, context);
		case RovermlPackage.GPS:
			return validateGPS((GPS) value, diagnostics, context);
		case RovermlPackage.COMPASS:
			return validateCompass((Compass) value, diagnostics, context);
		case RovermlPackage.DISTANCE_SENSOR:
			return validateDistanceSensor((DistanceSensor) value, diagnostics, context);
		case RovermlPackage.MOTOR:
			return validateMotor((Motor) value, diagnostics, context);
		case RovermlPackage.LIGHT:
			return validateLight((Light) value, diagnostics, context);
		case RovermlPackage.BLOCK:
			return validateBlock((Block) value, diagnostics, context);
		case RovermlPackage.COMMAND:
			return validateCommand((Command) value, diagnostics, context);
		case RovermlPackage.TRANSITION:
			return validateTransition((Transition) value, diagnostics, context);
		case RovermlPackage.SET_LIGHT_COLOR:
			return validateSetLightColor((SetLightColor) value, diagnostics, context);
		case RovermlPackage.WAIT:
			return validateWait((Wait) value, diagnostics, context);
		case RovermlPackage.MOVE:
			return validateMove((Move) value, diagnostics, context);
		case RovermlPackage.ROTATE:
			return validateRotate((Rotate) value, diagnostics, context);
		case RovermlPackage.TERMINATE:
			return validateTerminate((Terminate) value, diagnostics, context);
		case RovermlPackage.REPEAT:
			return validateRepeat((Repeat) value, diagnostics, context);
		case RovermlPackage.TRIGGERED:
			return validateTriggered((Triggered) value, diagnostics, context);
		case RovermlPackage.REGULAR:
			return validateRegular((Regular) value, diagnostics, context);
		case RovermlPackage.DISTANCE_SENSOR_TRIGGER:
			return validateDistanceSensorTrigger((DistanceSensorTrigger) value, diagnostics, context);
		case RovermlPackage.COMPASS_TRIGGER:
			return validateCompassTrigger((CompassTrigger) value, diagnostics, context);
		case RovermlPackage.GPS_TRIGGER:
			return validateGPSTrigger((GPSTrigger) value, diagnostics, context);
		case RovermlPackage.QUANTITY:
			return validateQuantity((Quantity) value, diagnostics, context);
		case RovermlPackage.SINGLE_QUANTITY:
			return validateSingleQuantity((SingleQuantity) value, diagnostics, context);
		case RovermlPackage.POSITION:
			return validatePosition((Position) value, diagnostics, context);
		case RovermlPackage.TIME:
			return validateTime((Time) value, diagnostics, context);
		case RovermlPackage.VELOCITY:
			return validateVelocity((Velocity) value, diagnostics, context);
		case RovermlPackage.LENGTH:
			return validateLength((Length) value, diagnostics, context);
		case RovermlPackage.ANGLE:
			return validateAngle((Angle) value, diagnostics, context);
		case RovermlPackage.TIME_UNITS:
			return validateTimeUnits((TimeUnits) value, diagnostics, context);
		case RovermlPackage.VELOCITY_UNITS:
			return validateVelocityUnits((VelocityUnits) value, diagnostics, context);
		case RovermlPackage.LENGTH_UNITS:
			return validateLengthUnits((LengthUnits) value, diagnostics, context);
		case RovermlPackage.ANGLE_UNITS:
			return validateAngleUnits((AngleUnits) value, diagnostics, context);
		case RovermlPackage.COLOURS:
			return validateColours((Colours) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystem(roverml.System system, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(system, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRover(Rover rover, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rover, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(rover, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(rover, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(rover, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(rover, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(rover, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(rover, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(rover, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(rover, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRover_uniqueComponentNames(rover, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRover_minNumMotors(rover, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the uniqueComponentNames constraint of '<em>Rover</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROVER__UNIQUE_COMPONENT_NAMES__EEXPRESSION = "self.components -> forAll(c1, c2 | c1 <> c2 implies c1.name <> c2.name)";

	/**
	 * Validates the uniqueComponentNames constraint of '<em>Rover</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRover_uniqueComponentNames(Rover rover, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(RovermlPackage.Literals.ROVER, rover, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "uniqueComponentNames",
				ROVER__UNIQUE_COMPONENT_NAMES__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the minNumMotors constraint of '<em>Rover</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROVER__MIN_NUM_MOTORS__EEXPRESSION = "self.components -> exists(m | m.oclIsTypeOf(Motor) = true)";

	/**
	 * Validates the minNumMotors constraint of '<em>Rover</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRover_minNumMotors(Rover rover, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(RovermlPackage.Literals.ROVER, rover, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "minNumMotors", ROVER__MIN_NUM_MOTORS__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgram(Program program, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(program, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(component, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensor(Sensor sensor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sensor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActuator(Actuator actuator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actuator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGPS(GPS gps, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gps, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompass(Compass compass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDistanceSensor(DistanceSensor distanceSensor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(distanceSensor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMotor(Motor motor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(motor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLight(Light light, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(light, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBlock(Block block, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(block, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommand(Command command, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(command, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSetLightColor(SetLightColor setLightColor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(setLightColor, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(setLightColor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(setLightColor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(setLightColor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(setLightColor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(setLightColor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(setLightColor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(setLightColor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(setLightColor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSetLightColor_regularTransCount(setLightColor, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the regularTransCount constraint of '<em>Set Light Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SET_LIGHT_COLOR__REGULAR_TRANS_COUNT__EEXPRESSION = "self.outgoingTransitions -> select(m | m.oclIsTypeOf(Regular) = true) -> size() <= 1";

	/**
	 * Validates the regularTransCount constraint of '<em>Set Light Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSetLightColor_regularTransCount(SetLightColor setLightColor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(RovermlPackage.Literals.SET_LIGHT_COLOR, setLightColor, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "regularTransCount",
				SET_LIGHT_COLOR__REGULAR_TRANS_COUNT__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWait(Wait wait, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(wait, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(wait, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(wait, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(wait, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(wait, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(wait, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(wait, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(wait, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(wait, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateWait_timeNotNegative(wait, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateWait_regularTransCount(wait, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the timeNotNegative constraint of '<em>Wait</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WAIT__TIME_NOT_NEGATIVE__EEXPRESSION = "self.time >= 0";

	/**
	 * Validates the timeNotNegative constraint of '<em>Wait</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWait_timeNotNegative(Wait wait, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(RovermlPackage.Literals.WAIT, wait, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "timeNotNegative",
				WAIT__TIME_NOT_NEGATIVE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the regularTransCount constraint of '<em>Wait</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WAIT__REGULAR_TRANS_COUNT__EEXPRESSION = "self.outgoingTransitions -> select(m | m.oclIsTypeOf(Regular) = true) -> size() <= 1";

	/**
	 * Validates the regularTransCount constraint of '<em>Wait</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWait_regularTransCount(Wait wait, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(RovermlPackage.Literals.WAIT, wait, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "regularTransCount",
				WAIT__REGULAR_TRANS_COUNT__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMove(Move move, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(move, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(move, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(move, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(move, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(move, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(move, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(move, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(move, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(move, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMove_velocityNotZero(move, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMove_indefinitelyTrigg(move, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMove_regularTransCount(move, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the velocityNotZero constraint of '<em>Move</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MOVE__VELOCITY_NOT_ZERO__EEXPRESSION = "self.velocity <> 0";

	/**
	 * Validates the velocityNotZero constraint of '<em>Move</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMove_velocityNotZero(Move move, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(RovermlPackage.Literals.MOVE, move, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "velocityNotZero",
				MOVE__VELOCITY_NOT_ZERO__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the indefinitelyTrigg constraint of '<em>Move</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MOVE__INDEFINITELY_TRIGG__EEXPRESSION = "if length = 0.0 and self.outgoingTransitions -> forAll(m | m.oclIsKindOf(Triggered) = true) then true elseif length <> 0.0 then true else false endif";

	/**
	 * Validates the indefinitelyTrigg constraint of '<em>Move</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMove_indefinitelyTrigg(Move move, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(RovermlPackage.Literals.MOVE, move, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "indefinitelyTrigg",
				MOVE__INDEFINITELY_TRIGG__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the regularTransCount constraint of '<em>Move</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MOVE__REGULAR_TRANS_COUNT__EEXPRESSION = "self.outgoingTransitions -> select(m | m.oclIsTypeOf(Regular) = true) -> size() <= 1";

	/**
	 * Validates the regularTransCount constraint of '<em>Move</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMove_regularTransCount(Move move, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(RovermlPackage.Literals.MOVE, move, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "regularTransCount",
				MOVE__REGULAR_TRANS_COUNT__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRotate(Rotate rotate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rotate, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(rotate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(rotate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(rotate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(rotate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(rotate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(rotate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(rotate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(rotate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRotate_regularTransCount(rotate, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the regularTransCount constraint of '<em>Rotate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROTATE__REGULAR_TRANS_COUNT__EEXPRESSION = "self.outgoingTransitions -> select(m | m.oclIsTypeOf(Regular) = true) -> size() <= 1";

	/**
	 * Validates the regularTransCount constraint of '<em>Rotate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRotate_regularTransCount(Rotate rotate, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(RovermlPackage.Literals.ROTATE, rotate, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "regularTransCount",
				ROTATE__REGULAR_TRANS_COUNT__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerminate(Terminate terminate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(terminate, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(terminate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(terminate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(terminate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(terminate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(terminate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(terminate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(terminate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(terminate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTerminate_noOutTransitions(terminate, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the noOutTransitions constraint of '<em>Terminate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TERMINATE__NO_OUT_TRANSITIONS__EEXPRESSION = "self.outgoingTransitions -> isEmpty()";

	/**
	 * Validates the noOutTransitions constraint of '<em>Terminate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerminate_noOutTransitions(Terminate terminate, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(RovermlPackage.Literals.TERMINATE, terminate, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "noOutTransitions",
				TERMINATE__NO_OUT_TRANSITIONS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepeat(Repeat repeat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(repeat, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(repeat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(repeat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(repeat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(repeat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(repeat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(repeat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(repeat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(repeat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRepeat_indefRepeats(repeat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRepeat_regularTransCount(repeat, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the indefRepeats constraint of '<em>Repeat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REPEAT__INDEF_REPEATS__EEXPRESSION = "if self.numberOfReps = -1 and self.outgoingTransitions -> select(t: Transition | t.source -> exists(m | m.oclIsTypeOf(Repeat) = true)) -> notEmpty() then true elseif \n"
			+ "\t\tself.numberOfReps <> -1 then true else false endif";

	/**
	 * Validates the indefRepeats constraint of '<em>Repeat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepeat_indefRepeats(Repeat repeat, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(RovermlPackage.Literals.REPEAT, repeat, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "indefRepeats", REPEAT__INDEF_REPEATS__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the regularTransCount constraint of '<em>Repeat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REPEAT__REGULAR_TRANS_COUNT__EEXPRESSION = "self.outgoingTransitions -> select(m | m.oclIsTypeOf(Regular) = true) -> size() <= 1";

	/**
	 * Validates the regularTransCount constraint of '<em>Repeat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepeat_regularTransCount(Repeat repeat, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(RovermlPackage.Literals.REPEAT, repeat, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "regularTransCount",
				REPEAT__REGULAR_TRANS_COUNT__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTriggered(Triggered triggered, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(triggered, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegular(Regular regular, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(regular, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDistanceSensorTrigger(DistanceSensorTrigger distanceSensorTrigger,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(distanceSensorTrigger, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompassTrigger(CompassTrigger compassTrigger, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compassTrigger, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGPSTrigger(GPSTrigger gpsTrigger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gpsTrigger, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantity(Quantity quantity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quantity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingleQuantity(SingleQuantity singleQuantity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(singleQuantity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePosition(Position position, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(position, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTime(Time time, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(time, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVelocity(Velocity velocity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(velocity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLength(Length length, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(length, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngle(Angle angle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(angle, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeUnits(TimeUnits timeUnits, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVelocityUnits(VelocityUnits velocityUnits, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLengthUnits(LengthUnits lengthUnits, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngleUnits(AngleUnits angleUnits, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColours(Colours colours, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //RovermlValidator
