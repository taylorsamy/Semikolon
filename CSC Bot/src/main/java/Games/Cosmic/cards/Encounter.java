package games.cosmic.cards;

public class Encounter extends CosmicCard {


    private int attackValue;


    public Encounter(CosmicCard.Type cardType) {
        this.cardType = cardType;
        this.attackValue = 0;
    }

    public int getAttack() {
        return this.attackValue;
    }

    public void setAttack(int attackValue) {
        this.attackValue = attackValue;
    }


}
