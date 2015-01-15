/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc.team61.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 * @author Team-61
 */
public class AutonomousGroup extends CommandGroup {
    
    public AutonomousGroup() {
        // Drive forward for 10 inches
        addSequential(new DriveForDistance(10, 0.2));
        // Wait for 0.5 seconds
        addSequential(new WaitForTime(0.5));
        // Drive backward for 10 inches
        addSequential(new ReverseDriveForDistance(10, 0.2));
    }
}
