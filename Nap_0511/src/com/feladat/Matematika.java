package com.feladat;

public class Matematika {
    /**
     * N faktoriális számítása.
     * @param n
     * @return n! értéke
     */
    public static long fakt(int n){
        if (n < 0){
            throw new IllegalArgumentException("n értéke csak pozitív szám lehet!");
        }
        if(n == 0) return  1;
        long f = 1;
        long ft = 1;


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
