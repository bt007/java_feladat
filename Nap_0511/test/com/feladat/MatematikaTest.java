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
=======
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

    void faktPozitiv() {
        int input=6;
        long output=2*3*4*5*6;
=======
    void fakt3() {
        // 3) egyéb esetekben jól számol 5! = 120
        int input = 5;
        long output = 120;

        assertEquals(output, Matematika.fakt(input));
    }

    @Test

    void faktNagy(){
        int input=50;
        long output=10;
        assertThrows(RuntimeException.class, () -> {Matematika.fakt(input);});
=======
    void fakt4() {
        // túlcsordulásra hibát dob
        int input = 50;
        // long output = 10; hibát kell dobnom, mivel túlcsordulás van
        assertThrows(RuntimeException.class,
                () -> {Matematika.fakt(input);}
        );

    }
}