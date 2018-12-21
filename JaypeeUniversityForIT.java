package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp
public class JaypeeUniversityForIT extends OpMode {
    private DcMotor Backleft, Backright, LinearSlide, IntakeArm;


    public void init() {
        Backleft = hardwareMap.dcMotor.get("Backleft");
        Backright = hardwareMap.dcMotor.get("Backright");
        LinearSlide = hardwareMap.dcMotor.get ("Linear");
        IntakeArm = hardwareMap.dcMotor.get ("Arm");

        Backleft.setDirection(DcMotorSimple.Direction.REVERSE
        );



    }


    public void loop() {

        Backleft.setPower(gamepad1.left_stick_y);
        Backright.setPower(gamepad1.right_stick_y);

        if (gamepad1.right_bumper){

            LinearSlide.setPower(1.0);

        }
        else if (gamepad1.left_bumper) {

            LinearSlide.setPower(-1.0);
        }
        else {

            LinearSlide.setPower(0);
        }

        if (gamepad1.a){

            IntakeArm.setPower(0.5);
        }
        else if (gamepad1.b){

            IntakeArm.setPower(-0.5);
        }
        else {

            IntakeArm.setPower(0);
        }
    }

}


