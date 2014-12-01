
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        int count = 0;
        while(true) {
            int t = Integer.parseInt(reader.nextLine());
            if (t == numberDrawn) {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }else if (t < numberDrawn) {
                count++;
                System.out.println("The number is greater, guesses made: " + count);
            }else {
                count++;
                System.out.println("The number is lesser, guesses made: " + count);
            }
        }
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
