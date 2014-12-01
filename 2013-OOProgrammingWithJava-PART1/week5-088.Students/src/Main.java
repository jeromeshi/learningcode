
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);
        while(true){
            System.out.println("name: ");
            String t = reader.nextLine();
            if(!t.equals("")){
                System.out.println("studentnumber");
                String num = reader.nextLine();
                list.add(new Student(t, num));
                
            } else {
                break;
            }
            
        }
        for (Student t : list) {
            System.out.println(t);
        }
        
        System.out.println("Give search term: ");
        String t = reader.nextLine();
        System.out.println("Result: ");
        for ( Student s : list) {
           if( s.getName().contains(t)){
               System.out.println(s);
           }
        }
        // write here the main program
    }
}