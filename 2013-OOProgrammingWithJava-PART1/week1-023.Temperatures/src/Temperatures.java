
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.println("Please input a float number: or quit to exit");
            String t = reader.nextLine();
            if (t.equals("quit")){
                break;
            }else {
                double dt = Double.parseDouble(t);
                if ((dt >= -30) && (dt <= 40)) {
                    Graph.addNumber(dt);
                }
            }
        }
        // Write your code here. 

        // Graph is used as follows:
       // Graph.addNumber(7);
        //double value = 13.5;
       // Graph.addNumber(value);
       // value = 3;
        //Graph.addNumber(value);
        // Remove or comment out these lines above before trying to run the tests.
    }
}