
public class Main {
    public static void main(String[] args) {
        
        Reader reader = new Reader();
        OperatorInterface operator = new OperatorInterface(reader);
        operator.start();
        operator.usrstart();
        // Write your main program here. Implementing your own classes will be useful.
    }
}
