package Lessons.homework4_myEdition;

import java.util.ArrayList;

public class arraySort {

    public static void main(String[] args) {

        int[] arrayOfNum;
        arrayOfNum = fillArray();
        System.out.println();
        sortAnArray(arrayOfNum);

    }

    public static int[] fillArray() {
        int[] arrayOfNum = new int[10];

        for (int i = 0; i < arrayOfNum.length; i++) {
            arrayOfNum[i] = (int) (Math.random() * 10);
            System.out.println(arrayOfNum[i]);
        }
        return arrayOfNum;
    }

    public static void sortAnArray(int[] arrayToSort) {

        ArrayList oddNumbers = new ArrayList();
        ArrayList evenNumbers = new ArrayList();


        for (int i = 0; i < arrayToSort.length; i++) {
            if (arrayToSort[i] % 2 == 0) {
                evenNumbers.add(arrayToSort[i]);
            } else {
                oddNumbers.add(arrayToSort[i]);
            }
        }

        int[] finalArray = new int[arrayToSort.length];
        for (int i = 0; i < evenNumbers.size(); i++) {
            finalArray[i] = (int) evenNumbers.get(i);
        }

        int numberInOddList = 0;
        for (int i = evenNumbers.size(); i < arrayToSort.length; i++) {
            finalArray[i] = (int) oddNumbers.get(numberInOddList);
            numberInOddList++;
        }

        System.out.print("[ ");
        for (int i = 0; i < finalArray.length; i++) {
            System.out.print(finalArray[i] + " ");
        }
        System.out.println(" ]");
    }

}
