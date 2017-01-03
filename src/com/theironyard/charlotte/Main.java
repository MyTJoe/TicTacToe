package com.theironyard.charlotte;

public class Main {

    public static void main(String[] args) {
        System.out.println("X moves first.");
        TicTacToe ttt = new TicTacToe();

        ttt.playerMoves(1,1);

        ttt.switchPlayer();
        ttt.playerMoves(0,0);

        ttt.switchPlayer();
        ttt.playerMoves(0,1);

        ttt.switchPlayer();
        ttt.playerMoves(2,1);

        ttt.switchPlayer();
        ttt.playerMoves(1,0);

        ttt.switchPlayer();
        ttt.playerMoves(1,2);

        ttt.switchPlayer();
        ttt.playerMoves(2,2);

        ttt.switchPlayer();
        ttt.playerMoves(2,0);

        ttt.switchPlayer();
        ttt.playerMoves(0,2);

        ttt.printBoard();

        if (ttt.checkForWin()) {
            System.out.println("Winner!");
            System.exit(0);
        } else if (ttt.isDraw()) {
            System.out.println("Looks like a draw folks.");
            System.exit(0);
        }
    }
}
