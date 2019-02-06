package games.cosmic.cards;

public abstract class CosmicCard {

    protected Type cardType;
    protected Action action;

    public enum Type {
        ENCOUNTER, //encounter
        ARTIFACT,
        MORPH, //encounter
        NEGOTIATE, //encounter
        FLARE,
        REINFORCEMENT
    }

    public Type getType() {
        return this.cardType;
    }

    public Action getAction(){
        return action;
    }

}
