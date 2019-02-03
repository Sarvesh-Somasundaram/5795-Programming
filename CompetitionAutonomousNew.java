package org.firstinspires.ftc.teamcode.Competition;

import android.hardware.Sensor;
import android.os.storage.StorageManager;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by Sarvesh on 1/24/2019.
 */
@Autonomous (name = "Auto with hanging", group = "Competition")
public class CompetitionAutonomousNew extends LinearOpMode {

    private DcMotor Backleft, Backright, Frontleft, Frontright, Leftslide, Rightslide, Woosh, Intakewheel;
    private Servo Intakeleft, Intakeright;
    private SensorREVColorDistance Color;



    public void runOpMode() {

        Backleft = hardwareMap.dcMotor.get("Backleft");
        Backleft.setDirection(DcMotorSimple.Direction.REVERSE);
        Backright = hardwareMap.dcMotor.get("Backright");
        Backright.setDirection(DcMotorSimple.Direction.FORWARD);
        Frontleft = hardwareMap.dcMotor.get("Frontleft");
        Frontleft.setDirection(DcMotorSimple.Direction.REVERSE);
        Frontright = hardwareMap.dcMotor.get("Frontright");
        Frontright.setDirection(DcMotorSimple.Direction.FORWARD);
        Leftslide = hardwareMap.dcMotor.get("Leftslide");
        Rightslide = hardwareMap.dcMotor.get("Rightslide");
        Rightslide.setDirection(DcMotorSimple.Direction.REVERSE);
        Woosh = hardwareMap.dcMotor.get("Woosh");
        Intakewheel = hardwareMap.dcMotor.get("Intakewheel");
        Intakeleft = hardwareMap.servo.get("Intakeleft");
        Intakeright = hardwareMap.servo.get("Intakeright");

        Woosh.setDirection(DcMotorSimple.Direction.REVERSE);




        Rightslide.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        Leftslide.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        Backleft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        Backright.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        Frontleft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        Frontright.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        Backleft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        Backright.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        Frontleft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        Frontright.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        Rightslide.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        Leftslide.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        Woosh.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        Backleft.setPower(0);
        Backright.setPower(0);
        Frontleft.setPower(0);
        Frontright.setPower(0);
        Leftslide.setPower(0);
        Rightslide.setPower(0);
        Intakewheel.setPower(0);

        Intakeright.setPosition(01);


        waitForStart();


        while (opModeIsActive()) {

            Woosh.setTargetPosition(25310);
            Woosh.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            Woosh.setPower(1);

        }
        Woosh.setPower(0);

        sleep(100);

        //while (opModeIsActive()) {

          //  Backleft.setTargetPosition(538);
          //  Backleft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            //Backleft.setPower(0.5);



            //Backright.setTargetPosition(538);
            //Backright.setPower(-0.5);
            //Backright.setMode(DcMotor.RunMode.RUN_TO_POSITION);


            //Frontright.setTargetPosition(538);
            //Frontright.setPower(-0.5);
      //      Frontright.setMode(DcMotor.RunMode.RUN_TO_POSITION);



        //    Frontleft.setTargetPosition(538);
           // Frontleft.setPower(0.5);
         //   Frontleft.setMode(DcMotor.RunMode.RUN_TO_POSITION);


        //}

       // Frontleft.setPower(0);
    //    Frontleft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
      //  Frontleft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        //idle();

    //    Frontright.setPower(0);
        //Frontright.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
      //  Frontright.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        //idle();

  //      Backleft.setPower(0);
    //    Backleft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
      //  Backleft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        //idle();

  //      Backright.setPower(0);
//        Backright.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
      //  Backright.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    //    idle();

        //while (opModeIsActive()) {

   //         Woosh.setTargetPosition(0);
     //       Woosh.setPower(0.5);
       //     Woosh.setMode(DcMotor.RunMode.RUN_TO_POSITION);


         //   Backleft.setTargetPosition(950);
           // Backleft.setPower(0.6);
        //    Backleft.setMode(DcMotor.RunMode.RUN_TO_POSITION);


          //  Backright.setTargetPosition(942);
  //          Backright.setPower(0.5);
    //        Backright.setMode(DcMotor.RunMode.RUN_TO_POSITION);


      //      Frontleft.setTargetPosition(950);
        //    Frontleft.setPower(0.6);
          //  Frontleft.setMode(DcMotor.RunMode.RUN_TO_POSITION);


    //        Frontright.setTargetPosition(942);
        //    Frontright.setPower(0.5);
      //      Frontright.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        //}

        //Frontleft.setPower(0);
   //     Frontleft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
     //   Frontleft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
       // idle();

  //      Frontright.setPower(0);
    //    Frontright.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
      //  Frontright.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        //idle();

//        Backleft.setPower(0);
  //      Backleft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    //    Backleft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
      //  idle();

  //      Backright.setPower(0);
   //     Backright.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
   //     Backright.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
   //     idle();


        // goes backward at the same time the color sensor is used to locate the cube or sphere
     //   while (opModeIsActive()) {

       //     Backleft.setTargetPosition(1798);
         //   Backleft.setPower(-0.5);
           // Backleft.setMode(DcMotor.RunMode.RUN_TO_POSITION);


    //        Backright.setTargetPosition(1820);
      //      Backright.setPower(-0.5);
        //    Backright.setMode(DcMotor.RunMode.RUN_TO_POSITION);


          //  Frontleft.setTargetPosition(1798);
            //Frontleft.setPower(-0.5);
    //        Frontleft.setMode(DcMotor.RunMode.RUN_TO_POSITION);


      //      Frontright.setTargetPosition(1820);
        //    Frontright.setPower(-0.5);
          //  Frontright.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        //}

 //       Frontleft.setPower(0);
   //     Frontleft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
     //   Frontleft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
       // idle();

        //Frontright.setPower(0);
  //      Frontright.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    //    Frontright.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
      //  idle();
       // Backleft.setPower(0);
    //    Backleft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
       // Backleft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
     //   idle();

    //    Backright.setPower(0);
      //  Backright.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
       // Backright.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
      //  idle();

        // Turns right
        //while (opModeIsActive()) {

          //  Backleft.setTargetPosition(806);
            //Backleft.setPower(0.6);
  //          Backleft.setMode(DcMotor.RunMode.RUN_TO_POSITION);


    //        Backright.setTargetPosition(806);
      //      Backright.setPower(-0.6);
        //
        //    Backright.setMode(DcMotor.RunMode.RUN_TO_POSITION);

           // Frontleft.setTargetPosition(806);
//            Frontleft.setPower(0.6);
  //          Frontleft.setMode(DcMotor.RunMode.RUN_TO_POSITION);


//            Frontright.setTargetPosition(806);
  //          Frontright.setPower(-0.6);
    //        Frontright.setMode(DcMotor.RunMode.RUN_TO_POSITION);

      //  }

        //Frontleft.setPower(0);
      //  Frontleft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        //Frontleft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
      //  idle();

    //    Frontright.setPower(0);
        //Frontright.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
      //  Frontright.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
       // idle();

    //    Backleft.setPower(0);
      //  Backleft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        //Backleft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
     //   idle();

        //Backright.setPower(0);
       // Backright.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
       // Backright.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        //idle();

        // forward a little to prepare to outtake
       // while (opModeIsActive()) {

         //   Backleft.setTargetPosition(287);
           // Backleft.setPower(0.5);
           // Backleft.setMode(DcMotor.RunMode.RUN_TO_POSITION);


          //  Backright.setTargetPosition(287);
           // Backright.setPower(0.5);
           // Backright.setMode(DcMotor.RunMode.RUN_TO_POSITION);


           // Frontleft.setTargetPosition(287);
        //    Frontleft.setPower(0.5);
      //      Frontleft.setMode(DcMotor.RunMode.RUN_TO_POSITION);


          //  Frontright.setTargetPosition(287);
            //Frontright.setPower(0.5);
         //   Frontright.setMode(DcMotor.RunMode.RUN_TO_POSITION);


       // }

        //Frontleft.setPower(0);
        //Frontleft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        //Frontleft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        //idle();

   //     Frontright.setPower(0);
     //   Frontright.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
       // Frontright.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
       // idle();

    //    Backleft.setPower(0);
  //      Backleft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
      //  Backleft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        //idle();

   //     Backright.setPower(0);
     //   Backright.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
       // Backright.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
     //   idle();

        //Add outtake code here, first linearslides go up, then the servos go backward, then the servos go back to normal
        // and the slides go down

        // Drives into the crater
       // while (opModeIsActive()) {
//Set the target position to psrk the Robot to crater
           // Backleft.setTargetPosition(2150);
         //   Backleft.setPower(0.5);
       //     Backleft.setMode(DcMotor.RunMode.RUN_TO_POSITION);


            //Backright.setTargetPosition(2150);
        //    Backright.setPower(0.5);
          //  Backright.setMode(DcMotor.RunMode.RUN_TO_POSITION);


         //   Frontleft.setTargetPosition(2150);
           // Frontleft.setPower(0.5);
          //  Frontleft.setMode(DcMotor.RunMode.RUN_TO_POSITION);


    //        Frontright.setTargetPosition(2150);
  //          Frontright.setPower(0.5);
//            Frontright.setMode(DcMotor.RunMode.RUN_TO_POSITION);


        //}

       // Frontleft.setPower(0);
        //Frontleft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
      //  Frontleft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
     //   idle();

       // Frontright.setPower(0);
      //  Frontright.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
      //  Frontright.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
     //   idle();

       // Backleft.setPower(0);
     //   Backleft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
       // Backleft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
       // idle();

      //  Backright.setPower(0);
       // Backright.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    //    Backright.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
      //  idle();

    }


}