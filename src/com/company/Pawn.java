package com.company;


import java.util.List;

class Pawn {
    private final String[][] board;
    private final int pieceToMovex;
    private final int pieceToMovey;
    private final List<String> legalmoves;

    public Pawn(String[][] board, int pieceToMovex, int pieceToMovey, List<String> legalmoves) {
        this.board = board;
        this.pieceToMovex = pieceToMovex;
        this.pieceToMovey = pieceToMovey;
        this.legalmoves = legalmoves;
    }

    public void invoke() {
        String pieceColor = String.valueOf(board[pieceToMovex][pieceToMovey].charAt(1));
        if (pieceColor.equals("W")) {
            for (int row = pieceToMovex + 1; row <= (pieceToMovex + 1); row++) {
                if (board[row][pieceToMovey].equals("emps")) {
                    legalmoves.add(row + "" + pieceToMovey);
                }
                //String ifPawn = String.valueOf(board[row][pieceToMovey].charAt(0));
                String ifPawnType = String.valueOf(board[row][pieceToMovey].charAt(1));
                if (ifPawnType.equals("B")) {
                    legalmoves.add(row + "" + pieceToMovey);
                }
            }
                for (int row = pieceToMovex + 1; row <= (pieceToMovex + 1); row++) {
                    for (int col = pieceToMovey + 1; col <= (pieceToMovey + 1); col++) {
                        String ifPawnType = String.valueOf(board[row][col].charAt(1));
                        if (ifPawnType.equals("B")) {
                            legalmoves.add(row + "" + col);
                        }
                    }
                }
                for (int row = pieceToMovex + 1; row <= (pieceToMovex + 1); row++) {
                    for (int col = pieceToMovey - 1; col <= (pieceToMovey - 1); col++) {
                        String ifPawnType = String.valueOf(board[row][col].charAt(1));
                        if (ifPawnType.equals("B")) {
                            legalmoves.add(row + "" + col);
                        }
                    }
                }
        }
            else if (pieceColor.equals("B")) {
            for (int row = pieceToMovex - 1; row <= (pieceToMovex - 1); row++) {
                if (board[row][pieceToMovey].equals("emps")) {
                    legalmoves.add(row + "" + pieceToMovey);
                }
                //String ifPawn = String.valueOf(board[row][pieceToMovey].charAt(0));
                String ifPawnType = String.valueOf(board[row][pieceToMovey].charAt(1));
                if (ifPawnType.equals("W")) {
                    legalmoves.add(row + "" + pieceToMovey);
                }
            }
            for (int row = pieceToMovex - 1; row <= (pieceToMovex - 1); row++) {
                for (int col = pieceToMovey - 1; col <= (pieceToMovey - 1); col++) {
                    String ifPawnType = String.valueOf(board[row][col].charAt(1));
                    if (ifPawnType.equals("W")) {
                        legalmoves.add(row + "" + col);
                    }
                }
            }
            for (int row = pieceToMovex - 1; row <= (pieceToMovex - 1); row++) {
                for (int col = pieceToMovey + 1; col <= (pieceToMovey + 1); col++) {
                    String ifPawnType = String.valueOf(board[row][col].charAt(1));
                    if (ifPawnType.equals("W")) {
                        legalmoves.add(row + "" + col);
                    }
                }
            }
        }
    }
}