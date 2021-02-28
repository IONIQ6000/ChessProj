package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class Main {



    private static void chlist(String[][] board, List<String> blist) {
        for(String str : blist) {
            int inumx = (str.charAt(1) - 'a');
            int inumy = Integer.parseInt(str.substring(2))-1;
            board[inumx][inumy] = str;
            System.out.println(inumx+""+inumy);
        }
    }

    public static void main(String[] args) {
        String[][] board = new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = "emp";
                System.out.print(board[i][j]  + " ");
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


        for(String str : wlist) {
            System.out.println(str.charAt(0));
        }
        for(String str : blist) {
            System.out.println(str.charAt(0));
        }

        chlist(board, wlist);

        chlist(board, blist);

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Piece to move: ");
        String pieceToMove = in.nextLine();

        String pieceType = String.valueOf((Character.toUpperCase(pieceToMove.charAt(0))));
        
        System.out.println(pieceType);

        if(pieceType.equals("P")) {
            Pawn.pawnMethod();
        }



        }


}

