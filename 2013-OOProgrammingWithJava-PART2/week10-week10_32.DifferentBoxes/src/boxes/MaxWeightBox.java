/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boxes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jianrong
 */
public class MaxWeightBox extends Box{
    private int max;
    private List<Thing> thing;

    public MaxWeightBox(int max) {
        this.max = max;
        this.thing = new ArrayList<Thing>();
    }
    
    @Override
    public void add (Thing thing) {
        int total = 0;
        for ( Thing t :this.thing) {
            total += t.getWeight();
        }
        
        if ( total + thing.getWeight() > this.max) {
        }else {
            this.thing.add(thing);
        }
    }
    
    @Override
    public boolean isInTheBox ( Thing thing) {
        return this.thing.contains(thing);
    }
    
}
