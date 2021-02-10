package day17;

import java.util.Arrays;

public class ChessBoard {
    private ChessPiece[][] chessPieces;
    ChessPiece empty = ChessPiece.EMPTY;

    public ChessBoard(ChessPiece[][] chessPieces) {
        for (int i = 0; i < chessPieces.length; i++) {
            for (int j = 0; j < chessPieces[i].length; j++) {
                chessPieces[i][j] = empty;
                this.chessPieces = chessPieces;
            }
        }
    }

    public void print() {
        for (int i = 0; i < chessPieces.length; i++) {
            System.out.println();
            for (int j = 0; j < chessPieces[i].length; j++) {
                System.out.print(chessPieces[i][j] + " ");
            }
        }


    }
}
