package Lessons.homework_7;

public class Cat implements Participant {

    @Override
    public int getJumpAbility() {
        return 10;
    }

    @Override
    public int getRunAbility() {
        return 31;
    }

    @Override
    public void run() {
        System.out.println("I am cat and I can run");
    }

    @Override
    public void jump() {
        System.out.println("I am cat and I can jump");
    }

    @Override
    public String toString() {
        return "Cat";
    }
}
