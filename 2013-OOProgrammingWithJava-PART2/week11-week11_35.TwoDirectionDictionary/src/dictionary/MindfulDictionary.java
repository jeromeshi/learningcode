
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jianrong
 */
public class MindfulDictionary {
    private Map<String, String> dic;
    private Map<String, String> dicr;
    private File f;

    public MindfulDictionary() {
        this.dic = new HashMap<String, String>();
        this.dicr = new HashMap<String, String>();
    }

    public MindfulDictionary(String f) {
        
        this.dic = new HashMap<String, String>();
        this.dicr = new HashMap<String, String>();
        this.f = new File(f);
    }
    
    public boolean load()  {
        if (!this.f.exists()) {
            return false;
        }
        
        Scanner sc = null;
        try {
            sc = new Scanner(this.f);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MindfulDictionary.class.getName()).log(Level.SEVERE, null, ex);
        }
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] parts = line.split(":");
            this.dic.put(parts[0], parts[1]);
            this.dicr.put(parts[1], parts[0]);
        }
        
        return true;
        
    }
    
     public boolean save()  {
        //if (!this.f.exists()) {
       //     return false;
       // }
        FileWriter fw = null;
        try {
            fw = new FileWriter(this.f);
        } catch (IOException ex) {
            Logger.getLogger(MindfulDictionary.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            fw.write("");
        } catch (IOException ex) {
            Logger.getLogger(MindfulDictionary.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (String s: this.dic.keySet() ) {
            try {
                fw.append(s + ":" + this.dic.get(s));
                fw.append("\n");
            } catch (IOException ex) {
                Logger.getLogger(MindfulDictionary.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        try {
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(MindfulDictionary.class.getName()).log(Level.SEVERE, null, ex);
        }
             
        
        return true; 
     }
    
    
    
    public void add(String word, String translation) {
        if (this.dic.containsKey(word)) {
            return;
        }
        this.dic.put(word, translation);
        this.dicr.put(translation, word);
    }
    
     public void remove(String word) {
         String t1 = "";
         String t2 = "";
         if (this.dic.containsKey(word)) {
             t1 = word;
             t2 = this.dic.get(word);
             
         }
         if (t1 != "" && t2 != "") {
             this.dic.remove(t1);
             this.dicr.remove(t2);
             return;
         }
         
         if (this.dicr.containsKey(word)) {
             t1 = word;
             t2 = this.dicr.get(word);
             
         }
         this.dicr.remove(t1);
          this.dic.remove(t2);
         
        // this.dicr.remove()
         
        // if (this.di)
     }
    
    public String translate(String word) {
        if ( this.dic.containsKey(word)) {
            return this.dic.get(word);
        }else if ( this.dicr.containsKey(word)) {
            return this.dicr.get(word);
        }
        return null;  
    }
    
    
}
