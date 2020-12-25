package Pieces;

public class Pawn extends Piece{

    public Pawn(boolean killed) {
        super(killed);
    }

    public boolean canMove(){
        return true;
    }
}
