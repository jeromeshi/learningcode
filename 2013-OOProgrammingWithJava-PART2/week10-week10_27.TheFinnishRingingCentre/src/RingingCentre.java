
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jianrong
 */
public class RingingCentre {
    private Map<Bird, List<String>> ringbird;
    
    public RingingCentre() {
        this.ringbird = new HashMap<Bird,List<String>>();
    }
    
    public void observe(Bird bird, String place) {
        if(!this.ringbird.keySet().contains(bird)) {
            this.ringbird.put(bird, new ArrayList<String>());
             
        }
        List<String> finished = this.ringbird.get(bird);
        finished.add(place);
    }
     
    public void observations(Bird bird) {
        if (this.ringbird.keySet().contains(bird)){
            int count = this.ringbird.get(bird).size();
            //List<String> place = this.ringbird.get(t);
            System.out.println(bird + " observations: " + count);
            for (String s : this.ringbird.get(bird)) {
                System.out.println(s);
            }    
            
        }else {
            System.out.println(bird+ " observations: " + 0);
        }
         
    }
}
