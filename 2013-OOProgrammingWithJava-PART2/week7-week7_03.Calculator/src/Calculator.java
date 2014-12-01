
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
public class Calculator {
    private Reader reader = new Reader();
    private int count = 0;
    
    
    
    
    public void start() {
        
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }
    
    private  void sum() {
        System.out.println("value1: ");
        int t1 = reader.readInteger();
        System.out.println("value2: ");
        int t2 = reader.readInteger();
        count++;
        System.out.println("sum of the values " + (t1 + t2));
    }
    
    private  void difference() {
        System.out.println("value1: ");
        int t1 = reader.readInteger();
        System.out.println("value2: ");
        int t2 = reader.readInteger();
        count++;
        System.out.println("difference of the values " + (t1 - t2));
    }
    
    private  void product() {
        System.out.println("value1: ");
        int t1 = reader.readInteger();
        System.out.println("value2: ");
        int t2 = reader.readInteger();
        count++;
        System.out.println("product of the values " + (t1 * t2));
    }
    
    private  void statistics() {
        System.out.println("Calculations done " + count);
    }
    
}
