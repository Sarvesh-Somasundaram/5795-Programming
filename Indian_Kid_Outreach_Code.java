package org.firstinspires.ftc.teamcode.Competition;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class Indian_Kid_Outreach_Code extends OpMode {

    private DcMotor backLeft, backRight;
    private CRServo head;
    double one = 1, nOne = -1;

    public void init() {

        backLeft = hardwareMap.dcMotor.get("Backleft");
        backRight = hardwareMap.dcMotor.get("Backright");

        head = hardwareMap.crservo.get("Head");


        backLeft.setPower(0);
        backRight.setPower(0);
        head.setPower(0);


    }

    public void loop() {


        backLeft.setPower(-gamepad1.left_stick_y);
        backRight.setPower(gamepad1.right_stick_y);

        if (gamepad1.dpad_right) {
            head.setPower(one);
        }

        else if (gamepad1.dpad_left) {
            head.setPower(nOne);
        }

        else if (gamepad1.dpad_down) {
            head.setPower(0);
        }

    }
}