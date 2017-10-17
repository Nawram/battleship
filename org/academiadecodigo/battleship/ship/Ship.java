package org.academiadecodigo.battleship.ship;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Ship {

    private int x;
    private int y;
    private boolean destroyed;

    public Ship() {
        x = (int) (Math.random() * 2);
        y = (int) (Math.random() * 2);
        destroyed = false;

        Rectangle ship = new Rectangle(10 + x, 10 + y, 40, 40);
        ship.fill();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isDestroyed() {
        return destroyed;
    }
}
