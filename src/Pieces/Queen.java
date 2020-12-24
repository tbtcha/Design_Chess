package Pieces;

public class Queen extends Piece{

    public Queen(boolean killed) {
        super(killed);
    }

    boolean canMove(){
        return true;
    }
}
