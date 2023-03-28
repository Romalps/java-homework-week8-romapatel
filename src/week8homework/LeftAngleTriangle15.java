package week8homework;

import java.util.Scanner;

/* 15. Display left angle triangle of * using nested for loops
               *
             * *
           * * *
         * * * *
       * * * * *
 */
public class LeftAngleTriangle15 {
    public static void main(String[] args) {


        //create scanner object for reading input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of rows: ");
        int rows = sc.nextInt();

        for(int i =1; i<=rows; i++){
            for (int j= 1; j<= rows-i; j++){

                System.out.print(" ");
            }
            for (int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        sc.close();// close the scanner object
    }
}
