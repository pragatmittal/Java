package io.github.jiangdequan;

public class ProductOfDigitsRecursive {

    public static void main(String[] args ){
        int ans=  recursive(19);
        system.out.println(ans);
    }
    static void recursive(int n){
        if(n==0){
            return n ;
        }
        return recursive(n/10)*n%10;
    }


}