/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package movable;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jianrong
 */
public class Group implements Movable {
    private List<Movable> group;

    public Group() {
        this.group = new ArrayList<Movable>();
    }
    
    public void addToGroup(Movable movable) {
        this.group.add(movable);
    }
    
    

    @Override
    public void move(int dx, int dy) {
        for(Movable t : this.group){
            t.move(dx, dy);
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        String s = "";
        for (Movable t: this.group) {
            s += t.toString() + "\n";
        }
            
        return s;
    }
    
    
    
}
