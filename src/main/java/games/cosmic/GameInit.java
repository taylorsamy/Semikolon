package games.cosmic;

import games.cosmic.cards.CosmicCard;
import games.cosmic.cards.Encounter;

import static games.cosmic.Player.Colour.*;
import static games.cosmic.Player.Colour.PURPLE;
import static games.cosmic.Player.Colour.YELLOW;

public class GameInit {
    private Game g;
    private int numPlayers;


    public GameInit(Game g, int numPlayers) {
        this.g = g;
        this.numPlayers = numPlayers;
    }
    public void planets() {
        switch (numPlayers) {
            case 4:
                g.purplePlanets = new Planet[]{
                        new Planet(PURPLE), new Planet(PURPLE), new Planet(PURPLE), new Planet(PURPLE), new Planet(PURPLE)
                };
            case 3:
                g.yellowPlanets = new Planet[]{
                        new Planet(YELLOW), new Planet(YELLOW), new Planet(YELLOW), new Planet(YELLOW), new Planet(YELLOW)
                };
            case 2:
                g.bluePlanets = new Planet[]{
                        new Planet(BLUE), new Planet(BLUE), new Planet(BLUE), new Planet(BLUE), new Planet(BLUE)
                };
            case 1:
                g.greenPlanets = new Planet[]{
                        new Planet(GREEN), new Planet(GREEN), new Planet(GREEN), new Planet(GREEN), new Planet(GREEN)
                };
            case 0:
                g.redPlanets = new Planet[]{
                        new Planet(RED), new Planet(RED), new Planet(RED), new Planet(RED), new Planet(RED)
                };

        }


    }

    public void players() {
        for (int i = 0; i <= numPlayers; i++) {
            g.getPlayers().add(new Player(i, g));
        }
    }

    public void deck() {

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
        g.getDeck().add(card);

    }

    private void addCardToDeck(CosmicCard.Type cardType) {
        g.getDeck().add(new Encounter(cardType));
    }




}
