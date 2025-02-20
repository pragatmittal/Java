// package io.github.jiangdequan;

public class Subsequences {
    public static void main(String[] args){
        subseq("","abcd"); 
    }
    static void subseq(String a , String b){
        if(b.isEmpty()){
            System.out.println(a);
            return ;

        }
        char ch=b.charAt(0);
        subseq(a+ch,b.substring(1));
        subseq(a,b.substring(1));
        
    }
}
