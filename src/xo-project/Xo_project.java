/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xo_project;
import java.util.Scanner;

/**
 *
 * @author pc1
 */
/*
//game 2 players board start
//player name op
//board save state,isEmpty,win,isFull,draw,replace char
 --- --- ---
| 1 | 2 | 3 |
 --- --- ---
| 4 | 5 | 6 |
 --- --- ---
| 7 | 8 | 9 |
 --- --- ---
player 1 -> x player2-> o

*/
public class Xo_project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
    
}
