package games.cosmic.cards;

public class CosmicCard {

    protected Type cardType;

    public Type getType() {
        return this.cardType;
    }

    public enum Type {
        ENCOUNTER,
        ARTIFACT,
        MORPH,
        NEGOTIATE,
        FLARE,
        REINFORCEMENT
    }

}
