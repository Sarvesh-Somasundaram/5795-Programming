package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;
import com.qualcomm.robotcore.hardware.DcMotorSimple;



@Autonomous
public class CompetitionAutonomousNew extends LinearOpMode {
    long start = 0;
    private DcMotor Backleft, Backright, Frontleft, Frontright;

    public void runOpMode(){

        Backleft = hardwareMap.dcMotor.get("Backleft");
        Backleft.setDirection(DcMotorSimple.Direction.REVERSE);
        Backright = hardwareMap.dcMotor.get("Backright");
        Backright.setDirection(DcMotorSimple.Direction.FORWARD);
        Frontleft = hardwareMap.dcMotor.get("Frontleft");
        Frontleft.setDirection(DcMotorSimple.Direction.REVERSE);
        Frontright = hardwareMap.dcMotor.get("Frontright");
        Frontright.setDirection(DcMotorSimple.Direction.FORWARD);

        Backleft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        Backright.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        Frontleft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        Frontright.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        Backleft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        Backright.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        Frontleft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        Frontright.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);




        waitForStart();

        start = System.currentTimeMillis();


        while (opModeIsActive() && System.currentTimeMillis() - start <1000) {

            Backleft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            Backright.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            Frontleft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            Frontright.setMode(DcMotor.RunMode.RUN_TO_POSITION);

            Frontright.setTargetPosition(5730);
            Frontleft.setTargetPosition(5730);
            Backleft.setTargetPosition(5730);
            Backright.setTargetPosition(5730);

            while(Frontleft.isBusy() && Frontright.isBusy() && Backleft.isBusy() && Backright.isBusy() && opModeIsActive()) {

                Frontright.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                Frontleft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                Backleft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                Backright.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                Frontleft.setPower(1);
                Frontright.setPower(1);
                Backleft.setPower(1);
                Backright.setPower(1);


                if (Frontleft.getCurrentPosition() > 5730);
                Frontleft.setPower(0);
                if (Frontright.getCurrentPosition() > 5730);
                Frontright.setPower(0);
                if (Backleft.getCurrentPosition() > 5730);
                Backleft.setPower(0);
                if (Backright.getCurrentPosition() > 5730);
                Backright.setPower(0);

            }

            Frontright.setPower(0);
            Frontleft.setPower(0);
            Backleft.setPower(0);
            Backright.setPower(0);
        }
    }


}
