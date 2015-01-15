package org.usfirst.frc.team61.robot.commands;


//TODO: Add LiftWithJoysticks Javadoc
public class LiftWithJoysticks extends CommandBase {

	public LiftWithJoysticks(){
		requires(lift);
	}
	
	protected void end() {

	}

	protected void execute() {
		lift.moveElev(oi.getElevSpeed());

	}

	protected void initialize() {
		System.out.println("Lifting Started");
	}

	protected void interrupted() {

	}

	protected boolean isFinished() {
		return false;
	}

}
