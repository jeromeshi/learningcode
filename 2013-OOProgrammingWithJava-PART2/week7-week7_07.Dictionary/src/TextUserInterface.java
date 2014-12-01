
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jianrong
 */
public class TextUserInterface {
    private Scanner reader;
    private Dictionary dic;
    
    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dic = dictionary;
    }
    
    public void start() {
        
        System.out.println("Statement:\n" +
                           "  quit - quit the text user interface");
        while(true) {
            System.out.print("Statement: ");
            String t = this.reader.nextLine();
            if(t.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else if(t.equals("add")) {
                System.out.print("In Finnish: ");
                String add0 = this.reader.nextLine();
                System.out.print("Translation: ");
                String add1 = this.reader.nextLine();
                this.dic.add(add0, add1);
            }else if(t.equals("translate")){
                System.out.print("Give a word: ");
                String t0 = this.reader.nextLine();
                System.out.print("Translation: ");
                System.out.println(this.dic.translate(t0));
            }else {
                System.out.println("Unknown statement");
            }
        }
    }
    
}
