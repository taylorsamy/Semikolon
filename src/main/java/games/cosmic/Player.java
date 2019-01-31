package games.cosmic;

import games.cosmic.cards.CosmicCard;

import java.util.ArrayList;

public class Player {

    public enum Colour {
        RED, GREEN, BLUE, YELLOW, PURPLE
    }

    private Game game;
    private ArrayList<Colony> colonies;
    private ArrayList<CosmicCard> hand;
    private ArrayList<Player> allies;

    private int playerNum;

    private Colour colour;

    public Player(int playerNumber, Game game) {
        playerNum = playerNumber;
        this.game = game;
        colonies = new ArrayList<>();
        initPlayer();
        initColonies();
    }

    public Colour getColour() {
        return colour;
    }

    public ArrayList<Colony> getColonies() {
        return colonies;
    }

    private void initColonies() {

        switch (colour) {
            case RED:
                for (Planet p : game.redPlanets) {
                    colonies.add(p.addColony(new Colony(4, this, p)));
                }
                break;
            case GREEN:
                for (Planet p : game.greenPlanets) {
                    colonies.add(p.addColony(new Colony(4, this, p)));
                }
                break;
            case BLUE:
                for (Planet p : game.bluePlanets) {
                    colonies.add(p.addColony(new Colony(4, this, p)));
                }
                break;
            case YELLOW:
                for (Planet p : game.yellowPlanets) {
                    colonies.add(p.addColony(new Colony(4, this, p)));
                }
                break;
            case PURPLE:
                for (Planet p : game.purplePlanets) {
                    colonies.add(p.addColony(new Colony(4, this, p)));
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