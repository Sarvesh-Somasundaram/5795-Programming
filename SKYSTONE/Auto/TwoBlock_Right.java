package org.firstinspires.ftc.teamcode.Competition.Skystone_autos;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous
public class TwoBlock_Right extends LinearOpMode {


    private DcMotor backLeft, backRight, frontLeft, frontRight, leftSlide, rightSlide, leftTpu, rightTpu;
    private CRServo hSlide;
    private Servo lBase, rBase, grabber;
    private long start = 0;

    @Override
    public void runOpMode() {


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

//       leftSlide.setDirection(DcMotorSimple.Direction.REVERSE);


        frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        leftSlide.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rightSlide.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);


        backLeft.setPower(0);
        backRight.setPower(0);
        frontLeft.setPower(0);
        frontRight.setPower(0);
        leftTpu.setPower(0);
        rightTpu.setPower(0);
        leftSlide.setPower(0);
        rightSlide.setPower(0);

        grabber.setPosition(0.6);
        hSlide.setPower(0.38);

        lBase.setPosition(0.7);
        rBase.setPosition(0.25);



        waitForStart();

        start = System.currentTimeMillis();


        /* Go right a little */
        backLeft.setTargetPosition(-1350);
        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeft.setPower(0.5);

        backRight.setTargetPosition(-1350);
        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRight.setPower(0.5);

        frontLeft.setTargetPosition(1350);
        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontLeft.setPower(0.5);

        frontRight.setTargetPosition(1350);
        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRight.setPower(0.5);

        while (backLeft.isBusy() && backRight.isBusy() && frontRight.isBusy() && frontLeft.isBusy()) {
        }

        backLeft.setPower(0);
        frontLeft.setPower(0);
        backRight.setPower(0);
        frontRight.setPower(0);

        backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//
//
//        /* goes back to hit the wall */
        backLeft.setTargetPosition(-1350);
        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeft.setPower(0.8);

        backRight.setTargetPosition(1350);
        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRight.setPower(0.8);

        frontLeft.setTargetPosition(-1350);
        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontLeft.setPower(0.8);

        frontRight.setTargetPosition(1350);
        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRight.setPower(0.8);

        while (backLeft.isBusy() && backRight.isBusy() && frontRight.isBusy() && frontLeft.isBusy()) {
        }

        backLeft.setPower(0);
        frontLeft.setPower(0);
        backRight.setPower(0);
        frontRight.setPower(0);

        backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//
//
//        // Go right more to knock the blocks
        backLeft.setTargetPosition(-1123);
        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeft.setPower(0.25);

        backRight.setTargetPosition(-1123);
        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRight.setPower(0.25);

        frontLeft.setTargetPosition(1123);
        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontLeft.setPower(0.25);

        frontRight.setTargetPosition(1123);
        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRight.setPower(0.25);

        while (backLeft.isBusy() && backRight.isBusy() && frontRight.isBusy() && frontLeft.isBusy()) {
        }

        backLeft.setPower(0);
        frontLeft.setPower(0);
        backRight.setPower(0);
        frontRight.setPower(0);

        backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

//   turn right a little
        backLeft.setTargetPosition(50);
        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeft.setPower(1);

        backRight.setTargetPosition(50);
        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRight.setPower(1);

        frontLeft.setTargetPosition(50);
        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontLeft.setPower(1);

        frontRight.setTargetPosition(50);
        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRight.setPower(1);

        while (backLeft.isBusy() && backRight.isBusy() && frontRight.isBusy() && frontLeft.isBusy()) {
        }

        backLeft.setPower(0);
        frontLeft.setPower(0);
        backRight.setPower(0);
        frontRight.setPower(0);

        backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);


//        Go forward and intake


        backLeft.setTargetPosition(450);
        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeft.setPower(0.2);

        backRight.setTargetPosition(-450);
        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRight.setPower(0.2);

        frontLeft.setTargetPosition(450);
        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontLeft.setPower(0.20);

        frontRight.setTargetPosition(-450);
        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRight.setPower(0.20);

        while (backLeft.isBusy() && backRight.isBusy() && frontRight.isBusy() && frontLeft.isBusy()) {

            leftTpu.setPower(-0.55);
            rightTpu.setPower(-0.55);

        }

        backLeft.setPower(0);
        frontLeft.setPower(0);
        backRight.setPower(0);
        frontRight.setPower(0);
        leftTpu.setPower(0);
        rightTpu.setPower(0);

        backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);



