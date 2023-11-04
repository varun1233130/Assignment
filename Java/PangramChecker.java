package ARRAYOPERATION;

import java.util.Scanner;

public class PangramChecker {
    public static boolean isPangram(String sentence) {
        // Convert the sentence to lowercase for case-insensitive comparison
        sentence = sentence.toLowerCase();

        // Create a boolean array to mark the presence of each letter
        boolean[] lettersPresent = new boolean[26];

        // Iterate through the sentence to mark the presence of each letter
        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);
            if (Character.isLetter(currentChar)) {
                int index = currentChar - 'a';
                lettersPresent[index] = true;
            }
        }

        // Check if all the letters from 'a' to 'z' are present
        for (boolean letterPresent : lettersPresent) {
            if (!letterPresent) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
    	System.out.println("enter The Statement ");
    	Scanner sc=new Scanner(System.in);
    	String input	=sc.nextLine();
        if (isPangram(input)) {
            System.out.println("The sentence is a pangram!");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }
}

