package week2.arrays;

import java.util.Random;
import java.util.Scanner;

public class WhereIsIt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] nums = new int[10];

        System.out.print("Array:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(49) + 1;
            System.out.print(" " + nums[i]);
        }

        System.out.println();
        System.out.print("Value to find: ");
        int findValue = scanner.nextInt();
        boolean foundValue = false;
        System.out.println();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == findValue) {
                System.out.println(findValue + " is in slot " + i + ".");
                foundValue = true;
            }
        }
        if (!foundValue) {
            System.out.println(findValue + " is not in the array.");
        }
    }
}
