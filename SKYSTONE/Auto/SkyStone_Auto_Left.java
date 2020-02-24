package org.firstinspires.ftc.teamcode.Competition.Skystone_autos;


import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous

public class SkyStone_Auto_Left extends LinearOpMode {


    private DcMotor backLeft, backRight, frontLeft, frontRight, leftSlide, rightSlide, leftTpu, rightTpu;
    private CRServo grabber, hSlide;
    private Servo lBase, rBase;
    private long start = 0;

    @Override
    public void runOpMode() {


        frontLeft = hardwareMap.dcMotor.get("fleft");
        frontRight = hardwareMap.dcMotor.get("fright");
        backRight = hardwareMap.dcMotor.get("bright");
        backLeft = hardwareMap.dcMotor.get("bleft");
//       leftSlide = hardwareMap.dcMotor.get("lslide");
//       rightSlide = hardwareMap.dcMotor.get("rslide");
        leftTpu = hardwareMap.dcMotor.get("ltpu");
        rightTpu = hardwareMap.dcMotor.get("rtpu");
//       grabber = hardwareMap.crservo.get("grabber");
////       hSlide = hardwareMap.crservo.get("slide");
//        lBase = hardwareMap.servo.get("lbase");
//        rBase = hardwareMap.servo.get("rbase");

        leftTpu.setDirection(DcMotorSimple.Direction.REVERSE);
//       leftSlide.setDirection(DcMotorSimple.Direction.REVERSE);


        frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        leftSlide.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        rightSlide.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

//        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
////        leftSlide.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        rightSlide.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        backLeft.setPower(0);
        backRight.setPower(0);
        frontLeft.setPower(0);
        frontRight.setPower(0);
        leftTpu.setPower(0);
        rightTpu.setPower(0);
//       leftSlide.setPower(0);
//       rightSlide.setPower(0);

//       grabber.setPower(0);
//       hSlide.setPower(0);

//        lBase.setPosition(0.7);
//        rBase.setPosition(0.35);



        waitForStart();

        start = System.currentTimeMillis();


        if (opModeIsActive()) {


            // Go forward a little to be off the wall

            backLeft.setTargetPosition(300);
            backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            backLeft.setPower(1);

            backRight.setTargetPosition(-300);
            backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            backRight.setPower(1);

            frontLeft.setTargetPosition(300);
            frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            frontLeft.setPower(1);

            frontRight.setTargetPosition(-300);
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

            //Go right to park under bridge


            backLeft.setTargetPosition(-2000);
            backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            backLeft.setPower(0.65);

            backRight.setTargetPosition(-2000);
            backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            backRight.setPower(0.65);

            frontLeft.setTargetPosition(2000);
            frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            frontLeft.setPower(0.65);

            frontRight.setTargetPosition(2000);
            frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            frontRight.setPower(0.65);

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



            backLeft.setTargetPosition(-300);
            backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            backLeft.setPower(1);

            backRight.setTargetPosition(300);
            backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            backRight.setPower(1);

            frontLeft.setTargetPosition(-300);
            frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            frontLeft.setPower(1);

            frontRight.setTargetPosition(300);
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
        }

    }
}
