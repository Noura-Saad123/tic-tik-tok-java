/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xo_project;

/**
 *
 * @author pc1
 */
public class Board {
    char [][] mat = new char[3][3];
    public Board(){
        mat[0][0] = '1'; //for ascii 
        mat[0][1] = '2';
        mat[0][2] = '3';
        mat[1][0] = '4';
        mat[1][1] = '5';
        mat[1][2] = '6';
        mat[2][0] = '7';
        mat[2][1] = '8';
        mat[2][2] = '9';
        /*for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                mat[i][j] = (char)((i*3+j)+'1');
            }
        }*/
    }
    public void draw(){
        for(int i=0;i<3;i++){
            System.out.println(" --- --- ---");
            for(int j=0;j<3;j++){
                System.out.print("| "+mat[i][j]+" ");    
            }
            System.out.println("|");
        }
            System.out.println(" --- --- ---");
    }
    public boolean isEmpty(int index){
        //6
        int row = (index-1)/3;
        int col = (index-1)%3;
        if(mat[row][col]!='x'&&mat[row][col]!='o'){
            return true;
        }
        return false;
    }
    public void replaceChar(int index,char op){
        int row = (index-1)/3;
        int col = (index-1)%3;
        mat[row][col] = op;
    }
    public boolean isWin(char op){
        
        if(mat[0][0]==op&&mat[0][1]==op&&mat[0][2]==op)return true;
        if(mat[1][0]==op&&mat[1][1]==op&&mat[1][2]==op)return true;
        if(mat[2][0]==op&&mat[2][1]==op&&mat[2][2]==op)return true;
        if(mat[0][0]==op&&mat[1][0]==op&&mat[2][0]==op)return true;
        if(mat[0][1]==op&&mat[1][1]==op&&mat[2][1]==op)return true;
        if(mat[0][2]==op&&mat[1][2]==op&&mat[2][2]==op)return true;
        if(mat[0][0]==op&&mat[1][1]==op&&mat[2][2]==op)return true;
        if(mat[2][0]==op&&mat[1][1]==op&&mat[0][2]==op)return true;
        return false;
    }
    public boolean isFull(){
     for(int i=1;i<=9;i++){
         if(isEmpty(i))return false;
     }   
     return true;
    }
}
