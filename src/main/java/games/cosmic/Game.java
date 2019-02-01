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
    public ArrayList<Player> players;
    private LinkedList<CosmicCard> deck;

    private GameInit init;

    private enum EncounterPhase {
        REGROUP, DESTINY, LAUNCH, ALLIANCE, PLANNING, REVEAL, RESOLUTION
    }

    public Game(int numPlayers) {
        this.numPlayers = numPlayers - 1;
        this.players = new ArrayList<>();
        //this.playerTurn =
        this.currentPhase = EncounterPhase.REGROUP;
        this.init = new GameInit(this, this.numPlayers);
        init();
    }

    private void init() {
        init.planets();
        init.players();


    }


    public ArrayList<Player> getPlayers() {
        return players;
    }

    private void initCosmicDeck() {
        deck = new LinkedList<>();
        // -------------- Encounter cards --------------------------
        addCardToDeck(CosmicCard.Type.ENCOUNTER, 0);
        addCardToDeck(CosmicCard.Type.ENCOUNTER, 1);
        addCardToDeck(CosmicCard.Type.ENCOUNTER, 7);
        addCardToDeck(CosmicCard.Type.ENCOUNTER, 9);
        addCardToDeck(CosmicCard.Type.ENCOUNTER, 11);
        addCardToDeck(CosmicCard.Type.ENCOUNTER, 5);
        addCardToDeck(CosmicCard.Type.ENCOUNTER, 13);
        addCardToDeck(CosmicCard.Type.ENCOUNTER, 14);
        addCardToDeck(CosmicCard.Type.ENCOUNTER, 23);
        addCardToDeck(CosmicCard.Type.ENCOUNTER, 30);
        addCardToDeck(CosmicCard.Type.ENCOUNTER, 40);
        addCardToDeck(CosmicCard.Type.MORPH);

        for (int i = 0; i < 2; i++) {
            addCardToDeck(CosmicCard.Type.ENCOUNTER, 12);
            addCardToDeck(CosmicCard.Type.ENCOUNTER, 14);
            addCardToDeck(CosmicCard.Type.ENCOUNTER, 20);
            addCardToDeck(CosmicCard.Type.REINFORCEMENT, 2);
        }

        for (int i = 0; i < 3; i++) {
            addCardToDeck(CosmicCard.Type.REINFORCEMENT, 3);
        }


        for (int i = 0; i < 4; i++) {
            addCardToDeck(CosmicCard.Type.ENCOUNTER, 4);
            addCardToDeck(CosmicCard.Type.ENCOUNTER, 10);
        }

        for (int i = 0; i < 7; i++) {
            addCardToDeck(CosmicCard.Type.ENCOUNTER, 6);
            addCardToDeck(CosmicCard.Type.ENCOUNTER, 8);
        }

        for (int i = 0; i < 15; i++) {
            addCardToDeck(CosmicCard.Type.NEGOTIATE);
        }

//    Artifact Cards
//
//    2x Card Zap
//    2x Cosmic Zap
//    1x Emotion Control
//    1x Force Field
//    1x Ionic Gas
//    2x Moebius Tubes
//    1x Plague
//    1x Quash

    }

    private void addCardToDeck(CosmicCard.Type cardType, int atkValue) {
        Encounter card = new Encounter(cardType);
        card.setAttack(atkValue);
        deck.add(card);

    }

    private void addCardToDeck(CosmicCard.Type cardType) {
        deck.add(new Encounter(cardType));
    }


}
