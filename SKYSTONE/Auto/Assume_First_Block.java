package org.firstinspires.ftc.teamcode.Competition.Skystone_autos;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous
public class Assume_First_Block extends LinearOpMode {

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
        backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    }

    public void slideUp(int ticks, double power) {


    }

    public void backTurn(int ticks, double power ) {
        backLeft.setTargetPosition(-ticks);
        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeft.setPower(power*0.25);
        backRight.setTargetPosition(ticks);
        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRight.setPower(power);
        frontLeft.setTargetPosition(-ticks);
        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontLeft.setPower(power*0.25);
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

        frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        leftSlide.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rightSlide.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        grabber.setPosition(0.6);
        hSlide.setPower(0);

        lBase.setPosition(1);
        rBase.setPosition(0);

        waitForStart();

        start = System.currentTimeMillis();

        moveRight(1650, 0.75);
        moveBackward(1000, 0.75);
        turnRight(800, 0.75);
        forwardIntake(537,0.25, 0.75);
        backTurn(2300, 0.75);
        rightTpu.setPower(0);
        leftTpu.setPower(0);
        moveBackward(1100, 0.75);
        moveRight(1100, 0.75);




    }
}
