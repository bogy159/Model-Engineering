/**
 */
package roverml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see roverml.RovermlFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface RovermlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "roverml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/roverml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "roverml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RovermlPackage eINSTANCE = roverml.impl.RovermlPackageImpl.init();

	/**
	 * The meta object id for the '{@link roverml.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roverml.impl.NamedElementImpl
	 * @see roverml.impl.RovermlPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link roverml.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roverml.impl.SystemImpl
	 * @see roverml.impl.RovermlPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Programs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PROGRAMS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rovers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ROVERS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link roverml.impl.RoverImpl <em>Rover</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roverml.impl.RoverImpl
	 * @see roverml.impl.RovermlPackageImpl#getRover()
	 * @generated
	 */
	int ROVER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER__COMPONENTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rover</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rover</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link roverml.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roverml.impl.ProgramImpl
	 * @see roverml.impl.RovermlPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Rover Exec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__ROVER_EXEC = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__BLOCKS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link roverml.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roverml.impl.ComponentImpl
	 * @see roverml.impl.RovermlPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link roverml.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roverml.impl.SensorImpl
	 * @see roverml.impl.RovermlPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = COMPONENT__NAME;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link roverml.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roverml.impl.ActuatorImpl
	 * @see roverml.impl.RovermlPackageImpl#getActuator()
	 * @generated
	 */
	int ACTUATOR = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__NAME = COMPONENT__NAME;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link roverml.impl.GPSImpl <em>GPS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roverml.impl.GPSImpl
	 * @see roverml.impl.RovermlPackageImpl#getGPS()
	 * @generated
	 */
	int GPS = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS__X = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS__Y = SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>GPS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>GPS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link roverml.impl.CompassImpl <em>Compass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roverml.impl.CompassImpl
	 * @see roverml.impl.RovermlPackageImpl#getCompass()
	 * @generated
	 */
	int COMPASS = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPASS__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPASS__ANGLE = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Compass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPASS_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Compass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPASS_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link roverml.impl.DistanceSensorImpl <em>Distance Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roverml.impl.DistanceSensorImpl
	 * @see roverml.impl.RovermlPackageImpl#getDistanceSensor()
	 * @generated
	 */
	int DISTANCE_SENSOR = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR__DISTANCE = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Distance Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Distance Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link roverml.impl.MotorImpl <em>Motor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roverml.impl.MotorImpl
	 * @see roverml.impl.RovermlPackageImpl#getMotor()
	 * @generated
	 */
	int MOTOR = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__NAME = ACTUATOR__NAME;

	/**
	 * The number of structural features of the '<em>Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_FEATURE_COUNT = ACTUATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_OPERATION_COUNT = ACTUATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link roverml.impl.LightImpl <em>Light</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roverml.impl.LightImpl
	 * @see roverml.impl.RovermlPackageImpl#getLight()
	 * @generated
	 */
	int LIGHT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT__NAME = ACTUATOR__NAME;

	/**
	 * The number of structural features of the '<em>Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_FEATURE_COUNT = ACTUATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_OPERATION_COUNT = ACTUATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link roverml.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roverml.impl.BlockImpl
	 * @see roverml.impl.RovermlPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 12;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__TRANSITIONS = 0;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__COMMANDS = 1;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link roverml.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roverml.impl.CommandImpl
	 * @see roverml.impl.RovermlPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 13;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__OUTGOING_TRANSITIONS = 0;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__INCOMING_TRANSITIONS = 1;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__COMPONENTS = 2;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link roverml.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roverml.impl.TransitionImpl
	 * @see roverml.impl.RovermlPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 14;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link roverml.impl.SetLightColorImpl <em>Set Light Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roverml.impl.SetLightColorImpl
	 * @see roverml.impl.RovermlPackageImpl#getSetLightColor()
	 * @generated
	 */
	int SET_LIGHT_COLOR = 15;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIGHT_COLOR__OUTGOING_TRANSITIONS = COMMAND__OUTGOING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIGHT_COLOR__INCOMING_TRANSITIONS = COMMAND__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIGHT_COLOR__COMPONENTS = COMMAND__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIGHT_COLOR__COLOR = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Set Light Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIGHT_COLOR_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Set Light Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIGHT_COLOR_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link roverml.impl.WaitImpl <em>Wait</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roverml.impl.WaitImpl
	 * @see roverml.impl.RovermlPackageImpl#getWait()
	 * @generated
	 */
	int WAIT = 16;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__OUTGOING_TRANSITIONS = COMMAND__OUTGOING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__INCOMING_TRANSITIONS = COMMAND__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__COMPONENTS = COMMAND__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__TIME = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__TIME_UNIT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Wait</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Wait</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link roverml.impl.MoveImpl <em>Move</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roverml.impl.MoveImpl
	 * @see roverml.impl.RovermlPackageImpl#getMove()
	 * @generated
	 */
	int MOVE = 17;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__OUTGOING_TRANSITIONS = COMMAND__OUTGOING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__INCOMING_TRANSITIONS = COMMAND__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__COMPONENTS = COMMAND__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__LENGTH = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__VELOCITY = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Velocity Units</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__VELOCITY_UNITS = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Length Units</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__LENGTH_UNITS = COMMAND_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link roverml.impl.RotateImpl <em>Rotate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roverml.impl.RotateImpl
	 * @see roverml.impl.RovermlPackageImpl#getRotate()
	 * @generated
	 */
	int ROTATE = 18;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE__OUTGOING_TRANSITIONS = COMMAND__OUTGOING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE__INCOMING_TRANSITIONS = COMMAND__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE__COMPONENTS = COMMAND__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE__ANGLE = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Angle Units</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE__ANGLE_UNITS = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rotate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rotate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link roverml.impl.TerminateImpl <em>Terminate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roverml.impl.TerminateImpl
	 * @see roverml.impl.RovermlPackageImpl#getTerminate()
	 * @generated
	 */
	int TERMINATE = 19;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATE__OUTGOING_TRANSITIONS = COMMAND__OUTGOING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATE__INCOMING_TRANSITIONS = COMMAND__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATE__COMPONENTS = COMMAND__COMPONENTS;

	/**
	 * The number of structural features of the '<em>Terminate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATE_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Terminate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATE_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link roverml.impl.RepeatImpl <em>Repeat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roverml.impl.RepeatImpl
	 * @see roverml.impl.RovermlPackageImpl#getRepeat()
	 * @generated
	 */
	int REPEAT = 20;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__OUTGOING_TRANSITIONS = COMMAND__OUTGOING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__INCOMING_TRANSITIONS = COMMAND__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__COMPONENTS = COMMAND__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Number Of Reps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__NUMBER_OF_REPS = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__COMMANDS = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Repeat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Repeat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link roverml.impl.TriggeredImpl <em>Triggered</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roverml.impl.TriggeredImpl
	 * @see roverml.impl.RovermlPackageImpl#getTriggered()
	 * @generated
	 */
	int TRIGGERED = 21;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERED__SOURCE = TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERED__TARGET = TRANSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERED__OPERATOR = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Triggered</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERED_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Triggered</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERED_OPERATION_COUNT = TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link roverml.impl.RegularImpl <em>Regular</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roverml.impl.RegularImpl
	 * @see roverml.impl.RovermlPackageImpl#getRegular()
	 * @generated
	 */
	int REGULAR = 22;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR__SOURCE = TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR__TARGET = TRANSITION__TARGET;

	/**
	 * The number of structural features of the '<em>Regular</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Regular</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_OPERATION_COUNT = TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link roverml.impl.DistanceSensorTriggerImpl <em>Distance Sensor Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roverml.impl.DistanceSensorTriggerImpl
	 * @see roverml.impl.RovermlPackageImpl#getDistanceSensorTrigger()
	 * @generated
	 */
	int DISTANCE_SENSOR_TRIGGER = 23;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR_TRIGGER__SOURCE = TRIGGERED__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR_TRIGGER__TARGET = TRIGGERED__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR_TRIGGER__OPERATOR = TRIGGERED__OPERATOR;

	/**
	 * The feature id for the '<em><b>Length</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR_TRIGGER__LENGTH = TRIGGERED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR_TRIGGER__DIST = TRIGGERED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Distancesensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR_TRIGGER__DISTANCESENSOR = TRIGGERED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Distance Sensor Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR_TRIGGER_FEATURE_COUNT = TRIGGERED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Distance Sensor Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR_TRIGGER_OPERATION_COUNT = TRIGGERED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link roverml.impl.CompassTriggerImpl <em>Compass Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roverml.impl.CompassTriggerImpl
	 * @see roverml.impl.RovermlPackageImpl#getCompassTrigger()
	 * @generated
	 */
	int COMPASS_TRIGGER = 24;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPASS_TRIGGER__SOURCE = TRIGGERED__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPASS_TRIGGER__TARGET = TRIGGERED__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPASS_TRIGGER__OPERATOR = TRIGGERED__OPERATOR;

	/**
	 * The feature id for the '<em><b>Angles</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPASS_TRIGGER__ANGLES = TRIGGERED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPASS_TRIGGER__ANGLE = TRIGGERED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Compass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPASS_TRIGGER__COMPASS = TRIGGERED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Compass Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPASS_TRIGGER_FEATURE_COUNT = TRIGGERED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Compass Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPASS_TRIGGER_OPERATION_COUNT = TRIGGERED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link roverml.impl.GPSTriggerImpl <em>GPS Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roverml.impl.GPSTriggerImpl
	 * @see roverml.impl.RovermlPackageImpl#getGPSTrigger()
	 * @generated
	 */
	int GPS_TRIGGER = 25;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_TRIGGER__SOURCE = TRIGGERED__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_TRIGGER__TARGET = TRIGGERED__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_TRIGGER__OPERATOR = TRIGGERED__OPERATOR;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_TRIGGER__POSITION = TRIGGERED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_TRIGGER__X = TRIGGERED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_TRIGGER__Y = TRIGGERED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_TRIGGER__GPS = TRIGGERED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>GPS Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_TRIGGER_FEATURE_COUNT = TRIGGERED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>GPS Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_TRIGGER_OPERATION_COUNT = TRIGGERED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link roverml.impl.QuantityImpl <em>Quantity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roverml.impl.QuantityImpl
	 * @see roverml.impl.RovermlPackageImpl#getQuantity()
	 * @generated
	 */
	int QUANTITY = 26;

	/**
	 * The number of structural features of the '<em>Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link roverml.impl.SingleQuantityImpl <em>Single Quantity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roverml.impl.SingleQuantityImpl
	 * @see roverml.impl.RovermlPackageImpl#getSingleQuantity()
	 * @generated
	 */
	int SINGLE_QUANTITY = 27;

	/**
	 * The number of structural features of the '<em>Single Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_QUANTITY_FEATURE_COUNT = QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Single Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_QUANTITY_OPERATION_COUNT = QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link roverml.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roverml.impl.PositionImpl
	 * @see roverml.impl.RovermlPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 28;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__X = QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__Y = QUANTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = QUANTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OPERATION_COUNT = QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link roverml.impl.TimeImpl <em>Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roverml.impl.TimeImpl
	 * @see roverml.impl.RovermlPackageImpl#getTime()
	 * @generated
	 */
	int TIME = 29;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__UNITS = SINGLE_QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FEATURE_COUNT = SINGLE_QUANTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OPERATION_COUNT = SINGLE_QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link roverml.impl.VelocityImpl <em>Velocity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roverml.impl.VelocityImpl
	 * @see roverml.impl.RovermlPackageImpl#getVelocity()
	 * @generated
	 */
	int VELOCITY = 30;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VELOCITY__UNITS = SINGLE_QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Velocity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VELOCITY_FEATURE_COUNT = SINGLE_QUANTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Velocity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VELOCITY_OPERATION_COUNT = SINGLE_QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link roverml.impl.LengthImpl <em>Length</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roverml.impl.LengthImpl
	 * @see roverml.impl.RovermlPackageImpl#getLength()
	 * @generated
	 */
	int LENGTH = 31;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH__UNITS = SINGLE_QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Length</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_FEATURE_COUNT = SINGLE_QUANTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Length</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_OPERATION_COUNT = SINGLE_QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link roverml.impl.AngleImpl <em>Angle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roverml.impl.AngleImpl
	 * @see roverml.impl.RovermlPackageImpl#getAngle()
	 * @generated
	 */
	int ANGLE = 32;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE__UNITS = SINGLE_QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Angle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_FEATURE_COUNT = SINGLE_QUANTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Angle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_OPERATION_COUNT = SINGLE_QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link roverml.TimeUnits <em>Time Units</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roverml.TimeUnits
	 * @see roverml.impl.RovermlPackageImpl#getTimeUnits()
	 * @generated
	 */
	int TIME_UNITS = 33;

	/**
	 * The meta object id for the '{@link roverml.VelocityUnits <em>Velocity Units</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roverml.VelocityUnits
	 * @see roverml.impl.RovermlPackageImpl#getVelocityUnits()
	 * @generated
	 */
	int VELOCITY_UNITS = 34;

	/**
	 * The meta object id for the '{@link roverml.LengthUnits <em>Length Units</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roverml.LengthUnits
	 * @see roverml.impl.RovermlPackageImpl#getLengthUnits()
	 * @generated
	 */
	int LENGTH_UNITS = 35;

	/**
	 * The meta object id for the '{@link roverml.AngleUnits <em>Angle Units</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roverml.AngleUnits
	 * @see roverml.impl.RovermlPackageImpl#getAngleUnits()
	 * @generated
	 */
	int ANGLE_UNITS = 36;

	/**
	 * The meta object id for the '{@link roverml.Colours <em>Colours</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roverml.Colours
	 * @see roverml.impl.RovermlPackageImpl#getColours()
	 * @generated
	 */
	int COLOURS = 37;

	/**
	 * Returns the meta object for class '{@link roverml.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see roverml.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link roverml.System#getPrograms <em>Programs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Programs</em>'.
	 * @see roverml.System#getPrograms()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Programs();

	/**
	 * Returns the meta object for the containment reference list '{@link roverml.System#getRovers <em>Rovers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rovers</em>'.
	 * @see roverml.System#getRovers()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Rovers();

	/**
	 * Returns the meta object for class '{@link roverml.Rover <em>Rover</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rover</em>'.
	 * @see roverml.Rover
	 * @generated
	 */
	EClass getRover();

	/**
	 * Returns the meta object for the containment reference list '{@link roverml.Rover#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see roverml.Rover#getComponents()
	 * @see #getRover()
	 * @generated
	 */
	EReference getRover_Components();

	/**
	 * Returns the meta object for class '{@link roverml.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see roverml.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the reference '{@link roverml.Program#getRoverExec <em>Rover Exec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rover Exec</em>'.
	 * @see roverml.Program#getRoverExec()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_RoverExec();

	/**
	 * Returns the meta object for the containment reference '{@link roverml.Program#getBlocks <em>Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Blocks</em>'.
	 * @see roverml.Program#getBlocks()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Blocks();

	/**
	 * Returns the meta object for class '{@link roverml.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see roverml.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link roverml.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see roverml.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link roverml.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see roverml.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for class '{@link roverml.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see roverml.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for class '{@link roverml.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see roverml.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for class '{@link roverml.GPS <em>GPS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GPS</em>'.
	 * @see roverml.GPS
	 * @generated
	 */
	EClass getGPS();

	/**
	 * Returns the meta object for the attribute list '{@link roverml.GPS#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>X</em>'.
	 * @see roverml.GPS#getX()
	 * @see #getGPS()
	 * @generated
	 */
	EAttribute getGPS_X();

	/**
	 * Returns the meta object for the attribute list '{@link roverml.GPS#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Y</em>'.
	 * @see roverml.GPS#getY()
	 * @see #getGPS()
	 * @generated
	 */
	EAttribute getGPS_Y();

	/**
	 * Returns the meta object for class '{@link roverml.Compass <em>Compass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compass</em>'.
	 * @see roverml.Compass
	 * @generated
	 */
	EClass getCompass();

	/**
	 * Returns the meta object for the attribute '{@link roverml.Compass#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see roverml.Compass#getAngle()
	 * @see #getCompass()
	 * @generated
	 */
	EAttribute getCompass_Angle();

	/**
	 * Returns the meta object for class '{@link roverml.DistanceSensor <em>Distance Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distance Sensor</em>'.
	 * @see roverml.DistanceSensor
	 * @generated
	 */
	EClass getDistanceSensor();

	/**
	 * Returns the meta object for the attribute '{@link roverml.DistanceSensor#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see roverml.DistanceSensor#getDistance()
	 * @see #getDistanceSensor()
	 * @generated
	 */
	EAttribute getDistanceSensor_Distance();

	/**
	 * Returns the meta object for class '{@link roverml.Motor <em>Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motor</em>'.
	 * @see roverml.Motor
	 * @generated
	 */
	EClass getMotor();

	/**
	 * Returns the meta object for class '{@link roverml.Light <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Light</em>'.
	 * @see roverml.Light
	 * @generated
	 */
	EClass getLight();

	/**
	 * Returns the meta object for class '{@link roverml.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see roverml.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link roverml.Block#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see roverml.Block#getTransitions()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link roverml.Block#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commands</em>'.
	 * @see roverml.Block#getCommands()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Commands();

	/**
	 * Returns the meta object for class '{@link roverml.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see roverml.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for the reference list '{@link roverml.Command#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Transitions</em>'.
	 * @see roverml.Command#getOutgoingTransitions()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_OutgoingTransitions();

	/**
	 * Returns the meta object for the reference list '{@link roverml.Command#getIncomingTransitions <em>Incoming Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Transitions</em>'.
	 * @see roverml.Command#getIncomingTransitions()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_IncomingTransitions();

	/**
	 * Returns the meta object for the reference list '{@link roverml.Command#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Components</em>'.
	 * @see roverml.Command#getComponents()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_Components();

	/**
	 * Returns the meta object for class '{@link roverml.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see roverml.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link roverml.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see roverml.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link roverml.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see roverml.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for class '{@link roverml.SetLightColor <em>Set Light Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Light Color</em>'.
	 * @see roverml.SetLightColor
	 * @generated
	 */
	EClass getSetLightColor();

	/**
	 * Returns the meta object for the attribute '{@link roverml.SetLightColor#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see roverml.SetLightColor#getColor()
	 * @see #getSetLightColor()
	 * @generated
	 */
	EAttribute getSetLightColor_Color();

	/**
	 * Returns the meta object for class '{@link roverml.Wait <em>Wait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wait</em>'.
	 * @see roverml.Wait
	 * @generated
	 */
	EClass getWait();

	/**
	 * Returns the meta object for the attribute '{@link roverml.Wait#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see roverml.Wait#getTime()
	 * @see #getWait()
	 * @generated
	 */
	EAttribute getWait_Time();

	/**
	 * Returns the meta object for the containment reference '{@link roverml.Wait#getTimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Unit</em>'.
	 * @see roverml.Wait#getTimeUnit()
	 * @see #getWait()
	 * @generated
	 */
	EReference getWait_TimeUnit();

	/**
	 * Returns the meta object for class '{@link roverml.Move <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move</em>'.
	 * @see roverml.Move
	 * @generated
	 */
	EClass getMove();

	/**
	 * Returns the meta object for the attribute '{@link roverml.Move#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see roverml.Move#getLength()
	 * @see #getMove()
	 * @generated
	 */
	EAttribute getMove_Length();

	/**
	 * Returns the meta object for the attribute '{@link roverml.Move#getVelocity <em>Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Velocity</em>'.
	 * @see roverml.Move#getVelocity()
	 * @see #getMove()
	 * @generated
	 */
	EAttribute getMove_Velocity();

	/**
	 * Returns the meta object for the containment reference '{@link roverml.Move#getVelocityUnits <em>Velocity Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Velocity Units</em>'.
	 * @see roverml.Move#getVelocityUnits()
	 * @see #getMove()
	 * @generated
	 */
	EReference getMove_VelocityUnits();

	/**
	 * Returns the meta object for the containment reference '{@link roverml.Move#getLengthUnits <em>Length Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Length Units</em>'.
	 * @see roverml.Move#getLengthUnits()
	 * @see #getMove()
	 * @generated
	 */
	EReference getMove_LengthUnits();

	/**
	 * Returns the meta object for class '{@link roverml.Rotate <em>Rotate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotate</em>'.
	 * @see roverml.Rotate
	 * @generated
	 */
	EClass getRotate();

	/**
	 * Returns the meta object for the attribute '{@link roverml.Rotate#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see roverml.Rotate#getAngle()
	 * @see #getRotate()
	 * @generated
	 */
	EAttribute getRotate_Angle();

	/**
	 * Returns the meta object for the containment reference '{@link roverml.Rotate#getAngleUnits <em>Angle Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angle Units</em>'.
	 * @see roverml.Rotate#getAngleUnits()
	 * @see #getRotate()
	 * @generated
	 */
	EReference getRotate_AngleUnits();

	/**
	 * Returns the meta object for class '{@link roverml.Terminate <em>Terminate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminate</em>'.
	 * @see roverml.Terminate
	 * @generated
	 */
	EClass getTerminate();

	/**
	 * Returns the meta object for class '{@link roverml.Repeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeat</em>'.
	 * @see roverml.Repeat
	 * @generated
	 */
	EClass getRepeat();

	/**
	 * Returns the meta object for the attribute '{@link roverml.Repeat#getNumberOfReps <em>Number Of Reps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Reps</em>'.
	 * @see roverml.Repeat#getNumberOfReps()
	 * @see #getRepeat()
	 * @generated
	 */
	EAttribute getRepeat_NumberOfReps();

	/**
	 * Returns the meta object for the containment reference list '{@link roverml.Repeat#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commands</em>'.
	 * @see roverml.Repeat#getCommands()
	 * @see #getRepeat()
	 * @generated
	 */
	EReference getRepeat_Commands();

	/**
	 * Returns the meta object for class '{@link roverml.Triggered <em>Triggered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triggered</em>'.
	 * @see roverml.Triggered
	 * @generated
	 */
	EClass getTriggered();

	/**
	 * Returns the meta object for the attribute '{@link roverml.Triggered#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see roverml.Triggered#getOperator()
	 * @see #getTriggered()
	 * @generated
	 */
	EAttribute getTriggered_Operator();

	/**
	 * Returns the meta object for class '{@link roverml.Regular <em>Regular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regular</em>'.
	 * @see roverml.Regular
	 * @generated
	 */
	EClass getRegular();

	/**
	 * Returns the meta object for class '{@link roverml.DistanceSensorTrigger <em>Distance Sensor Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distance Sensor Trigger</em>'.
	 * @see roverml.DistanceSensorTrigger
	 * @generated
	 */
	EClass getDistanceSensorTrigger();

	/**
	 * Returns the meta object for the reference '{@link roverml.DistanceSensorTrigger#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Length</em>'.
	 * @see roverml.DistanceSensorTrigger#getLength()
	 * @see #getDistanceSensorTrigger()
	 * @generated
	 */
	EReference getDistanceSensorTrigger_Length();

	/**
	 * Returns the meta object for the attribute '{@link roverml.DistanceSensorTrigger#getDist <em>Dist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dist</em>'.
	 * @see roverml.DistanceSensorTrigger#getDist()
	 * @see #getDistanceSensorTrigger()
	 * @generated
	 */
	EAttribute getDistanceSensorTrigger_Dist();

	/**
	 * Returns the meta object for the reference '{@link roverml.DistanceSensorTrigger#getDistancesensor <em>Distancesensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Distancesensor</em>'.
	 * @see roverml.DistanceSensorTrigger#getDistancesensor()
	 * @see #getDistanceSensorTrigger()
	 * @generated
	 */
	EReference getDistanceSensorTrigger_Distancesensor();

	/**
	 * Returns the meta object for class '{@link roverml.CompassTrigger <em>Compass Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compass Trigger</em>'.
	 * @see roverml.CompassTrigger
	 * @generated
	 */
	EClass getCompassTrigger();

	/**
	 * Returns the meta object for the reference '{@link roverml.CompassTrigger#getAngles <em>Angles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Angles</em>'.
	 * @see roverml.CompassTrigger#getAngles()
	 * @see #getCompassTrigger()
	 * @generated
	 */
	EReference getCompassTrigger_Angles();

	/**
	 * Returns the meta object for the attribute '{@link roverml.CompassTrigger#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see roverml.CompassTrigger#getAngle()
	 * @see #getCompassTrigger()
	 * @generated
	 */
	EAttribute getCompassTrigger_Angle();

	/**
	 * Returns the meta object for the reference '{@link roverml.CompassTrigger#getCompass <em>Compass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Compass</em>'.
	 * @see roverml.CompassTrigger#getCompass()
	 * @see #getCompassTrigger()
	 * @generated
	 */
	EReference getCompassTrigger_Compass();

	/**
	 * Returns the meta object for class '{@link roverml.GPSTrigger <em>GPS Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GPS Trigger</em>'.
	 * @see roverml.GPSTrigger
	 * @generated
	 */
	EClass getGPSTrigger();

	/**
	 * Returns the meta object for the reference '{@link roverml.GPSTrigger#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Position</em>'.
	 * @see roverml.GPSTrigger#getPosition()
	 * @see #getGPSTrigger()
	 * @generated
	 */
	EReference getGPSTrigger_Position();

	/**
	 * Returns the meta object for the attribute '{@link roverml.GPSTrigger#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see roverml.GPSTrigger#getX()
	 * @see #getGPSTrigger()
	 * @generated
	 */
	EAttribute getGPSTrigger_X();

	/**
	 * Returns the meta object for the attribute '{@link roverml.GPSTrigger#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see roverml.GPSTrigger#getY()
	 * @see #getGPSTrigger()
	 * @generated
	 */
	EAttribute getGPSTrigger_Y();

	/**
	 * Returns the meta object for the reference '{@link roverml.GPSTrigger#getGps <em>Gps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gps</em>'.
	 * @see roverml.GPSTrigger#getGps()
	 * @see #getGPSTrigger()
	 * @generated
	 */
	EReference getGPSTrigger_Gps();

	/**
	 * Returns the meta object for class '{@link roverml.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity</em>'.
	 * @see roverml.Quantity
	 * @generated
	 */
	EClass getQuantity();

	/**
	 * Returns the meta object for class '{@link roverml.SingleQuantity <em>Single Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Quantity</em>'.
	 * @see roverml.SingleQuantity
	 * @generated
	 */
	EClass getSingleQuantity();

	/**
	 * Returns the meta object for class '{@link roverml.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see roverml.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for the attribute '{@link roverml.Position#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see roverml.Position#getX()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_X();

	/**
	 * Returns the meta object for the attribute '{@link roverml.Position#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see roverml.Position#getY()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Y();

	/**
	 * Returns the meta object for class '{@link roverml.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time</em>'.
	 * @see roverml.Time
	 * @generated
	 */
	EClass getTime();

	/**
	 * Returns the meta object for the attribute '{@link roverml.Time#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Units</em>'.
	 * @see roverml.Time#getUnits()
	 * @see #getTime()
	 * @generated
	 */
	EAttribute getTime_Units();

	/**
	 * Returns the meta object for class '{@link roverml.Velocity <em>Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Velocity</em>'.
	 * @see roverml.Velocity
	 * @generated
	 */
	EClass getVelocity();

	/**
	 * Returns the meta object for the attribute '{@link roverml.Velocity#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Units</em>'.
	 * @see roverml.Velocity#getUnits()
	 * @see #getVelocity()
	 * @generated
	 */
	EAttribute getVelocity_Units();

	/**
	 * Returns the meta object for class '{@link roverml.Length <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length</em>'.
	 * @see roverml.Length
	 * @generated
	 */
	EClass getLength();

	/**
	 * Returns the meta object for the attribute '{@link roverml.Length#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Units</em>'.
	 * @see roverml.Length#getUnits()
	 * @see #getLength()
	 * @generated
	 */
	EAttribute getLength_Units();

	/**
	 * Returns the meta object for class '{@link roverml.Angle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angle</em>'.
	 * @see roverml.Angle
	 * @generated
	 */
	EClass getAngle();

	/**
	 * Returns the meta object for the attribute '{@link roverml.Angle#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Units</em>'.
	 * @see roverml.Angle#getUnits()
	 * @see #getAngle()
	 * @generated
	 */
	EAttribute getAngle_Units();

	/**
	 * Returns the meta object for enum '{@link roverml.TimeUnits <em>Time Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Units</em>'.
	 * @see roverml.TimeUnits
	 * @generated
	 */
	EEnum getTimeUnits();

	/**
	 * Returns the meta object for enum '{@link roverml.VelocityUnits <em>Velocity Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Velocity Units</em>'.
	 * @see roverml.VelocityUnits
	 * @generated
	 */
	EEnum getVelocityUnits();

	/**
	 * Returns the meta object for enum '{@link roverml.LengthUnits <em>Length Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Length Units</em>'.
	 * @see roverml.LengthUnits
	 * @generated
	 */
	EEnum getLengthUnits();

	/**
	 * Returns the meta object for enum '{@link roverml.AngleUnits <em>Angle Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Angle Units</em>'.
	 * @see roverml.AngleUnits
	 * @generated
	 */
	EEnum getAngleUnits();

	/**
	 * Returns the meta object for enum '{@link roverml.Colours <em>Colours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Colours</em>'.
	 * @see roverml.Colours
	 * @generated
	 */
	EEnum getColours();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RovermlFactory getRovermlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link roverml.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roverml.impl.SystemImpl
		 * @see roverml.impl.RovermlPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Programs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__PROGRAMS = eINSTANCE.getSystem_Programs();

		/**
		 * The meta object literal for the '<em><b>Rovers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__ROVERS = eINSTANCE.getSystem_Rovers();

		/**
		 * The meta object literal for the '{@link roverml.impl.RoverImpl <em>Rover</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roverml.impl.RoverImpl
		 * @see roverml.impl.RovermlPackageImpl#getRover()
		 * @generated
		 */
		EClass ROVER = eINSTANCE.getRover();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROVER__COMPONENTS = eINSTANCE.getRover_Components();

		/**
		 * The meta object literal for the '{@link roverml.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roverml.impl.ProgramImpl
		 * @see roverml.impl.RovermlPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Rover Exec</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__ROVER_EXEC = eINSTANCE.getProgram_RoverExec();

		/**
		 * The meta object literal for the '<em><b>Blocks</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__BLOCKS = eINSTANCE.getProgram_Blocks();

		/**
		 * The meta object literal for the '{@link roverml.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roverml.impl.NamedElementImpl
		 * @see roverml.impl.RovermlPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link roverml.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roverml.impl.ComponentImpl
		 * @see roverml.impl.RovermlPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '{@link roverml.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roverml.impl.SensorImpl
		 * @see roverml.impl.RovermlPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '{@link roverml.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roverml.impl.ActuatorImpl
		 * @see roverml.impl.RovermlPackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '{@link roverml.impl.GPSImpl <em>GPS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roverml.impl.GPSImpl
		 * @see roverml.impl.RovermlPackageImpl#getGPS()
		 * @generated
		 */
		EClass GPS = eINSTANCE.getGPS();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS__X = eINSTANCE.getGPS_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS__Y = eINSTANCE.getGPS_Y();

		/**
		 * The meta object literal for the '{@link roverml.impl.CompassImpl <em>Compass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roverml.impl.CompassImpl
		 * @see roverml.impl.RovermlPackageImpl#getCompass()
		 * @generated
		 */
		EClass COMPASS = eINSTANCE.getCompass();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPASS__ANGLE = eINSTANCE.getCompass_Angle();

		/**
		 * The meta object literal for the '{@link roverml.impl.DistanceSensorImpl <em>Distance Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roverml.impl.DistanceSensorImpl
		 * @see roverml.impl.RovermlPackageImpl#getDistanceSensor()
		 * @generated
		 */
		EClass DISTANCE_SENSOR = eINSTANCE.getDistanceSensor();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTANCE_SENSOR__DISTANCE = eINSTANCE.getDistanceSensor_Distance();

		/**
		 * The meta object literal for the '{@link roverml.impl.MotorImpl <em>Motor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roverml.impl.MotorImpl
		 * @see roverml.impl.RovermlPackageImpl#getMotor()
		 * @generated
		 */
		EClass MOTOR = eINSTANCE.getMotor();

		/**
		 * The meta object literal for the '{@link roverml.impl.LightImpl <em>Light</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roverml.impl.LightImpl
		 * @see roverml.impl.RovermlPackageImpl#getLight()
		 * @generated
		 */
		EClass LIGHT = eINSTANCE.getLight();

		/**
		 * The meta object literal for the '{@link roverml.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roverml.impl.BlockImpl
		 * @see roverml.impl.RovermlPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__TRANSITIONS = eINSTANCE.getBlock_Transitions();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__COMMANDS = eINSTANCE.getBlock_Commands();

		/**
		 * The meta object literal for the '{@link roverml.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roverml.impl.CommandImpl
		 * @see roverml.impl.RovermlPackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '<em><b>Outgoing Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__OUTGOING_TRANSITIONS = eINSTANCE.getCommand_OutgoingTransitions();

		/**
		 * The meta object literal for the '<em><b>Incoming Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__INCOMING_TRANSITIONS = eINSTANCE.getCommand_IncomingTransitions();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__COMPONENTS = eINSTANCE.getCommand_Components();

		/**
		 * The meta object literal for the '{@link roverml.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roverml.impl.TransitionImpl
		 * @see roverml.impl.RovermlPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '{@link roverml.impl.SetLightColorImpl <em>Set Light Color</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roverml.impl.SetLightColorImpl
		 * @see roverml.impl.RovermlPackageImpl#getSetLightColor()
		 * @generated
		 */
		EClass SET_LIGHT_COLOR = eINSTANCE.getSetLightColor();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_LIGHT_COLOR__COLOR = eINSTANCE.getSetLightColor_Color();

		/**
		 * The meta object literal for the '{@link roverml.impl.WaitImpl <em>Wait</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roverml.impl.WaitImpl
		 * @see roverml.impl.RovermlPackageImpl#getWait()
		 * @generated
		 */
		EClass WAIT = eINSTANCE.getWait();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAIT__TIME = eINSTANCE.getWait_Time();

		/**
		 * The meta object literal for the '<em><b>Time Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAIT__TIME_UNIT = eINSTANCE.getWait_TimeUnit();

		/**
		 * The meta object literal for the '{@link roverml.impl.MoveImpl <em>Move</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roverml.impl.MoveImpl
		 * @see roverml.impl.RovermlPackageImpl#getMove()
		 * @generated
		 */
		EClass MOVE = eINSTANCE.getMove();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE__LENGTH = eINSTANCE.getMove_Length();

		/**
		 * The meta object literal for the '<em><b>Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE__VELOCITY = eINSTANCE.getMove_Velocity();

		/**
		 * The meta object literal for the '<em><b>Velocity Units</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE__VELOCITY_UNITS = eINSTANCE.getMove_VelocityUnits();

		/**
		 * The meta object literal for the '<em><b>Length Units</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE__LENGTH_UNITS = eINSTANCE.getMove_LengthUnits();

		/**
		 * The meta object literal for the '{@link roverml.impl.RotateImpl <em>Rotate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roverml.impl.RotateImpl
		 * @see roverml.impl.RovermlPackageImpl#getRotate()
		 * @generated
		 */
		EClass ROTATE = eINSTANCE.getRotate();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATE__ANGLE = eINSTANCE.getRotate_Angle();

		/**
		 * The meta object literal for the '<em><b>Angle Units</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROTATE__ANGLE_UNITS = eINSTANCE.getRotate_AngleUnits();

		/**
		 * The meta object literal for the '{@link roverml.impl.TerminateImpl <em>Terminate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roverml.impl.TerminateImpl
		 * @see roverml.impl.RovermlPackageImpl#getTerminate()
		 * @generated
		 */
		EClass TERMINATE = eINSTANCE.getTerminate();

		/**
		 * The meta object literal for the '{@link roverml.impl.RepeatImpl <em>Repeat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roverml.impl.RepeatImpl
		 * @see roverml.impl.RovermlPackageImpl#getRepeat()
		 * @generated
		 */
		EClass REPEAT = eINSTANCE.getRepeat();

		/**
		 * The meta object literal for the '<em><b>Number Of Reps</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPEAT__NUMBER_OF_REPS = eINSTANCE.getRepeat_NumberOfReps();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT__COMMANDS = eINSTANCE.getRepeat_Commands();

		/**
		 * The meta object literal for the '{@link roverml.impl.TriggeredImpl <em>Triggered</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roverml.impl.TriggeredImpl
		 * @see roverml.impl.RovermlPackageImpl#getTriggered()
		 * @generated
		 */
		EClass TRIGGERED = eINSTANCE.getTriggered();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGERED__OPERATOR = eINSTANCE.getTriggered_Operator();

		/**
		 * The meta object literal for the '{@link roverml.impl.RegularImpl <em>Regular</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roverml.impl.RegularImpl
		 * @see roverml.impl.RovermlPackageImpl#getRegular()
		 * @generated
		 */
		EClass REGULAR = eINSTANCE.getRegular();

		/**
		 * The meta object literal for the '{@link roverml.impl.DistanceSensorTriggerImpl <em>Distance Sensor Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roverml.impl.DistanceSensorTriggerImpl
		 * @see roverml.impl.RovermlPackageImpl#getDistanceSensorTrigger()
		 * @generated
		 */
		EClass DISTANCE_SENSOR_TRIGGER = eINSTANCE.getDistanceSensorTrigger();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTANCE_SENSOR_TRIGGER__LENGTH = eINSTANCE.getDistanceSensorTrigger_Length();

		/**
		 * The meta object literal for the '<em><b>Dist</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTANCE_SENSOR_TRIGGER__DIST = eINSTANCE.getDistanceSensorTrigger_Dist();

		/**
		 * The meta object literal for the '<em><b>Distancesensor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTANCE_SENSOR_TRIGGER__DISTANCESENSOR = eINSTANCE.getDistanceSensorTrigger_Distancesensor();

		/**
		 * The meta object literal for the '{@link roverml.impl.CompassTriggerImpl <em>Compass Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roverml.impl.CompassTriggerImpl
		 * @see roverml.impl.RovermlPackageImpl#getCompassTrigger()
		 * @generated
		 */
		EClass COMPASS_TRIGGER = eINSTANCE.getCompassTrigger();

		/**
		 * The meta object literal for the '<em><b>Angles</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPASS_TRIGGER__ANGLES = eINSTANCE.getCompassTrigger_Angles();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPASS_TRIGGER__ANGLE = eINSTANCE.getCompassTrigger_Angle();

		/**
		 * The meta object literal for the '<em><b>Compass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPASS_TRIGGER__COMPASS = eINSTANCE.getCompassTrigger_Compass();

		/**
		 * The meta object literal for the '{@link roverml.impl.GPSTriggerImpl <em>GPS Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roverml.impl.GPSTriggerImpl
		 * @see roverml.impl.RovermlPackageImpl#getGPSTrigger()
		 * @generated
		 */
		EClass GPS_TRIGGER = eINSTANCE.getGPSTrigger();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GPS_TRIGGER__POSITION = eINSTANCE.getGPSTrigger_Position();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS_TRIGGER__X = eINSTANCE.getGPSTrigger_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS_TRIGGER__Y = eINSTANCE.getGPSTrigger_Y();

		/**
		 * The meta object literal for the '<em><b>Gps</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GPS_TRIGGER__GPS = eINSTANCE.getGPSTrigger_Gps();

		/**
		 * The meta object literal for the '{@link roverml.impl.QuantityImpl <em>Quantity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roverml.impl.QuantityImpl
		 * @see roverml.impl.RovermlPackageImpl#getQuantity()
		 * @generated
		 */
		EClass QUANTITY = eINSTANCE.getQuantity();

		/**
		 * The meta object literal for the '{@link roverml.impl.SingleQuantityImpl <em>Single Quantity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roverml.impl.SingleQuantityImpl
		 * @see roverml.impl.RovermlPackageImpl#getSingleQuantity()
		 * @generated
		 */
		EClass SINGLE_QUANTITY = eINSTANCE.getSingleQuantity();

		/**
		 * The meta object literal for the '{@link roverml.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roverml.impl.PositionImpl
		 * @see roverml.impl.RovermlPackageImpl#getPosition()
		 * @generated
		 */
		EClass POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__X = eINSTANCE.getPosition_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__Y = eINSTANCE.getPosition_Y();

		/**
		 * The meta object literal for the '{@link roverml.impl.TimeImpl <em>Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roverml.impl.TimeImpl
		 * @see roverml.impl.RovermlPackageImpl#getTime()
		 * @generated
		 */
		EClass TIME = eINSTANCE.getTime();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME__UNITS = eINSTANCE.getTime_Units();

		/**
		 * The meta object literal for the '{@link roverml.impl.VelocityImpl <em>Velocity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roverml.impl.VelocityImpl
		 * @see roverml.impl.RovermlPackageImpl#getVelocity()
		 * @generated
		 */
		EClass VELOCITY = eINSTANCE.getVelocity();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VELOCITY__UNITS = eINSTANCE.getVelocity_Units();

		/**
		 * The meta object literal for the '{@link roverml.impl.LengthImpl <em>Length</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roverml.impl.LengthImpl
		 * @see roverml.impl.RovermlPackageImpl#getLength()
		 * @generated
		 */
		EClass LENGTH = eINSTANCE.getLength();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LENGTH__UNITS = eINSTANCE.getLength_Units();

		/**
		 * The meta object literal for the '{@link roverml.impl.AngleImpl <em>Angle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roverml.impl.AngleImpl
		 * @see roverml.impl.RovermlPackageImpl#getAngle()
		 * @generated
		 */
		EClass ANGLE = eINSTANCE.getAngle();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGLE__UNITS = eINSTANCE.getAngle_Units();

		/**
		 * The meta object literal for the '{@link roverml.TimeUnits <em>Time Units</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roverml.TimeUnits
		 * @see roverml.impl.RovermlPackageImpl#getTimeUnits()
		 * @generated
		 */
		EEnum TIME_UNITS = eINSTANCE.getTimeUnits();

		/**
		 * The meta object literal for the '{@link roverml.VelocityUnits <em>Velocity Units</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roverml.VelocityUnits
		 * @see roverml.impl.RovermlPackageImpl#getVelocityUnits()
		 * @generated
		 */
		EEnum VELOCITY_UNITS = eINSTANCE.getVelocityUnits();

		/**
		 * The meta object literal for the '{@link roverml.LengthUnits <em>Length Units</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roverml.LengthUnits
		 * @see roverml.impl.RovermlPackageImpl#getLengthUnits()
		 * @generated
		 */
		EEnum LENGTH_UNITS = eINSTANCE.getLengthUnits();

		/**
		 * The meta object literal for the '{@link roverml.AngleUnits <em>Angle Units</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roverml.AngleUnits
		 * @see roverml.impl.RovermlPackageImpl#getAngleUnits()
		 * @generated
		 */
		EEnum ANGLE_UNITS = eINSTANCE.getAngleUnits();

		/**
		 * The meta object literal for the '{@link roverml.Colours <em>Colours</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roverml.Colours
		 * @see roverml.impl.RovermlPackageImpl#getColours()
		 * @generated
		 */
		EEnum COLOURS = eINSTANCE.getColours();

	}

} //RovermlPackage
