package org.usfirst.frc.team2537.drive;

import org.usfirst.frc.team2537.robot.Ports;
import org.usfirst.frc.team2537.robot.resources.CANTalon;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveSubsystem extends Subsystem {
	private CANTalon backRightMotor, backLeftMotor;
	private Talon frontRightMotor, frontLeftMotor;
	
	
	public DriveSubsystem() {
		backRightMotor = new CANTalon(Ports.BACK_RIGHT_MOTOR);
		backLeftMotor = new CANTalon(Ports.BACK_LEFT_MOTOR);
		frontRightMotor = new Talon(Ports.FRONT_RIGHT_MOTOR);
		frontLeftMotor = new Talon(Ports.FRONT_LEFT_MOTOR);
		
	}

	@Override
	public void initDefaultCommand() {
		this.setDefaultCommand(new DriveCommand());
	}



}
