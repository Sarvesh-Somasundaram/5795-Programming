package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous

public class Circletrial extends LinearOpMode{

    long start =0;
    DcMotor Jaydensbackmotorleft, Jaydensbackmotorright;
    Servo Jaydensclaw, Jaydensarm;


    public void runOpMode() {
        Jaydensbackmotorleft = hardwareMap.dcMotor.get("JaydensleftMotor");
        Jaydensbackmotorright = hardwareMap.dcMotor.get("JaydensrightMotor");

        Jaydensbackmotorleft.setDirection(DcMotorSimple.Direction.REVERSE);

        Jaydensclaw = hardwareMap.servo.get("JaydensClaw");
        Jaydensarm = hardwareMap.servo.get("JaydensArm");


        waitForStart();

        start = System.currentTimeMillis();

        while (opModeIsActive() && System.currentTimeMillis() - start <100000) {
            Jaydensbackmotorleft.setPower(0.5);
            Jaydensbackmotorright.setPower(1);
            Jaydensarm.setPosition(180);
            Jaydensclaw.setPosition(120);
        }
        Jaydensbackmotorleft.setPower(0);
        Jaydensbackmotorright.setPower(0);
        Jaydensarm.setPosition(0);
        Jaydensclaw.setPosition(0);

        while (opModeIsActive() && System.currentTimeMillis() - start < 10000000) {
            Jaydensbackmotorleft.setPower(-0.5);
            Jaydensbackmotorright.setPower(-1);
            Jaydensarm.setPosition(0);
            Jaydensclaw.setPosition(0);
        }
        Jaydensbackmotorleft.setPower(0);
        Jaydensbackmotorright.setPower(0);
        Jaydensarm.setPosition(0);
        Jaydensclaw.setPosition(0);
    }
}
