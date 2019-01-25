package games.cosmic.cards;

public class Encounter extends Card {

  public enum Type{ATTACK, NEGOTIATE, MORPH}
  
  private int atkValue;
  private Type encounterType;
  
  public Encounter(Type encounterType) {
    this.encounterType = encounterType;
    this.atkValue = 0;
  }
  
  public int getAttack() {
    return this.atkValue; 
  }
  
  public Type getType() {
    return this.enounterType;
  }
  
  public void setAttack(int attackValue) {
    this.attackValue = attackValue; 
  }

}
