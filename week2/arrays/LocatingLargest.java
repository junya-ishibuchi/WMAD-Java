package week2.arrays;

import java.util.Random;

public class LocatingLargest {
    public static void main(String[] args) {
        Random random = new Random();

        int[] nums = new int[10];

        System.out.print("Array:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(99) + 1;
            System.out.print(" " + nums[i]);
        }
        System.out.println();
        System.out.println();

        int maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[maxIndex] < nums[i]) {
                maxIndex = i;
            }
        }

        System.out.println("The largest value is " + nums[maxIndex]);
        System.out.println("It is in slot " + maxIndex);
    }
}
