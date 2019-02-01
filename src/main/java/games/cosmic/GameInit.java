package games.cosmic;

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
            g.players.add(new Player(i, g));
        }
    }



}
