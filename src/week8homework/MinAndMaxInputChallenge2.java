package week8homework;
/*  2. -Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered.
-Before the user enters the number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum
number.
Hint:
-Use an endless while loop.
-Create a class with the name MinAndMaxInputChallenge.
 */

import java.util.Scanner;

public class MinAndMaxInputChallenge2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean t = true;
        System.out.println("Enter any character to stop the program.");
        while (true) {

            System.out.println("Please enter number : ");
            boolean t1 = s.hasNextInt();
            if (t1) {
                int number = s.nextInt();
                if (t) {
                    t = false;
                    min = number;
                    max = number;
                }
                if (number < min) {
                    min = number;
                }

            if (number > max) {
                max = number;
            }

        } else{
            break;
        }
        s.nextLine();
    }
        s.close();
        System.out.println("The minimum number is :  "+min);
        System.out.println("The maximum number is : "+max);

}

}