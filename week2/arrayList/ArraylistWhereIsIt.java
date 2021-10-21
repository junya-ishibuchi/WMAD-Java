package week2.arrayList;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArraylistWhereIsIt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            nums.add(random.nextInt(49) + 1);
        }
        System.out.println("ArrayList: " + nums);
        System.out.print("Value to find: ");
        int findValue = scanner.nextInt();
        System.out.println();

        boolean foundValue = false;
        for (int i = 0; i < nums.size(); i++) {
           if (findValue == nums.get(i)) {

               System.out.println(findValue + " is in slot " + i + ".");
               foundValue = true;
           }
        }
        if (!foundValue) {
            System.out.println(findValue + " is not in the ArrayList.");
        }
    }
}
