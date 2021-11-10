package Lessons.homework_10;

public class main {
    public static void main(String[] args) {
        ArrayValueCalculator calculator = new ArrayValueCalculator();

        String[][] brokenMatrix1 = {};

        System.out.println("Try one!");
        tryArray(calculator, new String[][]{});

        System.out.println("Try two!");
        tryArray(calculator, new String[][]{{"123", "2"}});

        System.out.println("Try three!");
        tryArray(calculator, new String[][]{
                {"1", "2", "3", "4"},
                {"1", "2", "3", "A"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
        });

        System.out.println("Try four!");
        tryArray(calculator, new String[][]{
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
        });
    }

    static int tryArray(ArrayValueCalculator calculator, String[][] values) {
        try {
            return calculator.doCalc(values);
        } catch (MyArraySizeException ex) {
            ex.printStackTrace();
            System.out.println("Matrix has incorrect size. Please check it");
        } catch (MyArrayDataException ex) {
            ex.printStackTrace();
            System.out.println("Matrix has broken values. Please check it");
        }
        return 0;
    }

}
