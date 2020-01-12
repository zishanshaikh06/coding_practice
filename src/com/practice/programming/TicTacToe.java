package com.practice.programming;

public class TicTacToe {

    int n = 3;

    int[] rowCounter = new int[n];
    int[] colCounter = new int[n];
    int diagLeft;
    int diagRight;

    public TicTacToe(int n) {
        this.n = n;
    }

    public int move(int player, int row, int col){

        int move = player == 1 ? 1 : -1;

        rowCounter[row] += move;
        colCounter[col] += move;

        if(row == col){
            diagLeft += move;
        } else if(row == n - col -1){
            diagRight += move;
        }

        if(rowCounter[row] == n || colCounter[col] == n || diagLeft == n || diagRight == n){
            return 1;
        } else if(rowCounter[row] == -n || colCounter[col] == -n || diagLeft == -n || diagRight == -n){
            return 2;
        } else{
            return 0;
        }
    }

    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe(3);

        int ret = 0;

        ret = ticTacToe.move(1, 0, 0);
        ret = ticTacToe.move(2, 0, 2);
        ret = ticTacToe.move(1, 2, 0);
        ret = ticTacToe.move(2, 2, 1);
        ret = ticTacToe.move(1, 1, 0);


        if(ret == 1){
            System.out.println("Player 1 win");
        }

        if(ret == 2){
            System.out.println("Player 2 win");
        }

        if(ret == 0){
            System.out.println("Its a tie");
        }



    }
}
