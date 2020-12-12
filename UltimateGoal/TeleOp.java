package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;

@com.qualcomm.robotcore.eventloop.opmode.TeleOp(name = "UltimateGoalTeleOp", group = "Competition")

public class TeleOp extends Robot {

    @Override
    public void init() {
        super.init();
    }

    @Override
    public void loop() {

        frontLeft.setPower(-gamepad1.left_stick_y + gamepad1.left_stick_x + gamepad1.right_stick_x);
        frontRight.setPower(gamepad1.left_stick_y + gamepad1.left_stick_x + gamepad1.right_stick_x);
        backRight.setPower(gamepad1.left_stick_y - gamepad1.left_stick_x + gamepad1.right_stick_x);
        backLeft.setPower(-gamepad1.left_stick_y - gamepad1.left_stick_x + gamepad1.right_stick_x);




        if (gamepad2.x) {
            brrr.setPower(0.8);
        }

        else if (gamepad2.y) {
            brrr.setPower(1);

        }

        else if (gamepad2.a) {

            brrr.setPower(0.615);
        }

        else if (gamepad2.b) {
            brrr.setPower(0.5);
        }

        else {

            brrr.setPower(0);

        }


        if (gamepad2.right_bumper) {

            shooterServo.setPosition(0.9);
        }

        else if (gamepad2.left_bumper){

            shooterServo.setPosition(0.7);

        }



      if (gamepad1.left_trigger > 0) {

            intake.setPower(1);


        }

        else  {

            intake.setPower(0);


        }

//        if (gamepad1.b) {
//
//            wobble.setTargetPosition(500);
//            wobble.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//            wobble.setPower(1);
//
//
//
//
//        }


    }
}
