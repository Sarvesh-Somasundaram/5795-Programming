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


import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.robotcore.external.navigation.Orientation;

@TeleOp(name = "MecanumTeleop", group = "Competition")
public class MecanumTeleop extends OpMode {

    private DcMotor backLeft, backRight, frontLeft, frontRight, leftSlide, rightSlide, leftTpu, rightTpu;
    private CRServo hSlide;
    private Servo lBase, rBase, grabber;
    private long start = 0;




    public void init(){

       frontLeft = hardwareMap.dcMotor.get("fleft");
       frontRight = hardwareMap.dcMotor.get("fright");

       backRight = hardwareMap.dcMotor.get("bright");
       backLeft = hardwareMap.dcMotor.get("bleft");

       leftSlide = hardwareMap.dcMotor.get("lslide");
       rightSlide = hardwareMap.dcMotor.get("rslide");

       leftTpu = hardwareMap.dcMotor.get("ltpu");
       rightTpu = hardwareMap.dcMotor.get("rtpu");

       grabber = hardwareMap.servo.get("grabber");
       hSlide = hardwareMap.crservo.get("slide");

       lBase = hardwareMap.servo.get("lbase");
       rBase = hardwareMap.servo.get("rbase");

       leftTpu.setDirection(DcMotorSimple.Direction.REVERSE);

       rightSlide.setDirection(DcMotorSimple.Direction.REVERSE);

       backLeft.setPower(0);
       backRight.setPower(0);
       frontLeft.setPower(0);
       frontRight.setPower(0);
       leftTpu.setPower(0);
       rightTpu.setPower(0);
       leftSlide.setPower(0);
       rightSlide.setPower(0);

       grabber.setPosition(0.55);
       hSlide.setPower(0);

       lBase.setPosition(1);
       rBase.setPosition(0);

       //This is the initialization part of team 5795’s teleop code, stating in total 8 dcMotors, 4
        // controlling each of the 4 mechanism wheels(front right, front left, back right, back left),
        // 2 motors used to raise and lower the linear slides( left slide, right slide), and 2 motors
        // controlling the intake( left tpu and right tpu). Within the initialization there is also
        // two stated CRServo and two stated servos for a total of 4. One CRServo controls the grabber
        // that actually latches onto sky stones, and another labeled hslide controls the horizontal slide
        // that the actual grabber is attached to. The two other servos control the left and right base grabbers
        // meant to grab and move the stacking base during auto
        // and near endgame. In init all motors are set to power zero and the two base grabber are
        // put into set positions ready to grab
    }
    public void loop() {
        start = System.currentTimeMillis();

        if (gamepad1.left_bumper) {
            frontLeft.setPower((-gamepad1.left_stick_y + gamepad1.left_stick_x + gamepad1.right_stick_x) * .35);
            frontRight.setPower((gamepad1.left_stick_y + gamepad1.left_stick_x + gamepad1.right_stick_x) * .35);
            backRight.setPower((gamepad1.left_stick_y - gamepad1.left_stick_x + gamepad1.right_stick_x) * .35);
            backLeft.setPower((-gamepad1.left_stick_y - gamepad1.left_stick_x + gamepad1.right_stick_x) * .35);
        } else if (gamepad1.right_bumper) {
           frontLeft.setPower((-gamepad1.left_stick_y + gamepad1.left_stick_x + gamepad1.right_stick_x) * .1);
           frontRight.setPower((gamepad1.left_stick_y + gamepad1.left_stick_x + gamepad1.right_stick_x) * .1);
           backRight.setPower((gamepad1.left_stick_y - gamepad1.left_stick_x + gamepad1.right_stick_x) * .1);
           backLeft.setPower((-gamepad1.left_stick_y - gamepad1.left_stick_x + gamepad1.right_stick_x) * .1);
       } else {
           frontLeft.setPower(-gamepad1.left_stick_y + gamepad1.left_stick_x + gamepad1.right_stick_x);
           frontRight.setPower(gamepad1.left_stick_y + gamepad1.left_stick_x + gamepad1.right_stick_x);
           backRight.setPower(gamepad1.left_stick_y - gamepad1.left_stick_x + gamepad1.right_stick_x);
           backLeft.setPower(-gamepad1.left_stick_y - gamepad1.left_stick_x + gamepad1.right_stick_x);
       }

       leftTpu.setPower(gamepad1.left_trigger);
       rightTpu.setPower(gamepad1.left_trigger);

       leftTpu.setPower(-gamepad1.right_trigger*0.9);
       rightTpu.setPower(-gamepad1.right_trigger*0.9);

       rightSlide.setPower(-gamepad2.right_stick_y);
       leftSlide.setPower(-gamepad2.right_stick_y);

        if (gamepad2.left_bumper && System.currentTimeMillis() - start < 2400 ) {
            hSlide.setPower(-1);
        }
        else if (gamepad2.right_bumper ){
            hSlide.setPower(1);
        }
        else {
            hSlide.setPower(0);
        }
        if (gamepad2.x) {
            grabber.setPosition(0.05);
        }
        else if (gamepad2.y) {
            grabber.setPosition(0.6);
        }
        if (gamepad2.a) {
            lBase.setPosition(0.25);
            rBase.setPosition(0.65);
        }
        else if (gamepad2.b) {
            lBase.setPosition(1);
            rBase.setPosition(0);
        }
    }
}