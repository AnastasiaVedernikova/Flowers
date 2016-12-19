package builder;

/**
 * Created by cs.ucu.edu.ua on 19.12.2016.
 */
public interface RobotBuilder {

    public void buildRobotHead();

    public void buildRobotTorso();

    public void buildRobotArms();

    public void buildRobotLegs();

    public Robot getRobot();

}

