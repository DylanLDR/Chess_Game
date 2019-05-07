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
public class Chess_Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Chess_Game");
        ChessBoard board;
        board = new ChessBoard();
        board.smartPrint();
        ///board.setOccupation(new Coord[10][10],true);
        //King king1 = new King(new Coord[0][0],BLACK,board);
        
    }
    
    
}