//        Go left

        grabber.setPosition(0);

        backLeft.setTargetPosition(1100);
        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeft.setPower(0.8);

        backRight.setTargetPosition(1100);
        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRight.setPower(0.8);

        frontLeft.setTargetPosition(-1100);
        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontLeft.setPower(0.8);

        frontRight.setTargetPosition(-1100);
        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRight.setPower(0.8);

        while (backLeft.isBusy() && backRight.isBusy() && frontRight.isBusy() && frontLeft.isBusy()) {
            leftTpu.setPower(-0.55);
            rightTpu.setPower(-0.55);
        }

        backLeft.setPower(0);
        frontLeft.setPower(0);
        backRight.setPower(0);
        frontRight.setPower(0);

        backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

//          Go forward


        backLeft.setTargetPosition(4900);
        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeft.setPower(1);

        backRight.setTargetPosition(-4900);
        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRight.setPower(1);

        frontLeft.setTargetPosition(4900);
        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontLeft.setPower(1);

        frontRight.setTargetPosition(-4900);
        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRight.setPower(1);

        rightSlide.setTargetPosition(-320);
        rightSlide.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rightSlide.setPower(0.75);

        leftSlide.setTargetPosition(320);
        leftSlide.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        leftSlide.setPower(0.75);

        while (backLeft.isBusy() && backRight.isBusy() && frontRight.isBusy() && frontLeft.isBusy()) {
        }

        backLeft.setPower(0);
        frontLeft.setPower(0);
        backRight.setPower(0);
        frontRight.setPower(0);
        rightSlide.setPower(0);
        leftSlide.setPower(0);

        backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

// strafe left a little
        backLeft.setTargetPosition(300);
        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeft.setPower(0.5);

        backRight.setTargetPosition(300);
        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRight.setPower(0.5);

        frontLeft.setTargetPosition(-300);
        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontLeft.setPower(0.5);

        frontRight.setTargetPosition(-300);
        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRight.setPower(0.5);

        while (backLeft.isBusy() && backRight.isBusy() && frontRight.isBusy() && frontLeft.isBusy()) {
        }

        backLeft.setPower(0);
        frontLeft.setPower(0);
        backRight.setPower(0);
        frontRight.setPower(0);

        backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);


//          Turn 90 degrees
        backLeft.setTargetPosition(-1320);
        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeft.setPower(0.5);

        backRight.setTargetPosition(-1320);
        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRight.setPower(0.5);

        frontLeft.setTargetPosition(-1320);
        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontLeft.setPower(0.5);

        frontRight.setTargetPosition(-1320);
        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRight.setPower(0.5);

        while (backLeft.isBusy() && backRight.isBusy() && frontRight.isBusy() && frontLeft.isBusy()) {
        }

        backLeft.setPower(0);
        frontLeft.setPower(0);
        backRight.setPower(0);
        frontRight.setPower(0);

        backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

//          Goes back a little to be against the foundation
        backLeft.setTargetPosition(-650);
        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeft.setPower(0.65);

        backRight.setTargetPosition(650);
        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRight.setPower(0.65);

        frontLeft.setTargetPosition(-650);
        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontLeft.setPower(0.65);

        frontRight.setTargetPosition(650);
        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRight.setPower(0.65);

        hSlide.setPower(0);



        while (backLeft.isBusy() && backRight.isBusy() && frontRight.isBusy() && frontLeft.isBusy()) {
        }

        backLeft.setPower(0);
        frontLeft.setPower(0);
        backRight.setPower(0);
        frontRight.setPower(0);
        rightSlide.setPower(0);
        leftSlide.setPower(0);

        backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        sleep(2500);


        rightSlide.setTargetPosition(0);
        rightSlide.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rightSlide.setPower(0.75);

        leftSlide.setTargetPosition(0);
        leftSlide.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        leftSlide.setPower(0.75);

        grabber.setPosition(0.6);

        while (rightSlide.isBusy() && leftSlide.isBusy()) {

        }

        rightSlide.setPower(0);
        leftSlide.setPower(0);

        rightSlide.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        leftSlide.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

