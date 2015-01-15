package org.usfirst.frc.team61.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    //Joysticks
    public static final int leftStick = 0;
    public static final int rightStick = 1;
    public static final int elevStick = 2;
    public static final int clawStick = 3;
    
    //Motors (PWM)
    public static final int leftMotor = 0; // Left motor in PWM port 0
    public static final int rightMotor = 1; // Right motor in PWM port 1
    public static final int elevMotor = 2;

    //Digital IO (DIO)
    public static final int leftEncoderA = 0;
    public static final int leftEncoderB = 1; 
    public static final int rightEncoderA = 2;
    public static final int rightEncoderB = 3;
    public static final int liftEncoderA = 4;
    public static final int liftEncoderB = 5;
}
