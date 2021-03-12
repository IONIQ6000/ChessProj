package com.company;

import java.util.List;

class Bishop {
    private final String[][] board;
    private final int pieceToMovex;
    private final int pieceToMovey;
    private final List<String> legalmoves;

    public Bishop(String[][] board, int pieceToMovex, int pieceToMovey, List<String> legalmoves) {
        this.board = board;
        this.pieceToMovex = pieceToMovex;
        this.pieceToMovey = pieceToMovey;
        this.legalmoves = legalmoves;
    }

    public void invoke() {
        String pieceColor = String.valueOf(board[pieceToMovex][pieceToMovey].charAt(1));
        //look to the right
        int col = pieceToMovey;
        for (int row = pieceToMovex + 1; row <= pieceToMovex + 7; row++) {
            col++;
            if (col > 7 || row > 7) {
                    System.out.println("Out of Bounds - lower right ");
                    break;
                }
            String occupyColor = String.valueOf(board[row][col].charAt(1));
            if (board[row][col].equals("emps")) {
                    legalmoves.add(row + "" + col);
                } else if (pieceColor.equals("W")) {
                    if (occupyColor.equals("B")) {
                        legalmoves.add(row + "" + col);
                    }
                    break;
                } else if (pieceColor.equals("B")) {
                    if (occupyColor.equals("W")) {
                        legalmoves.add(row + "" + col);
                    }
                    break;
                }
        }
        col = pieceToMovey;
        for (int row = pieceToMovex - 1; row >= pieceToMovex - 7; row--) {
            col++;
            if (col > 7 || row < 0) {
                System.out.println("Out of Bounds - upper right ");
                break;
            }
            String occupyColor = String.valueOf(board[row][col].charAt(1));
            if (board[row][col].equals("emps")) {
                legalmoves.add(row + "" + col);
            } else if (pieceColor.equals("W")) {
                if (occupyColor.equals("B")) {
                    legalmoves.add(row + "" + col);
                }
                break;
            } else if (pieceColor.equals("B")) {
                if (occupyColor.equals("W")) {
                    legalmoves.add(row + "" + col);
                }
                break;
            }
        }

        int row = pieceToMovex;
        for (col = pieceToMovey - 1; col >= pieceToMovey - 7; col--) {
            row++;
            if (col < 0 || row > 7) {
                System.out.println("Out of Bounds - lower left ");
                break;
            }
            String occupyColor = String.valueOf(board[row][col].charAt(1));
            if (board[row][col].equals("emps")) {
                legalmoves.add(row + "" + col);
            } else if (pieceColor.equals("W")) {
                if (occupyColor.equals("B")) {
                    legalmoves.add(row + "" + col);
                }
                break;
            } else if (pieceColor.equals("B")) {
                if (occupyColor.equals("W")) {
                    legalmoves.add(row + "" + col);
                }
                break;
            }
        }

        row = pieceToMovex;
        for (col = pieceToMovey - 1; col >= pieceToMovey - 7; col--) {
            row--;
            if (col < 0 || row < 0) {
                System.out.println("Out of Bounds - upper left ");
                break;
            }
            String occupyColor = String.valueOf(board[row][col].charAt(1));
            if (board[row][col].equals("emps")) {
                legalmoves.add(row + "" + col);
            } else if (pieceColor.equals("W")) {
                if (occupyColor.equals("B")) {
                    legalmoves.add(row + "" + col);
                }
                break;
            } else if (pieceColor.equals("B")) {
                if (occupyColor.equals("W")) {
                    legalmoves.add(row + "" + col);
                }
                break;
            }
        }
    }
}

