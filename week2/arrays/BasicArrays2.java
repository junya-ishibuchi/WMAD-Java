package week2.arrays;

import java.util.Random;

public class BasicArrays2 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(100);
            System.out.println("Slot " + i + " contains a " + nums[i]);
        }
    }
}
