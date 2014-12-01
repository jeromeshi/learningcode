
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jianrong
 */
public class Box implements ToBeStored {
    private double total;
    private ArrayList<ToBeStored> store;

    public Box(double total) {
        this.total = total;
        this.store = new ArrayList<ToBeStored>();
    }
    
    public void add(ToBeStored t) {
        if(t.weight() + this.weight() > this.total) {
            return;
        }
        this.store.add(t);
    }
    
    @Override
    public double weight() {
        double total = 0;
        for (ToBeStored t : this.store) {
            total+= t.weight();
        }
        return total;
    }

    @Override
    public String toString() {
        int count = 0;
        for (ToBeStored t : this.store) {
            count++;
        }
        
        return "Box: "+ count + " things, total weight " + this.weight() + " kg";
    }
    
    
    
    
}
