package games.cosmic;

public class Colony {

    private int ships;

    private Player.Colour system;

    public Colony(int ships, Player.Colour system) {
        this.ships = ships;
        this.system = system;
    }

    public int getShips() {
        return ships;
    }

    public Player.Colour getSystem() {
        return system;
    }
}
