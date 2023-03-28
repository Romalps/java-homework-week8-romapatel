package week8homework;

import java.util.Scanner;

/*  10. Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153
 */
public class ArmstrongNumber10 {

    public static void main(String[] args) {
        // Create a scanner object for reading input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = scanner.nextInt();

        int numberOfDigits = String.valueOf(number).length();

        int sum = 0;
        int temp = number;
        while (temp>0){// loop execute until the condition becomes false
            int digit = temp % 10;
            sum= (int) (sum + Math.pow(digit,numberOfDigits));
            temp= temp /10;

        }
    if(number == sum){// if condition is true then print the message
        System.out.println(number + " is an Armstrong number.");

            }
    else {// if condition is false then print this message
        System.out.println(number + " is not an Armstrong number.");
    }
    scanner.close();// closing scanner object
    }
}
