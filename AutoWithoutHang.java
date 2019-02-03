package org.firstinspires.ftc.teamcode.Competition;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by Sarvesh on 1/25/2019
 */

@Autonomous (name = "Auto w/o hanging", group = "Regionals")

public class AutoWithoutHang extends LinearOpMode {

    private DcMotor Backleft, Backright, Frontleft, Frontright, Leftslide, Rightslide, Woosh, Intakewheel;
    private Servo Intakeleft, Intakeright;
    private SensorREVColorDistance Color;


    public void runOpMode() {

        Backleft = hardwareMap.dcMotor.get("Backleft");
        Backleft.setDirection(DcMotorSimple.Direction.REVERSE);
        Backright = hardwareMap.dcMotor.get("Backright");
        Backright.setDirection(DcMotorSimple.Direction.FORWARD);
        Frontleft = hardwareMap.dcMotor.get("Frontleft");
        Frontleft.setDirection(DcMotorSimple.Direction.REVERSE);
        Frontright = hardwareMap.dcMotor.get("Frontright");
        Frontright.setDirection(DcMotorSimple.Direction.FORWARD);
        Leftslide = hardwareMap.dcMotor.get("Leftslide");
        Rightslide = hardwareMap.dcMotor.get("Rightslide");
        Rightslide.setDirection(DcMotorSimple.Direction.REVERSE);
        Woosh = hardwareMap.dcMotor.get("Woosh");
        Intakewheel = hardwareMap.dcMotor.get("Intakewheel");
        Intakeleft = hardwareMap.servo.get("Intakeleft");
        Intakeright = hardwareMap.servo.get("Intakeright");


        Backleft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        Backright.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        Frontleft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        Frontright.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        Rightslide.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        Leftslide.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        Woosh.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        Rightslide.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        Leftslide.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        Backleft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        Backright.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        Frontleft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        Frontright.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        Backleft.setPower(0);
        Backright.setPower(0);
        Frontleft.setPower(0);
        Frontright.setPower(0);
        Woosh.setPower(0);
        Leftslide.setPower(0);
        Rightslide.setPower(0);
        Intakewheel.setPower(0);

        Intakeleft.setPosition(0);
        Intakeright.setPosition(0);


        waitForStart();

        // goes forward

        while (opModeIsActive()) {

            Backleft.setTargetPosition(1612);
            Backleft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            Backleft.setPower(0.6);

            Backright.setTargetPosition(1612);
            Backright.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            Backright.setPower(0.5);

            Frontleft.setTargetPosition(1612);
            Frontleft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            Frontleft.setPower(0.6);

            Frontright.setTargetPosition(1612);
            Frontright.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            Frontright.setPower(0.5);
        }

        Frontleft.setPower(0);
        Frontleft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        Frontleft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        Frontright.setPower(0);
        Frontright.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        Frontright.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        Backleft.setPower(0);
        Backleft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        Backleft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        Backright.setPower(0);
        Backright.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        Backright.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);


        // Turns right
        while (opModeIsActive()) {

            Backleft.setTargetPosition(806);
            Backleft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            Backleft.setPower(0.6);

            Backright.setTargetPosition(806);
            Backright.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            Backright.setPower(-0.6);

            Frontleft.setTargetPosition(806);
            Frontleft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            Frontleft.setPower(0.6);

            Frontright.setTargetPosition(806);
            Frontright.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            Frontright.setPower(-0.6);
        }

        Frontleft.setPower(0);
        Frontleft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        Frontleft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        Frontright.setPower(0);
        Frontright.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        Frontright.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        Backleft.setPower(0);
        Backleft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        Backleft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        Backright.setPower(0);
        Backright.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        Backright.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        // forward a little to prepare to outtake
        while (opModeIsActive()) {

            Backleft.setTargetPosition(287);
            Backleft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            Backleft.setPower(0.5);

            Backright.setTargetPosition(287);
            Backright.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            Backright.setPower(0.5);

            Frontleft.setTargetPosition(287);
            Frontleft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            Frontleft.setPower(0.5);

            Frontright.setTargetPosition(287);
            Frontright.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            Frontright.setPower(0.5);

        }

        Frontleft.setPower(0);
        Frontleft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        Frontleft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        Frontright.setPower(0);
        Frontright.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        Frontright.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        Backleft.setPower(0);
        Backleft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        Backleft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        Backright.setPower(0);
        Backright.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        Backright.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);


        //Add outtake code here, first linearslides go up, then the servos go backward, then the servos go back to normal
        // and the slides go down

        // Drives into the crater
        while (opModeIsActive()) {

            Backleft.setTargetPosition(2150);
            Backleft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            Backleft.setPower(0.5);

            Backright.setTargetPosition(2150);
            Backright.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            Backright.setPower(0.5);

            Frontleft.setTargetPosition(2150);
            Frontleft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            Frontleft.setPower(0.5);

            Frontright.setTargetPosition(2150);
            Frontright.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            Frontright.setPower(0.5);

        }

        Frontleft.setPower(0);
        Frontleft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        Frontleft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        Frontright.setPower(0);
        Frontright.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        Frontright.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        Backleft.setPower(0);
        Backleft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        Backleft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        Backright.setPower(0);
        Backright.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        Backright.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

    }

}
