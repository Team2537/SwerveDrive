package org.usfirst.frc.team2537.input;

import org.usfirst.frc.team2537.robot.Ports;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;

public class HumanInput {
	
	public static Joystick leftJoystick = new Joystick(Ports.LEFT_JOYSTICK);
	public static Joystick rightJoystick = new Joystick(Ports.RIGHT_JOYSTICK);
	
	public static Button tankButton = new JoystickButton(leftJoystick, Ports.TANK_BUTTON);
	
	public void registerWhenPressedCommand(Button b, Command c) {
		b.whenPressed(c);
	}
	

}
