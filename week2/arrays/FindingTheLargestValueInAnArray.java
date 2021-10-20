package week2.arrays;

import java.util.Random;

public class FindingTheLargestValueInAnArray {
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

        int max = 0;
        for (int num : nums) {
            if (max < num) {
                max = num;
            }
        }

        System.out.println("The largest value is " + max);
    }
}
