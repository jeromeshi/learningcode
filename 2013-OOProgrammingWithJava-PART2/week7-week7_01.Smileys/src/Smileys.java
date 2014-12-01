
import java.util.Scanner;


public class Smileys {
    
    
    private static void printWithSmileys(String characterString) {
        String t = characterString;
        if(t.length()%2 != 0) {
            t = t + " ";
        }
        int count = t.length()/2 + 3;
        printSmile(count);
        System.out.println(":) " + t + " :)");
        printSmile(count);
       
    }
    
    private static void printSmile(int t){
        while(t > 0) {
            System.out.print(":)");
            t--;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        // Test your method at least with the following
         printWithSmileys("Method");
         printWithSmileys("Beerbottle");
         printWithSmileys("Interface");
    }

}
