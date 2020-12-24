package Pieces;

public class Pawn extends Piece{

    public Pawn(boolean killed) {
        super(killed);
    }

    boolean canMove(){
        return true;
    }
}
