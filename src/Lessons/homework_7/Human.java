package Lessons.homework_7;

public class Human implements Participant {

    @Override
    public int getJumpAbility() {
        return 2;
    }

    @Override
    public int getRunAbility() {
        return 30;
    }

    @Override
    public void run() {
        System.out.println("I am human and I can run");
    }

    @Override
    public void jump() {
        System.out.println("I am human and I can jump");
    }

    @Override
    public String toString() {
        return "Human";
    }
}
