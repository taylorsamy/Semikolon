package games.cosmic.cards;

public class Reinforcement extends CosmicCard {



    public Reinforcement(Type type, int atk){
        this.action.setAtk(atk);
        this.cardType = type;
    }



}
