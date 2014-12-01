
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
public class Reader {
    private Scanner reader;

    public Reader() {
        this.reader = new Scanner(System.in);
    }
    
    public  String readString() {
        Scanner t = reader;
        String command = t.nextLine();
        return command;
    }
    
    public  int readInteger() {
        Scanner t = reader;
        int val = Integer.parseInt(t.nextLine());
        return val;
    }
    
}

