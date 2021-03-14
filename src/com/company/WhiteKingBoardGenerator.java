package com.company;

class WhiteKingBoardGenerator {
    private final String[][] board;
    private final int pieceToMovex;
    private final int pieceToMovey;

    public WhiteKingBoardGenerator(String[][] board, int pieceToMovex, int pieceToMovey) {
        this.board = board;
        this.pieceToMovex = pieceToMovex;
        this.pieceToMovey = pieceToMovey;
    }

    public void invoke() {
        String pieceColor = String.valueOf(board[pieceToMovex][pieceToMovey].charAt(1));

        for (int scanX = 0; scanX <= 7; scanX++) {
            for (int scanY = 0; scanY <= 7; scanY++) {
                String occupyType = String.valueOf(board[scanX][scanY].charAt(0));
                String occupyColor = String.valueOf(board[scanX][scanY].charAt(1));
                if (occupyType.equals("P") && (occupyColor.equals("W"))) {
                    System.out.println("White Pawn found at " + board[scanX][scanY]);
                    int row = scanX + 1;
                    if (!(row > 7)) {
                            if (board[row][scanY].equals("emps")) {
                                board[row][scanY] = "Wchk";
                            }
                        }
                    row = scanX + 1;
                    int col = scanY + 1;
                    if (!(row > 7 || col > 7)) {
                        if (board[row][col].equals("emps")) {
                            board[row][col] = "Wchk";
                        }
                    }
                    row = scanX + 1;
                    col = scanY - 1;
                    if (!(row > 7 || col < 0)) {
                        if (board[row][col].equals("emps")) {
                            board[row][col] = "Wchk";
                        }
                    }
                }
                if (occupyType.equals("P") && (occupyColor.equals("B"))) {
                    System.out.println("Black Pawn found at " + board[scanX][scanY]);
                    int row = scanX - 1;
                    if (!(row < 0)) {
                        if (board[row][scanY].equals("emps")) {
                            board[row][scanY] = "Wchk";
                        }
                    }
                    row = scanX - 1;
                    int col = scanY - 1;
                    if (!(row < 0 || col < 0)) {
                        if (board[row][col].equals("emps")) {
                            board[row][col] = "Wchk";
                        }
                    }
                    row = scanX - 1;
                    col = scanY + 1;
                    if (!(row < 0 || col > 7)) {
                        if (board[row][col].equals("emps")) {
                            board[row][col] = "Wchk";
                        }
                    }
                }
                if (occupyType.equals("R") && (occupyColor.equals("W"))) {
                    System.out.println("White Rook found at " + board[scanX][scanY]);
                    //look to the right
                    for (int col = scanY + 1; col <= scanY + 7; col++) {
                        if (col > 7) {
                            break;
                        }
                        if (board[scanX][col].equals("emps")) {
                            board[scanX][col] = "Wchk";
                        } else {
                            if (!board[scanX][col].equals("Wchk")) {
                                break;
                            }
                        }
                    }
                    //look to the left
                    for (int col = scanY - 1; col >= scanY - 7; col--) {
                        if (col < 0) {
                            break;
                        }
                        if (board[scanX][col].equals("emps")) {
                            board[scanX][col] = "Wchk";
                        } else {
                            if (!board[scanX][col].equals("Wchk")) {
                                break;
                            }
                        }
                    }
                    //look to the top
                    for (int row = scanX - 1; row >= scanX - 7; row--) {
                        if (row < 0) {
                            break;
                        }
                        if (board[row][scanY].equals("emps")) {
                            board[row][scanY] = "Wchk";
                        } else {
                            if (!board[row][scanY].equals("Wchk")) {
                                break;
                            }
                        }
                    }
                    //look to the bottom
                    for (int row = scanX + 1; row <= scanX + 7; row++) {
                        if (row > 7) {
                            break;
                        }
                        if (board[row][scanY].equals("emps")) {
                            board[row][scanY] = "Wchk";
                        } else {
                            if (!board[row][scanY].equals("Wchk")) {
                                break;
                            }
                        }
                    }
                }
                if (occupyType.equals("R") && (occupyColor.equals("B"))) {
                    System.out.println("Black Rook found at " + board[scanX][scanY]);
                    //look to the right
                    for (int col = scanY + 1; col <= scanY + 7; col++) {
                        if (col > 7) {
                            break;
                        }
                        if (board[scanX][col].equals("emps")) {
                            board[scanX][col] = "Bchk";
                        } else {
                            if (!board[scanX][col].equals("Bchk")) {
                                break;
                            }
                        }
                    }
                    //look to the left
                    for (int col = scanY - 1; col >= scanY - 7; col--) {
                        if (col < 0) {
                            break;
                        }
                        if (board[scanX][col].equals("emps")) {
                            board[scanX][col] = "Bchk";
                        } else {
                            if (!board[scanX][col].equals("Bchk")) {
                                break;
                            }
                        }
                    }
                    //look to the top
                    for (int row = scanX - 1; row >= scanX - 7; row--) {
                        if (row < 0) {
                            break;
                        }
                        if (board[row][scanY].equals("emps")) {
                            board[row][scanY] = "Bchk";
                        } else {
                            if (!board[row][scanY].equals("Bchk")) {
                                break;
                            }
                        }
                    }
                    //look to the bottom
                    for (int row = scanX + 1; row <= scanX + 7; row++) {
                        if (row > 7) {
                            break;
                        }
                        if (board[row][scanY].equals("emps")) {
                            board[row][scanY] = "Bchk";
                        } else {
                            if (!board[row][scanY].equals("Bchk")) {
                                break;
                            }
                        }
                    }
                }
                if (occupyType.equals("B") && (occupyColor.equals("W"))) {
                    System.out.println("White Bishop found at " + board[scanX][scanY]);
                    //looking diagonally low-right
                    int col = scanY;
                    for (int row = scanX + 1; row <= scanX + 7; row++) {
                        col++;
                        if (col > 7 || row > 7) {
                            break;
                        }
                        if (board[row][col].equals("emps")) {
                            board[row][col] = "Wchk";
                        } else {
                            if (!board[row][col].equals("Wchk")) {
                                break;
                            }
                        }
                    }
                    //looking diagonally up-right
                    col = scanY;
                    for (int row = scanX - 1; row >= scanX - 7; row--) {
                        col++;
                        if (col > 7 || row < 0) {
                            break;
                        }
                        if (board[row][col].equals("emps")) {
                            board[row][col] = "Wchk";
                        } else {
                            if (!board[row][col].equals("Wchk")) {
                                break;
                            }
                        }
                    }
                    //looking diagonally low-left
                    int row = scanX;
                    for (col = scanY - 1; col >= scanY - 7; col--) {
                        row++;
                        if (col < 0 || row > 7) {
                            break;
                        }
                        if (board[row][col].equals("emps")) {
                            board[row][col] = "Wchk";
                        } else {
                            if (!board[row][col].equals("Wchk")) {
                                break;
                            }
                        }
                    }
                    //looking diagonally upper-left
                    row = scanX;
                    for (col = scanY - 1; col >= scanY - 7; col--) {
                        row--;
                        if (col < 0 || row < 0) {
                            break;
                        }
                        if (board[row][col].equals("emps")) {
                            board[row][col] = "Wchk";
                        } else {
                            if (!board[row][col].equals("Wchk")) {
                                break;
                            }
                        }
                    }
                }
                if (occupyType.equals("B") && (occupyColor.equals("B"))) {
                    System.out.println("Black Bishop found at " + board[scanX][scanY]);
                    //looking diagonally low-right
                    int col = scanY;
                    for (int row = scanX + 1; row <= scanX + 7; row++) {
                        col++;
                        if (col > 7 || row > 7) {
                            break;
                        }
                        if (board[row][col].equals("emps")) {
                            board[row][col] = "Bchk";
                        } else {
                            if (!board[row][col].equals("Bchk")) {
                                break;
                            }
                        }
                    }
                    //looking diagonally up-right
                    col = scanY;
                    for (int row = scanX - 1; row >= scanX - 7; row--) {
                        col++;
                        if (col > 7 || row < 0) {
                            break;
                        }
                        if (board[row][col].equals("emps")) {
                            board[row][col] = "Bchk";
                        } else {
                            if (!board[row][col].equals("Bchk")) {
                                break;
                            }
                        }
                    }
                    //looking diagonally low-left
                    int row = scanX;
                    for (col = scanY - 1; col >= scanY - 7; col--) {
                        row++;
                        if (col < 0 || row > 7) {
                            break;
                        }
                        if (board[row][col].equals("emps")) {
                            board[row][col] = "Bchk";
                        } else {
                            if (!board[row][col].equals("Bchk")) {
                                break;
                            }
                        }
                    }
                    //looking diagonally upper-left
                    row = scanX;
                    for (col = scanY - 1; col >= scanY - 7; col--) {
                        row--;
                        if (col < 0 || row < 0) {
                            break;
                        }
                        if (board[row][col].equals("emps")) {
                            board[row][col] = "Bchk";
                        } else {
                            if (!board[row][col].equals("Bchk")) {
                                break;
                            }
                        }
                    }
                }
                if (occupyType.equals("Q") && (occupyColor.equals("W"))) {
                    System.out.println("White Queen found at " + board[scanX][scanY]);
                    //look to the right
                    for (int col = scanY + 1; col <= scanY + 7; col++) {
                        if (col > 7) {
                            break;
                        }
                        if (board[scanX][col].equals("emps")) {
                            board[scanX][col] = "Wchk";
                        } else {
                            if (!board[scanX][col].equals("Wchk")) {
                                break;
                            }
                        }
                    }
                    //look to the left
                    for (int col = scanY - 1; col >= scanY - 7; col--) {
                        if (col < 0) {
                            break;
                        }
                        if (board[scanX][col].equals("emps")) {
                            board[scanX][col] = "Wchk";
                        } else {
                            if (!board[scanX][col].equals("Wchk")) {
                                break;
                            }
                        }
                    }
                    //look to the top
                    for (int row = scanX - 1; row >= scanX - 7; row--) {
                        if (row < 0) {
                            break;
                        }
                        if (board[row][scanY].equals("emps")) {
                            board[row][scanY] = "Wchk";
                        } else {
                            if (!board[row][scanY].equals("Wchk")) {
                                break;
                            }
                        }
                    }
                    //look to the bottom
                    for (int row = scanX + 1; row <= scanX + 7; row++) {
                        if (row > 7) {
                            break;
                        }
                        if (board[row][scanY].equals("emps")) {
                            board[row][scanY] = "Wchk";
                        } else {
                            if (!board[row][scanY].equals("Wchk")) {
                                break;
                            }
                        }
                    }
                    //looking diagonally low-right
                    int col = scanY;
                    for (int row = scanX + 1; row <= scanX + 7; row++) {
                        col++;
                        if (col > 7 || row > 7) {
                            break;
                        }
                        if (board[row][col].equals("emps")) {
                            board[row][col] = "Wchk";
                        } else {
                            if (!board[row][col].equals("Wchk")) {
                                break;
                            }
                        }
                    }
                    //looking diagonally up-right
                    col = scanY;
                    for (int row = scanX - 1; row >= scanX - 7; row--) {
                        col++;
                        if (col > 7 || row < 0) {
                            break;
                        }
                        if (board[row][col].equals("emps")) {
                            board[row][col] = "Wchk";
                        } else {
                            if (!board[row][col].equals("Wchk")) {
                                break;
                            }
                        }
                    }
                    //looking diagonally low-left
                    int row = scanX;
                    for (col = scanY - 1; col >= scanY - 7; col--) {
                        row++;
                        if (col < 0 || row > 7) {
                            break;
                        }
                        if (board[row][col].equals("emps")) {
                            board[row][col] = "Wchk";
                        } else {
                            if (!board[row][col].equals("Wchk")) {
                                break;
                            }
                        }
                    }
                    //looking diagonally upper-left
                    row = scanX;
                    for (col = scanY - 1; col >= scanY - 7; col--) {
                        row--;
                        if (col < 0 || row < 0) {
                            break;
                        }
                        if (board[row][col].equals("emps")) {
                            board[row][col] = "Wchk";
                        } else {
                            if (!board[row][col].equals("Wchk")) {
                                break;
                            }
                        }
                    }
                }
                if (occupyType.equals("Q") && (occupyColor.equals("B"))) {
                    System.out.println("Black Queen found at " + board[scanX][scanY]);
                    //look to the right
                    for (int col = scanY + 1; col <= scanY + 7; col++) {
                        if (col > 7) {
                            break;
                        }
                        if (board[scanX][col].equals("emps")) {
                            board[scanX][col] = "Bchk";
                        } else {
                            if (!board[scanX][col].equals("Bchk")) {
                                break;
                            }
                        }
                    }
                    //look to the left
                    for (int col = scanY - 1; col >= scanY - 7; col--) {
                        if (col < 0) {
                            break;
                        }
                        if (board[scanX][col].equals("emps")) {
                            board[scanX][col] = "Bchk";
                        } else {
                            if (!board[scanX][col].equals("Bchk")) {
                                break;
                            }
                        }
                    }
                    //look to the top
                    for (int row = scanX - 1; row >= scanX - 7; row--) {
                        if (row < 0) {
                            break;
                        }
                        if (board[row][scanY].equals("emps")) {
                            board[row][scanY] = "Bchk";
                        } else {
                            if (!board[row][scanY].equals("Bchk")) {
                                break;
                            }
                        }
                    }
                    //look to the bottom
                    for (int row = scanX + 1; row <= scanX + 7; row++) {
                        if (row > 7) {
                            break;
                        }
                        if (board[row][scanY].equals("emps")) {
                            board[row][scanY] = "Bchk";
                        } else {
                            if (!board[row][scanY].equals("Bchk")) {
                                break;
                            }
                        }
                    }
                    //looking diagonally low-right
                    int col = scanY;
                    for (int row = scanX + 1; row <= scanX + 7; row++) {
                        col++;
                        if (col > 7 || row > 7) {
                            break;
                        }
                        if (board[row][col].equals("emps")) {
                            board[row][col] = "Bchk";
                        } else {
                            if (!board[row][col].equals("Bchk")) {
                                break;
                            }
                        }
                    }
                    //looking diagonally up-right
                    col = scanY;
                    for (int row = scanX - 1; row >= scanX - 7; row--) {
                        col++;
                        if (col > 7 || row < 0) {
                            break;
                        }
                        if (board[row][col].equals("emps")) {
                            board[row][col] = "Bchk";
                        } else {
                            if (!board[row][col].equals("Bchk")) {
                                break;
                            }
                        }
                    }
                    //looking diagonally low-left
                    int row = scanX;
                    for (col = scanY - 1; col >= scanY - 7; col--) {
                        row++;
                        if (col < 0 || row > 7) {
                            break;
                        }
                        if (board[row][col].equals("emps")) {
                            board[row][col] = "Bchk";
                        } else {
                            if (!board[row][col].equals("Bchk")) {
                                break;
                            }
                        }
                    }
                    //looking diagonally upper-left
                    row = scanX;
                    for (col = scanY - 1; col >= scanY - 7; col--) {
                        row--;
                        if (col < 0 || row < 0) {
                            break;
                        }
                        if (board[row][col].equals("emps")) {
                            board[row][col] = "Bchk";
                        } else {
                            if (!board[row][col].equals("Bchk")) {
                                break;
                            }
                        }
                    }
                }
                if (occupyType.equals("N") && (occupyColor.equals("W"))) {
                    System.out.println("White Knight found at " + board[scanX][scanY]);
                    //2 right then down 1
                    int row = scanX + 2;
                    int col = scanY + 1;
                    if (row > 7 || col > 7) {
                        break;
                    } else {
                        if (board[row][col].equals("emps")) {
                            board[row][col] = "Wchk";
                        }
                    }
                    //down 2 then 1 right
                    row = scanX + 1;
                    col = scanY + 2;
                    if (row > 7 || col > 7) {
                        break;
                    } else {
                        if (board[row][col].equals("emps")) {
                            board[row][col] = "Wchk";
                        }
                    }
                    //up 1 then right 2
                    row = scanX - 1;
                    col = scanY + 2;
                    if (row < 0 || col > 7) {
                        break;
                    } else {
                        if (board[row][col].equals("emps")) {
                            board[row][col] = "Wchk";
                        }
                    }
                    //up 2 then right 1
                    row = scanX - 2;
                    col = scanY + 1;
                    if (row < 0 || col > 7) {
                        break;
                    } else {
                        if (board[row][col].equals("emps")) {
                            board[row][col] = "Wchk";
                        }
                    }
                    //down 2 then left 1
                    row = scanX + 2;
                    col = scanY - 1;
                    if (row > 8 || col < 0) {
                        break;
                    } else {
                        if (board[row][col].equals("emps")) {
                            board[row][col] = "Wchk";
                        }
                    }
                    //down 1 then left 2
                    row = scanX + 1;
                    col = scanY - 2;
                    if (row > 8 || col < 0) {
                        break;
                    } else {
                        if (board[row][col].equals("emps")) {
                            board[row][col] = "Wchk";
                        }
                    }
                    //up 1 then left 2
                    row = scanX - 1;
                    col = scanY - 2;
                    if (row < 0 || col < 0) {
                        break;
                    } else {
                        if (board[row][col].equals("emps")) {
                            board[row][col] = "Wchk";
                        }
                    }
                    //up 2 then left 1
                    row = scanX - 2;
                    col = scanY - 1;
                    if (row < 0 || col < 0) {
                        break;
                    } else {
                        if (board[row][col].equals("emps")) {
                            board[row][col] = "Wchk";
                        }
                    }
                }
                if (occupyType.equals("N") && (occupyColor.equals("B"))) {
                    System.out.println("Black Knight found at " + board[scanX][scanY]);
                    //2 right then down 1
                    int row = scanX + 2;
                    int col = scanY + 1;
                    if (row > 7 || col > 7) {
                        break;
                    } else {
                        if (board[row][col].equals("emps")) {
                            board[row][col] = "Bchk";
                        }
                    }
                    //down 2 then 1 right
                    row = scanX + 1;
                    col = scanY + 2;
                    if (row > 7 || col > 7) {
                        break;
                    } else {
                        if (board[row][col].equals("emps")) {
                            board[row][col] = "Bchk";
                        }
                    }
                    //up 1 then right 2
                    row = scanX - 1;
                    col = scanY + 2;
                    if (row < 0 || col > 7) {
                        break;
                    } else {
                        if (board[row][col].equals("emps")) {
                            board[row][col] = "Bchk";
                        }
                    }
                    //up 2 then right 1
                    row = scanX - 2;
                    col = scanY + 1;
                    if (row < 0 || col > 7) {
                        break;
                    } else {
                        if (board[row][col].equals("emps")) {
                            board[row][col] = "Bchk";
                        }
                    }
                    //down 2 then left 1
                    row = scanX + 2;
                    col = scanY - 1;
                    if (row > 8 || col < 0) {
                        break;
                    } else {
                        if (board[row][col].equals("emps")) {
                            board[row][col] = "Bchk";
                        }
                    }
                    //down 1 then left 2
                    row = scanX + 1;
                    col = scanY - 2;
                    if (row > 8 || col < 0) {
                        break;
                    } else {
                        if (board[row][col].equals("emps")) {
                            board[row][col] = "Bchk";
                        }
                    }
                    //up 1 then left 2
                    row = scanX - 1;
                    col = scanY - 2;
                    if (row < 0 || col < 0) {
                        break;
                    } else {
                        if (board[row][col].equals("emps")) {
                            board[row][col] = "Bchk";
                        }
                    }
                    //up 2 then left 1
                    row = scanX - 2;
                    col = scanY - 1;
                    if (row < 0 || col < 0) {
                        break;
                    } else {
                        if (board[row][col].equals("emps")) {
                            board[row][col] = "Bchk";
                        }
                    }
                }
                if (occupyType.equals("K") && (occupyColor.equals("W"))) {
                    System.out.println("White King found at " + board[scanX][scanY]);
                        //scan col to left of king
                        int row = scanX - 1;
                        int col = scanY - 1;
                        if (!(row < 0 || col < 0)) {
                            if(board[row][col].equals("emps")) {
                                board[row][scanY] = "Wchk";
                            }
                        }
                        row = scanX - 1;
                        col = scanY;

                        if (!(row < 0 )) {
                            if(board[row][col].equals("emps")) {
                                board[row][scanY] = "Wchk";
                            }
                        }
                        row = scanX - 1;
                        col = scanY + 1;

                        if (!(row < 0 || col > 7)) {
                            if(board[row][col].equals("emps")) {
                                board[row][scanY] = "Wchk";
                            }
                        }
                        row = scanX;
                        col = scanY + 1;

                        if (!( col > 7)) {
                            if(board[row][col].equals("emps")) {
                                board[row][scanY] = "Wchk";
                            }
                        }
                        row = scanX + 1;
                        col = scanY + 1;

                        if (!( row > 7 ||col > 7)) {
                            if(board[row][col].equals("emps")) {
                                board[row][scanY] = "Wchk";
                            }
                        }
                        row = scanX + 1;
                        col = scanY;

                        if (!( row > 7 )) {
                            if(board[row][col].equals("emps")) {
                                board[row][scanY] = "Wchk";
                            }
                        }
                        row = scanX + 1;
                        col = scanY - 1;

                        if (!( row > 7 || col < 0)) {
                            if(board[row][col].equals("emps")) {
                                board[row][scanY] = "Wchk";
                            }
                        }
                        row = scanX;
                        col = scanY - 1;

                        if (!( row > 7 || col < 0)) {
                            if(board[row][col].equals("emps")) {
                                board[row][scanY] = "Wchk";
                            }
                        }
                }
                if (occupyType.equals("K") && (occupyColor.equals("B"))) {
                    System.out.println("Black Knight found at " + board[scanX][scanY]);
                    int row = scanX - 1;
                    int col = scanY - 1;
                    if (!(row < 0 || col < 0)) {
                        if(board[row][col].equals("emps")) {
                            board[row][scanY] = "Bchk";
                        }
                    }
                    row = scanX - 1;
                    col = scanY;

                    if (!(row < 0 )) {
                        if(board[row][col].equals("emps")) {
                            board[row][scanY] = "Bchk";
                        }
                    }
                    row = scanX - 1;
                    col = scanY + 1;

                    if (!(row < 0 || col > 7)) {
                        if(board[row][col].equals("emps")) {
                            board[row][scanY] = "Bchk";
                        }
                    }
                    row = scanX;
                    col = scanY + 1;

                    if (!( col > 7)) {
                        if(board[row][col].equals("emps")) {
                            board[row][scanY] = "Bchk";
                        }
                    }
                    row = scanX + 1;
                    col = scanY + 1;

                    if (!( row > 7 ||col > 7)) {
                        if(board[row][col].equals("emps")) {
                            board[row][scanY] = "Bchk";
                        }
                    }
                    row = scanX + 1;
                    col = scanY;

                    if (!( row > 7 )) {
                        if(board[row][col].equals("emps")) {
                            board[row][scanY] = "Bchk";
                        }
                    }
                    row = scanX + 1;
                    col = scanY - 1;

                    if (!( row > 7 || col < 0)) {
                        if(board[row][col].equals("emps")) {
                            board[row][scanY] = "Bchk";
                        }
                    }
                    row = scanX;
                    col = scanY - 1;

                    if (!( row > 7 || col < 0)) {
                        if(board[row][col].equals("emps")) {
                            board[row][scanY] = "Bchk";
                        }
                    }
                }
            }
        }
    }
}


