package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class Main {

    private static String getCharForNumber(int i) {
        return i >= 0 && i < 27 ? String.valueOf((char) (i + 97)) : null;
    }

    public static void main(String[] args) {
        String[][] board = new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = "emps";
            }
        }

        Scanner in = new Scanner(System.in);
        System.out.println("Enter White: ");
        String whiteInput = in.nextLine();
        whiteInput = whiteInput.replaceAll("\\s", "");
        List<String> wlist = Arrays.asList(whiteInput.split(","));
        System.out.println("You entered for White " + wlist);
        for (String str : wlist) {
            int inumx = (str.charAt(1) - 'a');
            int inumy = Integer.parseInt(str.substring(2)) - 1;
            str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
            StringBuffer strbuf = new StringBuffer(str);
            strbuf.insert(1, 'W');
            str = String.valueOf(strbuf);
            board[inumx][inumy] = str;
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter Black: ");
        String blackInput = in.nextLine();
        blackInput = blackInput.replaceAll("\\s", "");
        List<String> blist = Arrays.asList(blackInput.split(","));
        System.out.println("You entered for Black " + blist);


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

        List<String> legalmoves = new ArrayList<>();

        if (pieceType.equals("P")) {
            new Pawn(board, pieceToMovex, pieceToMovey, legalmoves).invoke();
        }
        if (pieceType.equals("R")) {
            new Rook(board, pieceToMovex, pieceToMovey, legalmoves).invoke();
        }
        if (pieceType.equals("B")) {
            new Bishop(board, pieceToMovex, pieceToMovey, legalmoves).invoke();
        }
        if (pieceType.equals("Q")) {
            new Queen(board, pieceToMovex, pieceToMovey, legalmoves).invoke();
        }
        if (pieceType.equals("N")) {
            new Knight(board, pieceToMovex, pieceToMovey, legalmoves).invoke();
        }
        if (pieceType.equals("K")) {
            String pieceColor = String.valueOf(board[pieceToMovex][pieceToMovey].charAt(1));
            if (pieceColor.equals("W")){
                new WhiteKingBoardGenerator(board).invoke();
            } else if (pieceColor.equals("B")){
                new BlackKingBoardGenerator(board).invoke();
            }
            new King(board, pieceToMovex, pieceToMovey, legalmoves).invoke();
        }

        List<String> legalprint = new ArrayList<>();
        for (String str : legalmoves) {
            String letterax = getCharForNumber(Integer.parseInt(str.substring(0, 1)));
            String numax = String.valueOf((Integer.parseInt(str.substring(1))) + 1);
            legalprint.add(letterax + "" + numax);
        }
        System.out.println("Legal moves:  " + legalprint);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}




