/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jianrong
 */
public class Change {
    char origin;
    char replace;
   
    public Change(char a, char b) {
        this.origin = a;
        this.replace = b;
    }
    
    public String change(String t) {
        String replacedA = "";
        for ( int i=0; i < t.length(); i++) {
            char character = t.charAt(i);
            if ( character == this.origin ) {
                replacedA += this.replace;
            }  else {
                replacedA += character;
            }
        }

     return replacedA;
    }
    
    
}
