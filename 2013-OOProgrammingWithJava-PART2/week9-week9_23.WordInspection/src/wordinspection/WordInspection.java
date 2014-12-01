/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wordinspection;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jianrong
 */
public class WordInspection {
    private File f;

    public WordInspection(File f) {
        this.f = f;
    }
    
     public int wordCount() throws Exception {
        int count = 0; 
        Scanner reader = new Scanner(this.f, "UTF-8");
        while(reader.hasNext()) {
            String word = reader.next();
            count++;
        } 
        return count;  
     }
     
    public List<String> wordsContainingZ() throws Exception {
        List<String> word = new ArrayList<String>();
        Scanner reader = new Scanner(this.f, "UTF-8");
        while(reader.hasNext()) {
            String t = reader.next();
            if (t.contains("z")) {
                word.add(t);
            } 
        }
        return word;
        
    }
     
    /**
     *
     * @return
     * @throws Exception
     */
    public List<String> wordsEndingInL() throws Exception {
        List<String> word = new ArrayList<String>();
        Scanner reader = new Scanner(this.f, "UTF-8");
        while(reader.hasNext()) {
            String t = reader.next();
            char t0 = t.charAt(t.length()-1);
            if ( t0 == 'l') {
                word.add(t);
            }
        } 
        return word;
    }   
    
    public List<String> palindromes() throws Exception {
        List<String> word = new ArrayList<String>();
        Scanner reader = new Scanner(this.f, "UTF-8");
        while(reader.hasNext()) {
            String t = reader.next();
            StringBuffer tv =new StringBuffer(t);
            tv= tv.reverse();
            String t1 = tv.toString();
            
            if (t1.equals(t)) {
                word.add(t);
            }
        }
        return word;
    }
    
    public List<String> wordsWhichContainAllVowels() throws Exception {
        List<String> word = new ArrayList<String>();
        Scanner reader = new Scanner(this.f, "UTF-8");
        while(reader.hasNext()) {
            String t = reader.next();
            if (t.contains("a") && t.contains("e") &&
                t.contains("i") && t.contains("o") &&
                t.contains("u") && t.contains("y") &&  
                t.contains("ä") && t.contains("ö")     ) {
                word.add(t);
            } 
        }
        return word;
        
    }
        
    

     
    
}
