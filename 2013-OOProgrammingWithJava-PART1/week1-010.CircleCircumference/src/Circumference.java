
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the radius: ");
        int r;
        r = Integer.parseInt(reader.nextLine());
        double result = 2 * Math.PI * r ;
        System.out.println("Circumference of the circle: " + result);

        // Program your solution here 
    }
}
