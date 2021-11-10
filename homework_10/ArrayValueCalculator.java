package Lessons.homework_10;

public class ArrayValueCalculator {

    public int doCalc(String[][] values) {
        checkArraySize(values);

        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                try {
                    sum += Integer.parseInt(values[i][j]);
                } catch (NumberFormatException ex) {
                    throw new MyArrayDataException(String.format("Array cell [%s][%s] does not contain parseable integer", i, j), ex);
                }
            }
        }
        System.out.println(sum);
        return sum;
    }

    private void checkArraySize(String[][] values) {
        checkArraySize(values.length);

        for (int i = 0; i < values.length; i++) {
            checkArraySize(values[i].length);
        }
    }

    private void checkArraySize(int length) {
        if (length != 4) {
            throw new MyArraySizeException("Incorrect size of array. Array must be 4X4");
        }
    }
}
