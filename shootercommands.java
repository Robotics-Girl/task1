package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ShooterSubsystem;

public class ShootCommand extends CommandBase {
    private final ShooterSubsystem shooterSubsystem;

    public ShootCommand(ShooterSubsystem subsystem) {
        shooterSubsystem = subsystem;
        addRequirements(shooterSubsystem);
    }

    @Override
    public void initialize() {
        shooterSubsystem.shoot();
    }

    @Override
    public void execute() {
    }

    @Override
    public void end(boolean interrupted) {
        shooterSubsystem.stopShooter();
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}

public class ReverseShooterCommand extends CommandBase {
    private final ShooterSubsystem shooterSubsystem;

    public ReverseShooterCommand(ShooterSubsystem subsystem) {
        shooterSubsystem = subsystem;
        addRequirements(shooterSubsystem);
    }

    @Override
    public void initialize() {
        shooterSubsystem.reverseShooter();
    }

    @Override
    public void execute() {
    }

    @Override
    public void end(boolean interrupted) {
        shooterSubsystem.stopShooter();
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}

public class RunRelayCommand extends CommandBase {
    private final ShooterSubsystem shooterSubsystem;

    public RunRelayCommand(ShooterSubsystem subsystem) {
        shooterSubsystem = subsystem;
        addRequirements(shooterSubsystem);
    }

    @Override
    public void initialize() {
        shooterSubsystem.runRelay();
    }

    @Override
    public void execute() {
    }

    @Override
    public void end(boolean interrupted) {
        shooterSubsystem.stopRelay();
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}

public class ReverseRelayCommand extends CommandBase {
    private final ShooterSubsystem shooterSubsystem;

    public ReverseRelayCommand(ShooterSubsystem subsystem) {
        shooterSubsystem = subsystem;
        addRequirements(shooterSubsystem);
    }

    @Override
    public void initialize() {
        shooterSubsystem.reverseRelay();
    }

    @Override
    public void execute() {
    }

    @Override
    public void end(boolean interrupted) {
        shooterSubsystem.stopRelay();
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}

public class RunStorageCommand extends CommandBase {
    private final ShooterSubsystem shooterSubsystem;

    public RunStorageCommand(ShooterSubsystem subsystem) {
        shooterSubsystem = subsystem;
        addRequirements(shooterSubsystem);
    }

    @Override
    public void initialize() {
        shooterSubsystem.runStorage();
    }

    @Override
    public void execute() {
    }

    @Override
    public void end(boolean interrupted) {
        shooterSubsystem.stopStorage();
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}

public class ReverseStorageCommand extends CommandBase {
    private final ShooterSubsystem shooterSubsystem;

    public ReverseStorageCommand(ShooterSubsystem subsystem) {
        shooterSubsystem = subsystem;
        addRequirements(shooterSubsystem);
    }

    @Override
    public void initialize() {
        shooterSubsystem.reverseStorage();
    }

    @Override
    public void execute() {
    }

    @Override
    public void end(boolean interrupted) {
        shooterSubsystem.stopStorage();
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}

public class LightsOnCommand extends CommandBase {
    private final ShooterSubsystem shooterSubsystem;

    public LightsOnCommand(ShooterSubsystem subsystem) {
        shooterSubsystem = subsystem;
        addRequirements(shooterSubsystem);
    }

    @Override
    public void initialize() {
        shooterSubsystem.lightsOn();
    }

    @Override
    public void execute() {
    }

    @Override
    public void end(boolean interrupted) {
        shooterSubsystem.lightsOff();
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}

public class LightsOffCommand extends CommandBase {
    private final ShooterSubsystem shooterSubsystem;

    public LightsOffCommand(ShooterSubsystem subsystem) {
        shooterSubsystem = subsystem;
        addRequirements(shooterSubsystem);
    }

    @Override
    public void initialize() {
        shooterSubsystem.lightsOff();
    }

    @Override
    public void execute() {
    }

    @Override
    public void end(boolean interrupted) {
        shooterSubsystem.lightsOff();
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
