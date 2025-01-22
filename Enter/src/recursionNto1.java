package io.github.jiangdequan;

public class recursionNto1 {
    public static void main( String[] args){
        fin(9);
    }
    static void fin(int a){
        // if( n==1){

        // }
        if( n==0){
            return;
        }
        System.out.println(n);
        fin(n-1);
    }
}