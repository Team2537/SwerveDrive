package org.usfirst.frc.team2537.drive;

import org.usfirst.frc.team2537.robot.Robot;

public class SwerveDriveMath {
	
	public static double getLeftJoystickAngle() {
		return Math.atan2(Robot.drivesys.getLeftJoystickY(), Robot.drivesys.getLeftJoystickX());	
		
	}
	
	public static double getLeftJoystickMagnitude() {
		return Math.hypot(Robot.drivesys.getLeftJoystickX(), Robot.drivesys.getLeftJoystickY());
	}
	
	
	
}
