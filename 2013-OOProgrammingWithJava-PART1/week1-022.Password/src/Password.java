
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot";
        while (true) {
            System.out.println("Type the password: ");
            String t = reader.nextLine();
            if (t.equals(password)) {
                System.out.println("Right!");
                break;
            } else {
                System.out.println("Wrong!");
                
            }
        }
        System.out.println("The secret is : " + "jryy qbar!");

        // Write your code here
    }
}
