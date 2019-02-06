package games.cosmic;

import games.cosmic.cards.CosmicCard;
import games.cosmic.cards.Encounter;

import java.util.ArrayList;
import java.util.LinkedList;

public class Game {

    public Planet[] redPlanets;
    public Planet[] greenPlanets;
    public Planet[] bluePlanets;
    public Planet[] yellowPlanets;
    public Planet[] purplePlanets;
    private EncounterPhase currentPhase;
    private int numPlayers;
    private int playerTurn;
    private ArrayList<Player> players;
    private LinkedList<CosmicCard> deck;

    private GameInit init;

    private enum EncounterPhase {
        REGROUP, DESTINY, LAUNCH, ALLIANCE, PLANNING, REVEAL, RESOLUTION
    }

    public Game(int numPlayers) {
        this.numPlayers = numPlayers - 1;
        this.players = new ArrayList<>();
        this.deck = new LinkedList<>();
        //this.playerTurn =
        this.currentPhase = EncounterPhase.REGROUP;
        this.init = new GameInit(this, this.numPlayers);
        init();
    }

    private void init() {
        init.planets();
        init.players();
        init.deck();
    }


    public ArrayList<Player> getPlayers() {
        return players;
    }

    public LinkedList<CosmicCard> getDeck() {
        return deck;
    }

}
