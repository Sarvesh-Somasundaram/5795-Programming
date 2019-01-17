package org.firstinspires.ftc.teamcode.Outreach;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class K9 extends OpMode {

    DcMotor Jaydensbackmotorleft, Jaydensbackmotorright;
    Servo Jaydensclaw, Jaydensarm;



    public void init() {
        Jaydensbackmotorleft = hardwareMap.dcMotor.get("JaydensleftMotor");
        Jaydensbackmotorright = hardwareMap.dcMotor.get("JaydensrightMotor");

        Jaydensbackmotorleft.setDirection(DcMotorSimple.Direction.REVERSE);

        Jaydensclaw = hardwareMap.servo.get("JaydensClaw");
        Jaydensarm = hardwareMap.servo.get("JaydensArm");
    }

    public void loop() {
        Jaydensbackmotorleft.setPower(gamepad1.left_stick_y);
        Jaydensbackmotorright.setPower(gamepad1.right_stick_y);


        //Jayden, if the servos don't work then change the values inside of the setPosition function
        //the value is from 0 to 180 degrees and its measured in decimals so 0.5 is 90 degrees.

        if (gamepad1.dpad_up) {
            Jaydensarm.setPosition(0.5);
        }

        else if (gamepad1.dpad_down) {
            Jaydensarm.setPosition(0);
        }

        if (gamepad1.dpad_left) {
            Jaydensclaw.setPosition(0.7);
        }

        else if (gamepad1.dpad_right) {
            Jaydensclaw.setPosition(0);
        }

    }

}
