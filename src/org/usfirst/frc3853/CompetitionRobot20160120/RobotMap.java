// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3853.CompetitionRobot20160120;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;

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
    public static SpeedController  DriveTrainLeftMotor;
    public static SpeedController  DriveTrainRightMotor;
    public static RobotDrive  DriveTrainRobotDrive21;
    public static Encoder  DriveTrainDriveTrainEncoderRight;
    public static Encoder  DriveTrainDriveTrainEncoderLeft;
    public static SpeedController ballHandlerMotor;
    public static DigitalInput ballHandlerLimitSwitchBallHandler;
    public static SpeedController armArmMotorTalon;
    public static Encoder armArmEncoder;
    public static DigitalInput armLimitSwitchArm;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
         DriveTrainLeftMotor = new Jaguar(0);
        LiveWindow.addActuator(" DriveTrain", "LeftMotor", (Jaguar)  DriveTrainLeftMotor);
        
         DriveTrainRightMotor = new Jaguar(1);
        LiveWindow.addActuator(" DriveTrain", "RightMotor", (Jaguar)  DriveTrainRightMotor);
        
         DriveTrainRobotDrive21 = new RobotDrive( DriveTrainLeftMotor,  DriveTrainRightMotor);
        
         DriveTrainRobotDrive21.setSafetyEnabled(true);
         DriveTrainRobotDrive21.setExpiration(0.1);
         DriveTrainRobotDrive21.setSensitivity(0.5);
         DriveTrainRobotDrive21.setMaxOutput(1.0);
         DriveTrainRobotDrive21.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
         DriveTrainRobotDrive21.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
         DriveTrainDriveTrainEncoderRight = new Encoder(5, 6, false, EncodingType.k4X);
        LiveWindow.addSensor(" DriveTrain", "DriveTrainEncoderRight",  DriveTrainDriveTrainEncoderRight);
         DriveTrainDriveTrainEncoderRight.setDistancePerPulse(1.0);
         DriveTrainDriveTrainEncoderRight.setPIDSourceType(PIDSourceType.kDisplacement);
         DriveTrainDriveTrainEncoderLeft = new Encoder(3, 4, false, EncodingType.k4X);
        LiveWindow.addSensor(" DriveTrain", "DriveTrainEncoderLeft",  DriveTrainDriveTrainEncoderLeft);
         DriveTrainDriveTrainEncoderLeft.setDistancePerPulse(1.0);
         DriveTrainDriveTrainEncoderLeft.setPIDSourceType(PIDSourceType.kDisplacement);
        ballHandlerMotor = new Jaguar(9);
        LiveWindow.addActuator("BallHandler", "Motor", (Jaguar) ballHandlerMotor);
        
        ballHandlerLimitSwitchBallHandler = new DigitalInput(7);
        LiveWindow.addSensor("BallHandler", "LimitSwitchBallHandler", ballHandlerLimitSwitchBallHandler);
        
        armArmMotorTalon = new Jaguar(8);
        LiveWindow.addActuator("Arm", "ArmMotorTalon", (Jaguar) armArmMotorTalon);
        
        armArmEncoder = new Encoder(0, 1, true, EncodingType.k4X);
        LiveWindow.addSensor("Arm", "ArmEncoder", armArmEncoder);
        armArmEncoder.setDistancePerPulse(0.042);
        armArmEncoder.setPIDSourceType(PIDSourceType.kDisplacement);
        armLimitSwitchArm = new DigitalInput(2);
        LiveWindow.addSensor("Arm", "LimitSwitchArm", armLimitSwitchArm);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
