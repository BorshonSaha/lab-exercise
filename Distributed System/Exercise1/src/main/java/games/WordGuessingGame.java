package games;

import java.util.Scanner;

public class WordGuessingGame {
    public static void main(String[] args) {
        String word = "Distributed";
        boolean wordGuessed = false;
        int position = 0;

        Scanner scanner = new Scanner(System.in);

        while (!wordGuessed) {
            System.out.print("Please enter a character: ");
            char c = scanner.nextLine().charAt(0);

            if(Character.toLowerCase(c) == Character.toLowerCase(word.charAt(position))) {
                if(position == word.length() - 1) {
                    System.out.println("You guessed the word");
                    wordGuessed = true;
                } else {
                    System.out.println("That was correct");
                    position++;
                }
            } else {
                System.out.println("Ops, that was wrong");
            }
        }
    }
}
