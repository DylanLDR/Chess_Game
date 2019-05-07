/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess_game;

import javafx.geometry.Pos;

/**
 *
 * @author dylan
 */
public class ChessBoard {
    private int[][] cases;
    static final int nb_Cases = 0;
    
    public ChessBoard(){
        this.cases = new int [nb_Cases][nb_Cases];
    }
    
    public boolean isOccuped(Coord pos){
        return (cases[pos.GetX()][pos.GetY()]==1);
    }
    
    public void setOccupation(Coord pos, boolean in){
        
        
        if(in){
            cases[pos.GetX()][pos.GetY()] = 1;
        }
        else{
            cases[pos.GetX()][pos.GetY()] = 0;
        }
    }
    
    public void smartPrint(){
        System.err.println(" A B C D E F G H I J K"); 
        
        for (int i = 0; i < 10; i++) {
            System.out.print(" 0\n");
            for (int j = 0; j < 10; j++) {
                System.out.print(" 0");
            }
        }
        System.out.println("");
    }
}
