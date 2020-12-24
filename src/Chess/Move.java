package Chess;

import People.Player;
import Pieces.Piece;

public class Move {
    private Box startBox;
    private Box endingBox;
    private Piece pieceKilled;
    private Player player;
    private boolean isCastlingMove;

    public Move(Box startBox, Box endingBox, Piece pieceKilled, Player player, boolean isCastlingMove) {
        this.startBox = startBox;
        this.endingBox = endingBox;
        this.pieceKilled = pieceKilled;
        this.player = player;
        this.isCastlingMove = isCastlingMove;
    }

    public Box getStartBox() {
        return startBox;
    }

    public void setStartBox(Box startBox) {
        this.startBox = startBox;
    }

    public Box getEndingBox() {
        return endingBox;
    }

    public void setEndingBox(Box endingBox) {
        this.endingBox = endingBox;
    }

    public Piece getPieceKilled() {
        return pieceKilled;
    }

    public void setPieceKilled(Piece pieceKilled) {
        this.pieceKilled = pieceKilled;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public boolean isCastlingMove() {
        return isCastlingMove;
    }

    public void setCastlingMove(boolean castlingMove) {
        isCastlingMove = castlingMove;
        System.out.printf("Castling was set");
    }
}
