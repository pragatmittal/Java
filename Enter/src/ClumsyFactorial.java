package io.github.jiangdequan;

public class ClumsyFactorial {
    class Solution {
        public int clumsy(int n) {
            int map[]={1,2,6,7,7,8,6,9};
            if(n<=8){
                return map[n];
            }
            else if(n%4==0){
                return n+1;
    
            }
            else if(n%4==3){
                return n-1;
            }
            else{
               return  n+2;
    
            }
    
        }
    }
}