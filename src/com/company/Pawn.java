package com.company;


public class Pawn {

    public static void pawnMethod() {
        System.out.println("True" + Main.pieceToMove);
        int inumx = (Main.pieceToMove.charAt(1) - 'a');
        int inumy = Integer.parseInt(Main.pieceToMove.substring(2))-1;
        System.out.println(inumx+""+inumy);
        
    }
}
