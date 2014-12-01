
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
public class Changer {
    ArrayList<Change> t;
    
    public Changer() {
        this.t = new ArrayList<Change>();
    }
    
    public void addChange(Change t) {
        this.t.add(t);
    }
    
    public String change(String origin) {
        String replace = origin;
        for(Change tt : this.t){
            replace = tt.change(replace);
        }
        return replace;
    }
    
}
