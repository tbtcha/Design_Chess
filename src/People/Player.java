package People;

import Chess.GameController;
import Datatypes.Person;
import enums.AccountStatus;

public class Player extends Account{
    private Person person;
    private int totalGamesPlayed;
    private boolean whiteSide;
    private GameController gameController;

    public Player(int id, String password, AccountStatus status, Person person, int totalGamesPlayed, boolean whiteSide) {
        super(id, password, status);
        this.person = person;
        this.totalGamesPlayed = totalGamesPlayed;
        this.whiteSide = whiteSide;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getTotalGamesPlayed() {
        return totalGamesPlayed;
    }

    public void setTotalGamesPlayed(int totalGamesPlayed) {
        this.totalGamesPlayed = totalGamesPlayed;
    }

    public void setWhiteSide(boolean whiteSide) {
        this.whiteSide = whiteSide;
    }

    public GameController getGameController() {
        return gameController;
    }

    public void setGameController(GameController gameController) {
        this.gameController = gameController;
    }

    public boolean isWhiteSide(){
        if (whiteSide==true){
            return true;
        }
        else return false;
    }

    public boolean isChecked(){
        return false;
    }
}
