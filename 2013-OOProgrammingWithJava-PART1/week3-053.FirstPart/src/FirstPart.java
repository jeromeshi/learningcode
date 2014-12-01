
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String s = reader.nextLine();
        System.out.println("Length of the first part: ");
        int t =Integer.parseInt(reader.nextLine());
        System.out.println("Result: " + s.substring(0,t));
    }
}
