package com.feladat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatematikaTest {
    // n! = 1 * 2 * 3 * 4 * ... * n
    // 1) Negatív számoknkak nincs faktoriálisa (->IllegalArgumentException-t várok)
    // 2) 0! => 1 (matematika szabályai alapján)
    // 3) egyéb esetekben jól számol
    @Test
    void fakt() {
        // Negatív számoknkak nincs faktoriálisa (->IllegalArgumentException-t várok)
        int input = -5;
        //long output = ???; az elvárt kimenet most az, hogy hibát dobjunk fel
        assertThrows(IllegalArgumentException.class,
                () -> { Matematika.fakt(input); }
        );
    }

    @Test
    void fakt2() {  // sikeres volt, így rá sem nézek a kódra
        // 2) 0! => 1 (matematika szabályai alapján)
        int input = 0;
        long output = 1;
        assertEquals(output, Matematika.fakt(input));
    }

    @Test
    void fakt3() {
        // 3) egyéb esetekben jól számol 5! = 120
        int input = 5;
        long output = 120;
        assertEquals(output, Matematika.fakt(input));
    }

    @Test
    void fakt4() {
        // túlcsordulásra hibát dob
        int input = 50;
        // long output = 10; hibát kell dobnom, mivel túlcsordulás van
        assertThrows(RuntimeException.class,
                () -> {Matematika.fakt(input);}
        );
    }
}