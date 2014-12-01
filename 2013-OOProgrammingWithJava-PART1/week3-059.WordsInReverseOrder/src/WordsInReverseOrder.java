import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        System.out.println("Type a word:");
        String t = reader.nextLine();
        while(!t.equals("")){
            System.out.println("Type a word:");
            words.add(t);
            t = reader.nextLine();
        }
        
        System.out.println("You typed the following words: ");
        Collections.reverse(words);
        for(String s : words) {
            System.out.println(s);
        }
        // create here an ArrayList
    }
}
