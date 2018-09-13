package org.firstinspires.ftc.teamcode.summercamp;

import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.hardware.bosch.JustLoggingAccelerationIntegrator;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.robotcore.external.navigation.AxesOrder;
import org.firstinspires.ftc.robotcore.external.navigation.AxesReference;
import org.firstinspires.ftc.robotcore.external.navigation.Orientation;

@TeleOp

public class Teleop extends OpMode {
    DcMotor leftmotor, rightMotor;
    DcMotor rightarm, leftarm;
    BNO055IMU imu;
    Orientation angles;


    public void init() {
        leftmotor = hardwareMap.dcMotor.get("leftmotor");
        rightMotor = hardwareMap.dcMotor.get("rightmotor");

        leftmotor.setDirection(DcMotorSimple.Direction.REVERSE);

        rightarm = hardwareMap.dcMotor.get("rightarm");
        leftarm = hardwareMap.dcMotor.get("leftarm");

        BNO055IMU.Parameters parameters = new BNO055IMU.Parameters(
        );
        parameters.angleUnit = BNO055IMU.AngleUnit.DEGREES;
        parameters.accelUnit = BNO055IMU.AccelUnit.METERS_PERSEC_PERSEC;
        parameters.calibrationDataFile = "BNO055IMUCalibration.json"; // see the calibration sample opmode
        parameters.loggingEnabled = true;
        parameters.loggingTag = "IMU";
        parameters.accelerationIntegrationAlgorithm = new JustLoggingAccelerationIntegrator();

        imu = hardwareMap.get(BNO055IMU.class, "imu");
        imu.initialize(parameters);

    }




    public void loop() {
        leftmotor.setPower(-gamepad1.left_stick_y - gamepad1.right_stick_x);
        rightMotor.setPower(-gamepad1.left_stick_y + gamepad1.right_stick_x);
angles = imu.getAngularOrientation(AxesReference.INTRINSIC, AxesOrder.ZYX, AngleUnit.DEGREES);
telemetry.addData("heading", angles.firstAngle);
telemetry.addData("roll", angles.secondAngle);
telemetry.addData("pitch", angles.thirdAngle);
        if (gamepad1.left_bumper) {
            leftarm.setPower(1);
        }
        else if (gamepad1.right_bumper) {
            leftarm.setPower(-1);

        }
        else {
            leftarm.setPower(0);
        }

        if (gamepad1.dpad_left) {
            rightarm.setPower(0.50);
        }
        else if (gamepad1.dpad_right) {
            rightarm.setPower(-1);
        }
        else{
            rightarm.setPower(0);
        }
    }
}
