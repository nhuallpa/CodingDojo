package com.gol;

import static org.junit.Assert.*;
import org.junit.Test;

public class CellTest {

    @Test
    public void testUnderpopulation() {
        // given: dada una celula con menos de dos vecinos
        Cell cell = new Cell(true);
        Neighbourhood neighbourhood = new Neighbourhood(1);
        // when: cuando transiciona
        cell.checkNeighbourhood(neighbourhood);
        // then: muere
        assertFalse(cell.isAlive());
    }

    @Test
    public void testStablePopulation() {
        // given: dada una celula con dos o tres vecinos
        Cell cell = new Cell(true);
        Neighbourhood neighbourhood = new Neighbourhood(2);
        // when: cuando transiciona
        cell.checkNeighbourhood(neighbourhood);
        // then: vive
        assertTrue(cell.isAlive());
    }
    
    @Test
    public void testOverCrowding() {
        // given: dada una celula con mas de tres vecinos
        Cell cell = new Cell(true);
        Neighbourhood neighbourhood = new Neighbourhood(4);
        // when: cuando transiciona
        cell.checkNeighbourhood(neighbourhood);
        // then: muere
        assertFalse(cell.isAlive());
    }
    
    @Test
    public void testReproduction() {
        // given: dada una celula con exactamente tres vecinos
        Cell cell = new Cell(false);
        Neighbourhood neighbourhood = new Neighbourhood(3);
        // when: cuando transiciona
        cell.checkNeighbourhood(neighbourhood);
        // then: vive
        assertTrue(cell.isAlive());
    }
    @Test
    public void testNotReproduction() {
        // given: dada una celula con una cantidad diferente de 3 vecinos
        Cell cell = new Cell(false);
        Neighbourhood neighbourhood = new Neighbourhood(4);
        // when: cuando transiciona
        cell.checkNeighbourhood(neighbourhood);
        // then: muere
        assertFalse(cell.isAlive());
    }
    

    @Test(expected=IllegalArgumentException.class)
    public void testNegativeNeighboursNotAllowed() {
        new Neighbourhood(-1);
    }
    @Test(expected=IllegalArgumentException.class)
    public void testMoreThan8NeighboursNotAllowed() {
        new Neighbourhood(9);
    }
}
