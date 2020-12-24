package Chess;

import People.Player;

public class GameView {
    private Player player;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public boolean makeMove(){
        return true;
    }
}
