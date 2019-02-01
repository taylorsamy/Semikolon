package games.comsic.cards;

import games.cosmic.cards.CosmicCard;
import games.cosmic.cards.Reinforcement;
import org.junit.Test;
import static org.junit.Assert.*;

public class ReinforcementCardTest {
    @Test
    public void testCardCreation() {
        CosmicCard card = new Reinforcement(CosmicCard.Type.REINFORCEMENT, (short)2);
        assertEquals(card.getAction(), 2);
    }
}
