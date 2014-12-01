/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package moving.logic;

import java.util.ArrayList;
import java.util.List;
import moving.domain.Box;
import moving.domain.Thing;

/**
 *
 * @author jianrong
 */
public class Packer {
    private List<Box> box;
    private int boxsize;

    public Packer(int boxsize) {
        this.box =  new ArrayList<Box>();
        this.boxsize = boxsize;
    }
    
    
    
    
    public List<Box> packThings(List<Thing> things) {
        List<Box> box = new ArrayList<Box>();
        Box t = new Box(this.boxsize);
        box.add(t);
        for( Thing s : things){
            if(!t.addThing(s)){
               
                t = new Box(this.boxsize);
                t.addThing(s);
                box.add(t);
                
            }
        }
        return box;
    }
}


