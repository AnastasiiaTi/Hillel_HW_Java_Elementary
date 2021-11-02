package Lessons.homework_5.vehicle;

import Lessons.homework_5.details.Engine;
import Lessons.homework_5.professions.Driver;

public class car {
        private String autoMark;
        private String autoClass;
        private int autoWeight;

       // Driver driver1 = new Driver();
        Engine engineOfTheCar = new Engine();

        public static void start() {
            System.out.println("Поехали");
        }

        public static void stop() {
            System.out.println("Останавливаемся");
        }

        public static void turnRight() {
            System.out.println("Поворот направо");
        }

        public static void turnLeft() {
            System.out.println("Поворот налево");
        }

    @Override
    public String toString() {
        return "car{" +
                "autoMark='" + autoMark + '\'' +
                ", autoClass='" + autoClass + '\'' +
                ", autoWeight=" + autoWeight +
               // ", driver1=" + driver1 +
                ", engineOfTheCar=" + engineOfTheCar +
                '}';
    }
}
