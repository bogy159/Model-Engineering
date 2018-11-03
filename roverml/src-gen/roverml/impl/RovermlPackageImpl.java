/**
 */
package roverml.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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

import roverml.util.RovermlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RovermlPackageImpl extends EPackageImpl implements RovermlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actuatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gpsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distanceSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass motorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setLightColorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass waitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rotateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repeatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggeredEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regularEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distanceSensorTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compassTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gpsTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleQuantityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass velocityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lengthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeUnitsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum velocityUnitsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lengthUnitsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum angleUnitsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum coloursEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see roverml.RovermlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RovermlPackageImpl() {
		super(eNS_URI, RovermlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link RovermlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RovermlPackage init() {
		if (isInited)
			return (RovermlPackage) EPackage.Registry.INSTANCE.getEPackage(RovermlPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRovermlPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RovermlPackageImpl theRovermlPackage = registeredRovermlPackage instanceof RovermlPackageImpl
				? (RovermlPackageImpl) registeredRovermlPackage
				: new RovermlPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theRovermlPackage.createPackageContents();

		// Initialize created meta-data
		theRovermlPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theRovermlPackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return RovermlValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theRovermlPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RovermlPackage.eNS_URI, theRovermlPackage);
		return theRovermlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystem() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Programs() {
		return (EReference) systemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Rovers() {
		return (EReference) systemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRover() {
		return roverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRover_Components() {
		return (EReference) roverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgram() {
		return programEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgram_RoverExec() {
		return (EReference) programEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgram_Blocks() {
		return (EReference) programEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensor() {
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActuator() {
		return actuatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGPS() {
		return gpsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPS_X() {
		return (EAttribute) gpsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPS_Y() {
		return (EAttribute) gpsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompass() {
		return compassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompass_Angle() {
		return (EAttribute) compassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDistanceSensor() {
		return distanceSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistanceSensor_Distance() {
		return (EAttribute) distanceSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMotor() {
		return motorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLight() {
		return lightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Transitions() {
		return (EReference) blockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Commands() {
		return (EReference) blockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommand() {
		return commandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommand_OutgoingTransitions() {
		return (EReference) commandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommand_IncomingTransitions() {
		return (EReference) commandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommand_Components() {
		return (EReference) commandEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Source() {
		return (EReference) transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Target() {
		return (EReference) transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetLightColor() {
		return setLightColorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetLightColor_Color() {
		return (EAttribute) setLightColorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWait() {
		return waitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWait_Time() {
		return (EAttribute) waitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWait_TimeUnit() {
		return (EReference) waitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMove() {
		return moveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMove_Length() {
		return (EAttribute) moveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMove_Velocity() {
		return (EAttribute) moveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMove_VelocityUnits() {
		return (EReference) moveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMove_LengthUnits() {
		return (EReference) moveEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRotate() {
		return rotateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotate_Angle() {
		return (EAttribute) rotateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRotate_AngleUnits() {
		return (EReference) rotateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminate() {
		return terminateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepeat() {
		return repeatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepeat_NumberOfReps() {
		return (EAttribute) repeatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepeat_Commands() {
		return (EReference) repeatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriggered() {
		return triggeredEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriggered_Operator() {
		return (EAttribute) triggeredEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegular() {
		return regularEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDistanceSensorTrigger() {
		return distanceSensorTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistanceSensorTrigger_Length() {
		return (EReference) distanceSensorTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistanceSensorTrigger_Dist() {
		return (EAttribute) distanceSensorTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistanceSensorTrigger_Distancesensor() {
		return (EReference) distanceSensorTriggerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompassTrigger() {
		return compassTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompassTrigger_Angles() {
		return (EReference) compassTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompassTrigger_Angle() {
		return (EAttribute) compassTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompassTrigger_Compass() {
		return (EReference) compassTriggerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGPSTrigger() {
		return gpsTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGPSTrigger_Position() {
		return (EReference) gpsTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPSTrigger_X() {
		return (EAttribute) gpsTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPSTrigger_Y() {
		return (EAttribute) gpsTriggerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGPSTrigger_Gps() {
		return (EReference) gpsTriggerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantity() {
		return quantityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleQuantity() {
		return singleQuantityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPosition() {
		return positionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPosition_X() {
		return (EAttribute) positionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPosition_Y() {
		return (EAttribute) positionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTime() {
		return timeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTime_Units() {
		return (EAttribute) timeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVelocity() {
		return velocityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVelocity_Units() {
		return (EAttribute) velocityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLength() {
		return lengthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLength_Units() {
		return (EAttribute) lengthEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAngle() {
		return angleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAngle_Units() {
		return (EAttribute) angleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeUnits() {
		return timeUnitsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVelocityUnits() {
		return velocityUnitsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLengthUnits() {
		return lengthUnitsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAngleUnits() {
		return angleUnitsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColours() {
		return coloursEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RovermlFactory getRovermlFactory() {
		return (RovermlFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		systemEClass = createEClass(SYSTEM);
		createEReference(systemEClass, SYSTEM__PROGRAMS);
		createEReference(systemEClass, SYSTEM__ROVERS);

		roverEClass = createEClass(ROVER);
		createEReference(roverEClass, ROVER__COMPONENTS);

		programEClass = createEClass(PROGRAM);
		createEReference(programEClass, PROGRAM__ROVER_EXEC);
		createEReference(programEClass, PROGRAM__BLOCKS);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		componentEClass = createEClass(COMPONENT);

		sensorEClass = createEClass(SENSOR);

		actuatorEClass = createEClass(ACTUATOR);

		gpsEClass = createEClass(GPS);
		createEAttribute(gpsEClass, GPS__X);
		createEAttribute(gpsEClass, GPS__Y);

		compassEClass = createEClass(COMPASS);
		createEAttribute(compassEClass, COMPASS__ANGLE);

		distanceSensorEClass = createEClass(DISTANCE_SENSOR);
		createEAttribute(distanceSensorEClass, DISTANCE_SENSOR__DISTANCE);

		motorEClass = createEClass(MOTOR);

		lightEClass = createEClass(LIGHT);

		blockEClass = createEClass(BLOCK);
		createEReference(blockEClass, BLOCK__TRANSITIONS);
		createEReference(blockEClass, BLOCK__COMMANDS);

		commandEClass = createEClass(COMMAND);
		createEReference(commandEClass, COMMAND__OUTGOING_TRANSITIONS);
		createEReference(commandEClass, COMMAND__INCOMING_TRANSITIONS);
		createEReference(commandEClass, COMMAND__COMPONENTS);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__TARGET);

		setLightColorEClass = createEClass(SET_LIGHT_COLOR);
		createEAttribute(setLightColorEClass, SET_LIGHT_COLOR__COLOR);

		waitEClass = createEClass(WAIT);
		createEAttribute(waitEClass, WAIT__TIME);
		createEReference(waitEClass, WAIT__TIME_UNIT);

		moveEClass = createEClass(MOVE);
		createEAttribute(moveEClass, MOVE__LENGTH);
		createEAttribute(moveEClass, MOVE__VELOCITY);
		createEReference(moveEClass, MOVE__VELOCITY_UNITS);
		createEReference(moveEClass, MOVE__LENGTH_UNITS);

		rotateEClass = createEClass(ROTATE);
		createEAttribute(rotateEClass, ROTATE__ANGLE);
		createEReference(rotateEClass, ROTATE__ANGLE_UNITS);

		terminateEClass = createEClass(TERMINATE);

		repeatEClass = createEClass(REPEAT);
		createEAttribute(repeatEClass, REPEAT__NUMBER_OF_REPS);
		createEReference(repeatEClass, REPEAT__COMMANDS);

		triggeredEClass = createEClass(TRIGGERED);
		createEAttribute(triggeredEClass, TRIGGERED__OPERATOR);

		regularEClass = createEClass(REGULAR);

		distanceSensorTriggerEClass = createEClass(DISTANCE_SENSOR_TRIGGER);
		createEReference(distanceSensorTriggerEClass, DISTANCE_SENSOR_TRIGGER__LENGTH);
		createEAttribute(distanceSensorTriggerEClass, DISTANCE_SENSOR_TRIGGER__DIST);
		createEReference(distanceSensorTriggerEClass, DISTANCE_SENSOR_TRIGGER__DISTANCESENSOR);

		compassTriggerEClass = createEClass(COMPASS_TRIGGER);
		createEReference(compassTriggerEClass, COMPASS_TRIGGER__ANGLES);
		createEAttribute(compassTriggerEClass, COMPASS_TRIGGER__ANGLE);
		createEReference(compassTriggerEClass, COMPASS_TRIGGER__COMPASS);

		gpsTriggerEClass = createEClass(GPS_TRIGGER);
		createEReference(gpsTriggerEClass, GPS_TRIGGER__POSITION);
		createEAttribute(gpsTriggerEClass, GPS_TRIGGER__X);
		createEAttribute(gpsTriggerEClass, GPS_TRIGGER__Y);
		createEReference(gpsTriggerEClass, GPS_TRIGGER__GPS);

		quantityEClass = createEClass(QUANTITY);

		singleQuantityEClass = createEClass(SINGLE_QUANTITY);

		positionEClass = createEClass(POSITION);
		createEAttribute(positionEClass, POSITION__X);
		createEAttribute(positionEClass, POSITION__Y);

		timeEClass = createEClass(TIME);
		createEAttribute(timeEClass, TIME__UNITS);

		velocityEClass = createEClass(VELOCITY);
		createEAttribute(velocityEClass, VELOCITY__UNITS);

		lengthEClass = createEClass(LENGTH);
		createEAttribute(lengthEClass, LENGTH__UNITS);

		angleEClass = createEClass(ANGLE);
		createEAttribute(angleEClass, ANGLE__UNITS);

		// Create enums
		timeUnitsEEnum = createEEnum(TIME_UNITS);
		velocityUnitsEEnum = createEEnum(VELOCITY_UNITS);
		lengthUnitsEEnum = createEEnum(LENGTH_UNITS);
		angleUnitsEEnum = createEEnum(ANGLE_UNITS);
		coloursEEnum = createEEnum(COLOURS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		systemEClass.getESuperTypes().add(this.getNamedElement());
		roverEClass.getESuperTypes().add(this.getNamedElement());
		programEClass.getESuperTypes().add(this.getNamedElement());
		componentEClass.getESuperTypes().add(this.getNamedElement());
		sensorEClass.getESuperTypes().add(this.getComponent());
		actuatorEClass.getESuperTypes().add(this.getComponent());
		gpsEClass.getESuperTypes().add(this.getSensor());
		compassEClass.getESuperTypes().add(this.getSensor());
		distanceSensorEClass.getESuperTypes().add(this.getSensor());
		motorEClass.getESuperTypes().add(this.getActuator());
		lightEClass.getESuperTypes().add(this.getActuator());
		setLightColorEClass.getESuperTypes().add(this.getCommand());
		waitEClass.getESuperTypes().add(this.getCommand());
		moveEClass.getESuperTypes().add(this.getCommand());
		rotateEClass.getESuperTypes().add(this.getCommand());
		terminateEClass.getESuperTypes().add(this.getCommand());
		repeatEClass.getESuperTypes().add(this.getCommand());
		triggeredEClass.getESuperTypes().add(this.getTransition());
		regularEClass.getESuperTypes().add(this.getTransition());
		distanceSensorTriggerEClass.getESuperTypes().add(this.getTriggered());
		compassTriggerEClass.getESuperTypes().add(this.getTriggered());
		gpsTriggerEClass.getESuperTypes().add(this.getTriggered());
		singleQuantityEClass.getESuperTypes().add(this.getQuantity());
		positionEClass.getESuperTypes().add(this.getQuantity());
		timeEClass.getESuperTypes().add(this.getSingleQuantity());
		velocityEClass.getESuperTypes().add(this.getSingleQuantity());
		lengthEClass.getESuperTypes().add(this.getSingleQuantity());
		angleEClass.getESuperTypes().add(this.getSingleQuantity());

		// Initialize classes, features, and operations; add parameters
		initEClass(systemEClass, roverml.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystem_Programs(), this.getProgram(), null, "programs", null, 0, -1, roverml.System.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Rovers(), this.getRover(), null, "rovers", null, 0, -1, roverml.System.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roverEClass, Rover.class, "Rover", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRover_Components(), this.getComponent(), null, "components", null, 0, -1, Rover.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programEClass, Program.class, "Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgram_RoverExec(), this.getRover(), null, "roverExec", null, 0, 1, Program.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgram_Blocks(), this.getBlock(), null, "blocks", null, 0, 1, Program.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(sensorEClass, Sensor.class, "Sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actuatorEClass, Actuator.class, "Actuator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(gpsEClass, roverml.GPS.class, "GPS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGPS_X(), ecorePackage.getEFloat(), "x", null, 0, -1, roverml.GPS.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPS_Y(), ecorePackage.getEFloat(), "y", null, 0, -1, roverml.GPS.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compassEClass, Compass.class, "Compass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompass_Angle(), ecorePackage.getEInt(), "angle", null, 1, 1, Compass.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(distanceSensorEClass, DistanceSensor.class, "DistanceSensor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDistanceSensor_Distance(), ecorePackage.getEDouble(), "distance", null, 1, 1,
				DistanceSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(motorEClass, Motor.class, "Motor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lightEClass, Light.class, "Light", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlock_Transitions(), this.getTransition(), null, "transitions", null, 0, -1, Block.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Commands(), this.getCommand(), null, "commands", null, 0, -1, Block.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commandEClass, Command.class, "Command", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommand_OutgoingTransitions(), this.getTransition(), this.getTransition_Source(),
				"outgoingTransitions", null, 0, -1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommand_IncomingTransitions(), this.getTransition(), this.getTransition_Target(),
				"incomingTransitions", null, 0, -1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommand_Components(), this.getComponent(), null, "components", null, 0, -1, Command.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_Source(), this.getCommand(), this.getCommand_OutgoingTransitions(), "source", null,
				1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Target(), this.getCommand(), this.getCommand_IncomingTransitions(), "target", null,
				1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setLightColorEClass, SetLightColor.class, "SetLightColor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetLightColor_Color(), this.getColours(), "color", null, 1, 1, SetLightColor.class,
				IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(waitEClass, Wait.class, "Wait", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWait_Time(), ecorePackage.getEInt(), "time", null, 1, 1, Wait.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWait_TimeUnit(), this.getTime(), null, "timeUnit", null, 1, 1, Wait.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(moveEClass, Move.class, "Move", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMove_Length(), ecorePackage.getEDouble(), "length", null, 1, 1, Move.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMove_Velocity(), ecorePackage.getEDouble(), "velocity", null, 1, 1, Move.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMove_VelocityUnits(), this.getVelocity(), null, "velocityUnits", null, 1, 1, Move.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMove_LengthUnits(), this.getLength(), null, "lengthUnits", null, 1, 1, Move.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rotateEClass, Rotate.class, "Rotate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRotate_Angle(), ecorePackage.getEInt(), "angle", null, 1, 1, Rotate.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRotate_AngleUnits(), this.getAngle(), null, "angleUnits", null, 1, 1, Rotate.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(terminateEClass, Terminate.class, "Terminate", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(repeatEClass, Repeat.class, "Repeat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepeat_NumberOfReps(), ecorePackage.getEInt(), "numberOfReps", null, 1, 1, Repeat.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepeat_Commands(), this.getCommand(), null, "commands", null, 0, -1, Repeat.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggeredEClass, Triggered.class, "Triggered", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTriggered_Operator(), ecorePackage.getEChar(), "operator", null, 0, 1, Triggered.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regularEClass, Regular.class, "Regular", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(distanceSensorTriggerEClass, DistanceSensorTrigger.class, "DistanceSensorTrigger", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDistanceSensorTrigger_Length(), this.getLength(), null, "length", null, 0, 1,
				DistanceSensorTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistanceSensorTrigger_Dist(), ecorePackage.getEDouble(), "dist", null, 1, 1,
				DistanceSensorTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistanceSensorTrigger_Distancesensor(), this.getDistanceSensor(), null, "distancesensor",
				null, 0, 1, DistanceSensorTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compassTriggerEClass, CompassTrigger.class, "CompassTrigger", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompassTrigger_Angles(), this.getAngle(), null, "angles", null, 0, 1, CompassTrigger.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompassTrigger_Angle(), ecorePackage.getEInt(), "angle", null, 1, 1, CompassTrigger.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompassTrigger_Compass(), this.getCompass(), null, "compass", null, 0, 1,
				CompassTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gpsTriggerEClass, GPSTrigger.class, "GPSTrigger", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGPSTrigger_Position(), this.getPosition(), null, "position", null, 0, 1, GPSTrigger.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPSTrigger_X(), ecorePackage.getEFloat(), "x", null, 1, 1, GPSTrigger.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPSTrigger_Y(), ecorePackage.getEFloat(), "y", null, 1, 1, GPSTrigger.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGPSTrigger_Gps(), this.getGPS(), null, "gps", null, 0, 1, GPSTrigger.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(quantityEClass, Quantity.class, "Quantity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(singleQuantityEClass, SingleQuantity.class, "SingleQuantity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(positionEClass, Position.class, "Position", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPosition_X(), ecorePackage.getEFloat(), "x", null, 1, 1, Position.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_Y(), ecorePackage.getEFloat(), "y", null, 1, 1, Position.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeEClass, Time.class, "Time", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTime_Units(), this.getTimeUnits(), "units", null, 1, 1, Time.class, IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(velocityEClass, Velocity.class, "Velocity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVelocity_Units(), this.getVelocityUnits(), "units", null, 1, 1, Velocity.class, IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lengthEClass, Length.class, "Length", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLength_Units(), this.getLengthUnits(), "units", null, 1, 1, Length.class, IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(angleEClass, Angle.class, "Angle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAngle_Units(), this.getAngleUnits(), "units", null, 1, 1, Angle.class, IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(timeUnitsEEnum, TimeUnits.class, "TimeUnits");
		addEEnumLiteral(timeUnitsEEnum, TimeUnits.NANOSECONDS);
		addEEnumLiteral(timeUnitsEEnum, TimeUnits.MILLISECONDS);
		addEEnumLiteral(timeUnitsEEnum, TimeUnits.SECONDS);
		addEEnumLiteral(timeUnitsEEnum, TimeUnits.MINUTES);
		addEEnumLiteral(timeUnitsEEnum, TimeUnits.HOURS);

		initEEnum(velocityUnitsEEnum, VelocityUnits.class, "VelocityUnits");
		addEEnumLiteral(velocityUnitsEEnum, VelocityUnits.MILLIMETERS_PER_SECOND);
		addEEnumLiteral(velocityUnitsEEnum, VelocityUnits.CENTIMETERS_PER_SECOND);

		initEEnum(lengthUnitsEEnum, LengthUnits.class, "LengthUnits");
		addEEnumLiteral(lengthUnitsEEnum, LengthUnits.MILLIMETERS);
		addEEnumLiteral(lengthUnitsEEnum, LengthUnits.CENTIMETERS);
		addEEnumLiteral(lengthUnitsEEnum, LengthUnits.METERS);

		initEEnum(angleUnitsEEnum, AngleUnits.class, "AngleUnits");
		addEEnumLiteral(angleUnitsEEnum, AngleUnits.RADIANS);
		addEEnumLiteral(angleUnitsEEnum, AngleUnits.DEGREES);

		initEEnum(coloursEEnum, Colours.class, "Colours");
		addEEnumLiteral(coloursEEnum, Colours.NONE);
		addEEnumLiteral(coloursEEnum, Colours.RED);
		addEEnumLiteral(coloursEEnum, Colours.GREEN);
		addEEnumLiteral(coloursEEnum, Colours.BLUE);
		addEEnumLiteral(coloursEEnum, Colours.YELLOW);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation(this, source, new String[] { "ecore", "http://www.eclipse.org/emf/2002/Ecore" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source,
				new String[] { "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
						"settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "validationDelegates",
						"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot" });
		addAnnotation(roverEClass, source, new String[] { "constraints", "uniqueComponentNames minNumMotors" });
		addAnnotation(setLightColorEClass, source, new String[] { "constraints", "regularTransCount" });
		addAnnotation(waitEClass, source, new String[] { "constraints", "timeNotNegative regularTransCount" });
		addAnnotation(moveEClass, source,
				new String[] { "constraints", "velocityNotZero indefinitelyTrigg regularTransCount" });
		addAnnotation(rotateEClass, source, new String[] { "constraints", "regularTransCount" });
		addAnnotation(terminateEClass, source, new String[] { "constraints", "noOutTransitions" });
		addAnnotation(repeatEClass, source, new String[] { "constraints", "indefRepeats regularTransCount" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(roverEClass, source,
				new String[] { "uniqueComponentNames",
						"self.components -> forAll(c1, c2 | c1 <> c2 implies c1.name <> c2.name)", "minNumMotors",
						"self.components -> exists(m | m.oclIsTypeOf(Motor) = true)" });
		addAnnotation(setLightColorEClass, source, new String[] { "regularTransCount",
				"self.outgoingTransitions -> select(m | m.oclIsTypeOf(Regular) = true) -> size() <= 1" });
		addAnnotation(waitEClass, source, new String[] { "timeNotNegative", "self.time >= 0", "regularTransCount",
				"self.outgoingTransitions -> select(m | m.oclIsTypeOf(Regular) = true) -> size() <= 1" });
		addAnnotation(moveEClass, source, new String[] { "velocityNotZero", "self.velocity <> 0", "indefinitelyTrigg",
				"if length = 0.0 and self.outgoingTransitions -> forAll(m | m.oclIsKindOf(Triggered) = true) then true elseif length <> 0.0 then true else false endif",
				"regularTransCount",
				"self.outgoingTransitions -> select(m | m.oclIsTypeOf(Regular) = true) -> size() <= 1" });
		addAnnotation(rotateEClass, source, new String[] { "regularTransCount",
				"self.outgoingTransitions -> select(m | m.oclIsTypeOf(Regular) = true) -> size() <= 1" });
		addAnnotation(terminateEClass, source,
				new String[] { "noOutTransitions", "self.outgoingTransitions -> isEmpty()" });
		addAnnotation(repeatEClass, source, new String[] { "indefRepeats",
				"if self.numberOfReps = -1 and self.outgoingTransitions -> select(t: Transition | t.source -> exists(m | m.oclIsTypeOf(Repeat) = true)) -> notEmpty() then true elseif \n\t\tself.numberOfReps <> -1 then true else false endif",
				"regularTransCount",
				"self.outgoingTransitions -> select(m | m.oclIsTypeOf(Regular) = true) -> size() <= 1" });
	}

} //RovermlPackageImpl
