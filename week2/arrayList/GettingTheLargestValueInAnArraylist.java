package week2.arrayList;

import java.util.ArrayList;
import java.util.Random;

public class GettingTheLargestValueInAnArraylist {
    public static void main(String[] args) {
        Random random = new Random();

        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            nums.add(random.nextInt(99) + 1);
        }
        System.out.println("ArrayList: " + nums);
        System.out.println();

        int maxIndex = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(maxIndex) < nums.get(i)) {
                maxIndex = i;
            }
        }

        System.out.println("The largest value is " + nums.get(maxIndex) + ", which is in slot " + maxIndex);
    }
}
