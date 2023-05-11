package com.feladat;

public class Matematika {
    /**
     * N faktoriális számítása.
     * @param n aminek a faktoriálást számítani szeretnénk
     * @return n! értéke
     */
    public static long fakt(int n){
        if(n < 0){
            throw new IllegalArgumentException("N értéke nem lehet negatív!"); // T1
        }

        if(n == 0) return  1;
        // T3 alapján 3 módosítás (+ helyett *, f és i kezdőértéke 1)
        long f = 1;
        long ft = 1; // T4 alapján túlcsordulás detektálása

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
