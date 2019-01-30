package games.comsic;

import games.cosmic.Colony;
import games.cosmic.Game;
import games.cosmic.Planet;
import games.cosmic.Player;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlanetTest {

    @Test
    public void testPlanetColonies() {
        Game g = new Game(5);

        for (Planet p : g.redPlanets) {
            for (Colony c : p.getColonies()) {
                assertEquals(c.getOwner().getColour(), Player.Colour.RED);
                assertEquals(c.getShips(), 4);
            }
        }
        for (Planet p : g.greenPlanets) {
            for (Colony c : p.getColonies()) {
                assertEquals(c.getOwner().getColour(), Player.Colour.GREEN);
                assertEquals(c.getShips(), 4);
            }
        }
        for (Planet p : g.bluePlanets) {
            for (Colony c : p.getColonies()) {
                assertEquals(c.getOwner().getColour(), Player.Colour.BLUE);
                assertEquals(c.getShips(), 4);
            }
        }
        for (Planet p : g.yellowPlanets) {
            for (Colony c : p.getColonies()) {
                assertEquals(c.getOwner().getColour(), Player.Colour.YELLOW);
                assertEquals(c.getShips(), 4);
            }
        }
        for (Planet p : g.purplePlanets) {
            for (Colony c : p.getColonies()) {
                assertEquals(c.getOwner().getColour(), Player.Colour.PURPLE);
                assertEquals(c.getShips(), 4);
            }
        }
    }

}
