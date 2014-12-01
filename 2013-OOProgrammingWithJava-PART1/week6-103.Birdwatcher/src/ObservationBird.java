
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
public class ObservationBird {
    private ArrayList<Bird> bird;
    
    public ObservationBird() {
        this.bird = new ArrayList<Bird>();
    }
    
    public void Add(Bird t){
        this.getBird().add(t);
    }
    
    public void Statistics() {
        for (Bird t : this.getBird()) {
            System.out.println(t);
        }
    }

    /**
     * @return the bird
     */
    public ArrayList<Bird> getBird() {
        return bird;
    }
    
}
    

