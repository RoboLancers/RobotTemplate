package com.robolancers.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;

public class Robot extends TimedRobot {
    @Override
    public void robotInit() {
        // Add your robot initialization code here
    }

    @Override
    public void robotPeriodic() {
        Scheduler.getInstance().run();
    }

    @Override
    public void teleopInit() {
        // Add your teleop initialization here
    }

    @Override
    public void teleopPeriodic() {
        // Add your teleop code here
    }

    @Override
    public void autonomousInit() {
        // Add your autonomous initialization here
    }

    @Override
    public void autonomousPeriodic() {
        // Add your autonomous code here
    }
}
