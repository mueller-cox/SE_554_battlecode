package group10player;
import battlecode.common.*;

public class HQ extends Building{
    int numMiners = 0;
    int limitMiners = 1;

    public HQ(RobotController rc) throws GameActionException {
        super(rc);

    }
    
    @Override
    public void takeTurn() throws GameActionException{

        if(numMiners < limitMiners){
            for (Direction dir: Robot.directions){
                if(tryBuild(RobotType.MINER, dir)){
                    numMiners++;

                }
            }
        }

        if(numMiners >= limitMiners && rc.getTeamSoup() >= 300){
            for (Direction dir: Robot.directions){
                if(tryBuild(RobotType.MINER, dir)){
                    numMiners++;
                }
            }
        }
        System.out.println("Total amount of soup is: "+rc.getTeamSoup());
    }
}