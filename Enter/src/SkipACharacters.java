package io.github.jiangdequan;

public class SkipACharacters {
    public static void main(String[] args){
        skip("","bdabababbababababababab");
    }
    static void skip(String ans,String a){
        if (a.isEmpty()){
           
            return "";
        }
        char ch= a.charAt(0);
        if(ch=='a'){
            skip(ans,a.substring(1));
        }
        else {
            skip(ans+ch,a.substring(1));

        }
    }
    
}