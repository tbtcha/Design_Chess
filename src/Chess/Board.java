package Chess;

import Pieces.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Board {
    private ZonedDateTime creationDate;
    private Box box;
    ArrayList<Piece> pieces = new ArrayList<Piece>();
    ZonedDateTime now = ZonedDateTime.now();

    public Board() {
        this.creationDate = now;
        this.box = new Box(63,63);
    }

    public ZonedDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(ZonedDateTime creationDate) {
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
