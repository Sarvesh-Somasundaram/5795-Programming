/*
package org.firstinspires.ftc.teamcode.Competition;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;


@TeleOp()
public class MecanumTeleop extends OpMode {


    DcMotor backLeft, backRight, frontLeft, frontRight ;

    public void init() {

        backLeft = hardwareMap.dcMotor.get("bleft");
        backRight = hardwareMap.dcMotor.get("bright");
        frontLeft = hardwareMap.dcMotor.get("fleft");
        frontRight = hardwareMap.dcMotor.get("fright");

        backLeft.setPower(0);
        backRight.setPower(0);
        frontRight.setPower(0);
        frontLeft.setPower(0);

        backLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        backRight.setDirection(DcMotorSimple.Direction.REVERSE);
        frontLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        frontRight.setDirection(DcMotorSimple.Direction.REVERSE);
    }



    @Override
    public void loop() {

        if (gamepad1.left_stick_y > 0) {

            backRight.setPower(gamepad1.left_stick_y);
            backLeft.setPower(gamepad1.left_stick_y);
            frontLeft.setPower(gamepad1.left_stick_y);
            frontRight.setPower(gamepad1.left_stick_y);

        }

        else if (gamepad1.left_stick_y < 0) {

            backRight.setPower(-gamepad1.left_stick_y);
            backLeft.setPower(-gamepad1.left_stick_y);
            frontLeft.setPower(-gamepad1.left_stick_y);
            frontRight.setPower(-gamepad1.left_stick_y);

        }

        else if (gamepad1.right_stick_x > 0) {

            backLeft.setPower(-gamepad1.right_stick_x);
            frontLeft.setPower(gamepad1.right_stick_x);
            backRight.setPower(gamepad1.right_stick_x);
            frontRight.setPower(-gamepad1.right_stick_x);
        }

        else if (gamepad1.right_stick_x < 0) {

            backLeft.setPower(gamepad1.right_stick_x);
            frontLeft.setPower(-gamepad1.right_stick_x);
            backRight.setPower(-gamepad1.right_stick_x);
            frontRight.setPower(gamepad1.right_stick_x);
        }

        else {

            backLeft.setPower(0);
            frontLeft.setPower(0);
            backRight.setPower(0);
            backRight.setPower(0);
        }

    }
}


*/

package org.firstinspires.ftc.teamcode.Competition;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class MecanumTeleop extends OpMode {

    private DcMotor backLeft, backRight, frontLeft, frontRight ;


    public void init(){

        backLeft = hardwareMap.dcMotor.get("bleft");
        backRight = hardwareMap.dcMotor.get("bright");
        frontLeft = hardwareMap.dcMotor.get("fleft");
        frontRight = hardwareMap.dcMotor.get("fright");

        //if something goes wrong try uncommenting the next four lines to un comment just remove the backslashes

        // Bl.setDirection(DcMotorSimple.Direction.REVERSE);
        //Fl.setDirection(DcMotorSimple.Direction.REVERSE);

    }


    public void loop() {

        frontLeft.setPower(-gamepad1.left_stick_y - gamepad1.left_stick_x - gamepad1.right_stick_x);
        frontRight.setPower(gamepad1.left_stick_y - gamepad1.left_stick_x - gamepad1.right_stick_x);
        backRight.setPower(gamepad1.left_stick_y + gamepad1.left_stick_x - gamepad1.right_stick_x);
        backLeft.setPower(-gamepad1.left_stick_y + gamepad1.left_stick_x - gamepad1.right_stick_x);
    }
}