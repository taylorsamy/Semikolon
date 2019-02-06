package games.cosmic.cards;

public class Encounter extends CosmicCard {



    public Encounter(CosmicCard.Type cardType) {
        this.cardType = cardType;
        this.action.setAtk(0);
    }

    public void setAttack(int attackValue) {
        this.action.setAtk(attackValue);
    }


}
