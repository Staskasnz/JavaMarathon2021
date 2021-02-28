package FinalProject;

import java.util.Arrays;

public class SeaField {
    private SeaPiece[][] seaPieces;
    private String playerName;

    public SeaField(SeaPiece[][] seaPiece, String playerName) {
        for (int i = 0; i < seaPiece.length; i++) {
            for (int j = 0; j < seaPiece[i].length; j++) {
                seaPiece[i][j] = SeaPiece.EMPTY;
                this.seaPieces = seaPiece;
            }
        }
        this.playerName = playerName;
    }


    public void print() {
        for (int i = 0; i < seaPieces.length; i++) {
            for (int j = 0; j < seaPieces[i].length; j++) {
                System.out.print(seaPieces[i][j] + " ");
            }
            System.out.println();
        }
    }
}

