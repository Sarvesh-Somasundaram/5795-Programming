package org.firstinspires.ftc.teamcode.Competition;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class Slides_Down extends OpMode {


    private DcMotor backLeft, backRight, frontLeft, frontRight, leftSlide, rightSlide, leftTpu, rightTpu;
    private CRServo hSlide;
    private Servo lBase, rBase, grabber;

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

//       leftSlide.setDirection(DcMotorSimple.Direction.REVERSE);


        backLeft.setPower(0);
        backRight.setPower(0);
        frontLeft.setPower(0);
        frontRight.setPower(0);
        leftTpu.setPower(0);
        rightTpu.setPower(0);
        leftSlide.setPower(0);
        rightSlide.setPower(0);

        grabber.setPosition(0);

        lBase.setPosition(0.7);
        rBase.setPosition(0.35);

        //This is the initialization part of team 5795’s teleop code, stating in total 8 dcMotors, 4
        // controlling each of the 4 mechanism wheels(front right, front left, back right, back left),
        // 2 motors used to raise and lower the linear slides( left slide, right slide), and 2 motors
        // controlling the intake( left tpu +and right tpu). Within the initialization there is also
        // two stated CRServo and two stated servos for a total of 4. One CRServo controls the grabber
        // that actually latches onto sky stones, and another labeled hslide controls the horizontal slide
        // that the actual grabber is attached to. The two other servos control the left and right base grabbers
        // meant to grab and move the stacking base during auto
        // and near endgame. In init all motors are set to power zero and the two base grabber are
        // put into set positions ready to grab
    }

    public void loop() {

        rightSlide.setPower(gamepad2.right_stick_y*0.5);
        leftSlide.setPower(gamepad2.left_stick_y*0.5);
        }
    }

