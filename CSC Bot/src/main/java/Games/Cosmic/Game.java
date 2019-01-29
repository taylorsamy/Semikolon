public class Game {

  private enum EncounterPhase {
    REGROUP, DESTINY, LAUNCH, ALLIANCE, PLANNING, REVEAL, RESOLUTION
  };
  private EncounterPhase currentPhase;
  
  private int numPlayers;
  private int playerTurn;
  
  public Game(int numPlayers) {
    this.numPlayers = numPlayers;
    //this.playerTurn = 
    this.currentPhase = EncounterPhase.REGROUP;
  }

}
