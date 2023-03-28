package week8homework;

import java.util.Scanner;

/* 14. Write a program in Java to display the pattern like a diamond.
While loop
           *
          ***
         *****
        *******
       *********
      ***********
     *************
      ***********
       *********
        *******
         *****
          ***
           *
  */
public class DiamondPattern14 {

    public static void main(String[] args) {

        //Create scanner object for reading input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers of rows : ");

        int rows = sc.nextInt();
        int i = 1, j;
        // print first half triangle
        while (i <= rows) {
            j = 1;
            while (j <= (rows - i)) {
                System.out.print(" ");
                j++;
            }
            j = 1;
            while (j <= (2 * i - 1)) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
// this will print upside down half triangle
        i = rows - 1;
        while (i >= 1) {
            j = 1;
            while (j <= (rows - i)) {
                System.out.print(" ");
                j++;
            }
            j = 1;
            while (j <= (2 * i - 1)) {

                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }

        sc.close();//close object
    }
}
