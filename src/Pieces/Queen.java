package Pieces;

public class Queen extends Piece{

    public Queen(boolean killed) {
        super(killed);
    }

    public boolean canMove(){
        return true;
    }
}
