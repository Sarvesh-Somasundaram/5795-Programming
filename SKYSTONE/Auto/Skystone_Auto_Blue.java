package org.firstinspires.ftc.teamcode.Competition.Skystone_autos;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.Competition.Detect;
import org.openftc.easyopencv.OpenCvCameraFactory;
import org.openftc.easyopencv.OpenCvCameraRotation;
import org.openftc.easyopencv.OpenCvInternalCamera;

@Autonomous(name = "Blue_Auto")
public class Skystone_Auto_Blue extends LinearOpMode {

    private OpenCvInternalCamera Camera;
    private Detect detector = new Detect();
    private String position;


    public void runOpMode(){

        int cameraMonitorViewId = hardwareMap.appContext.getResources().getIdentifier("cameraMonitorViewId", "id", hardwareMap.appContext.getPackageName());
        Camera = OpenCvCameraFactory.getInstance().createInternalCamera(OpenCvInternalCamera.CameraDirection.BACK, cameraMonitorViewId);
        Camera.openCameraDevice();
        Camera.setPipeline(detector);
        //change dims
        Camera.startStreaming(320, 240, OpenCvCameraRotation.UPSIDE_DOWN);

        while (!isStarted()) {
            position = detector.position;
            telemetry.addData("position", position);
        }

        //start

        if (position.equals("LEFT")) {
            // left code
        }
    }

}
