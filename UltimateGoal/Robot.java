package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.Servo;

public class Robot extends OpMode {

    /*
    Configuration

    Control Hub
    bright - 0
    bleft & horizontal encoder - 1
    fright & right encoder - 2
    fleft & left encoder - 3
    brrrservo - 0

    Expansion Hub
    brrr - 0
     */


    public DcMotor backLeft, backRight, frontLeft, frontRight, verticalLeft, verticalRight, horizontal, intake;
    public DcMotorEx brrr;
    public final double COUNTS_PER_INCH = 43.4670116429;
    public Servo shooterServo;
    public double encoderCountShooter;
    public long start = 0;
    public double speed = 0;
    public double power = 1;

    public int increment=0;

    public void init() {

        backLeft = hardwareMap.dcMotor.get("bleft");
        frontLeft = hardwareMap.dcMotor.get("fleft");
        frontRight = hardwareMap.dcMotor.get("fright");
        backRight = hardwareMap.dcMotor.get("bright");
        verticalLeft = hardwareMap.dcMotor.get("fleft");
        verticalRight = hardwareMap.dcMotor.get("fright");
        horizontal = hardwareMap.dcMotor.get("bleft");
        intake = hardwareMap.dcMotor.get("intake");
//        wobble = hardwareMap.dcMotor.get("wobble");
        brrr = (DcMotorEx)hardwareMap.get(DcMotor.class, "brrr");
//        wobbleservo = hardwareMap.servo.get("wobbles");

        shooterServo = hardwareMap.servo.get("brrrservo");
//
//        wobble.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);




        backLeft.setPower(0);
        backRight.setPower(0);
        frontRight.setPower(0);
        frontLeft.setPower(0);
        intake.setPower(0);

        shooterServo.setPosition(0);
//        wobbleservo.setPosition(0);
        //figure out wobbles value

    }

    public void loop() {

    }

}
