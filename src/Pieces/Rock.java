package Pieces;

public class Rock extends Piece{
    public Rock(boolean killed) {
        super(killed);
    }

    public boolean canMove(){
        return true;
    }
}
