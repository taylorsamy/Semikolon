package games.cosmic;

import games.cosmic.cards.Card;

import java.util.ArrayList;

public class Player {

    public enum Colour {
        RED, GREEN, BLUE, YELLOW, PURPLE
    }

    private Game game;
    private ArrayList<Colony> colonies;
    private ArrayList<Card> hand;
    private ArrayList<Player> allies;

    private int playerNum;

    private Colour colour;

    public Player(int playerNumber, Game game) {
        playerNum = playerNumber;
        this.game = game;
        initPlayer();
        initColonies();
    }

    private void initColonies(){

        switch (colour) {
            case RED:
                for (Planet p : game.redPlanets) {
                    p.addColony(new Colony(4, this, p));
                }
                break;
            case GREEN:
                for (Planet p : game.greenPlanets) {
                    p.addColony(new Colony(4, this, p));
                }
                break;
            case BLUE:
                for (Planet p : game.bluePlanets) {
                    p.addColony(new Colony(4, this, p));
                }
                break;
            case YELLOW:
                for (Planet p : game.yellowPlanets) {
                    p.addColony(new Colony(4, this, p));
                }
                break;
            case PURPLE:
                for (Planet p : game.purplePlanets) {
                    p.addColony(new Colony(4, this, p));
                }
                break;
        }

    }

    private void initPlayer() {
        switch (playerNum) {
            case 0:
                colour = Colour.RED;
                break;
            case 1:
                colour = Colour.GREEN;
                break;
            case 2:
                colour = Colour.BLUE;
                break;
            case 3:
                colour = Colour.YELLOW;
                break;
            case 4:
                colour = Colour.PURPLE;
                break;
        }
    }



}
