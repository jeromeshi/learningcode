import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        System.out.println("Type a word:");
        String t = reader.nextLine();
        while(!t.equals("")) {
            words.add(t);
            System.out.println("Type a word:"); 
            t = reader.nextLine();
        }
        
        System.out.println("You typed the following words:");
        for(String s : words){
            System.out.println(s);
        }
        
    }
}
