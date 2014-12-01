
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String t = reader.nextLine();
        int i = 0;
        while ( i < t.length()){
            System.out.println((i + 1) +  ". character: " + t.charAt(i));
            i++;
        }
    }
}
