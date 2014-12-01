/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jianrong
 */
public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
        // write code here
    }
    
    public void payEconomical() {
        if(this.balance >= 2.50) {
            this.balance = this.balance - 2.50;
        }
        // write code here
    }

    public void payGourmet() {
        if(this.balance >= 4.00) {
            this.balance = this.balance - 4.00;
        }
        // write code here
    }
    
    public void loadMoney(double amount) {
        if(amount < 0){
            return;
        }
        this.balance = this.balance + amount;
        if(this.balance > 150) {
            this.balance = 150;
        }
        // write code here
    }
    

    public String toString() {
        return "The card has " + this.balance + " euros";
        // write code here
    }
    
}
