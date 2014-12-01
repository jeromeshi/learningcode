/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package moving.domain;

import java.util.ArrayList;

/**
 *
 * @author jianrong
 */
public class Box implements Thing {
    private int maximumCapacity;
    private ArrayList<Thing> thing;

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.thing = new ArrayList<Thing>();
    }

    public ArrayList<Thing> getThing() {
        return thing;
    }

   

    
    
     public boolean addThing(Thing thing) {
        
        if(this.getVolume() + thing.getVolume() > this.maximumCapacity){
             return false;
        }
       
        this.thing.add(thing);
        return true;
     }

    @Override
    public int getVolume() {
        int total = 0;
        for( Thing t: this.thing){
            total += t.getVolume();
        }
        return total;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
