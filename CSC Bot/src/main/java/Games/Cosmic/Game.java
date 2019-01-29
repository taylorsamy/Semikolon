public class Game {

  private enum EncounterPhase {REGROUP, DESTINY, LAUNCH, ALLIANCE, PLANNING, REVEAL, RESOLUTION};
  private EncounterPhase currentPhase;
  
  private int numPlayers;
  
  public Game(int numPlayers) {
    this.numPlayers = numPlayers;
  }

}
