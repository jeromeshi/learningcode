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
public class Dungeon {
    private  int length;
    private  int height;
    private int vampires;
    private int moves;
    private boolean vampiresMove;

    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove) {
        this.length = length;
        this.height = height;
        this.vampires = vampires;
        this.moves = moves;
        this.vampiresMove = vampiresMove;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getVampires() {
        return vampires;
    }

    public int getMoves() {
        return moves;
    }

    public boolean isVampiresMove() {
        return vampiresMove;
    }
    
    
    
}
