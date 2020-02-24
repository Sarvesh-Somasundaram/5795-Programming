package org.firstinspires.ftc.teamcode.Competition.Skystone_autos;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous
public class TwoBlock_Left extends LinearOpMode {


    private DcMotor backLeft, backRight, frontLeft, frontRight, leftSlide, rightSlide, leftTpu, rightTpu;
    private CRServo hSlide;
    private Servo lBase, rBase, grabber;
    private long start = 0;


    public void moveForward(int ticks, double power) {
        backLeft.setTargetPosition(ticks);
        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeft.setPower(power);
        backRight.setTargetPosition(-ticks);
        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRight.setPower(power);
        frontLeft.setTargetPosition(ticks);
        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontLeft.setPower(power);
        frontRight.setTargetPosition(-ticks);
        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRight.setPower(power);
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
    }

    public void moveBackward(int ticks, double power) {
        backLeft.setTargetPosition(-ticks);
        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeft.setPower(power);
        backRight.setTargetPosition(ticks);
        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRight.setPower(power);
        frontLeft.setTargetPosition(-ticks);
        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontLeft.setPower(power);
        frontRight.setTargetPosition(ticks);
        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRight.setPower(power);
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
    }

    public void moveLeft(int ticks, double power) {
        backLeft.setTargetPosition(-ticks);
        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeft.setPower(power);
        backRight.setTargetPosition(-ticks);
        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRight.setPower(power);
        frontLeft.setTargetPosition(ticks);
        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontLeft.setPower(power);
        frontRight.setTargetPosition(ticks);
        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRight.setPower(power);
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
    }

    public void moveRight(int ticks, double power) {
        backLeft.setTargetPosition(ticks);
        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeft.setPower(power);
        backRight.setTargetPosition(ticks);
        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRight.setPower(power);
        frontLeft.setTargetPosition(-ticks);
        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontLeft.setPower(power);
        frontRight.setTargetPosition(-ticks);
        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRight.setPower(power);
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
    }

    public void turnRight(int ticks, double power) {
        backLeft.setTargetPosition(-ticks);
        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeft.setPower(power);
        backRight.setTargetPosition(-ticks);
        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRight.setPower(power);
        frontLeft.setTargetPosition(-ticks);
        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontLeft.setPower(power);
        frontRight.setTargetPosition(-ticks);
        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRight.setPower(power);
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
    }

    public void turnLeft(int ticks, double power){
        backLeft.setTargetPosition(ticks);
        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeft.setPower(power);
        backRight.setTargetPosition(ticks);
        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRight.setPower(power);
        frontLeft.setTargetPosition(ticks);
        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontLeft.setPower(power);
        frontRight.setTargetPosition(ticks);
        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRight.setPower(power);
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
    }

