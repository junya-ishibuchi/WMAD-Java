package week2.arrays;

import java.util.Random;

public class CopyingArrays {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array1 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(100);
        }

        int[] array2 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }

        array1[array1.length - 1] = -7;

        StringBuilder string1 = new StringBuilder("Array 1:");
        StringBuilder string2 = new StringBuilder("Array 2:");
        for (int i = 0; i < array1.length; i++) {
            string1.append(" ").append(array1[i]);
            string2.append(" ").append(array2[i]);
        }

        System.out.println(string1);
        System.out.println(string2);
    }
}
