package day17;

public enum ChessPiece {
    KING_WHITE(100,"♔"), KING_BLACK(100, "♚"),
    QUEEN_WHITE(9,"Королева біла"), QUEEN_BLACK(9,"Королева чорна"),
    ROOK_WHITE(5,"Ладья біла"), ROOK_BLACK(5,"Ладья чорна"),
    KNIGHT_WHITE(3,"♘"), KNIGHT_BLACK(3,"♞"),
    EMPTY(-1,"_");
    private int value;
    private String description;

    ChessPiece(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }
}
