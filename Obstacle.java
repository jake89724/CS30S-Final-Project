/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.project.j.head;

/**
 *
 * @author j.head
 */
public class Obstacle {

    public int[][] board = new int[10][10];
    public String output;

    public Obstacle() {
        fillBoard();
        int num1 = 1;
        int num2 = 1;
        boolean fax = false;

        for (int i = 0; i < 9; i++) {
            fax = false;
            //makes sure there is 9 everytime 
            //if value = 1 already it finds a new spot
            while (fax == false) {
                num1 = random();
                num2 = random();
                if (board[num1][num2] == 0) {
                    board[num1][num2] = 1;
                    fax = true;
                } else {
                    fax = false;
                }
                
            }

        }
        check(board);
        output(board);
        

    }

    public int random() {
        final int high = 9;
        final int low = 0;
        double seed = Math.random();
        double number = (high - low + 1) * seed + low;
        int randomNumber = (int) number;
        System.out.println(randomNumber);
        return (randomNumber);
    }

    public void fillBoard() {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[1].length; col++) {
                board[row][col] = 0;
            }
        }

    }

    public void output(int[][] array) {
        String output = "";
        
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[1].length; col++) {
                System.out.print(array[row][col]);
                output = output + board[row][col];
            }
            System.out.println("");
            output = output + "\n";
        }
        
    }

    private void check(int [][] array) {
        int numberCol = 10;
        
    }
}
