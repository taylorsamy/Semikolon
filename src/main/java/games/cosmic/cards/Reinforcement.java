package games.cosmic.cards;

public class Reinforcement extends CosmicCard {

    private short atk;
    private Type type;

    public Reinforcement(Type type, short atk){
        this.atk = atk;
        this.type = type;
    }


    @Override
    public int getAction() {
        return atk;
    }
}
