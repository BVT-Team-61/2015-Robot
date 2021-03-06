package org.usfirst.frc.team61.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc.team61.robot.RobotMap;
import org.usfirst.frc.team61.robot.commands.ClawSuck;
import org.usfirst.frc.team61.robot.commands.ClawSpin;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {   

//   private static boolean reverseDriveMode=false ;
   
   // Define Joystick Objects
   Joystick jLeft = new Joystick(RobotMap.leftStick);    
   Joystick jRight = new Joystick(RobotMap.rightStick);
   Joystick jElev = new Joystick(RobotMap.elevStick);
   Joystick jClaw = new Joystick(RobotMap.clawStick);
   
   // Define Joystick Buttons
//   Button forwardButton = new JoystickButton (jRight,2);
//   Button reverseButton = new JoystickButton (jRight,1);
   Button suckButton = new JoystickButton(jClaw,1);
   Button toggleButton = new JoystickButton(jClaw, 2);
   Button spinButton = new JoystickButton(jClaw, 3);
   
   public OI(){
	   suckButton.whileHeld(new ClawSuck());
	   spinButton.whileHeld(new ClawSpin());
   }
    // Placeholder method. Does nothing yet.
//    public boolean weAreDriving() {
//        return true;
//    }
//    
//    // Determines if robot in reverse.
//    public boolean weAreReversing (){
//        // If the reverse button is hit, then we are reversing.
//        if (reverseButton.get()) {
//            reverseDriveMode = false;
//        }
//        // If the forward button is hit, then we are not reversing.
//        else if (forwardButton.get()) {
//            reverseDriveMode= true;
//        }
//        // Otherwise, just return whatever it was before
//        return reverseDriveMode ;
//    }
    
    // Method to return the left joystick Y Axis.
    public double getLeftSpeed() {
        return (jLeft.getY()); 
    }
    
    // Same thing but for the right joystick Y Axis.
    public double getRightSpeed() {
        return (jRight.getY());
    }
    public double getElevSpeed(){
    	return (jElev.getY());
    }
}

