package org.firstinspires.ftc.teamcode.summercamp;

import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.hardware.bosch.JustLoggingAccelerationIntegrator;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.robotcore.external.navigation.AxesOrder;
import org.firstinspires.ftc.robotcore.external.navigation.AxesReference;
import org.firstinspires.ftc.robotcore.external.navigation.Orientation;

@Autonomous

public class Auto extends LinearOpMode {

    long start = 0;
    DcMotor leftmotor, rightMotor;
    DcMotor rightarm, leftarm;
    BNO055IMU imu;
    Orientation angles;

    public void runOpMode() {

        leftmotor = hardwareMap.dcMotor.get("leftmotor");
        rightMotor = hardwareMap.dcMotor.get("rightmotor");

        leftmotor.setDirection(DcMotorSimple.Direction.REVERSE);

        rightarm = hardwareMap.dcMotor.get("rightarm");
        leftarm = hardwareMap.dcMotor.get("leftarm");


        BNO055IMU.Parameters parameters = new BNO055IMU.Parameters();
        parameters.angleUnit = BNO055IMU.AngleUnit.DEGREES;
        parameters.accelUnit = BNO055IMU.AccelUnit.METERS_PERSEC_PERSEC;
        parameters.calibrationDataFile = "BNO055IMUCalibration.json"; // see the calibration sample opmode
        parameters.loggingEnabled = true;
        parameters.loggingTag = "IMU";
        parameters.accelerationIntegrationAlgorithm = new JustLoggingAccelerationIntegrator();


        imu = hardwareMap.get(BNO055IMU.class, "imu");
        imu.initialize(parameters);

        angles = imu.getAngularOrientation(AxesReference.INTRINSIC, AxesOrder.ZYX, AngleUnit.DEGREES);
        telemetry.addData("heading", angles.firstAngle);

        waitForStart();

        start = System.currentTimeMillis();

//
//        while (opModeIsActive() ){
//
//            an0gles = imu.getAngularOrientation(AxesReference.INTRINSIC, AxesOrder.ZYX, AngleUnit.DEGREES);
//            double turn = 1/30 * angles.firstAngle;
//            telemetry.addData("heading", angles.firstAngle);
//        }

        while (opModeIsActive() && System.currentTimeMillis() - start <4000) {
            angles = imu.getAngularOrientation(AxesReference.INTRINSIC, AxesOrder.ZYX, AngleUnit.DEGREES);
            double turn = 0.03 * angles.firstAngle;
            leftmotor.setPower(0.70 - turn);
            rightMotor.setPower(0.70 + turn);
            leftarm.setPower(0.3);

        }
        leftmotor.setPower(0);
        rightMotor.setPower(0);
        leftarm.setPower(0);



        while (opModeIsActive() && System.currentTimeMillis() - start < 350) {
            leftarm.setPower(-1);
        }

        leftarm.setPower(0);

        start = System.currentTimeMillis();

        while (opModeIsActive() && System.currentTimeMillis() - start <2100) {
            leftmotor.setPower(-0.60);
            rightMotor.setPower(-0.60);
        }
        leftmotor.setPower(0);
        rightMotor.setPower(0);

    }
}
