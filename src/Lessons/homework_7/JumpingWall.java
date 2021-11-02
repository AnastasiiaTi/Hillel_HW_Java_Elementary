package Lessons.homework_7;

public class JumpingWall implements Obstacle {

    static int obstacleSize = 3;

    @Override
    public void overcome(Participant participant) {
        participant.jump();
        System.out.println(participant + " jumped over the wall.");
    }

    @Override
    public String toString() {
        return "JumpingWall";
    }

    public boolean compete(Participant participant) {
        if (participant.getJumpAbility() >= obstacleSize) {
            System.out.println(participant + " passed jumping obstacle at distance " + obstacleSize + ". Passed " + participant.getJumpAbility());
            return true;
        }
        System.out.println(participant + " did not pass jumping obstacle at distance " + obstacleSize);
        return false;
    }
}
