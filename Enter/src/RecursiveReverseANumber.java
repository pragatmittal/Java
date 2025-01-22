package io.github.jiangdequan;

public class RecursiveReverseANumber {
    public static void main(String[] args){
        int ans=rev(123456789,0);
        system.out.println(ans);
    }
    static  void rev(int n,int reversed){
        if(n==0){
            return reversed;
        }
        return rev(n/10,reversed*10+n%10);
    }
}