
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        String reverse = "";
        int t = text.length();
        while(t > 0){
            t--;
            reverse += text.charAt(t);
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
