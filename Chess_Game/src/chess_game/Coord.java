/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess_game;

/**
 *
 * @author dylan
 */
public class Coord {
    private int x;
    private int y;
    
    public Coord(int x, int y){
        this.x = x-1;
        this.y = y-1;
    }

    public int GetX(){
        return x;
    }
    
    public int GetY(){
        return y;
    }
    
    public void SetX(int newX){
        this.x = newX;
    }
    
    public void SetY(int newY){
        this.y = newY;
    }
    
}
