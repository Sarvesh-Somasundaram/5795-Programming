package org.firstinspires.ftc.teamcode.Competition;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp
public class CompetitionTeleop extends OpMode{

    private DcMotor Backleft, Backright;


    public void init() {
        Backleft = hardwareMap.dcMotor.get("Backleft");
        Backright = hardwareMap.dcMotor.get("Backright");

    }


    public void loop() {

        Backleft.setPower(gamepad1.left_stick_y - gamepad1.right_stick_x);
        Backright.setPower(-gamepad1.left_stick_y - gamepad1.right_stick_x);

    }

}
