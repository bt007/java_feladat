package com.feladat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatematikaTest {
    // n faktoriális = 1 * 2 * 3 * 4...n
    // Negatív számoknak nincs faktoriálisa -> Erre az esetre IllegalArgumentExt. várok
    @Test
    void fakt() {
        int input = -5;
        assertThrows(IllegalArgumentException.class, () -> { Matematika.fakt(input); });

    }
    @Test
    void fakt2(){
        int input = 0;
        assertEquals(Matematika.fakt(input), 1);
    }

    @Test
    void fakt3(){
        int input = 5;
        long output = 120;
        assertEquals(output, Matematika.fakt(input));
    }

    @Test
    void fakt4(){
        // túlcsordulásra hibát dob
        int input = 100;
        assertThrows(RuntimeException.class, () ->{Matematika.fakt(input);});
    }

}