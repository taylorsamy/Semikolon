package games.cosmic;

import java.util.ArrayList;

public class Game {

  private enum EncounterPhase {
    REGROUP, DESTINY, LAUNCH, ALLIANCE, PLANNING, REVEAL, RESOLUTION
  }
  private EncounterPhase currentPhase;
  
  private int numPlayers;
  private int playerTurn;
  private ArrayList<Player> players;
  
  public Game(int numPlayers) {
    this.numPlayers = numPlayers;
    //this.playerTurn = 
    this.currentPhase = EncounterPhase.REGROUP;
  }


  private void initPlayers() {
    for (int i = 0; i < numPlayers; i++) {
      players.add(new Player(i));
    }
  }


}
