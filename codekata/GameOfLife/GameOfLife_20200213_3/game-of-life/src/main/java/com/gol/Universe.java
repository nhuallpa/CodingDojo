package com.gol;

public class Universe {

    private Cell[][] cells;

    public Universe(Cell[][] cells) {
        this.cells = cells;
    }

    public void transicionar() {
        int width = cells.length;
        int height = cells[0].length;
        Neighbourhood[][] neighbourhoods = new Neighbourhood[width][height];
        // TODO Mover parte de estas responsabilidades a neighbourhood
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int cantidadVivos = contarVivos(width, height, y, x);
                neighbourhoods[x][y] = new Neighbourhood(cantidadVivos);
            }
        }
        
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                cells[x][y].checkNeighbourhood(neighbourhoods[x][y]);
            }
        }
    }

    private int contarVivos(int width, int height, int y, int x) {
        int cantidadVivos = 0;
        // -1 -1
        if (x > 0 && y > 0 && cells[x-1][y-1].isAlive()) cantidadVivos++;
        //  0 -1
        if (y > 0 && cells[x][y-1].isAlive()) cantidadVivos++;
        // +1 -1
        if (x < width - 1 && y > 0 && cells[x+1][y-1].isAlive()) cantidadVivos++;
        
        // -1  0
        if (x > 0 && cells[x-1][y].isAlive()) cantidadVivos++;
        // +1  0
        if (x < width - 1 && cells[x+1][y].isAlive()) cantidadVivos++;
        
        // -1 +1
        if (x > 0 && y < height - 1 && cells[x-1][y+1].isAlive()) cantidadVivos++;
        //  0 +1
        if (y < height - 1 && cells[x][y+1].isAlive()) cantidadVivos++;
        // +1 +1
        if (x < width - 1 && y < height - 1 && cells[x+1][y+1].isAlive()) cantidadVivos++;
        return cantidadVivos;
    }

    public Cell[][] getCells() {
        return cells;
    }
    
}
