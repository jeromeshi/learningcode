
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Up to what number? ");
        int end = Integer.parseInt(reader.nextLine());
        int i = 1;
        while (i <= end) {
            System.out.println(i);
            i++;
        }
        
        // Write your code here
        
    }
}
