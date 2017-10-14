package org.academiadecodigo.battleship.ships;

import org.academiadecodigo.battleship.grid.Position;

public class Destroyer extends Ship {

    private ShipType type = ShipType.DESTROYER;

    private Position[] positions = new Position[type.getNumPositions()];

    public Destroyer() {

    }
}
