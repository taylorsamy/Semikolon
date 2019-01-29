package games.cosmic;

import games.cosmic.cards.Card;

import java.util.ArrayList;

public class Player {

    public enum Colour {
        REG, GREEN, BLUE, YELLOW, PURPLE
    }

    private ArrayList<Colony> colonies;
    private ArrayList<Card> hand;
    private ArrayList<Player> allies;

    private Colour colour;

    public Player(Colour c) {
        this.colour = c;

    }



}
