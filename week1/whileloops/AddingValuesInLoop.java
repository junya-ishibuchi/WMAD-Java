package week1.whileloops;

import java.util.Scanner;

public class AddingValuesInLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("I will add up the numbers you give me.");
        System.out.print("Number: ");

        int number = scanner.nextInt();
        int total = 0;

        while (number != 0) {
            total += number;

            System.out.println("The total so far is " + total);
            System.out.print("Number: ");

            number = scanner.nextInt();
        }
        System.out.println();
        System.out.println("The total is " + total);
    }
}
