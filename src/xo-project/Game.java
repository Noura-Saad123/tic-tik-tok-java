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
public class Game {
    Player player1;
    Player player2;
    Board board ;
    public Game(){
        player1 = new Player();
        player2 = new Player();
        board = new Board();
    }
    void start(){
        readNames();
        board.draw();
        int count =0;
        Player currentPlayer = new Player();
        Scanner cin = new Scanner(System.in);
        while(board.isFull()==false){
            if(count%2==0){
                //player1
                currentPlayer = player1;
            }else{
                //player2
                currentPlayer = player2;
            }
            int index;
            while(true){
                System.out.println("please enter number for 1 to 9");
                index = cin.nextInt();
                if(index>=1&&index<=9&&board.isEmpty(index))break;
            }
            //empty place 
            board.replaceChar(index, currentPlayer.getOp());
            board.draw();
            if(board.isWin(currentPlayer.getOp())){
                break;
            }
            count++;
        }
        if(board.isWin(currentPlayer.getOp())){
            System.out.println("the winner is "+currentPlayer.getName());
        }else{
            System.out.println("Draw");
        }
    }
    void readNames(){
        Scanner cin = new Scanner(System.in);
        String name = cin.next();
        player1.setName(name);
        player1.setOp('x');
        name = cin.next();
        player2.setName(name);
        player2.setOp('o');
    }
}
