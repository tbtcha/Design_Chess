package Chess;

import Pieces.*;

import java.util.ArrayList;
import java.util.Date;

public class Board {
    private Date creationDate;
    private Box box;
    ArrayList<Piece> pieces = new ArrayList<Piece>();

    public Board(Date creationDate) {
        this.creationDate = creationDate;
        this.box = new Box(63,63);
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        this.box = new Box(63,63);
    }

    public ArrayList<Piece> getPieces(){
        Piece queen = new Queen(false);
        Piece king = new King(false,false);
        Piece knight = new Knight(false);
        Piece bishop = new Bishop(false);
        Piece rock = new Rock(false);
        Piece pawn = new Pawn(false);
        pieces.add(queen);
        pieces.add(king);
        pieces.add(knight);
        pieces.add(bishop);
        pieces.add(rock);
        pieces.add(pawn);
        return pieces;
    }

    public void resetBoard(){
        System.out.printf("Board was reset");
    }
}
