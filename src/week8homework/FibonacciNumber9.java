package week8homework;

import java.util.Scanner;

/* 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class FibonacciNumber9 {

    public static void main(String[] args) {
        // Create scanner object for reading the input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = scanner.nextInt();
        // first two number initialise
        int num1 = 0, num2 = 1;

        System.out.println("Fibonacci number : ");
        for (int i = 1; i <= number; i++) {
            System.out.print(num1 + " ");
            int sum = num1 + num2;// add the first two number
            num1 = num2;
            num2 = sum;
        }
    }
}


