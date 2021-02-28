package FinalProject;

public enum SeaPiece {
    SHIP("\uD83D\uDEA2"),
    EMPTY("⬜"),
    OREO("\uD83D\uDFE6"),
    KILLED("\uD83D\uDFE5"),
    MISSING("•");

    private String notation;

    SeaPiece(String notation) {
        this.notation = notation;
    }

    public String getNotation() {
        return notation;
    }

    @Override
    public String toString() {
        return getNotation();
    }
}