package games.cosmic;

import games.cosmic.cards.CosmicCard;
import games.cosmic.cards.Encounter;

import java.util.ArrayList;
import java.util.LinkedList;

import static games.cosmic.Player.Colour.*;

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

    public Game(int numPlayers) {
        this.numPlayers = numPlayers;
        this.players = new ArrayList<>();
        //this.playerTurn =
        this.currentPhase = EncounterPhase.REGROUP;
        initPlanets();
        initPlayers();
    }

    private void initPlanets() {
        redPlanets = new Planet[]{
                new Planet(RED), new Planet(RED), new Planet(RED), new Planet(RED), new Planet(RED)
        };
        greenPlanets = new Planet[]{
                new Planet(GREEN), new Planet(GREEN), new Planet(GREEN), new Planet(GREEN), new Planet(GREEN)
        };
        bluePlanets = new Planet[]{
                new Planet(BLUE), new Planet(BLUE), new Planet(BLUE), new Planet(BLUE), new Planet(BLUE)
        };
        yellowPlanets = new Planet[]{
                new Planet(YELLOW), new Planet(YELLOW), new Planet(YELLOW), new Planet(YELLOW), new Planet(YELLOW)
        };
        purplePlanets = new Planet[]{
                new Planet(PURPLE), new Planet(PURPLE), new Planet(PURPLE), new Planet(PURPLE), new Planet(PURPLE)
        };
    }

    private void initPlayers() {
        for (int i = 0; i < numPlayers; i++) {
            players.add(new Player(i, this));
        }
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

        for (int i = 0; i < 4; i++) {
            addCardToDeck(CosmicCard.Type.ENCOUNTER, 4);
            addCardToDeck(CosmicCard.Type.ENCOUNTER, 10);
        }

        for (int i = 0; i < 7; i++) {
            addCardToDeck(CosmicCard.Type.ENCOUNTER, 6);
            addCardToDeck(CosmicCard.Type.ENCOUNTER, 8);
        }

        for (int i = 0; i < 2; i++) {
            addCardToDeck(CosmicCard.Type.ENCOUNTER, 12);
            addCardToDeck(CosmicCard.Type.ENCOUNTER, 14);
            addCardToDeck(CosmicCard.Type.ENCOUNTER, 20);
        }

        addCardToDeck(CosmicCard.Type.MORPH);

        for (int i = 0; i < 15; i++) {
            addCardToDeck(CosmicCard.Type.NEGOTIATE);
        }




//    Cosmic Deck
//
//    Encounter Cards
//
//    1x Attack 00 //
//    1x Attack 01 //
//    4x Attack 04 //
//    1x Attack 05 //
//    7x Attack 06 //
//    1x Attack 07 //
//    7x Attack 08 //
//    1x Attack 09 //
//    4x Attack 10 //
//    1x Attack 11//
//    2x Attack 12//
//    1x Attack 13
//    2x Attack 14//
//    1x Attack 15
//    2x Attack 20//
//    1x Attack 23
//    1x Attack 30
//    1x Attack 40
//
//    1x Morph
//    15x Negotiate
//
//    Reinforcement Cards
//
//    2x Reinforcement +2
//    3x Reinforcement +3
//    1x Reinforcement +5
//
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

    private enum EncounterPhase {
        REGROUP, DESTINY, LAUNCH, ALLIANCE, PLANNING, REVEAL, RESOLUTION
    }


}