//          Go right a little

        backLeft.setTargetPosition(-800);
        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeft.setPower(0.5);

        backRight.setTargetPosition(-800);
        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRight.setPower(0.5);

        frontLeft.setTargetPosition(800);
        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontLeft.setPower(0.5);

        frontRight.setTargetPosition(800);
        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRight.setPower(0.5);

//
        while (backLeft.isBusy() && backRight.isBusy() && frontRight.isBusy() && frontLeft.isBusy()) {
        }

        backLeft.setPower(0);
        frontLeft.setPower(0);
        backRight.setPower(0);
        frontRight.setPower(0);

        backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        lBase.setPosition(0.1);
        rBase.setPosition(0.85);
        hSlide.setPower(0.38);


        sleep(800);

        backLeft.setTargetPosition(2200);
        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeft.setPower(0.2);

        backRight.setTargetPosition(-2200);
        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRight.setPower(0.2);

        frontLeft.setTargetPosition(2200);
        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontLeft.setPower(0.2);

        frontRight.setTargetPosition(-2200);
        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRight.setPower(0.2);

        while (backLeft.isBusy() && backRight.isBusy() && frontRight.isBusy() && frontLeft.isBusy()) {
        }

        backLeft.setPower(0);
        frontLeft.setPower(0);
        backRight.setPower(0);
        frontRight.setPower(0);

        backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        lBase.setPosition(0.7);
        rBase.setPosition(0.25);

        sleep(800);



        //Go right to park

        backLeft.setTargetPosition(1500);
        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeft.setPower(1);

        backRight.setTargetPosition(1500);
        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRight.setPower(1);

        frontLeft.setTargetPosition(-1500);
        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontLeft.setPower(1);

        frontRight.setTargetPosition(-1500);
        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRight.setPower(1);

        while (backLeft.isBusy() && backRight.isBusy() && frontRight.isBusy() && frontLeft.isBusy()) {
        }

        backLeft.setPower(0);
        frontLeft.setPower(0);
        backRight.setPower(0);
        frontRight.setPower(0);

        backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);


        frontLeft.setTargetPosition(-2500);
        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontLeft.setPower(1);

        backRight.setTargetPosition(2500);
        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRight.setPower(1);

        while (frontLeft.isBusy() && backRight.isBusy()) {
        }

        frontLeft.setPower(0);
        backRight.setPower(0);

        frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);



        backLeft.setTargetPosition(800);
        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeft.setPower(0.5);

        backRight.setTargetPosition(800);
        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRight.setPower(0.5);

        frontLeft.setTargetPosition(-800);
        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontLeft.setPower(0.5);

        frontRight.setTargetPosition(-800);
        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRight.setPower(0.5);

//
        while (backLeft.isBusy() && backRight.isBusy() && frontRight.isBusy() && frontLeft.isBusy()) {
        }

        backLeft.setPower(0);
        frontLeft.setPower(0);
        backRight.setPower(0);
        frontRight.setPower(0);

        backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);



// Goes left all the way
//
//        backLeft.setTargetPosition(4300);
//        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        backLeft.setPower(0.5);
//
//        backRight.setTargetPosition(4300);
//        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        backRight.setPower(0.5);
//
//        frontLeft.setTargetPosition(-4300);
//        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        frontLeft.setPower(0.5);
//
//        frontRight.setTargetPosition(-4300);
//        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        frontRight.setPower(0.5);
//
//        while (backLeft.isBusy() && backRight.isBusy() && frontRight.isBusy() && frontLeft.isBusy()) {
//        }
//
//        backLeft.setPower(0);
//        frontLeft.setPower(0);
//        backRight.setPower(0);
//        frontRight.setPower(0);
//
//        backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

