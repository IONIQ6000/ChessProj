package com.company;

public class kingBoardGenerator {
    private String[][] board;
    private final int pieceToMovex;
    private final int pieceToMovey;

    public kingBoardGenerator(String[][] board, int pieceToMovex, int pieceToMovey) {
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
                    for (int row = scanX + 1; row <= (scanX + 1); row++) {
                        if (row > 7) {
                            break;
                        } else {
                            if (board[row][scanY].equals("emps")) {
                                board[row][scanY] = "Wchk";
                            } else {
                                break;
                            }
                        }
                    }
                    for (int row = scanX + 1; row <= (scanX + 1); row++) {
                        for (int col = scanY + 1; col <= (scanY + 1); col++) {
                            if (row > 7 || col > 7) {
                                break;
                            } else {
                                if (board[row][col].equals("emps")) {
                                    board[row][col] = "Wchk";
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                    for (int row = scanX + 1; row <= (scanX + 1); row++) {
                        for (int col = scanY - 1; col <= (scanY - 1); col++) {
                            if (row > 7 || col < 0) {
                                break;
                            } else {
                                if (board[row][col].equals("emps")) {
                                    board[row][col] = "Wchk";
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                }
                if (occupyType.equals("P") && (occupyColor.equals("B"))) {
                    System.out.println("Black Pawn found at " + board[scanX][scanY]);
                    for (int row = scanX - 1; row <= (scanX - 1); row++) {
                        if (row < 0) {
                            break;
                        } else {
                            if (board[row][scanY].equals("emps")) {
                                board[row][scanY] = "Bchk";
                            } else {
                                break;
                            }
                        }
                    }
                    for (int row = scanX - 1; row <= (scanX - 1); row++) {
                        for (int col = scanY - 1; col <= (scanY - 1); col++) {
                            if (row < 0 || col < 0) {
                                break;
                            } else {
                                if (board[row][col].equals("emps")) {
                                    board[row][col] = "Bchk";
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                    for (int row = scanX - 1; row <= (scanX - 1); row++) {
                        for (int col = scanY + 1; col <= (scanY + 1); col++) {
                            if (row < 0 || col > 7) {
                                break;
                            } else {
                                if (board[row][col].equals("emps")) {
                                    board[row][col] = "Bchk";
                                } else {
                                    break;
                                }
                            }
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
                    System.out.println("White Queen found at " + board[scanX][scanY]);
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
            }
        }
    }
}


