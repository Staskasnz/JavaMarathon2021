package day17;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece pawn_white = ChessPiece.PAWN_WHITE;
        ChessPiece rook_black = ChessPiece.ROOK_BLACK;
        List<ChessPiece> chessPieces = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            chessPieces.add(pawn_white);
        }
        for (int i = 0; i < 4; i++) {
            chessPieces.add(rook_black);
        }
        for (ChessPiece chessPiece : chessPieces) {
            System.out.print(chessPiece + " ");
        }
    }
}