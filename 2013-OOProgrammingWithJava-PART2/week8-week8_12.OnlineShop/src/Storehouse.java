
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jianrong
 */
public class Storehouse {
    private Map<String, Integer> pprice;
    private Map<String, Integer> pstock;

    public Storehouse() {
        this.pprice = new HashMap<String, Integer>();
        this.pstock = new HashMap<String, Integer>();
    }
    
    public void addProduct (String product, int price, int stock) {
        this.pprice.put(product, price);
        this.pstock.put(product, stock);
    }
    
    public int price(String product) {
        for (String t : this.pprice.keySet()) {
            if (t.equals(product)) {
                return this.pprice.get(t);
            }
        }
        return -99;
    }
    
    public int stock(String product) {
        for (String t : this.pstock.keySet()) {
            if (t.equals(product)) {
                return this.pstock.get(t);
            }
        }
        return 0;
    }
    
    public boolean take(String product) {
        if(!this.pstock.containsKey(product)){
            return false;
        }
        if (this.pstock.get(product) > 0) {
            
            this.pstock.replace(product, this.pstock.get(product) - 1);
            return true;
        }
        
        return false;
    }
    
    public Set<String> products() {
        Set<String> set = new HashSet<String>();
        for(String t : this.pprice.keySet()) {
            set.add(t);
        }
        return set;
    }
    
}
