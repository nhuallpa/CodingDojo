package com.gol;

import static org.junit.Assert.*;

import org.junit.Test;

public class AsciiEncoderTest {

    @Test
    public void testDecode() {
        // given: Un texto
        // **  *
        //    * 
        // *  * 
        AsciiEncoder asciiEncoder = new AsciiEncoder();
        String texto = "**  * \n" + 
                       "    * \n" +
                       "*   * ";
        // when: se lo decodifica
        Cell[][] cells = asciiEncoder.decode(texto);
        // then: arma una matriz con celulas vivas donde habia "*" y muertas donde estaba " "
        assertEquals(6, cells.length);
        assertEquals(3, cells[0].length);
        
        assertTrue(cells[0][0].isAlive());
        assertTrue(cells[1][0].isAlive());
        assertFalse(cells[2][0].isAlive());
        assertFalse(cells[3][0].isAlive());
        assertTrue(cells[4][0].isAlive());
        assertFalse(cells[5][0].isAlive());
        
        assertFalse(cells[0][1].isAlive());
        assertFalse(cells[1][1].isAlive());
        assertFalse(cells[2][1].isAlive());
        assertFalse(cells[3][1].isAlive());
        assertTrue(cells[4][1].isAlive());
        assertFalse(cells[5][1].isAlive());
        
        assertTrue(cells[0][2].isAlive());
        assertFalse(cells[1][2].isAlive());
        assertFalse(cells[2][2].isAlive());
        assertFalse(cells[3][2].isAlive());
        assertTrue(cells[4][2].isAlive());
        assertFalse(cells[5][2].isAlive());
        
    }
    @Test
    public void testEncode() {
        // given: Una matriz de cells con la siguiente disposicion
        // **  *
        //    * 
        // *  * 
        Cell[][] cells = new Cell[6][3];
        cells[0][0]= new Cell(true);
        cells[1][0]= new Cell(true);
        cells[2][0]= new Cell(false);
        cells[3][0]= new Cell(false);
        cells[4][0]= new Cell(true);
        cells[5][0]= new Cell(false);
        
        cells[0][1]= new Cell(false);
        cells[1][1]= new Cell(false);
        cells[2][1]= new Cell(false);
        cells[3][1]= new Cell(false);
        cells[4][1]= new Cell(true);
        cells[5][1]= new Cell(false);
        
        cells[0][2]= new Cell(true);
        cells[1][2]= new Cell(false);
        cells[2][2]= new Cell(false);
        cells[3][2]= new Cell(false);
        cells[4][2]= new Cell(true);
        cells[5][2]= new Cell(false);
        
        
        AsciiEncoder asciiEncoder = new AsciiEncoder();
        String textoCodificado = asciiEncoder.encode(cells);
        // when: se lo codifica
        // then: arma una matriz con celulas vivas donde habia "*" y muertas donde estaba " "
        String textoEsperado = "**  * \n" + 
                "    * \n" +
                "*   * ";
        assertEquals(textoEsperado, textoCodificado);
    }

}
