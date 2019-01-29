package games.cosmic;

import games.cosmic.cards.Card;

import java.util.ArrayList;

public class Player {

    public enum Colour {
        RED, GREEN, BLUE, YELLOW, PURPLE
    }

    private ArrayList<Colony> colonies;
    private ArrayList<Card> hand;
    private ArrayList<Player> allies;

    private int playerNum;

    private Colour colour;

    public Player(int playerNumber) {
        playerNum = playerNumber;
        initPlayer();
        initColonies();
    }

    private void initColonies(){
        //for ()
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
