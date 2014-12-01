import java.util.Scanner;



public class Palindromi {
    public static String reverse(String text) {
        String reverse = "";
        int t = text.length();
        while(t > 0){
            t--;
            reverse += text.charAt(t);
        }
        return reverse;
    }

    public static boolean palindrome(String text) {
        if( reverse(text).equals(text)){
            return true;
        }
        // write code here
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
