
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
public class Suitcase {
    private ArrayList<Thing> things;
    private int total;
    
    public Suitcase(int total) {
        this.total = total;
        this.things = new ArrayList<Thing>();
    }
    
    public void addThing(Thing thing) {
        int tt = 0;
        for (Thing t: this.things ) {
            tt+=t.getWeight();
        }
        if (tt + thing.getWeight() > this.getTotal()) {
            return;
        } else {
            this.things.add(thing);
        }
    }
    
    public int totalWeight(){
        int tt = 0;
        for (Thing t: this.things ) {
            tt+=t.getWeight();
        }
        return tt;
    }
    
    
    public Thing heaviestThing() {
        Thing tthing = new Thing("t", 0) ;
        int tw = 0;
        if (this.things.size() == 0) {
            return null;
        }
        for (Thing t: this.things) {
            if (t.getWeight() > tw) {
                tw = t.getWeight();
                tthing = t;
            }
        }
        return tthing;
    }
    
    public void printThings() {
        for (Thing t: this.things ) {
            System.out.println(t);
        }
    }
    
    public String toString() {
        int tt = 0;
        for (Thing t: this.things ) {
            tt+=t.getWeight();
        }
        if ( this.things.size() == 0){
            return "empty " + " (" + tt + " kg)";
        }else if (this.things.size() == 1) {
            return this.things.size() + " thing " + " (" + tt + " kg)";
        }
    
        return this.things.size() + " things " + " (" + tt + " kg)";
    }

    /**
     * @return the total
     */
    public int getTotal() {
        return total;
    }
    
}
