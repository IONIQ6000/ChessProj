package com.company;

import java.util.List;

class Knight {
    private final String[][] board;
    private final int pieceToMovex;
    private final int pieceToMovey;
    private final List<String> legalmoves;

    public Knight(String[][] board, int pieceToMovex, int pieceToMovey, List<String> legalmoves) {
        this.board = board;
        this.pieceToMovex = pieceToMovex;
        this.pieceToMovey = pieceToMovey;
        this.legalmoves = legalmoves;
    }

    public void invoke() {
        //up 1 then 2 right
        String pieceColor = String.valueOf(board[pieceToMovex][pieceToMovey].charAt(1));
        int row = pieceToMovex + 2;
        int col = pieceToMovey + 1;
        String occupyColor = null;
        if (row > 7 || (col) > 7) {
            System.out.println("Out of Bounds - going up 1 then 2 right");
        } else
            occupyColor = String.valueOf(board[row][col].charAt(1));
            if (board[row][col].equals("emps")) {
                legalmoves.add(row + "" + col);
            } else if (pieceColor.equals("W")) {
                if (occupyColor.equals("B")) {
                    legalmoves.add(row + "" + col);
                }
            } else if (pieceColor.equals("B")) {
                if (occupyColor.equals("W")) {
                    legalmoves.add(row + "" + col);
                }
            }
        }
}
