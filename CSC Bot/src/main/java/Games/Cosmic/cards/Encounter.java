package games.cosmic.cards;

public class Encounter extends Card {

  public enum Type{ATTACK, NEGOTIATE, MORPH}
  
  private int attackValue;
  private Type encounterType;
  
  public Encounter(Type encounterType) {
    this.encounterType = encounterType;
    this.attackValue = 0;
  }
  
  public int getAttack() {
    return this.attackValue; 
  }
  
  public Type getType() {
    return this.encounterType;
  }
  
  public void setAttack(int attackValue) {
    this.attackValue = attackValue; 
  }

}
