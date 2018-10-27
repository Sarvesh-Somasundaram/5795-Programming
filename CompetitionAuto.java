package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;


@Autonomous

public class CompetitionAuto extends LinearOpMode {

    long start = 0;
    private DcMotor Backleft,Backright;

    public void runOpMode() {

        Backleft = hardwareMap.dcMotor.get("Backleft");
        Backright = hardwareMap.dcMotor.get("Backright");

        Backleft.setDirection(DcMotorSimple.Direction.REVERSE);

        waitForStart();

        start = System.currentTimeMillis();


        while (opModeIsActive() && System.currentTimeMillis() - start <750) {

            Backleft.setPower(1);
            Backright.setPower(1);

        }
        Backleft.setPower(0);
        Backright.setPower(0);



        while (opModeIsActive() && System.currentTimeMillis() - start < 6000) {
            Backleft.setPower(1);
            Backright.setPower(-1);
        }

        Backleft.setPower(0);
        Backright.setPower(0);


        while (opModeIsActive() && System.currentTimeMillis() - start <4000) {
            Backleft.setPower(0.95);
            Backright.setPower(0.95);
        }
        Backleft.setPower(0);
        Backright.setPower(0);

    }

}
