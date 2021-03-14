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
            int col = pieceToMovey;
            if (col > 5) {
                for (col = pieceToMovey - 1; col >= pieceToMovey - 2; col--) {
                    if (board[pieceToMovex][col].equals("emps")) {
                        legalmoves.add(pieceToMovex + "" + col);
                    } else {
                        String occupyColor = String.valueOf(board[pieceToMovex][col].charAt(1));
                        if (occupyColor.equals("B")) {
                            legalmoves.add(pieceToMovex + "" + col);
                            break;
                        }
                    }
                }
            } else {
                col = pieceToMovey - 1;
                if (!(col < 0)) {
                    if (board[pieceToMovex][col].equals("emps")) {
                        legalmoves.add(pieceToMovex + "" + col);
                    } else {
                        String occupyColor = String.valueOf(board[pieceToMovex][col].charAt(1));
                        if (occupyColor.equals("B")) {
                            legalmoves.add(pieceToMovex + "" + col);
                        }
                    }
                }
            }

            int row = pieceToMovex - 1;
            col = pieceToMovey - 1;
            if (!(row < 0 || col < 0)) {
                String occupyColor = String.valueOf(board[row][col].charAt(1));
                if (occupyColor.equals("B")) {
                    legalmoves.add(row + "" + col);
                }
            }

            row = pieceToMovex + 1;
            col = pieceToMovey - 1;
            if (!(row > 7 || col < 0)) {
                String occupyColor = String.valueOf(board[row][col].charAt(1));
                if (occupyColor.equals("B")) {
                    legalmoves.add(row + "" + col);
                }
            }
        } else if (pieceColor.equals("B")) {
            int col = pieceToMovey;
            if (col < 2) {
                for (col = pieceToMovey + 1; col <= pieceToMovey + 2; col++) {
                    if (board[pieceToMovex][col].equals("emps")) {
                        legalmoves.add(pieceToMovex + "" + col);
                    } else {
                        String occupyColor = String.valueOf(board[pieceToMovex][col].charAt(1));
                        if (occupyColor.equals("B")) {
                            legalmoves.add(pieceToMovex + "" + col);
                            break;
                        }
                    }
                }
            } else {
                col = pieceToMovey + 1;
                if (!(col > 7)) {
                    if (board[pieceToMovex][col].equals("emps")) {
                        legalmoves.add(pieceToMovex + "" + col);
                    } else {
                        String occupyColor = String.valueOf(board[pieceToMovex][col].charAt(1));
                        if (occupyColor.equals("W")) {
                            legalmoves.add(pieceToMovex + "" + col);
                        }
                    }
                }
                int row = pieceToMovex + 1;
                col = pieceToMovey + 1;
                if (!(row > 8 || col > 8)) {
                    String occupyColor = String.valueOf(board[row][col].charAt(1));
                    if (occupyColor.equals("W")) {
                        legalmoves.add(row + "" + col);
                    }
                }

                row = pieceToMovex - 1;
                col = pieceToMovey + 1;
                if (!(row < 0 || col > 8)) {
                    String occupyColor = String.valueOf(board[row][col].charAt(1));
                    if (occupyColor.equals("W")) {
                        legalmoves.add(row + "" + col);
                    }
                }
            }
        }
    }
}