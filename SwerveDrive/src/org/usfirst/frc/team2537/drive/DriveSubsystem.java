package org.usfirst.frc.team2537.drive;

import org.usfirst.frc.team2537.input.HumanInput;
import org.usfirst.frc.team2537.robot.Ports;
import org.usfirst.frc.team2537.robot.resources.CANTalon;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveSubsystem extends Subsystem {
	private CANTalon backRightRotateMotor, backLeftRotateMotor;
	private CANTalon frontRightRotateMotor, frontLeftRotateMotor;
	private CANTalon backRightDriveMotor, backLeftDriveMotor;
	private Talon frontRightDriveMotor, frontLeftDriveMotor;
	
	public DriveSubsystem() {
		backRightRotateMotor = new CANTalon(Ports.BACK_RIGHT_ROTATE_MOTOR);
		backLeftRotateMotor = new CANTalon(Ports.BACK_LEFT_ROTATE_MOTOR);
		frontRightRotateMotor = new CANTalon(Ports.FRONT_RIGHT_ROTATE_MOTOR);
		frontLeftRotateMotor = new CANTalon(Ports.FRONT_LEFT_ROTATE_MOTOR);
		
		backRightDriveMotor = new CANTalon(Ports.BACK_RIGHT_DRIVE_MOTOR);
		backLeftDriveMotor = new CANTalon(Ports.BACK_LEFT_DRIVE_MOTOR);
		frontRightDriveMotor = new Talon(Ports.FRONT_RIGHT_DRIVE_MOTOR);
		frontLeftDriveMotor = new Talon(Ports.FRONT_LEFT_DRIVE_MOTOR);
		
		backRightRotateMotor.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 0);
		backLeftRotateMotor.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 0);
		frontRightRotateMotor.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 0);
		frontLeftRotateMotor.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 0);
		
	}
	
	public double getLeftJoystickX() {
		return HumanInput.leftJoystick.getRawAxis(2);
	}
	
	public double getLeftJoystickY() {
		return HumanInput.leftJoystick.getRawAxis(1);
	}
	
	public double getRightJoystick() {
		return HumanInput.rightJoystick.getRawAxis(1);
	}

	@Override
	public void initDefaultCommand() {
		this.setDefaultCommand(new DriveCommand());
	}



}
