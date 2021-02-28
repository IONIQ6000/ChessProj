package com.company;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {


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
            System.out.println(str.charAt(0));
        }
        for (String str : blist) {
            System.out.println(str.charAt(0));
        }

        for (String str : wlist) {
            int inumx = (str.charAt(1) - 'a');
            int inumy = Integer.parseInt(str.substring(2)) - 1;
            str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
            StringBuffer strbuf = new StringBuffer(str);
            strbuf.insert(1,'W');
            str = String.valueOf(strbuf);
            board[inumx][inumy] = str;
            System.out.println(inumx + "" + inumy);
        }
        for (String str : blist) {
            int inumx = (str.charAt(1) - 'a');
            int inumy = Integer.parseInt(str.substring(2)) - 1;
            str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
            StringBuffer strbuf = new StringBuffer(str);
            strbuf.insert(1,'B');
            str = String.valueOf(strbuf);
            board[inumx][inumy] = str;
            System.out.println(inumx + "" + inumy);
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
        if(board[pieceToMovex][pieceToMovey].equals("emps")){
            System.out.println("Empty!");
        }
        System.out.println(pieceToMove);

        String pieceType = String.valueOf(pieceToMove.charAt(0));

        System.out.println(pieceType);
        if (pieceType.equals("P")) {
            System.out.println("True" + pieceToMove);
            int inumx = (pieceToMove.charAt(1) - 'a');
            int inumy = Integer.parseInt(pieceToMove.substring(2)) - 1;

            if (board[inumx + 1][inumy].equals("emps") && board[inumx + 2][inumy].equals("emps")) {
                System.out.println("True Move");
            }
            else
            {

                String ifPawn = String.valueOf(board[inumx + 1][inumy].charAt(0));
                String ifPawnType = String.valueOf(board[inumx + 1][inumy].charAt(1));
                if (ifPawn.equals("P") && ifPawnType.equals("W")){
                    System.out.println("White Pawn found");
                }
            }

        }
    }


