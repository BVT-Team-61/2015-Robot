package org.usfirst.frc.team61.robot.commands;


/**
 *
 */
public class DriveAtSpeed extends CommandBase {

	public double left;
	public double right;
	
    public DriveAtSpeed(double left, double right) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(drivetrain);
    	this.left = left;
    	this.right = right;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	drivetrain.tankDrive(left, right);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
