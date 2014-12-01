
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number:");
        int number1 = Integer.parseInt(reader.nextLine());
        System.out.println("Tyep another number:");
        int number2 = Integer.parseInt(reader.nextLine());
        double result = (double)number1 / number2;
        System.out.println("Division: " + number1 +  " / " + number2 + " = " +  result);

        // Implement your program here. Remember to ask the input from user.
    }
}
