import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        int guesses = 0;
        String let1 = "a";
        String let2 = "a";
        String let3 = "a";
        String let4 = "a";
        String let5 = "a";

        Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Wordle, type start to start!");
        String input = in.nextLine();

        if (input.equals("start")) {
            num1 = random.nextInt(26) + 1;
            num2 = random.nextInt(26) + 1;
            num3 = random.nextInt(26) + 1;
            num4 = random.nextInt(26) + 1;
            num5 = random.nextInt(26) + 1;
        }

        if (num1 == 1) {
            let1 = "a";
        }
        if (num1 == 2) {
            let1 = "b";
        }
        if (num1 == 3) {
            let1 = "c";
        }
        if (num1 == 4) {
            let1 = "d";
        }
        if (num1 == 5) {
            let1 = "e";
        }
        if (num1 == 6) {
            let1 = "f";
        }
        if (num1 == 7) {
            let1 = "g";
        }
        if (num1 == 8) {
            let1 = "h";
        }
        if (num1 == 9) {
            let1 = "i";
        }
        if (num1 == 10) {
            let1 = "j";
        }
        if (num1 == 11) {
            let1 = "k";
        }
        if (num1 == 12) {
            let1 = "l";
        }
        if (num1 == 13) {
            let1 = "m";
        }
        if (num1 == 14) {
            let1 = "n";
        }
        if (num1 == 15) {
            let1 = "o";
        }
        if (num1 == 16) {
            let1 = "p";
        }
        if (num1 == 17) {
            let1 = "q";
        }
        if (num1 == 18) {
            let1 = "r";
        }
        if (num1 == 19) {
            let1 = "s";
        }
        if (num1 == 20) {
            let1 = "t";
        }
        if (num1 == 21) {
            let1 = "u";
        }
        if (num1 == 22) {
            let1 = "v";
        }
        if (num1 == 23) {
            let1 = "w";
        }
        if (num1 == 24) {
            let1 = "x";
        }
        if (num1 == 25) {
            let1 = "y";
        }
        if (num1 == 26) {
            let1 = "z";
        }

        if (num2 == 1) {
            let2 = "a";
        }
        if (num2 == 2) {
            let2 = "b";
        }
        if (num2 == 3) {
            let2 = "c";
        }
        if (num2 == 4) {
            let2 = "d";
        }
        if (num2 == 5) {
            let2 = "e";
        }
        if (num2 == 6) {
            let2 = "f";
        }
        if (num2 == 7) {
            let2 = "g";
        }
        if (num2 == 8) {
            let2 = "h";
        }
        if (num2 == 9) {
            let2 = "i";
        }
        if (num2 == 10) {
            let2 = "j";
        }
        if (num2 == 11) {
            let2 = "k";
        }
        if (num2 == 12) {
            let2 = "l";
        }
        if (num2 == 13) {
            let2 = "m";
        }
        if (num2 == 14) {
            let2 = "n";
        }
        if (num2 == 15) {
            let2 = "o";
        }
        if (num2 == 16) {
            let2 = "p";
        }
        if (num2 == 17) {
            let2 = "q";
        }
        if (num2 == 18) {
            let2 = "r";
        }
        if (num2 == 19) {
            let2 = "s";
        }
        if (num2 == 20) {
            let2 = "t";
        }
        if (num2 == 21) {
            let2 = "u";
        }
        if (num2 == 22) {
            let2 = "v";
        }
        if (num2 == 23) {
            let2 = "w";
        }
        if (num2 == 24) {
            let2 = "x";
        }
        if (num2 == 25) {
            let2 = "y";
        }
        if (num2 == 26) {
            let2 = "z";
        }

        if (num3 == 1) {
            let3 = "a";
        }
        if (num3 == 2) {
            let3 = "b";
        }
        if (num3 == 3) {
            let3 = "c";
        }
        if (num3 == 4) {
            let3 = "d";
        }
        if (num3 == 5) {
            let3 = "e";
        }
        if (num3 == 6) {
            let3 = "f";
        }
        if (num3 == 7) {
            let3 = "g";
        }
        if (num3 == 8) {
            let3 = "h";
        }
        if (num3 == 9) {
            let3 = "i";
        }
        if (num3 == 10) {
            let3 = "j";
        }
        if (num3 == 11) {
            let3 = "k";
        }
        if (num3 == 12) {
            let3 = "l";
        }
        if (num3 == 13) {
            let3 = "m";
        }
        if (num3 == 14) {
            let3 = "n";
        }
        if (num3 == 15) {
            let3 = "o";
        }
        if (num3 == 16) {
            let3 = "p";
        }
        if (num3 == 17) {
            let3 = "q";
        }
        if (num3 == 18) {
            let3 = "r";
        }
        if (num3 == 19) {
            let3 = "s";
        }
        if (num3 == 20) {
            let3 = "t";
        }
        if (num3 == 21) {
            let3 = "u";
        }
        if (num3 == 22) {
            let3 = "v";
        }
        if (num3 == 23) {
            let3 = "w";
        }
        if (num3 == 24) {
            let3 = "x";
        }
        if (num3 == 25) {
            let3 = "y";
        }
        if (num3 == 26) {
            let3 = "z";
        }

        if (num4 == 1) {
            let4 = "a";
        }
        if (num4 == 2) {
            let4 = "b";
        }
        if (num4 == 3) {
            let4 = "c";
        }
        if (num4 == 4) {
            let4 = "d";
        }
        if (num4 == 5) {
            let4 = "e";
        }
        if (num4 == 6) {
            let4 = "f";
        }
        if (num4 == 7) {
            let4 = "g";
        }
        if (num4 == 8) {
            let4 = "h";
        }
        if (num4 == 9) {
            let4 = "i";
        }
        if (num4 == 10) {
            let4 = "j";
        }
        if (num4 == 11) {
            let4 = "k";
        }
        if (num4 == 12) {
            let4 = "l";
        }
        if (num4 == 13) {
            let4 = "m";
        }
        if (num4 == 14) {
            let4 = "n";
        }
        if (num4 == 15) {
            let4 = "o";
        }
        if (num4 == 16) {
            let4 = "p";
        }
        if (num4 == 17) {
            let4 = "q";
        }
        if (num4 == 18) {
            let4 = "r";
        }
        if (num4 == 19) {
            let4 = "s";
        }
        if (num4 == 20) {
            let4 = "t";
        }
        if (num4 == 21) {
            let4 = "u";
        }
        if (num4 == 22) {
            let4 = "v";
        }
        if (num4 == 23) {
            let4 = "w";
        }
        if (num4 == 24) {
            let4 = "x";
        }
        if (num4 == 25) {
            let4 = "y";
        }
        if (num4 == 26) {
            let4 = "z";
        }

        if (num5 == 1) {
            let5 = "a";
        }
        if (num5 == 2) {
            let5 = "b";
        }
        if (num5 == 3) {
            let5 = "c";
        }
        if (num5 == 4) {
            let5 = "d";
        }
        if (num5 == 5) {
            let5 = "e";
        }
        if (num5 == 6) {
            let5 = "f";
        }
        if (num5 == 7) {
            let5 = "g";
        }
        if (num5 == 8) {
            let5 = "h";
        }
        if (num5 == 9) {
            let5 = "i";
        }
        if (num5 == 10) {
            let5 = "j";
        }
        if (num5 == 11) {
            let5 = "k";
        }
        if (num5 == 12) {
            let5 = "l";
        }
        if (num5 == 13) {
            let5 = "m";
        }
        if (num5 == 14) {
            let5 = "n";
        }
        if (num5 == 15) {
            let5 = "o";
        }
        if (num5 == 16) {
            let5 = "p";
        }
        if (num5 == 17) {
            let5 = "q";
        }
        if (num5 == 18) {
            let5 = "r";
        }
        if (num5 == 19) {
            let5 = "s";
        }
        if (num5 == 20) {
            let5 = "t";
        }
        if (num5 == 21) {
            let5 = "u";
        }
        if (num5 == 22) {
            let5 = "v";
        }
        if (num5 == 23) {
            let5 = "w";
        }
        if (num5 == 24) {
            let5 = "x";
        }
        if (num5 == 25) {
            let5 = "y";
        }
        if (num5 == 26) {
            let5 = "z";
        }

        String word = let1 + let2 + let3 + let4 + let5;
        System.out.println("The word has been chosen, you may guess now.");
        while(!input.equals(word)) {
            input = in.nextLine();
            guesses = guesses + 1;
            if (input.equals(word)) {
                System.out.println("You guessed the word in " + guesses + "!");
            } else {
                System.out.println("You guess was wrong, Guess again.");
                System.out.println("Guesses: " + guesses);
            }
        }
    }
}