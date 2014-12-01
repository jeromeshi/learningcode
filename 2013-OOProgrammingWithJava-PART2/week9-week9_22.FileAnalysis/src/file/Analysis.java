/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package file;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author jianrong
 */
public class Analysis {
    private File f;

    public Analysis(File f) throws Exception {
        this.f = f;
    }
    
    public int lines() throws Exception{
        int lines = 0;
        Scanner reader = new Scanner(this.f);
        while(reader.hasNext()){
            String s = reader.nextLine();
            lines++;
        }
        return lines;
    }
    
    public int characters() throws Exception {
        int chars = 0;
        Scanner reader = new Scanner(this.f);
        while(reader.hasNext()) {
            String word = reader.next();
            chars += word.length();
        }
        chars += this.lines();
        chars += this.spaces();
        return chars;
    }
    
    private int spaces() throws Exception {
        int spaces = 0;
        Scanner reader = new Scanner(this.f);
        while(reader.hasNext()){
            String s = reader.nextLine();
            for (int i = 0;i < s.length(); i++) {
                if (Character.isSpaceChar(s.charAt(i))){
                    spaces++;
                }
            }
            
        }
        return spaces;
    }
    
}

