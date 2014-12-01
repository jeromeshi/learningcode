
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        System.out.println("Type a word:");
        String t = reader.nextLine();
        while( !words.contains(t)){
            System.out.println("Type a word:");
            words.add(t);
            t = reader.nextLine();
        }
        System.out.println("You gave the word "+ t + " twice");
        // create here the ArrayList 
        
    }
}
