import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String t = reader.nextLine();
        if (t.length() < 3){
            
        } else {
            System.out.println("1. character: " + t.charAt(0));
            System.out.println("2. character: " + t.charAt(1));
            System.out.println("3. character: " + t.charAt(2));
        }
       
           
    }
}
