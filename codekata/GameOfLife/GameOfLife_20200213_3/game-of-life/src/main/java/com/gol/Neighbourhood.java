package com.gol;

public class Neighbourhood {
    private int lives = 0;
    public Neighbourhood(int lives) {
        if (lives < 0 || lives > 8) {
            throw new IllegalArgumentException();
        }
        this.lives = lives;
    }
    
    public int getLives()
    {
        return this.lives;
    }
}
