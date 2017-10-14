package org.academiadecodigo.battleship.ships;

/**
 * Created by codecadet on 14/10/17.
 */
public class Ship {

    private ShipType shipType;
    private int numberHitsPossible;
    private ShipOrientation orientation;

    public Ship(ShipType type) {
        numberHitsPossible = shipType.getNumPositions();
    }

    public boolean isDestroyed() {
        return numberHitsPossible <= 0;
    }

    public void hit() {

        numberHitsPossible--;
    }

}
