package com.company;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.*;


public class Main {

    private static String getCharForNumber(int i) {
        return i > 0 && i < 27 ? String.valueOf((char)(i + 97)) : null;
    }

    public static void main(String[] args) {
        String[][] board = new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = "emps";
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        Scanner in = new Scanner(System.in);
        System.out.println("Enter White: ");
        String whiteInput = in.nextLine();
        whiteInput = whiteInput.replaceAll("\\s", "");
        List<String> wlist = Arrays.asList(whiteInput.split(","));
        System.out.println("You entered for White " + wlist);
        System.out.println("Enter Black: ");
        String blackInput = in.nextLine();
        blackInput = blackInput.replaceAll("\\s", "");
        List<String> blist = Arrays.asList(blackInput.split(","));
        System.out.println("You entered for Black " + blist);

        for (String str : wlist) {
            int inumx = (str.charAt(1) - 'a');
            int inumy = Integer.parseInt(str.substring(2)) - 1;
            str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
            StringBuffer strbuf = new StringBuffer(str);
            strbuf.insert(1, 'W');
            str = String.valueOf(strbuf);
            board[inumx][inumy] = str;
        }
        for (String str : blist) {
            int inumx = (str.charAt(1) - 'a');
            int inumy = Integer.parseInt(str.substring(2)) - 1;
            str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
            StringBuffer strbuf = new StringBuffer(str);
            strbuf.insert(1, 'B');
            str = String.valueOf(strbuf);
            board[inumx][inumy] = str;
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Piece to move: ");
        String pieceToMove = in.nextLine();

        int pieceToMovex = (pieceToMove.charAt(1) - 'a');
        int pieceToMovey = Integer.parseInt(pieceToMove.substring(2)) - 1;

        pieceToMove = board[pieceToMovex][pieceToMovey];

        while (board[pieceToMovex][pieceToMovey].equals("emps")) {
            System.out.println("Empty!");
            System.out.println("Piece to move: ");
            pieceToMove = in.nextLine();
            pieceToMovex = (pieceToMove.charAt(1) - 'a');
            pieceToMovey = Integer.parseInt(pieceToMove.substring(2)) - 1;
            pieceToMove = board[pieceToMovex][pieceToMovey];

        }
        System.out.println(pieceToMove);


        String pieceType = String.valueOf(pieceToMove.charAt(0));

        List<String>legalmoves = new ArrayList<>();

        if (pieceType.equals("P")) {
            String pieceColor = String.valueOf(board[pieceToMovex][pieceToMovey].charAt(1));
            if (pieceColor.equals("W")) {
                for (int row = pieceToMovex + 1; row <= (pieceToMovex + 2); row++) {
                    if (board[row][pieceToMovey].equals("emps")) {
                        legalmoves.add(row + "" + pieceToMovey);
                    }
                    String ifPawn = String.valueOf(board[row][pieceToMovey].charAt(0));
                    String ifPawnType = String.valueOf(board[row][pieceToMovey].charAt(1));
                    if (ifPawn.equals("P") && ifPawnType.equals("W")) {
                        System.out.println("White Pawn found at " + board[row][pieceToMovey]);
                        } else if (ifPawn.equals("P") && ifPawnType.equals("B")) {
                            System.out.println("Black Pawn found at " + board[row][pieceToMovey]);
                        }



                }
            } else if (pieceColor.equals("B")) {
                for (int row = pieceToMovex - 1; row >= (pieceToMovex - 2); row--) {
                    if (board[row][pieceToMovey].equals("emps")) {
                        System.out.println("Empty space at " + board[row][pieceToMovey]);
                    } else {
                        String ifPawn = String.valueOf(board[row][pieceToMovey].charAt(0));
                        String ifPawnType = String.valueOf(board[row][pieceToMovey].charAt(1));
                        if (ifPawn.equals("P") && ifPawnType.equals("W")) {
                            System.out.println("White Pawn found at " + board[row][pieceToMovey]);
                        } else if (ifPawn.equals("P") && ifPawnType.equals("B")) {
                            System.out.println("Black Pawn found at " + board[row][pieceToMovey]);
                        }
                    }


                }
            }

        }
        String letterax;
        for (String str : legalmoves) {
            letterax = getCharForNumber(Integer.parseInt(str.substring(0,1)));
            System.out.println("Letter at pos 0 : " + letterax);
        }
        System.out.println("Legal moves:  " + legalmoves);

    }
    }




