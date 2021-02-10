package day17;

public class Task2 {
    public static void main(String[] args) {
        ChessPiece rook_white = ChessPiece.ROOK_WHITE;
        ChessPiece rook_black = ChessPiece.ROOK_BLACK;
        ChessPiece king_black = ChessPiece.KING_BLACK;
        ChessPiece king_white = ChessPiece.KING_WHITE;
        ChessPiece pawn_black = ChessPiece.PAWN_BLACK;
        ChessPiece pawn_white = ChessPiece.PAWN_BLACK;
        ChessPiece knight_black = ChessPiece.KNIGHT_BLACK;
        ChessPiece knight_white = ChessPiece.KNIGHT_WHITE;
        ChessPiece queen_white = ChessPiece.QUEEN_WHITE;
        ChessPiece queen_black = ChessPiece.QUEEN_BLACK;
        ChessPiece bishop_black = ChessPiece.BISHOP_BLACK;
        ChessPiece bishop_white = ChessPiece.BISHOP_WHITE;

        ChessPiece[][] chessBoardMassObject = new ChessPiece[8][8];
        ChessBoard chessBoard = new ChessBoard(chessBoardMassObject);
        chessBoardMassObject[0][0] = rook_black;
        chessBoardMassObject[0][5] = rook_black;
        chessBoardMassObject[0][6] = king_black;
        chessBoardMassObject[1][1] = rook_white;
        chessBoardMassObject[1][4] = pawn_black;
        chessBoardMassObject[1][5] = pawn_black;
        chessBoardMassObject[1][7] = pawn_black;
        chessBoardMassObject[2][0] = pawn_black;
        chessBoardMassObject[2][2] = knight_black;
        chessBoardMassObject[2][6] = king_black;
        chessBoardMassObject[3][0] = queen_black;
        chessBoardMassObject[3][3] = bishop_white;
        chessBoardMassObject[4][3] = bishop_black;
        chessBoardMassObject[4][4] = pawn_white;
        chessBoardMassObject[5][4] = bishop_white;
        chessBoardMassObject[5][5] = pawn_white;
        chessBoardMassObject[6][0] = pawn_white;
        chessBoardMassObject[6][3] = queen_white;
        chessBoardMassObject[6][5] = pawn_white;
        chessBoardMassObject[6][7] = pawn_white;
        chessBoardMassObject[7][5] = rook_white;
        chessBoardMassObject[7][6] = king_white;

        chessBoard.print();
    }
}
