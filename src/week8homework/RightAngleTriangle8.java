package week8homework;

import java.util.Scanner;

/* 8. Display right angle triangle of @ using nested for loops
@
@@
@@@
@@@@
@@@@@

 */
public class RightAngleTriangle8 {
    public static void main(String[] args) {
        // Create Scanner object for reading input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        // outer loop for rows
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {// inner loop for columns
                System.out.print("@");
            }
            System.out.println(" ");
        }
        scanner.close();// close the scanner object
    }

}