//         Turns right 90 degrees
//        backLeft.setTargetPosition(900);
//        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        backLeft.setPower(1);
//
//        backRight.setTargetPosition(900);
//        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        backRight.setPower(1);
//
//        frontLeft.setTargetPosition(900);
//        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        frontLeft.setPower(1);
//
//        frontRight.setTargetPosition(900);
//        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        frontRight.setPower(1);
//
//        while (backLeft.isBusy() && backRight.isBusy() && frontRight.isBusy() && frontLeft.isBusy()) {
//        }
//
//        backLeft.setPower(0);
//        frontLeft.setPower(0);
//        backRight.setPower(0);
//        frontRight.setPower(0);
//
//        backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

// Goes right a little to get next block
//        backLeft.setTargetPosition(-700);
//        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        backLeft.setPower(1);
//
//        backRight.setTargetPosition(-700);
//        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        backRight.setPower(1);
//
//        frontLeft.setTargetPosition(700);
//        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        frontLeft.setPower(1);
//
//        frontRight.setTargetPosition(700);
//        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        frontRight.setPower(1);
//
//        while (backLeft.isBusy() && backRight.isBusy() && frontRight.isBusy() && frontLeft.isBusy()) {
//        }
//
//        backLeft.setPower(0);
//        frontLeft.setPower(0);
//        backRight.setPower(0);
//        frontRight.setPower(0);
//
//        backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//
// Goes forward and intakes
//        backLeft.setTargetPosition(300);
//        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        backLeft.setPower(1);
//
//        backRight.setTargetPosition(-300);
//        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        backRight.setPower(1);
//
//        frontLeft.setTargetPosition(300);
//        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        frontLeft.setPower(1);
//
//        frontRight.setTargetPosition(-300);
//        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        frontRight.setPower(1);
//
//        while (backLeft.isBusy() && backRight.isBusy() && frontRight.isBusy() && frontLeft.isBusy()) {
//
//            leftTpu.setPower(1);
//            rightTpu.setPower(1);
//        }
//
//        backLeft.setPower(0);
//        frontLeft.setPower(0);
//        backRight.setPower(0);
//        frontRight.setPower(0);
//        rightTpu.setPower(0);
//        leftTpu.setPower(0);
//
//        backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//
//        backLeft.setTargetPosition(300);
//        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        backLeft.setPower(1);
//
//        backRight.setTargetPosition(300);
//        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        backRight.setPower(1);
//
//        frontLeft.setTargetPosition(-300);
//        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        frontLeft.setPower(1);
//
//        frontRight.setTargetPosition(-300);
//        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        frontRight.setPower(1);
//
//        while (backLeft.isBusy() && backRight.isBusy() && frontRight.isBusy() && frontLeft.isBusy()) {
//        }
//
//        backLeft.setPower(0);
//        frontLeft.setPower(0);
//        backRight.setPower(0);
//        frontRight.setPower(0);
//
//        backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//
//        backLeft.setTargetPosition(2500);
//        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        backLeft.setPower(1);
//
//        backRight.setTargetPosition(-2500);
//        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        backRight.setPower(1);
//
//        frontLeft.setTargetPosition(2500);
//        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        frontLeft.setPower(1);
//
//        frontRight.setTargetPosition(-2500);
//        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        frontRight.setPower(1);
//
//        while (backLeft.isBusy() && backRight.isBusy() && frontRight.isBusy() && frontLeft.isBusy()) {
//        }
//
//        backLeft.setPower(0);
//        frontLeft.setPower(0);
//        backRight.setPower(0);
//        frontRight.setPower(0);
//
//        backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//
//
//
//        backLeft.setTargetPosition(-300);
//        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        backLeft.setPower(1);
//
//        backRight.setTargetPosition(-300);
//        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        backRight.setPower(1);
//
//        frontLeft.setTargetPosition(-300);
//        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        frontLeft.setPower(1);
//
//        frontRight.setTargetPosition(-300);
//        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        frontRight.setPower(1);
//
//        while (backLeft.isBusy() && backRight.isBusy() && frontRight.isBusy() && frontLeft.isBusy()) {
//        }
//
//        backLeft.setPower(0);
//        frontLeft.setPower(0);
//        backRight.setPower(0);
//        frontRight.setPower(0);
//
//        backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//
//
//        backLeft.setTargetPosition(-100);
//        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        backLeft.setPower(0.65);
//
//        backRight.setTargetPosition(100);
//        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        backRight.setPower(0.65);
//
//        frontLeft.setTargetPosition(-100);
//        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        frontLeft.setPower(0.65);
//
//        frontRight.setTargetPosition(100);
//        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        frontRight.setPower(0.65);
//
//        grabber.setPosition(0);
//
//        while (backLeft.isBusy() && backRight.isBusy() && frontRight.isBusy() && frontLeft.isBusy()) {
//        }
//
//        backLeft.setPower(0);
//        frontLeft.setPower(0);
//        backRight.setPower(0);
//        frontRight.setPower(0);
//
//        backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//
//        rightSlide.setTargetPosition(-300);
//        rightSlide.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        rightSlide.setPower(0.75);
//
//        leftSlide.setTargetPosition(300);
//        leftSlide.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        rightSlide.setPower(0.75);
//
//        hSlide.setPower(0.52);
//
//        while (rightSlide.isBusy() && leftSlide.isBusy()) {
//        }
//
//        rightSlide.setPower(0);
//        leftSlide.setPower(0);
//
//        rightSlide.setTargetPosition(300);
//        rightSlide.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        rightSlide.setPower(0.75);
//
//        leftSlide.setTargetPosition(-300);
//        leftSlide.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        rightSlide.setPower(0.75);
//
//        while (rightSlide.isBusy() && leftSlide.isBusy()) {
//        }
//
//        rightSlide.setPower(0);
//        leftSlide.setPower(0);
//
//        grabber.setPosition(0.6);
//
//        lBase.setPosition(0.1);
//        rBase.setPosition(0.95);
//
//        hSlide.setPower(0);
//
//        backLeft.setTargetPosition(1800);
//        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        backLeft.setPower(0.2);
//
//        backRight.setTargetPosition(-1800);
//        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        backRight.setPower(0.2);
//
//        frontLeft.setTargetPosition(1800);
//        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        frontLeft.setPower(0.2);
//
//        frontRight.setTargetPosition(-1800);
//        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        frontRight.setPower(0.2);
//
//        while (backLeft.isBusy() && backRight.isBusy() && frontRight.isBusy() && frontLeft.isBusy()) {
//        }
//
//        backLeft.setPower(0);
//        frontLeft.setPower(0);
//        backRight.setPower(0);
//        frontRight.setPower(0);
//
//        backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//
//        lBase.setPosition(0.7);
//        rBase.setPosition(0.35);
//
//        sleep(800);
//
//        //Go slightly forward
//
//        backLeft.setTargetPosition(150);
//        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        backLeft.setPower(1);
//
//        backRight.setTargetPosition(-150);
//        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        backRight.setPower(1);
//
//        frontLeft.setTargetPosition(150);
//        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        frontLeft.setPower(1);
//
//        frontRight.setTargetPosition(-150);
//        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        frontRight.setPower(1);
//
//        while (backLeft.isBusy() && backRight.isBusy() && frontRight.isBusy() && frontLeft.isBusy()) {
//        }
//
//        backLeft.setPower(0);
//        frontLeft.setPower(0);
//        backRight.setPower(0);
//        frontRight.setPower(0);
//
//        backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//
//        //Go right to park
//
//        backLeft.setTargetPosition(2700);
//        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        backLeft.setPower(1);
//
//        backRight.setTargetPosition(2700);
//        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        backRight.setPower(1);
//
//        frontLeft.setTargetPosition(-2700);
//        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        frontLeft.setPower(1);
//
//        frontRight.setTargetPosition(-2700);
//        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        frontRight.setPower(1);
//
//        while (backLeft.isBusy() && backRight.isBusy() && frontRight.isBusy() && frontLeft.isBusy()) {
//        }
//
//        backLeft.setPower(0);
//        frontLeft.setPower(0);
//        backRight.setPower(0);
//        frontRight.setPower(0);
//
//        backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        // , then left, then forward, then turn left, outake, go left, turn right, go right, forward and intake, left, forward, turn left, outake and grab foundation, forward, then left and back and left to park.
//
//
//



    }
}
