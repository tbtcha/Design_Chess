package Chess;

import People.Player;
import enums.GameStatus;

import java.util.ArrayList;

public class Game {
    private ArrayList<Move> movesPlayed;
    private Player currentTurn;
    private GameStatus status;
    private GameView gameView;
    private Move move;
    private Board board;
    private Player[] players;

    public Game(ArrayList<Move> movesPlayed, Player currentTurn, GameStatus status, Move move, Board board, Player player1, Player player2) {
        this.movesPlayed = movesPlayed;
        this.currentTurn = currentTurn;
        this.status = status;
        this.move = move;
        this.board = board;
        players[0] = player1;
        players[1] = player2;
    }

    public ArrayList<Move> getMovesPlayed() {
        return movesPlayed;
    }

    public void setMovesPlayed(ArrayList<Move> movesPlayed) {
        this.movesPlayed = movesPlayed;
    }

    public Player getCurrentTurn() {
        return currentTurn;
    }

    public void setCurrentTurn(Player currentTurn) {
        this.currentTurn = currentTurn;
    }

    public GameStatus getStatus() {
        return status;
    }

    public void setStatus(GameStatus status) {
        this.status = status;
    }

    public GameView getGameView() {
        return gameView;
    }

    public void setGameView(GameView gameView) {
        this.gameView = gameView;
    }

    public Move getMove() {
        return move;
    }

    public void setMove(Move move) {
        this.move = move;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player player1, Player player2) {
        players[0] = player1;
        players[1] = player2;
    }

    public boolean isOver(){
        return false;
    }

    public boolean playerMoved(){
        return true;
    }

    public boolean makeMove(){
        return true;
    }
}
