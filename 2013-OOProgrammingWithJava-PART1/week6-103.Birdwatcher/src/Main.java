
import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
        ObservationBird t = new ObservationBird();
        Scanner reader = new Scanner(System.in);
        while(true){
            System.out.print("? ");
            String s = reader.next();
            if (s.equals("Quit")){
                break;
            }else if(s.equals("Add")){
                System.out.print("Name: ");
                String name = reader.next();
                System.out.print("Latin Name: ");
                String lname = reader.next();
                t.Add(new Bird(name, lname));
            }else if(s.equals("Observation")) {
                System.out.print("What was observed:? ");
                String tname = reader.next();
                boolean itis = false;
                for(Bird b : t.getBird()){
                    if(b.getName().equals(tname)){
                        int tt = b.getCount();
                        tt++;
                        b.setCount(tt);
                        itis = true;
                    }
                }
                if(itis){
                    continue;
                }
                System.out.println("Is not a bird!");
                
                
            }else if (s.equals("Show")){
                System.out.print("What? ");
                String st = reader.next();
                for(Bird b : t.getBird()){
                    if(b.getName().equals(st)) {
                        System.out.println(b);
                    }
                }
            }else if (s.equals("Statistics")){                
                t.Statistics();
            }
            
        }
       
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
            
    }

}
