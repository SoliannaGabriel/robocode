package soliannagabriel;
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

        while(true){
            //this code will run forever until you die
            ahead(300);
            turnLeft(90);
            ahead(150);
            turnLeft(90);
        
        }
    }

    public void onScannedRobot(ScannedRobotEvent e){
        //this code will run when we see a robot on our radar
        fire(2);

    public void onHitWall(HitWallEvent e){
        turnLeft(90);
    }

    }
}
 