package Pieces;

public class Rock extends Piece{
    public Rock(boolean killed) {
        super(killed);
    }

    boolean canMove(){
        return true;
    }
}
