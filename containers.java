package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.ShootCommand;
import frc.robot.commands.ReverseShooterCommand;
import frc.robot.commands.RunRelayCommand;
import frc.robot.commands.ReverseRelayCommand;
import frc.robot.commands.RunStorageCommand;
import frc.robot.commands.ReverseStorageCommand;
import frc.robot.commands.LightsOnCommand;
import frc.robot.commands.LightsOffCommand;
import frc.robot.subsystems.ShooterSubsystem;

public class RobotContainer {
    private final ShooterSubsystem shooterSubsystem = new ShooterSubsystem();
    private final XboxController controller = new XboxController(0);

    public RobotContainer() {
        configureButtonBindings();
    }

    private void configureButtonBindings() {
        new JoystickButton(controller, XboxController.Button.kA.value)
                .whenPressed(new ShootCommand(shooterSubsystem))
                .whenReleased(new InstantCommand(shooterSubsystem::stopShooter, shooterSubsystem));
        new JoystickButton(controller, XboxController.Button.kB.value)
                .whenPressed(new ReverseShooterCommand(shooterSubsystem))
                .whenReleased(new InstantCommand(shooterSubsystem::stopShooter, shooterSubsystem));
        new JoystickButton(controller, XboxController.Button.kX.value)
                .whenPressed(new RunRelayCommand(shooterSubsystem))
                .whenReleased(new InstantCommand(shooterSubsystem::stopRelay, shooterSubsystem));
        new JoystickButton(controller, XboxController.Button.kY.value)
                .whenPressed(new ReverseRelayCommand(shooterSubsystem))
                .whenReleased(new InstantCommand(shooterSubsystem::stopRelay, shooterSubsystem));
        new JoystickButton(controller, XboxController.Button.kLeftBumper.value)
                .whenPressed(new RunStorageCommand
