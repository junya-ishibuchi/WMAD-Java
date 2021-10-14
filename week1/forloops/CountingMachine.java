package week1.forloops;

import java.util.Scanner;

public class CountingMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Count to: ");
        int end = scanner.nextInt();

        int count = 0;
        while (count <= end) {
            System.out.print(count++ + " ");
        }
    }
}
