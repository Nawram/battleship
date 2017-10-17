package org.academiadecodigo.battleship;

import org.academiadecodigo.battleship.grid.Grid;
import org.academiadecodigo.battleship.ship.Ship;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseEventType;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;

/**
 * Created by codecadet on 14/10/17.
 */
public class Game {

    private Player player = new Player();
    Ship ship = new Ship();
    private Grid g1 = new Grid(2, 2, 40);

    public void init() {

        g1.gridInit();

        System.out.println(g1.getX());
        System.out.println(g1.getY());
        if (player.getX() > g1.getX() && player.getX() < (g1.getX() + g1.getCellSize())) {

            System.out.println(player.getX());
            System.out.println(player.getY());

        }

/*
        Rectangle rect = new Rectangle(g1.getX(), g1.getY() - 23, g1.getCellSize(), g1.getCellSize());
        rect.setColor(Color.RED);
        rect.fill();
        }
        */
    }
}


