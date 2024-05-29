package soliannagabriel;
import java.awt.Color;

import robocode.HitWallEvent;
import robocode.Robot;
import robocode.ScannedRobotEvent;

// Sources I referenced for help!
// https://stackoverflow.com/questions/9727485/need-help-to-make-a-good-robocode-robot
// 

public class SoliannaGabriel extends Robot{
    
    public void run(){
        // two sections

        // first, setup
        // handle spawn randomness (write codes that get you to a known postion, corner, etc)
        setBodyColor(Color.red);
        while(true){
            //this code will run forever until you die
            ahead(300);
            turnRight(360);
        
        }
    }

    public void onScannedRobot(ScannedRobotEvent e){
        //this code will run when we see a robot on our radar
        fire(2);
    }
    public void onHitWall(HitWallEvent e){
        System.out.println("I hit a wall!");
        ahead(1000);
        turnLeft(90);
    

    }
}
 