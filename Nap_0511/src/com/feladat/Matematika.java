package com.feladat;

public class Matematika {
    /**
     * N faktoriális számítása.
     * @param n faktoriális alapja
     * @return n! értéke
     */
    public static long fakt(int n){
        if(n < 0){
            throw new IllegalArgumentException("A megadott szám nem lehet negatív!");
        }
        if(n == 0) return  1;
        long f = 1;
        long ft = 1; //túlcsordulás detektálása

        for(int i = 1; i <= n; i++) {
            ft = f;
            f *= i;
            if(f < ft){
                throw new RuntimeException("A számítás során túlcsordulási hiba keletkezett!");
            }
        }
        return f;

    }
}
