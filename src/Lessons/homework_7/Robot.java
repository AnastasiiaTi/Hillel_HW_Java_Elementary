package Lessons.homework_7;

public class Robot implements Participant {

    @Override
    public int getJumpAbility() {
        return 12;
    }

    @Override
    public int getRunAbility() {
        return 55;
    }

    @Override
    public void run() {
        System.out.println("I am robot and I can run");
    }

    @Override
    public void jump() {
        System.out.println("I am robot and I can jump");
    }

    @Override
    public String toString() {
        return "Robot";
    }
}
