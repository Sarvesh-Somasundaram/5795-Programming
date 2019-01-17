package org.firstinspires.ftc.teamcode.Outreach;


import com.qualcomm.hardware.rev.Rev2mDistanceSensor;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp
public class Xbot extends OpMode {

    private DcMotor Bl, Br, Fl, Fr;


    public void init(){

        Bl = hardwareMap.dcMotor.get("Bl");
        Br = hardwareMap.dcMotor.get("Br");
        Fl = hardwareMap.dcMotor.get("Fl");
        Fr = hardwareMap.dcMotor.get("Fr");

        //if something goes wrong try uncommenting the next four lines to un comment just remove the backslashes

       // Bl.setDirection(DcMotorSimple.Direction.REVERSE);
        //Fl.setDirection(DcMotorSimple.Direction.REVERSE);

    }


    public void loop() {

        Fl.setPower(-gamepad1.left_stick_y - gamepad1.left_stick_x - gamepad1.right_stick_x);
        Fr.setPower(gamepad1.left_stick_y - gamepad1.left_stick_x - gamepad1.right_stick_x);
        Br.setPower(gamepad1.left_stick_y + gamepad1.left_stick_x - gamepad1.right_stick_x);
        Bl.setPower(-gamepad1.left_stick_y + gamepad1.left_stick_x - gamepad1.right_stick_x);
    }
}


