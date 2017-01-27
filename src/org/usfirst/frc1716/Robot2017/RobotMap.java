// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc1716.Robot2017;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveSubsystemFrontLeft;
    public static SpeedController driveSubsystemRearLeft;
    public static SpeedController driveSubsystemFrontRight;
    public static SpeedController driveSubsystemRearRight;
    public static RobotDrive driveSubsystemRobotDrive;
    public static Encoder driveSubsystemLeftEncoder;
    public static Encoder driveSubsystemRightEncoder;
    public static SpeedController tarpMotor;
    public static AnalogPotentiometer tarpPotentiometer;
    public static SpeedController intakeMotor;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveSubsystemFrontLeft = new Talon(0);
        LiveWindow.addActuator("DriveSubsystem", "FrontLeft", (Talon) driveSubsystemFrontLeft);
        
        driveSubsystemRearLeft = new Talon(1);
        LiveWindow.addActuator("DriveSubsystem", "RearLeft", (Talon) driveSubsystemRearLeft);
        
        driveSubsystemFrontRight = new Talon(2);
        LiveWindow.addActuator("DriveSubsystem", "FrontRight", (Talon) driveSubsystemFrontRight);
        
        driveSubsystemRearRight = new Talon(3);
        LiveWindow.addActuator("DriveSubsystem", "RearRight", (Talon) driveSubsystemRearRight);
        
        driveSubsystemRobotDrive = new RobotDrive(driveSubsystemFrontLeft, driveSubsystemRearLeft,
              driveSubsystemFrontRight, driveSubsystemRearRight);
        
        driveSubsystemRobotDrive.setSafetyEnabled(true);
        driveSubsystemRobotDrive.setExpiration(0.1);
        driveSubsystemRobotDrive.setSensitivity(0.5);
        driveSubsystemRobotDrive.setMaxOutput(1.0);

        driveSubsystemLeftEncoder = new Encoder(0, 1, false, EncodingType.k4X);
        LiveWindow.addSensor("DriveSubsystem", "LeftEncoder", driveSubsystemLeftEncoder);
        driveSubsystemLeftEncoder.setDistancePerPulse(1.0);
        driveSubsystemLeftEncoder.setPIDSourceType(PIDSourceType.kRate);
        driveSubsystemRightEncoder = new Encoder(2, 3, false, EncodingType.k4X);
        LiveWindow.addSensor("DriveSubsystem", "RightEncoder", driveSubsystemRightEncoder);
        driveSubsystemRightEncoder.setDistancePerPulse(1.0);
        driveSubsystemRightEncoder.setPIDSourceType(PIDSourceType.kRate);
        tarpMotor = new Spark(4);
        LiveWindow.addActuator("Tarp", "Motor", (Spark) tarpMotor);
        
        tarpPotentiometer = new AnalogPotentiometer(2, 3600.0, 0.0);
        LiveWindow.addSensor("Tarp", "Potentiometer", tarpPotentiometer);
        
        intakeMotor = new Spark(5);
        LiveWindow.addActuator("Intake", "Motor", (Spark) intakeMotor);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
