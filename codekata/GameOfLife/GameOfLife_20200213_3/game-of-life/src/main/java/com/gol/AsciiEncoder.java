package com.gol;

public class AsciiEncoder {

    public static final AsciiEncoder ENCODER = new AsciiEncoder();
    
    public Cell[][] decode(String texto) {
        String[] lineas = texto.split("\n");
        int width = lineas[0].length();
        int height = lineas.length;
        
        Cell[][] cells = new Cell[width][height];
        for (int y = 0; y < height; y++) {
            String linea = lineas[y];
            for (int x = 0; x < linea.length(); x++) {
                boolean isAlive = linea.charAt(x) == '*';
                cells[x][y] = new Cell(isAlive);
            }
        }
        return cells;
    }

    public String encode(Cell[][] cells) {
        StringBuffer stringBuffer = new StringBuffer();
        
        for (int y = 0; y < cells[0].length; y++) {
            for (int x = 0; x < cells.length; x++) {
                stringBuffer.append((cells[x][y].isAlive()) ? "*" : " " );
            }
            if (y < cells[0].length - 1)
                stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }

}
