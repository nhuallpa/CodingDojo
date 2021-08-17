package com.gol;

public class Cell {
    private boolean alive;
    public Cell(boolean alive) {
        this.alive = alive;
    }
    
    public boolean isAlive() {
        return alive;
    }
    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void checkNeighbourhood(Neighbourhood neighbourhood) {
        if (isAlive())
        {            
            if (neighbourhood.getLives() < 2 || neighbourhood.getLives() > 3)
            {
                this.alive = false;
            }
        }
        else
        {
            if (neighbourhood.getLives() == 3) {
                this.alive = true;
            }
        }
    }
}
