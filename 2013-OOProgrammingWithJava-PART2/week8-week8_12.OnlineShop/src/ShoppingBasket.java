
import java.util.HashMap;
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
public class ShoppingBasket {
    private Map<String, Purchase> basket;

    public ShoppingBasket() {
        this.basket = new HashMap<String, Purchase>();
    }
    
    public void add(String product, int price) {
        if(!this.basket.containsKey(product)){
           this.basket.put(product, new Purchase(product, 1, price)); 
        }else {
            this.basket.get(product).increaseAmount();
        }
    }
    
   
    
    public int price() {
        int total = 0;
        for (String t : this.basket.keySet()) {
            total += this.basket.get(t).price();
        }
        return total;
    }
    
     public void print() {
         for (String t : this.basket.keySet()) {
             System.out.println(this.basket.get(t));
        }
     }
    
}
