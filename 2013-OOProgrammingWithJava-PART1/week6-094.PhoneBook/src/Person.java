/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jianrong
 */
public class Person {
    private String name;
    private String number;
    
    public Person(String name, String phone) {
        this.name = name;
        this.number = phone;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(String number) {
        this.number = number;
    }
    
    public void changeNumber(String newNumber) {
        this.number = newNumber;
    }
    
    public String toString() {
        return this.name + " number: " + this.number;
    }
    
    
    
}
