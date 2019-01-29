package games.cosmic;

import java.util.ArrayList;

import static games.cosmic.Player.Colour.*;

public class Game {

  private enum EncounterPhase {
    REGROUP, DESTINY, LAUNCH, ALLIANCE, PLANNING, REVEAL, RESOLUTION
  }
  private EncounterPhase currentPhase;
  
  private int numPlayers;
  private int playerTurn;
  private ArrayList<Player> players;


  public Planet[] redPlanets;
  public Planet[] greenPlanets;
  public Planet[] bluePlanets;
  public Planet[] yellowPlanets;
  public Planet[] purplePlanets;
  
  public Game(int numPlayers) {
    this.numPlayers = numPlayers;
    //this.playerTurn = 
    this.currentPhase = EncounterPhase.REGROUP;
    initPlanets();
    initPlayers();
  }

  private void initPlanets() {
    redPlanets = new Planet[] {
            new Planet(RED), new Planet(RED), new Planet(RED), new Planet(RED), new Planet(RED)
    };
    greenPlanets = new Planet[] {
            new Planet(GREEN), new Planet(GREEN), new Planet(GREEN), new Planet(GREEN), new Planet(GREEN)
    };
    bluePlanets = new Planet[] {
            new Planet(BLUE), new Planet(BLUE), new Planet(BLUE), new Planet(BLUE), new Planet(BLUE)
    };
    yellowPlanets = new Planet[] {
            new Planet(YELLOW), new Planet(YELLOW), new Planet(YELLOW), new Planet(YELLOW), new Planet(YELLOW)
    };
    purplePlanets = new Planet[] {
            new Planet(PURPLE), new Planet(PURPLE), new Planet(PURPLE), new Planet(PURPLE), new Planet(PURPLE)
    };
  }

  private void initPlayers() {
    for (int i = 0; i < numPlayers; i++) {
      players.add(new Player(i, this));
    }
  }



}
