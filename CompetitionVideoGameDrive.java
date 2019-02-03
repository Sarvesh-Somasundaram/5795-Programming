package org.firstinspires.ftc.teamcode.Competition;

import com.qualcomm.hardware.rev.Rev2mDistanceSensor;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by sarvesh on 1/24/2019.
 *
 */
@TeleOp (name = "CompetitionVideoGame", group = "Regionals")

public class CompetitionVideoGameDrive extends OpMode {

    private DcMotor Backleft, Backright, Frontleft, Frontright, Leftslide, Rightslide, Woosh, Intakewheel;
    private CRServo Intakeleft, Intakeright;
    private double direction, Turn, Right, Left;



    public void init() {

        Backleft = hardwareMap.dcMotor.get("Backleft");
        Backright = hardwareMap.dcMotor.get("Backright");
        Backright.setDirection(DcMotorSimple.Direction.REVERSE);
        Frontleft = hardwareMap.dcMotor.get("Frontleft");
        Frontright = hardwareMap.dcMotor.get("Frontright");
        Frontright.setDirection(DcMotorSimple.Direction.REVERSE);
        Leftslide = hardwareMap.dcMotor.get("Leftslide");
        Rightslide = hardwareMap.dcMotor.get("Rightslide");
        Rightslide.setDirection(DcMotorSimple.Direction.REVERSE);
        Woosh = hardwareMap.dcMotor.get("Woosh");
        Woosh.setDirection(DcMotorSimple.Direction.REVERSE);
        Intakewheel = hardwareMap.dcMotor.get("Intakewheel");
        Intakeleft = hardwareMap.crservo.get("Intakeleft");
        Intakeright = hardwareMap.crservo.get("Intakeright");

        Intakeright.setDirection(DcMotorSimple.Direction.REVERSE);


        Woosh.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        Rightslide.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        Leftslide.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        Woosh.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        Rightslide.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        Leftslide.setMode(DcMotor.RunMode.RUN_TO_POSITION);



        Backleft.setPower(0);
        Backright.setPower(0);
        Frontleft.setPower(0);
        Frontright.setPower(0);
        Leftslide.setPower(0);
        Woosh.setPower(0);
        Rightslide.setPower(0);
        Intakewheel.setPower(0);

        Intakeright.setPower(0);
        Intakeleft.setPower(0);



    }

    public void loop() {

// This is the arcade controls for the drivetrain
        direction = -gamepad1.left_stick_y;

        if (Math.abs(gamepad1.left_stick_y) > 0.2) {
            Turn = -(0.65 * gamepad1.right_stick_x);
        } else {
            Turn = -(0.75 * gamepad1.right_stick_x);
        }

        // SLOW MODE
        if (gamepad1.left_bumper) {

            Backleft.setPower((direction - 1.5 * Turn) * 0.25);
            Backright.setPower((direction + 1.5 * Turn) * 0.25);
            Frontleft.setPower((direction - 1.5 * Turn) * 0.25);
            Frontright.setPower((direction + 1.5 * Turn) * 0.25);

        }

        else {

            Right = direction + Turn;
            Left = direction - Turn;

            Backright.setPower(Right);
            Backleft.setPower(Left);
            Frontleft.setPower(Left);
            Frontright.setPower(Right);

        }

// Moves the Intake wheel
        Intakewheel.setPower(gamepad2.right_stick_y);

// This is to move our Linear Actuator up to the position for hanging uses Encoders for accurate positioning consistently
        if (gamepad2.dpad_up) {

            Woosh.setTargetPosition(25310);
            Woosh.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            Woosh.setPower(0.9);
        }

        else if (gamepad2.dpad_down) {

            Woosh.setTargetPosition(0);
            Woosh.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            Woosh.setPower(0.9);
        }
// Use to adjust the Linear Actuator after moving to desired position
        else if (gamepad2.left_bumper) {

            Woosh.setPower(0.15);
        }

// This is to move the Linear slides to a desired position to outake minerals into the LANDER
        if (gamepad2.b) {

            Rightslide.setTargetPosition(10000);
            Leftslide.setTargetPosition(10000);
            Rightslide.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            Leftslide.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            Rightslide.setPower(0.9);
            Leftslide.setPower(0.9);

        }

        else if (gamepad2.a) {

            Rightslide.setTargetPosition(0);
            Leftslide.setTargetPosition(0);
            Rightslide.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            Leftslide.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            Rightslide.setPower(0.9);
            Leftslide.setPower(0.9);



        }

        if (gamepad2.b) {

            Intakeleft.setPower(0.5);
            Intakeright.setPower(0.5);

        }

        else if (gamepad2.a) {

            Intakeleft.setPower(-0.5);
            Intakeright.setPower(-0.5);
        }

        else {

            Intakeleft.setPower(0);
            Intakeright.setPower(0);
        }



    }
}

