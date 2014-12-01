import java.util.Random;



public class PasswordRandomizer {
    private int length;
    private Random random;
    private String s;
    // Define the variables

    public PasswordRandomizer(int length) {
        this.length = length;
        this.random = new Random();
        this.s = "";
        
        // Initialize the variable
    }

    public String createPassword() {
        int length = this.length;
        this.s = "";
        while(length > 0){
            int number = this.random.nextInt(26);
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number);
            //System.out.println(symbol);
            this.s+=symbol;
           // System.out.println(this.s);
            length--;
        }
        
        // write code that returns a randomized password
        return this.s;
    }
}
