package com.theironyard.charlotte;

class TicTacToe {
    private char[][] board;
    private char playerMove;

    TicTacToe() {
        this.board = new char[3][3];
        this.playerMove = 'x';
        startNewGame();
    }

    void startNewGame() {
        for (int i = 0; i < 3; i++) {
            for( int y = 0; y < 3; y++) {
                board[i][y] = '.';
            }
        }
    }

    void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int y = 0; y < 3; y++) {
                System.out.print(board[i][y] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    //go through th board and find any '.' if there aren't any it's a draw.
    boolean isDraw() {
        boolean draw = true;

        for (int i = 0; i < 3; i++) {
            for (int y = 0; y < 3; y++) {
                if (board[i][y] == '.') {
                    draw = false;
                }
            }
        }
        return draw;
    }

    public void switchPlayer() {
        if (playerMove == 'x') {
            playerMove = 'o';
        }
        else {
            playerMove = 'x';
        }
    }

    //returns true if there is a win, false otherwise.
    //Checks all win functions at once.
    boolean checkForWin() {
        return (checkRows() || checkColumns() || checkDiagonals());
    }

    private boolean checkRowCol(char c1, char c2, char c3) {
        return ((c1 != '.') && (c1 == c2) && (c2 == c3));
    }

    private boolean checkRows() {
        for (int i = 0; i <3; i++) {
            if (checkRowCol(board[i][0], board[i][1], board[i][2])) {
                return true;
            }
        }
        return false;
    }

    private boolean checkColumns() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[0][i], board[1][i], board[2][i])) {
                return true;
            }
        }
        return false;
    }

    private boolean checkDiagonals() {
        return ((checkRowCol(board[0][0], board[1][1], board[2][2])) ||
                (checkRowCol(board[2][0], board[1][1], board[0][2])));
    }

    public boolean playerMoves(int row, int col) {

        if ((row >= 0) && (row < 3)) {
            if ((col >= 0) && (col < 3)) {
                if (board[row][col] == '.') {
                    board[row][col] = playerMove;
                }
            }
        }
        return false;
    }
}
