package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.DigitalOutput;
import frc.robot.Constants.ShooterConstants;

public class ShooterSubsystem extends SubsystemBase {
    private final CANSparkMax shooterMotorLeft;
    private final CANSparkMax shooterMotorRight;
    private final CANSparkMax relayMotor;
    private final CANSparkMax storageMotor;
    private final DigitalOutput lights;

    public ShooterSubsystem() {
        shooterMotorLeft = new CANSparkMax(ShooterConstants.kShooterMotorLeftPort, MotorType.kBrushless);
        shooterMotorRight = new CANSparkMax(ShooterConstants.kShooterMotorRightPort, MotorType.kBrushless);
        relayMotor = new CANSparkMax(ShooterConstants.kRelayMotorPort, MotorType.kBrushless);
        storageMotor = new CANSparkMax(ShooterConstants.kStorageMotorPort, MotorType.kBrushless);
        lights = new DigitalOutput(ShooterConstants.kLightsPort);

        shooterMotorRight.follow(shooterMotorLeft);
    }

    public void shoot() {
        shooterMotorLeft.set(ShooterConstants.kShooterSpeed);
        lightsOn();
    }

    public void stopShooter() {
        shooterMotorLeft.set(0);
        lightsOff();
    }

    public void reverseShooter() {
        shooterMotorLeft.set(-ShooterConstants.kShooterSpeed);
        lightsOn();
    }

    public void runRelay() {
        relayMotor.set(ShooterConstants.kRelaySpeed);
    }

    public void stopRelay() {
        relayMotor.set(0);
    }

    public void reverseRelay() {
        relayMotor.set(-ShooterConstants.kRelaySpeed);
    }

    public void runStorage() {
        storageMotor.set(ShooterConstants.kStorageSpeed);
    }

    public void stopStorage() {
        storageMotor.set(0);
    }

    public void reverseStorage() {
        storageMotor.set(-ShooterConstants.kStorageSpeed);
    }

    public void lightsOn() {
        lights.set(true);
    }

    public void lightsOff() {
        lights.set(false);
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }
}
