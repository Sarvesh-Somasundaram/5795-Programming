package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp

public class CompetitionTeleopTankdrive extends OpMode {

    private DcMotor Backleft, Backright, Frontleft, Frontright;





    public void init() {

        Backleft = hardwareMap.dcMotor.get("Backleft");
        Backright = hardwareMap.dcMotor.get("Backright");
        Frontleft = hardwareMap.dcMotor.get("Frontleft");
        Frontright = hardwareMap.dcMotor.get("Frontright");
        Backleft.setDirection(DcMotorSimple.Direction.REVERSE);
        Frontleft.setDirection(DcMotorSimple.Direction.REVERSE);


    }

    public void loop() {
        Backleft.setPower(gamepad1.left_stick_y);
        Frontleft.setPower(gamepad1.left_stick_y);
        Backright.setPower(gamepad1.right_stick_y);
        Frontright.setPower(gamepad1.right_stick_y);
    }
}
