package com.feladat;

public class Matematika {
    /**
     * N faktoriális számítása.
     * @param n
     * @return n! értéke
     */
    public static long fakt(int n){
        if(n == 0) return  1;
        long f = 0;

        for(int i = 0; i <= n; i++) {
            f += i;
        }
        return f;

    }
}
