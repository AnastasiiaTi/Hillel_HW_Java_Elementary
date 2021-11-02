package Lessons.homework_4;

import java.util.ArrayList;

public class Sort_Array_By_Parity {

    public int[] sortArrayByParity(int[] nums) {

        ArrayList oddNumbers = new ArrayList();
        ArrayList evenNumbers = new ArrayList();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evenNumbers.add(nums[i]);
            } else {
                oddNumbers.add(nums[i]);
            }
        }

        int[] finalArray = new int[nums.length];
        for (int i = 0; i < evenNumbers.size(); i++) {
            finalArray[i] = (int) evenNumbers.get(i);
        }

        int numberInOddList = 0;
        for (int i = evenNumbers.size(); i < nums.length; i++) {
            finalArray[i] = (int) oddNumbers.get(numberInOddList);
            numberInOddList++;
        }

        System.out.print("[ ");
        for (int i = 0; i < finalArray.length; i++) {
            System.out.print(finalArray[i] + " ");
        }
        System.out.println("]");
        
        return finalArray;
    }
}
