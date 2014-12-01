/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dungeon;

/**
 *
 * @author jianrong
 */
public class Actor implements Move{
    private String name;
    private final int height;
    private final int length;
    private int col;
    private int row;

    public Actor(String name, int col, int row, int height, int length) {
        this.name = name;
        this.col = col;
        this.row = row;
        this.height = height;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }
    
    

    @Override
    public void up() {
        if( this.row != 0) {
            this.row--;
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void down() {
        if ( this.row != this.height - 1) {
            this.row++;
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void left() {
        if ( this.col != 0) {
            this.col--;
        }
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void right() {
        if ( this.col != this.length -1) {
            this.col++;
        }
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
