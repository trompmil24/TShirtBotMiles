
package org.team3197.tshirtbot.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import org.team3197.tshirtbot.robot.OI;
import org.team3197.tshirtbot.robot.commands.Drive;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class DriveTrain extends Subsystem {

WPI_TalonFX rightMotor;
WPI_TalonFX leftMotor; 
DifferentialDrive driver; 

public DriveTrain()
{
  rightMotor = new WPI_TalonFX(8);
  leftMotor = new WPI_TalonFX(2);
  rightMotor.setSafetyEnabled(false);
  leftMotor.setSafetyEnabled(false);
  driver = new DifferentialDrive(leftMotor, rightMotor);
} 

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new Drive());
  }

  public void setDrive(double xSpeed, double rSpeed) {
    //drive.arcadeDrive(xSpeed, rSpeed);
    driver.tankDrive(xSpeed, rSpeed);
  }
}
