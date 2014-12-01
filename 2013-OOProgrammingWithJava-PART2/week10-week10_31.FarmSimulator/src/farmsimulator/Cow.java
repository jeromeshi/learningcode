/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package farmsimulator;

import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * @author jianrong
 */
public class Cow implements Alive, Milkable{
    private String name;
    private int capacity;
    private double amount;
    
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    public Cow() {
        this.name = NAMES[new Random().nextInt(NAMES.length)];
        this.capacity = 15 + new Random().nextInt(26);
        this.amount = 0;
    }

    public Cow(String name) {
        this.name = name;
        this.capacity = 15 + new Random().nextInt(26);
        this.amount = 0;
    }

    public String getName() {
        return name;
    }

    public double getCapacity() {
        return capacity;
    }
    
    public double getAmount() {
        return amount;
    }
    
    
    

    @Override
    public void liveHour() {
        
        this.amount += Math.ceil((0.7 + 1.3 * (new Random().nextDouble())));
        if(this.amount > this.capacity) {
            this.amount = this.capacity;
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double milk() {
        double t = this.amount;
        this.amount = 0;
        return t;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return name + " " + amount +  "/" + capacity;
    }
    
    
}
