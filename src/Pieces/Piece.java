package Pieces;

public class Piece {
    private boolean killed;

    public Piece(boolean killed) {
        this.killed = killed;
    }

    public void setKilled(boolean killed) {
        this.killed = killed;
    }

    boolean isWhite(){
        return true;
    }

    boolean isKilled(){
        return true;
    }

    boolean canMove(){
        return true;
    }
}