    public void forwardIntake(int ticks, double power, double intakePower){
        backLeft.setTargetPosition(ticks);
        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeft.setPower(power);
        backRight.setTargetPosition(-ticks);
        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRight.setPower(power);
        frontLeft.setTargetPosition(ticks);
        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontLeft.setPower(power);
        frontRight.setTargetPosition(-ticks);
        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRight.setPower(power);
        while (backLeft.isBusy() && backRight.isBusy() && frontRight.isBusy() && frontLeft.isBusy()) {
            leftTpu.setPower(-intakePower);
            rightTpu.setPower(-intakePower);
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
    }

    public void slideUp(int ticks, double power) {


    }

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

        rightSlide.setDirection(DcMotorSimple.Direction.REVERSE);

        backLeft.setPower(0);
        backRight.setPower(0);
        frontLeft.setPower(0);
        frontRight.setPower(0);
        leftTpu.setPower(0);
        rightTpu.setPower(0);
        leftSlide.setPower(0);
        rightSlide.setPower(0);

        grabber.setPosition(0.6);
        hSlide.setPower(0);

        lBase.setPosition(1);
        rBase.setPosition(0);

        waitForStart();

        start = System.currentTimeMillis();

        /* Go right a little */
        moveRight(1350, 0.5);

        /* goes back to hit the wall */
        moveBackward(1380, 0.8);

        // Go right more to knock the blocks
        moveRight(1123, 0.25);

        //turn right a little
        turnRight(50, 1);

        //Go forward and intake
        forwardIntake(450, 0.2, 0.55);

        grabber.setPosition(0);
        //Go left
        moveLeft(1110, 0.8);

        while (backLeft.isBusy() && backRight.isBusy() && frontRight.isBusy() && frontLeft.isBusy()) {
            leftTpu.setPower(-0.55);
            rightTpu.setPower(-0.55);
        }

        //Go forward
        moveForward(4930, 0.7);

        backLeft.setTargetPosition(4930);
        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeft.setPower(0.7);

        backRight.setTargetPosition(-4930);
        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRight.setPower(0.7);

        frontLeft.setTargetPosition(4930);
        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontLeft.setPower(0.7);

        frontRight.setTargetPosition(-4930);
        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRight.setPower(0.7);

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
        leftTpu.setPower(0);
        rightTpu.setPower(0);

        backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

// strafe left a little
//        backLeft.setTargetPosition(-300);
//        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        backLeft.setPower(0.5);
//
//        backRight.setTargetPosition(-300);
//        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        backRight.setPower(0.5);
//
//        frontLeft.setTargetPosition(300);
//        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        frontLeft.setPower(0.5);
//
//        frontRight.setTargetPosition(300);
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


//          Turn 90 degrees
        backLeft.setTargetPosition(1320);
        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeft.setPower(0.5);

        backRight.setTargetPosition(1320);
        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRight.setPower(0.5);

        frontLeft.setTargetPosition(1320);
        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontLeft.setPower(0.5);

        frontRight.setTargetPosition(1320);
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
        backLeft.setTargetPosition(-720);
        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeft.setPower(0.65);

        backRight.setTargetPosition(720);
        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRight.setPower(0.65);

        frontLeft.setTargetPosition(-720);
        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontLeft.setPower(0.65);

        frontRight.setTargetPosition(720);
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

        backLeft.setTargetPosition(650);
        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeft.setPower(0.5);

        backRight.setTargetPosition(650);
        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRight.setPower(0.5);

        frontLeft.setTargetPosition(-650);
        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontLeft.setPower(0.5);

        frontRight.setTargetPosition(-650);
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

        backLeft.setTargetPosition(-150);
        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeft.setPower(0.65);

        backRight.setTargetPosition(150);
        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRight.setPower(0.65);

        frontLeft.setTargetPosition(-150);
        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontLeft.setPower(0.65);

        frontRight.setTargetPosition(150);
        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRight.setPower(0.65);


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


        lBase.setPosition(0.1);
        rBase.setPosition(0.85);
        hSlide.setPower(0.38);


        sleep(800);

        backLeft.setTargetPosition(2400);
        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeft.setPower(0.2);

        backRight.setTargetPosition(-2400);
        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRight.setPower(0.2);

        frontLeft.setTargetPosition(2400);
        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontLeft.setPower(0.2);

        frontRight.setTargetPosition(-2400);
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

        backLeft.setTargetPosition(-1500);
        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeft.setPower(1);

        backRight.setTargetPosition(-1500);
        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRight.setPower(1);

        frontLeft.setTargetPosition(1500);
        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontLeft.setPower(1);

        frontRight.setTargetPosition(1500);
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


        frontRight.setTargetPosition(2300);
        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRight.setPower(1);

        backLeft.setTargetPosition(-2300);
        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeft.setPower(1);

        while (frontRight.isBusy() && backLeft.isBusy()) {
        }

        frontRight.setPower(0);
        backLeft.setPower(0);

        frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);



        backLeft.setTargetPosition(-900);
        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeft.setPower(0.5);

        backRight.setTargetPosition(-900);
        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRight.setPower(0.5);

        frontLeft.setTargetPosition(900);
        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontLeft.setPower(0.5);

        frontRight.setTargetPosition(900);
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


    }
}
