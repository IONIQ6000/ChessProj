package com.company;

import java.util.List;

public class kingBoardGenerator {
    private final String[][] board;
    private final int pieceToMovex;
    private final int pieceToMovey;
    private final List<String> legalmoves;

    public kingBoardGenerator(String[][] board, int pieceToMovex, int pieceToMovey, List<String> legalmoves) {
        this.board = board;
        this.pieceToMovex = pieceToMovex;
        this.pieceToMovey = pieceToMovey;
        this.legalmoves = legalmoves;
    }

    public void invoke() {
        String pieceColor = String.valueOf(board[pieceToMovex][pieceToMovey].charAt(1));

        for (int scanX = 0; scanX <=  7; scanX++)  {
            for (int scanY = 0; scanY <=  7; scanY++){
                String occupyType = String.valueOf(board[scanX][scanY].charAt(0));
                String occupyColor = String.valueOf(board[scanX][scanY].charAt(1));
                if (occupyType.equals("P") && (occupyColor.equals("W"))){
                    System.out.println("White Pawn found at " + board[scanX][scanY]);
                    for (int row = pieceToMovex + 1; row <= (pieceToMovex + 1); row++) {
                        if (board[row][pieceToMovey].equals("emps")) {
                            legalmoves.add(row + "" + pieceToMovey);
                        }
                    }
                }
                if (occupyType.equals("P") && (occupyColor.equals("B"))){
                    System.out.println("Black Pawn found at " + board[scanX][scanY]);
                }
                if (occupyType.equals("R") && (occupyColor.equals("W"))){
                    System.out.println("White Rook found at " + board[scanX][scanY]);
                }
                if (occupyType.equals("R") && (occupyColor.equals("B"))){
                    System.out.println("Black Rook found at " + board[scanX][scanY]);
                }
                if (occupyType.equals("B") && (occupyColor.equals("W"))){
                    System.out.println("White Bishop found at " + board[scanX][scanY]);
                }
                if (occupyType.equals("B") && (occupyColor.equals("B"))){
                    System.out.println("Black Bishop found at " + board[scanX][scanY]);
                }
                if (occupyType.equals("Q") && (occupyColor.equals("W"))){
                    System.out.println("White Queen found at " + board[scanX][scanY]);
                }
                if (occupyType.equals("Q") && (occupyColor.equals("B"))){
                    System.out.println("Black Queen found at " + board[scanX][scanY]);
                }
                if (occupyType.equals("N") && (occupyColor.equals("W"))){
                    System.out.println("White Knight found at " + board[scanX][scanY]);
                }
                if (occupyType.equals("N") && (occupyColor.equals("B"))){
                    System.out.println("Black Knight found at " + board[scanX][scanY]);
                }
                if (occupyType.equals("K") && (occupyColor.equals("W"))){
                    System.out.println("White King found at " + board[scanX][scanY]);
                }
                if (occupyType.equals("K") && (occupyColor.equals("B"))){
                    System.out.println("Black King found at " + board[scanX][scanY]);
                }
            }
        }
    }
}
