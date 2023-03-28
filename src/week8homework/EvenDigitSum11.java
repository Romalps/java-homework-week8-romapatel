package week8homework;
/*  11. Even Digit Sum
Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value.
EXAMPLE INPUT/OUTPUT:
* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
* getEvenDigitSum(-22); → should return -1 since the number is negative
NOTE: The method getEvenDigitSum should be defined as public static
 */

import java.util.Scanner;

public class EvenDigitSum11 {

    public static int getEvenDigitSum(int number) {
        int i, sum = 0;// declare the variables

        if (number > 0) {// check number is  a positive number
            for (i = 2; i <= number; i += 2) {
                sum = number*(number + 1);// calculating the numbers
            }
        }
        else {
            return -1;
        }
        System.out.println("The sum of the even digits from 1 to "+ number +" is : "+ sum);
return sum;
    }

    public static void main(String[] args) {

        // create a scanner object for reading input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int number = sc.nextInt();
        getEvenDigitSum(number);// calling static method
        sc.close();// close the object
    }


}
