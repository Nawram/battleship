package org.academiadecodigo.battleship.ships;

import org.academiadecodigo.battleship.grid.Position;

/**
 * Created by codecadet on 14/10/17.
 */
public enum ShipType {
    BATTLESHIP(4,1),
    CRUISER(3,2),
    SUBMARINE(2,3),
    DESTROYER(1,4);

    private int numPositions;
    private Position[] positions = new Position[numPositions];
    private int numberOfShips;

    ShipType(int numPositions, int numberOfShips) {
        this.positions = positions;
        this.numPositions = numPositions;
        this.numberOfShips = numberOfShips;
    }

    public int getNumPositions() {
        return numPositions;
    }
}
