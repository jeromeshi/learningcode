/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jianrong
 */
public class Student {
    private String name;
    private String studentNumber;
    
    public Student(String name, String number){
        this.name = name;
        this.studentNumber = number;
    }

    /**
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the studentNumber
     */
    public String getStudentNumber() {
        return this.studentNumber;
    }

    /**
     * @param studentNumber the studentNumber to set
     */
    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
    
    public String toString() {
        return this.name + " " + "(" + this.studentNumber + ")";
    }
     
   
    
}
