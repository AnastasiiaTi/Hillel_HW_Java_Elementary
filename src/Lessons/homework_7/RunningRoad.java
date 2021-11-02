package Lessons.homework_7;

public class RunningRoad implements Obstacle {

    static int obstacleSize = 12;

    @Override
    public void overcome(Participant participant) {
        participant.run();
        System.out.println(participant + " run the path.");
    }

    @Override
    public String toString() {
        return "RunningRoad";
    }

    public boolean compete(Participant participant) {
        if (participant.getRunAbility() >= obstacleSize) {
            System.out.println(participant + " passed running obstacle at distance " + obstacleSize + ". Passed " + participant.getRunAbility());
            return true;
        }
        System.out.println(participant + " did not pass running obstacle at distance " + obstacleSize);
        return false;
    }
}
