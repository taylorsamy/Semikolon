package games.cosmic;

import java.util.ArrayList;

public class Planet {

    private ArrayList<Colony> colonyList;
    private Player.Colour systemColour;

    public Planet(Player.Colour systemColour) {
        this.systemColour = systemColour;
        colonyList = new ArrayList<>();
    }

    public Colony addColony(Colony c) {
        colonyList.add(c);
        return c;
    }

    public ArrayList<Colony> getColonies() {
        return colonyList;
    }

    public Player.Colour getSystemColour() {
        return systemColour;
    }
}
