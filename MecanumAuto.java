package org.firstinspires.ftc.teamcode.Competition;


import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@Autonomous
public class MecanumAuto extends LinearOpMode {

    DcMotor backLeft, backRight, frontLeft, frontRight ;
    double Forward = 1, Backward = -1;

    @Override
    public void runOpMode() {
        backLeft = hardwareMap.dcMotor.get("bleft");
        backRight = hardwareMap.dcMotor.get("bright");
        frontLeft = hardwareMap.dcMotor.get("fleft");
        frontRight = hardwareMap.dcMotor.get("fright");

        backLeft.setPower(0);
        backRight.setPower(0);
        frontRight.setPower(0);
        frontLeft.setPower(0);

        backLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        frontLeft.setDirection(DcMotorSimple.Direction.REVERSE);
    }


}
