package com.feladat;

public class Matematika {
    /**
     * N faktoriális számítása.
     * @param n
     * @return n! értéke
     */
    public static long fakt(int n){
        if(n < 0) throw new IllegalArgumentException("Nulla alatti értékeknek nincs faktoriálisa !!!!!!!!!!!!!!!!!!!!!!!!!!");
        if(n == 0) return  1;
        long f = 1;
long ftul=1;  //tulcsordulás detektálása

        for(int i = 1; i <= n; i++) {
            ftul=f;
            f *= i;
            if (f < ftul) {
                throw new RuntimeException("A számitás során túlcsordulás jelentkezett!");
            }
        }
        return f;

    }
}
