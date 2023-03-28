package week8homework;

import java.util.Scanner;

/* 6. Write a program in Java to display the pattern like a triangle with a number.
For eg.
Input number of rows: 10
Expected Output:
1
12
123
1234
12345
123456
1234567
12345678
123456789
12345678910
 */
public class TriangleWithNumber6 {

    public static void main(String[] args) {
        // create scanner object for input from user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numbers of rows : ");
        int row = scanner.nextInt();

        // outer loop for rows
        for (int i = 1; i <= row; i++) {
        //inner loop for columns
            for (int j = 1; j <= i; j++) {

                System.out.print(j);// print numbers

            }
            System.out.println(" ");// throws cursor in a new line after printing each line
        }
        scanner.close();
    }

}
