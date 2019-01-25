package games.cosmic.cards;

public class Technology extends Card {
  
  private int researchNum;
  
  public Technology(int researchNum) {
    this.researchNum = researchNum;
  }
  
  public int getResearchNum() {
    return this.researchNum; 
  }
  
}
