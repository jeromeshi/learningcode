/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jianrong
 */
public class MilitaryService implements NationalService{
    private  int dleft;

    public MilitaryService(int dleft) {
        this.dleft = dleft;
    }

    @Override
    public int getDaysLeft() {
        return this.dleft;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void work() {
        if(this.dleft > 0) {
            this.dleft--;
        }
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
