package Pieces;

public class King extends Piece{
    private boolean castlingDone;

    public King(boolean killed, boolean castlingDone) {
        super(killed);
        this.castlingDone = castlingDone;
    }

    public boolean isCastlingDone() {
        return castlingDone;
    }

    public void setCastlingDone(boolean castlingDone) {
        this.castlingDone = castlingDone;
    }

    public boolean canMove(){
        return true;
    }
}
