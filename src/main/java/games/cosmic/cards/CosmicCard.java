package games.cosmic.cards;

public abstract class CosmicCard {

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



    public abstract int getAction();

}
