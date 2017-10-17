package org.academiadecodigo.battleship.grid;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Created by codecadet on 14/10/17.
 */
public class Grid {

    private int PADDING = 10;
    private int STUPIDFUCKINGMOUSESHIT = 23;
    private int cols;
    private int rows;
    private int cellSize;
    private Rectangle grid;

    public Grid(int cols, int rows, int cellSize) {
        this.cols = cols;
        this.rows = rows;
        this.cellSize = cellSize;
    }

    public void gridInit() {

        grid = new Rectangle(PADDING, PADDING, cellSize * cols, cellSize * rows);
        grid.draw();
    }

    public int getCellSize() {
        return cellSize;
    }

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }

    public int getX() {
        return grid.getX();
    }

    public int getY() {
        return grid.getY();
    }

}
