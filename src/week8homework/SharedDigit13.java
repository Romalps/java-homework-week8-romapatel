package week8homework;

import java.util.Scanner;

/* 13. Shared Digit
Write a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
otherwise, the method should return false.
EXAMPLE INPUT/OUTPUT:
* hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
* hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
* hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
NOTE: The method hasSharedDigit should be defined as public static
 */
public class SharedDigit13 {

    public static boolean hasSharedDigit(int num1, int num2) {

        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {// check the range of 10 -99
            System.out.println("Number is not within the range of 10-99 ");
            return false;

        }
        while (num1 != 0) {

            int digit = num1 % 10;
            int temp = num2;
            while (temp!= 0){

                if(temp % 10 == digit){
                    System.out.println("the shared digit in both given number "+num1 + " and " + num2 +" is "+ digit);
                    return true;
                }
                temp= temp /10;

            }
            num1= num1 /10;

        }

        return false;
    }

    public static void main(String[] args) {

        //create scanner object for reading input from user
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a first number : ");
        int number1 = sc.nextInt();

        System.out.println("Enter a second number : ");
        int number2 = sc.nextInt();

        hasSharedDigit(number1,number2);
        sc.close();// close object

    }
}
