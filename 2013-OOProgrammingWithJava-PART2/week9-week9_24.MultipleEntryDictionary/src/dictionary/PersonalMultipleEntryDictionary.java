/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author jianrong
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary{
    private Map<String, Set<String>> dic;

    public PersonalMultipleEntryDictionary() {
        this.dic = new HashMap<String, Set<String>>();
    }
    
    
    @Override
    public void add(String word, String entry) {
        if (!this.dic.containsKey(word)) {
            this.dic.put(word, new HashSet<String>());
            
        }
        this.dic.get(word).add(entry);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Set<String> translate(String word) {
        return this.dic.get(word);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(String word) {
        this.dic.remove(word);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
