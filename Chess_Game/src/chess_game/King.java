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
public class King {
    private Coord place;
    private Colors col;
    private ChessBoard board;
    
    public King(Coord place, Colors col, ChessBoard board){
        this.place = place;
        this.col = col;
        this.board = board;
    }
    
    public Coord GetPlace(){
        return place;
    }
    
    public Colors GetColor(){
        return col;
    }
    
    public ChessBoard GetBoard(){
        return board;
    }
}
