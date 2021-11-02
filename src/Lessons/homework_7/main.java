package Lessons.homework_7;

public class main {

    public static void main(String[] args) {
        Participant[] participants = getParticipants();
        Obstacle[] obstacles = getObstacle();

        for (int i = 0; i < participants.length; i++) {
            for (int j = 0; j < getObstacle().length; j++) {
                obstacles[j].overcome(participants[i]);
            }
            System.out.println();
        }

        for (int i = 0; i < participants.length; i++) {
            completeAllObstacles(obstacles, participants[i]);
        }
    }

    static Participant[] getParticipants() {
        return new Participant[]{
                new Human(), new Cat(), new Robot()
        };
    }

    static Obstacle[] getObstacle() {
        return new Obstacle[]{
                new JumpingWall(), new RunningRoad()
        };
    }

    static void completeAllObstacles(Obstacle[] obstacles, Participant participant) {
        boolean result = true;
        int i = 0;
        while (result) {
            if (i >= obstacles.length) {
                break;
            }
            result = obstacles[i].compete(participant);
            i++;
        }
    }
}

