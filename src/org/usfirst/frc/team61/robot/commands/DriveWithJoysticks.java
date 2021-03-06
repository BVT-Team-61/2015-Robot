/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc.team61.robot.commands;

//TODO: Add DriveWithJoysticks Javadoc
/**
 *When the Joysticks are depressed a certain amount correlate to how much they are depressed. 
 * @author Team-61 
 */
public class DriveWithJoysticks extends CommandBase {
        
    public DriveWithJoysticks() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	System.out.println("Driving with Joysticks");
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        
    	drivetrain.tankDrive(oi.getLeftSpeed(), oi.getRightSpeed());
    	
    	// when driving and not reversing, pass joystick values to drivetrain subsystem.
//        if (oi.weAreDriving()) {
//          if (oi.weAreReversing()){
//              drivetrain.reverseTankDrive(oi.getLeftSpeed(),oi.getRightSpeed());
//          } else {
//              drivetrain.tankDrive(oi.getLeftSpeed(),oi.getRightSpeed());
//          }
//        }
    }
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
