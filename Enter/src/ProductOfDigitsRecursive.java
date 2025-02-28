package io.github.jiangdequan;

public class ProductOfDigitsRecursive {

    public static void main(String[] args ){
        int ans = recursive(19);
        System.out.println(ans);
    }
    static int recursive(int n){
        if(n==0){
            return 1;
        }
        return recursive(n/10) * (n%10);
    }


}