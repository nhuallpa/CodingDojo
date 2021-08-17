package com.gol;

import static org.junit.Assert.*;

import org.junit.Test;
import static com.gol.AsciiEncoder.ENCODER;

public class UniverseTest {

    @Test
    public void test() {
        // given: Un universo
        // _____
        // __*__
        // __*__
        // __*__
        // _____
        Universe universe = new Universe(ENCODER.decode(
                "     \n" +
                "  *  \n" +
                "  *  \n" +
                "  *  \n" +
                "     "));
        // when: Hacemos una transicion
        universe.transicionar();
        // then: Se obtiene
        // _____
        // _____
        // _***_
        // _____
        // _____
        Cell[][] cells = universe.getCells();
        assertEquals(
                "     \n" +
                "     \n" +
                " *** \n" +
                "     \n" +
                "     ", ENCODER.encode(cells));
        // and: Y despues de la siguiente transicion se obtiene
        // _____
        // __*__
        // __*__
        // __*__
        // _____
        universe.transicionar();
        assertEquals(
                "     \n" +
                "  *  \n" +
                "  *  \n" +
                "  *  \n" +
                "     ", ENCODER.encode(cells));

    }

}
