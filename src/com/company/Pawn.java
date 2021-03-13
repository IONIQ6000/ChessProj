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
                if (row > 7) {
                    break;
                } else {
                    if (board[row][pieceToMovey].equals("emps")) {
                        legalmoves.add(row + "" + pieceToMovey);
                    }
                    //String ifPawn = String.valueOf(board[row][pieceToMovey].charAt(0));
                    String occupyColor = String.valueOf(board[row][pieceToMovey].charAt(1));
                    if (occupyColor.equals("B")) {
                        legalmoves.add(row + "" + pieceToMovey);
                    }
                }
            }
            for (int row = pieceToMovex + 1; row <= (pieceToMovex + 1); row++) {
                for (int col = pieceToMovey + 1; col <= (pieceToMovey + 1); col++) {
                    if (row > 7 && col > 7) {
                        break;
                    } else {
                    String occupyColor = String.valueOf(board[row][col].charAt(1));
                    if (occupyColor.equals("B")) {
                        legalmoves.add(row + "" + col);
                        }
                    }
                }
            }
            for (int row = pieceToMovex + 1; row <= (pieceToMovex + 1); row++) {
                for (int col = pieceToMovey - 1; col <= (pieceToMovey - 1); col++) {
                    if (row > 7 && col < 0){
                        break;
                    } else {
                    String occupyColor = String.valueOf(board[row][col].charAt(1));
                    if (occupyColor.equals("B")) {
                        legalmoves.add(row + "" + col);
                        }
                    }
                }
            }
        } else if (pieceColor.equals("B")) {
            for (int row = pieceToMovex - 1; row <= (pieceToMovex - 1); row++) {
                if (row < 0) {
                    break;
                } else {
                if (board[row][pieceToMovey].equals("emps")) {
                    legalmoves.add(row + "" + pieceToMovey);
                }
                //String ifPawn = String.valueOf(board[row][pieceToMovey].charAt(0));
                String occupyColor = String.valueOf(board[row][pieceToMovey].charAt(1));
                if (occupyColor.equals("W")) {
                    legalmoves.add(row + "" + pieceToMovey);
                    }
                }
            }
            for (int row = pieceToMovex - 1; row <= (pieceToMovex - 1); row++) {
                for (int col = pieceToMovey - 1; col <= (pieceToMovey - 1); col++) {
                    if (row < 0 && col < 0) {
                        break;
                    } else {
                    String occupyColor = String.valueOf(board[row][col].charAt(1));
                    if (occupyColor.equals("W")) {
                        legalmoves.add(row + "" + col);
                        }
                    }
                }
            }
            for (int row = pieceToMovex - 1; row <= (pieceToMovex - 1); row++) {
                for (int col = pieceToMovey + 1; col <= (pieceToMovey + 1); col++) {
                    if (row < 0 && col > 7) {
                        break;
                    } else {
                    String occupyColor = String.valueOf(board[row][col].charAt(1));
                    if (occupyColor.equals("W")) {
                        legalmoves.add(row + "" + col);
                        }
                    }
                }
            }
        }
    }
}