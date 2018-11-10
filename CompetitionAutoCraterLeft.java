package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous
public class CompetitionAutoCraterLeft extends LinearOpMode {

    long start = 0;
    private DcMotor Backleft,Backright;

    public void runOpMode() {

        Backleft = hardwareMap.dcMotor.get("Backleft");
        Backright = hardwareMap.dcMotor.get("Backright");

        waitForStart();

        start = System.currentTimeMillis();

        while (opModeIsActive() && System.currentTimeMillis() - start <500) {

            Backleft.setPower(1);
            Backright.setPower(1);

        }
        Backleft.setPower(0);
        Backright.setPower(0);



        while (opModeIsActive() && System.currentTimeMillis() - start < 950) {
            Backleft.setPower(-1);
            Backright.setPower(1);
        }

        Backleft.setPower(0);
        Backright.setPower(0);


        while (opModeIsActive() && System.currentTimeMillis() - start <3200) {
            Backleft.setPower(1);
            Backright.setPower(1);
        }
        Backleft.setPower(0);
        Backright.setPower(0);

        // Here will go the outtake of team marker

        while (opModeIsActive() && System.currentTimeMillis()- start < 4000) {
            Backleft.setPower(-1);
            Backright.setPower(-1);
        }
        Backright.setPower(0);
        Backleft.setPower(0);

    }


}
