package games.comsic;

import games.cosmic.Game;
import games.cosmic.Player;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest { // added comment for testing

    @Test
    public void testPlayerColours() {
        Game g = new Game(5);
        assertEquals(g.getPlayers().get(0).getColour(), Player.Colour.RED);
        assertEquals(g.getPlayers().get(1).getColour(), Player.Colour.GREEN);
        assertEquals(g.getPlayers().get(2).getColour(), Player.Colour.BLUE);
        assertEquals(g.getPlayers().get(3).getColour(), Player.Colour.YELLOW);
        assertEquals(g.getPlayers().get(4).getColour(), Player.Colour.PURPLE);
    }

    @Test
    public void testPlayerColonies() {
        Game g = new Game(5);
        assertEquals(g.getPlayers().get(0).getColonies().size(), 5);
        assertEquals(g.getPlayers().get(1).getColonies().size(), 5);
        assertEquals(g.getPlayers().get(2).getColonies().size(), 5);
        assertEquals(g.getPlayers().get(3).getColonies().size(), 5);
        assertEquals(g.getPlayers().get(4).getColonies().size(), 5);
    }



}
