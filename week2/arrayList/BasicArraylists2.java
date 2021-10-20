package week2.arrayList;

import java.util.ArrayList;
import java.util.Random;

public class BasicArraylists2 {
    public static void main(String[] args) {

        Random random = new Random();

        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            nums.add(random.nextInt(99) + 1);
        }
        System.out.println( "ArrayList: " + nums);
    }
}
