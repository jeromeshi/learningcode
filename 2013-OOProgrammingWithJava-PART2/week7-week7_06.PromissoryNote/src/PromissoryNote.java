
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jianrong
 */
public class PromissoryNote {
    private HashMap<String, Double> t;
    
    public PromissoryNote() {
        this.t = new HashMap<String, Double>();
    }
    
    public void setLoan(String toWhom, double value) {
        this.t.put(toWhom, value);
    }
    
    public double howMuchIsTheDebt(String whose) {
        if(this.t.get(whose) != null){
            return this.t.get(whose);
        }
        return 0;
    }
    
}
