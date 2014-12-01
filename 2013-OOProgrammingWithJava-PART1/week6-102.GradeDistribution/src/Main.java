import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Grade grade = new Grade();
        Scanner reader = new Scanner(System.in);
        System.out.println("Type exam scores, -1 completes:");
        while(true) {
            int t = Integer.parseInt(reader.nextLine());
            if ( t != -1) {
                grade.add(t);
            }else {
                break;
            }
            
        }
        
        System.out.println("Grade distribution: ");
        grade.printStar();
        System.out.println("Acceptance percentage: " + grade.percentage());
        
        
        
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
    }
}
