import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int t = Integer.parseInt(reader.nextLine());
        int result = 1;
        if ( t == 0) {
            System.out.println("Factorial is 1");
        } else {
            while (t > 0) {
                result *= t;
                t--;
            }
        }
        System.out.println("Factorial is " + result);

    }
}
