package com.feladat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatematikaTest {

    @Test
    void fakt() {
        int input = -5;
        assertThrows(IllegalArgumentException.class,
                ()->{Matematika.fakt(input);}
        );
    }

    @Test
    void fakt2() {
        int input = 0;
        long output = 1;
        assertEquals(output, Matematika.fakt(input));
    }

    @Test
    void fakt3() {
        int input = 5;
        long output = 120;
        assertEquals(output, Matematika.fakt(input));

    }

    @Test
    void fakt4() {
        int input = 4;
        long output =10;
        assertThrows(RuntimeException.class,
                ()-> {Matematika.fakt(input);}
        );
    }
}