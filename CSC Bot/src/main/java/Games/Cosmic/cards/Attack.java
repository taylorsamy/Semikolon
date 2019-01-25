package games.cosmic.cards;

public class Attack extends Encounter{

  private int atkValue;
  
  public Attack(int atkValue) {
    this.atkValue = atkValue;
  }
  
  public void getAttack() {
    return this.atkValue; 
  }

}
