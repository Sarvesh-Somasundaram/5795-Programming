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

@TeleOp(name = "Slidetest2", group = "Competition")
public class testslidetwobutton extends OpMode {

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

        if (gamepad2.a) {

            rightSlide.setPower(-1);
            leftSlide.setPower(-1);

        }

        else if (gamepad2.b) {

            rightSlide.setPower(1);
            leftSlide.setPower(1);
        }

        else {

            rightSlide.setPower(0);
            leftSlide.setPower(0);
        }


    }
}