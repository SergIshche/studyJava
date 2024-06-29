package day17;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] pieces = new ChessPiece[8];

        for (int i = 0; i < 4; i++) {
            pieces[i] = ChessPiece.KNIGHT_WHITE;
            pieces[i + 4] = ChessPiece.KING_BLACK;
        }

        for (ChessPiece piece : pieces) {
            System.out.print(piece.getDescription() + " ");
        }
    }
}