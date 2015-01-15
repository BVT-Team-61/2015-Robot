package org.usfirst.frc.team61.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team61.robot.RobotMap;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import org.usfirst.frc.team61.robot.commands.LiftWithJoysticks;

public class Lift extends Subsystem {
	
	SpeedController elevMotor = new Talon(RobotMap.elevMotor);

	protected void initDefaultCommand() {
		setDefaultCommand(new LiftWithJoysticks());

	}
	public void moveElev(double vel){
		elevMotor.set(vel);
	}

}
