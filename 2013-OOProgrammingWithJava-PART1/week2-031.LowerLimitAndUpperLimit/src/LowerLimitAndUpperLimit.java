
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("first: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int last = Integer.parseInt(reader.nextLine());
        
        if (first > last) {
            return;
        } else if(first == last) {
            System.out.println("First = Last = " + last);           
            
        } else {  
            while (first <= last) {
            System.out.println(first);
            first++;
        }   
                
        }
        

        // write your code here

    }
}
