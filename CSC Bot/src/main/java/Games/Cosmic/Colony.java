package games.cosmic;

public class Colony {

    private int ships;
    private Planet planet;
    private Player owner;

    //private Planet planet;

    public Colony(int ships, Player owner, Planet planet) {
        this.ships = ships;
        this.planet = planet;
        this.owner = owner;
    }

    public int getShips() {
        return ships;
    }
    
    
    
}
