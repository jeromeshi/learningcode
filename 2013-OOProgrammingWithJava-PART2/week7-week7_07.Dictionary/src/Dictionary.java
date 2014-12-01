
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jianrong
 */
public class Dictionary {
    private HashMap<String, String> dic;
    
    public Dictionary() {
        this.dic = new HashMap<String, String>();
    }
    
    public void add(String word, String translation) {
        this.dic.put(word, translation);
    }
    
    public String translate(String word) {
        if (this.dic.get(word) != null) {
            return this.dic.get(word);
        }
        return null;
    }
    
     public int amountOfWords() {
         return this.dic.size();
     }
     
     public List<String> translationList() {
        ArrayList<String> result;
        result = new ArrayList<String>();
         for(String t:this.dic.keySet()) {
             String m = t + " = " + this.dic.get(t);
             result.add(m);
         }
         return result;
     }
}
