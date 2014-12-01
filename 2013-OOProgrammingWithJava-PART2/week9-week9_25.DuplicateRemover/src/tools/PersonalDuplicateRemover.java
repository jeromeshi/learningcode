/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tools;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author jianrong
 */
public class PersonalDuplicateRemover implements DuplicateRemover {
    private Set<String> uniq;
    private int repeat;

    public PersonalDuplicateRemover() {
        this.uniq = new HashSet<String>();
        this.repeat = 0;
    }
    
    

    @Override
    public void add(String characterString) {
        if (!this.uniq.contains(characterString)) {
            this.uniq.add(characterString);
        }else {
            this.repeat++;
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return this.repeat;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return this.uniq;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void empty() {
        this.uniq.clear();
        this.repeat = 0;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
