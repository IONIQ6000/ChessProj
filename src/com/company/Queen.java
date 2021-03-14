package com.company;

import java.util.List;

class Queen {
    private final String[][] board;
    private final int pieceToMovex;
    private final int pieceToMovey;
    private final List<String> legalmoves;

    public Queen(String[][] board, int pieceToMovex, int pieceToMovey, List<String> legalmoves) {
        this.board = board;
        this.pieceToMovex = pieceToMovex;
        this.pieceToMovey = pieceToMovey;
        this.legalmoves = legalmoves;
    }

    public void invoke() {
        String pieceColor = String.valueOf(board[pieceToMovex][pieceToMovey].charAt(1));
        //look to the right
        for (int col = pieceToMovey + 1; col <= pieceToMovey + 7; col++) {
            if (col > 7) {
                break;
            }
            String occupyColor = String.valueOf(board[pieceToMovex][col].charAt(1));
            if (board[pieceToMovex][col].equals("emps")) {
                legalmoves.add(pieceToMovex + "" + col);
            } else if (pieceColor.equals("W")) {
                if (occupyColor.equals("B")) {
                    legalmoves.add(pieceToMovex + "" + col);
                }
                break;
            } else if (pieceColor.equals("B")) {
                if (occupyColor.equals("W")) {
                    legalmoves.add(pieceToMovex + "" + col);
                }
                break;
            }
        }
        //look to the left
        for (int col = pieceToMovey - 1; col >= pieceToMovey - 7; col--) {
            if (col < 0) {
                break;
            }
            String occupyColor = String.valueOf(board[pieceToMovex][col].charAt(1));
            if (board[pieceToMovex][col].equals("emps")) {
                legalmoves.add(pieceToMovex + "" + col);
            } else if (pieceColor.equals("W")) {
                if (occupyColor.equals("B")) {
                    legalmoves.add(pieceToMovex + "" + col);
                }
                break;
            } else if (pieceColor.equals("B")) {
                if (occupyColor.equals("W")) {
                    legalmoves.add(pieceToMovex + "" + col);
                }
                break;
            }
        }
        //look to the top
        for (int row = pieceToMovex - 1; row >= pieceToMovex - 7; row--) {
            if (row < 0) {
                break;
            }
            String occupyColor = String.valueOf(board[row][pieceToMovey].charAt(1));
            if (board[row][pieceToMovey].equals("emps")) {
                legalmoves.add(row + "" + pieceToMovey);
            } else if (pieceColor.equals("W")) {
                if (occupyColor.equals("B")) {
                    legalmoves.add(row + "" + pieceToMovey);
                }
                break;
            } else if (pieceColor.equals("B")) {
                if (occupyColor.equals("W")) {
                    legalmoves.add(row + "" + pieceToMovey);
                }
                break;
            }
        }
        //look to the bottom
        for (int row = pieceToMovex + 1; row <= pieceToMovex + 7; row++) {
            if (row > 7) {
                break;
            }
            String occupyColor = String.valueOf(board[row][pieceToMovey].charAt(1));
            if (board[row][pieceToMovey].equals("emps")) {
                legalmoves.add(row + "" + pieceToMovey);
            } else if (pieceColor.equals("W")) {
                if (occupyColor.equals("B")) {
                    legalmoves.add(row + "" + pieceToMovey);
                }
                break;
            } else if (pieceColor.equals("B")) {
                if (occupyColor.equals("W")) {
                    legalmoves.add(row + "" + pieceToMovey);
                }
                break;
            }
        }
        //looking diagonally low-right
        int col = pieceToMovey;
        for (int row = pieceToMovex + 1; row <= pieceToMovex + 7; row++) {
            col++;
            if (col > 7 || row > 7) {
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
        //looking diagonally up-right
        col = pieceToMovey;
        for (int row = pieceToMovex - 1; row >= pieceToMovex - 7; row--) {
            col++;
            if (col > 7 || row < 0) {
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
        //looking diagonally low-left
        int row = pieceToMovex;
        for (col = pieceToMovey - 1; col >= pieceToMovey - 7; col--) {
            row++;
            if (col < 0 || row > 7) {
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
        //looking diagonally upper-left
        row = pieceToMovex;
        for (col = pieceToMovey - 1; col >= pieceToMovey - 7; col--) {
            row--;
            if (col < 0 || row < 0) {
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
