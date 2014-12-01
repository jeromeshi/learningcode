
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jianrong
 */
public class Phonebook {
    private ArrayList<Person> person;
    
    public Phonebook() {
        this.person = new ArrayList<Person>();
    }
    
    public void add(String name, String num) {
        Person t = new Person(name, num);
        this.person.add(t);
    }
    
    public void printAll() {
        for(Person t : this.person) {
            System.out.println(t);
        }
       
    }
    
     public String searchNumber(String name) {
         for(Person t : this.person) {
             if (t.getName().equals(name)){
                 return t.getNumber();
             }
         }
         return "number not known";
     }
    
}
