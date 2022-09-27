package org.team3197.tshirtbot.robot;

import edu.wpi.first.wpilibj.XboxController;

public final class OI {
    private static XboxController joystick = new XboxController(0);

    public static final double xSpeed() {
        return joystick.getRightY();
    }

    public static final double rSpeed() {
        return joystick.getRightX();
    }

    public static final double pitchSpeed() {
        return joystick.getLeftY();
    }

    public static final double yawSpeed() {
        return joystick.getLeftX();
    }

    public static final boolean getShoot() {
        return joystick.getAButton();
    }
}