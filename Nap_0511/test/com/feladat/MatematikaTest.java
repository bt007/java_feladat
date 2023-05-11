package com.feladat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatematikaTest {
    //n! = 1*2*3*...*n

    // negativ számokra illegal arg exc-t kell kapnunk
    @Test
    void faktMinus() {
        int input=-5;
//        Matematika faktor= new Matematika();  nem kell, mert static az objektum
        assertThrows(IllegalArgumentException.class, () -> {Matematika.fakt(input);}); // A Matematik osztály statikus, igy nem kell példányositani, hanem közvetlenül hivható meg
    }

    @Test
    void fakt0() {
        int input=0;
        long output=1;
        assertEquals(output, Matematika.fakt(input));
    }

    @Test
    void faktPozitiv() {
        int input=6;
        long output=2*3*4*5*6;
        assertEquals(output, Matematika.fakt(input));
    }

    @Test
    void faktNagy(){
        int input=50;
        long output=10;
        assertThrows(RuntimeException.class, () -> {Matematika.fakt(input);});
    }
}