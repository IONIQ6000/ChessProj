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
        String pieceColor = String.valueOf(board[pieceToMovex][pieceToMovey].charAt(1));
        //2 right then down 1
        int row = pieceToMovex + 2;
        int col = pieceToMovey + 1;
        String occupyColor;
        if (row > 7 || col > 7) {
            System.out.println("Out of Bounds - going down 1 then 2 right");

        } else {
            occupyColor = String.valueOf(board[row][col].charAt(1));
            if (board[row][col].equals("emps")) {
                legalmoves.add(row + "" + col);
                board[row][col] = "KKKK";
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
        //down 2 then 1 right
        row = pieceToMovex + 1;
        col = pieceToMovey + 2;
        if (row > 7 || col > 7) {
            System.out.println("Out of Bounds - going down 2 then 1 right");

        } else {
            occupyColor = String.valueOf(board[row][col].charAt(1));
            if (board[row][col].equals("emps")) {
                legalmoves.add(row + "" + col);
                board[row][col] = "KKKK";
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
        //up 1 then right 2
        row = pieceToMovex - 1;
        col = pieceToMovey + 2;
        if (row < 0 || col > 7) {
            System.out.println("Out of Bounds - going left 1 then down 2");

        } else {
            occupyColor = String.valueOf(board[row][col].charAt(1));
            if (board[row][col].equals("emps")) {
                legalmoves.add(row + "" + col);
                board[row][col] = "KKKK";
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
        //up 2 then right 1
        row = pieceToMovex - 2;
        col = pieceToMovey + 1;
        if (row < 0 || col > 7) {
            System.out.println("Out of Bounds - going left 2 then down 1");

        } else {
            occupyColor = String.valueOf(board[row][col].charAt(1));
            if (board[row][col].equals("emps")) {
                legalmoves.add(row + "" + col);
                board[row][col] = "KKKK";
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
        //down 2 then left 1
        row = pieceToMovex + 2;
        col = pieceToMovey - 1;
        if (row > 8 || col < 0) {
            System.out.println("Out of Bounds - going down 2 then left 1");

        } else {
            occupyColor = String.valueOf(board[row][col].charAt(1));
            if (board[row][col].equals("emps")) {
                legalmoves.add(row + "" + col);
                board[row][col] = "KKKK";
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
        //down 1 then left 2
        row = pieceToMovex + 1;
        col = pieceToMovey - 2;
        if (row > 8 || col < 0) {
            System.out.println("Out of Bounds - going down 2 then left 1");

        } else {
            occupyColor = String.valueOf(board[row][col].charAt(1));
            if (board[row][col].equals("emps")) {
                legalmoves.add(row + "" + col);
                board[row][col] = "KKKK";
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
        //up 1 then left 2
        row = pieceToMovex - 1;
        col = pieceToMovey - 2;
        if (row < 0 || col < 0) {
            System.out.println("Out of Bounds - going up 1 then left 2");

        } else {
            occupyColor = String.valueOf(board[row][col].charAt(1));
            if (board[row][col].equals("emps")) {
                legalmoves.add(row + "" + col);
                board[row][col] = "KKKK";
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
        //up 2 then left 1
        row = pieceToMovex - 2;
        col = pieceToMovey - 1;
        if (row < 0 || col < 0) {
            System.out.println("Out of Bounds - going up 2 then left 1");

        } else {
            occupyColor = String.valueOf(board[row][col].charAt(1));
            if (board[row][col].equals("emps")) {
                legalmoves.add(row + "" + col);
                board[row][col] = "KKKK";
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
}
