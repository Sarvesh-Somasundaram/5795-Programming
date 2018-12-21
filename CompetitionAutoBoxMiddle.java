package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.sun.source.tree.WhileLoopTree;


@Autonomous

public class CompetitionAutoBoxMiddle extends LinearOpMode {

    long start = 0;
    private DcMotor Backleft,Backright, IntakeArm;

    public void runOpMode() {

        Backleft = hardwareMap.dcMotor.get("Backleft");
        Backright = hardwareMap.dcMotor.get("Backright");
        IntakeArm = hardwareMap.dcMotor.get("Arm");

        Backright.setDirection(DcMotorSimple.Direction.REVERSE);

        waitForStart();

        start = System.currentTimeMillis();


        while (opModeIsActive() && System.currentTimeMillis() - start <1000) {

            Backleft.setPower(0.5);
            Backright.setPower(0.5);

        }
        Backleft.setPower(0);
        Backright.setPower(0);

        while (opModeIsActive() && System.currentTimeMillis() - start <500) {
            IntakeArm.setPower(0.5);
        }

        IntakeArm.setPower(0);

        while (opModeIsActive() && System.currentTimeMillis() - start< 500) {
            Backleft.setPower(-0.75);
            Backright.setPower(-0.75);
        }
        Backleft.setPower(0);
        Backright.setPower(0);


    }

}