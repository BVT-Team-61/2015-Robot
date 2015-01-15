/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc.team61.robot.subsystems;

import org.usfirst.frc.team61.robot.RobotMap;
import org.usfirst.frc.team61.robot.commands.DriveWithJoysticks;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
//import edu.wpi.first.wpilibj.Compressor;
//import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Team-61
 */
public class DriveTrain extends Subsystem {
    
    // Distance traveled per encoder pulse
    // pi * diameter of wheel / pulses per rotation
    private static final double dp = (3.14*8.5)/360; // scaled to inches
    
    //Define Encoders
    private Encoder leftEncoder = new Encoder(RobotMap.leftEncoderA, RobotMap.leftEncoderB);
    private Encoder rightEncoder = new Encoder(RobotMap.rightEncoderA, RobotMap.rightEncoderB);
    

    private SpeedController leftMotor = new Talon(RobotMap.leftMotor);
    private SpeedController rightMotor = new Talon(RobotMap.rightMotor);

    // Initialize your subsystem here
    public DriveTrain() {
        super("DriveTrain");  
        leftEncoder.setDistancePerPulse(dp);
        rightEncoder.setDistancePerPulse(dp);
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveWithJoysticks());
    }
    
    /**
     * Tank drive for main drivetrain.
     * @param left Left motor value
     * @param right Right motor value
     */
    public void tankDrive(double left, double right) {
        moveLeftMotor(left);
        moveRightMotor(right);
    }
    
    /**
     * Reversed controls tankDrive.
     * @param right Right motor value
     * @param left Left motor value
     */
    public void reverseTankDrive(double right, double left) {
        moveRightMotor(right);
        moveLeftMotor(left);
    }
    
    /**
     * 
     * @param speed 
     */
    private void moveLeftMotor(double speed)
    {
        speed = speed*-1.0;
        leftMotor.set(speed);
    }
    
    /**
     * 
     * @param speed 
     */
    private void moveRightMotor(double speed)
    {
        rightMotor.set(speed);
    }
    
    /**
     * Reset Right Encoder
     * Resets the right encoder counter to 0
     */
    public void resetRightEncoder()
    {
        rightEncoder.reset();
    }
    
    /**
     * Reset Left Encoder
     * Resets the left encoder counter to 0
     */
    public void resetLeftEncoder()
    {
        leftEncoder.reset();
    }
    
    /**
     * Get Right Encoder Distance
     * Returns scaled value of right encoder
     * 
     * @return distance since last reset of right encoder
     */
    public double getRightEncoder()
    {
        return rightEncoder.getDistance();
    }
    
    /**
     * Get Left Encoder Distance
     * Returns scaled value of left encoder
     * 
     * @return distance since last reset of left encoder
     */
    public double getLeftEncoder()
    {
        return leftEncoder.getDistance();
    }
}
 