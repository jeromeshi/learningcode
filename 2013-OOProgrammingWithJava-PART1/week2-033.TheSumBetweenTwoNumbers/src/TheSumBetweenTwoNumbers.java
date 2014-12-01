
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int first = Integer.parseInt(reader.nextLine());
        int last = Integer.parseInt(reader.nextLine());
        System.out.println("First: " + first);
        System.out.println("Last: " + last);
        int result = 0;
        int i = 0;
        while (first <= last) {
            result += first;
            first += 1;
        }
        System.out.println("The sum is " + result);
    }
        
        
   
}
