package week8homework;

import java.util.Scanner;

/* 3. Write a Java program that takes the user to provide a single character from the
alphabet. Print Vowel of Consonant, depending on the user input. If the user input
Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
error message.
For eg:
Input an alphabet: p
Expected Output:
Input letter is Consonant
 */
public class VowelOrConsonant3 {

    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner s = new Scanner(System.in);
        // User to enter single character
        System.out.println("Please enter an alphabet : ");
        String letter = s.next().toLowerCase();

        s.close();
        // check if the input is a single letter
        if (letter.length() != 1) {
            System.out.println("Input must be a single character.");
        } else {
            char ch = letter.charAt(0);
            // check if the input is a letter
            if (!Character.isLetter(ch) || letter.length() > 1) {
                System.out.println("Input must be a letter. ");

            } else {
                // convert the input to lowercase
                ch = Character.toLowerCase(ch);
                // check if the input is a vowel or a consonant
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println(ch + " is a Vowel. ");
                } else {
                    System.out.println(ch + " is a Consonant ");
                }
            }
        }
    }
}



