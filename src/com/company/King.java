package com.company;

import java.util.List;

class King {
    private final String[][] board;
    private final int pieceToMovex;
    private final int pieceToMovey;
    private final List<String> legalmoves;

    public King(String[][] board, int pieceToMovex, int pieceToMovey, List<String> legalmoves) {
        this.board = board;
        this.pieceToMovex = pieceToMovex;
        this.pieceToMovey = pieceToMovey;
        this.legalmoves = legalmoves;
    }

    public void invoke() {
        String pieceColor = String.valueOf(board[pieceToMovex][pieceToMovey].charAt(1));
        //scan col to left of king
        int row = pieceToMovex - 1;
        int col = pieceToMovey - 1;
        if (!(row < 0 || col < 0)) {
            String occupyColor = String.valueOf(board[row][col].charAt(1));
            if(board[row][col].equals("emps")) {
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
        row = pieceToMovex - 1;
        col = pieceToMovey;

        if (!(row < 0 )) {
            String occupyColor = String.valueOf(board[row][col].charAt(1));
            if(board[row][col].equals("emps")) {
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
        row = pieceToMovex - 1;
        col = pieceToMovey + 1;

        if (!(row < 0 || col > 7)) {
            String occupyColor = String.valueOf(board[row][col].charAt(1));
            if(board[row][col].equals("emps")) {
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
        row = pieceToMovex;
        col = pieceToMovey + 1;

        if (!( col > 7)) {
            String occupyColor = String.valueOf(board[row][col].charAt(1));
            if(board[row][col].equals("emps")) {
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
        row = pieceToMovex + 1;
        col = pieceToMovey + 1;

        if (!( row > 7 ||col > 7)) {
            String occupyColor = String.valueOf(board[row][col].charAt(1));
            if(board[row][col].equals("emps")) {
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
        row = pieceToMovex + 1;
        col = pieceToMovey;

        if (!( row > 7 )) {
            String occupyColor = String.valueOf(board[row][col].charAt(1));
            if(board[row][col].equals("emps")) {
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
        row = pieceToMovex + 1;
        col = pieceToMovey - 1;

        if (!( row > 7 || col < 0)) {
            String occupyColor = String.valueOf(board[row][col].charAt(1));
            if(board[row][col].equals("emps")) {
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
        row = pieceToMovex;
        col = pieceToMovey - 1;

        if (!( row > 7 || col < 0)) {
            String occupyColor = String.valueOf(board[row][col].charAt(1));
            if(board[row][col].equals("emps")) {
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
}