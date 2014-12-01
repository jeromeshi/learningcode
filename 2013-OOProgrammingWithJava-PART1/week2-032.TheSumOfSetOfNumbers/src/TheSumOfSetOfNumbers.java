
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Until what? ");
        int end = Integer.parseInt(reader.nextLine());
        int start = 1;
        int result = 0;
        while (start <= end) {
            result += start;
            start ++;
        }
        System.out.println("Sum is " + result);
        
        

    }
}
