package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class Xbot extends OpMode {

    private DcMotor Bl, Br, Fl, Fr;


    public void init(){

        Bl = hardwareMap.dcMotor.get("Bl");
        Br = hardwareMap.dcMotor.get("Br");
        Fl = hardwareMap.dcMotor.get("Fl");
        Fr = hardwareMap.dcMotor.get("Fr");


    }


    public void loop() {

        Fl.setPower(-gamepad1.left_stick_y - gamepad1.left_stick_x - gamepad1.right_stick_x);
        Fr.setPower(gamepad1.left_stick_y - gamepad1.left_stick_x - gamepad1.right_stick_x);
        Br.setPower(gamepad1.left_stick_y + gamepad1.left_stick_x - gamepad1.right_stick_x);
        Bl.setPower(-gamepad1.left_stick_y + gamepad1.left_stick_x - gamepad1.right_stick_x);
    }
}


