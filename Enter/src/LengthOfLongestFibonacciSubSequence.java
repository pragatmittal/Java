
import java.util.HashMap;

public class LengthOfLongestFibonacciSubSequence {
    class Solution {public int solve(int j,int k, int[] arr, HashMap<Integer ,Integer >hp){
    int target=arr[k]-arr[j];
    if(hp.containsKey(target ) && hp.get(target)<j){
        int i=hp.get(target);
        return solve(i,j,arr,hp)+1;
    }
    return 2;
}
    public int lenLongestFibSubseq(int[] arr) {
        int n=arr.length;
        HashMap<Integer,Integer>hp=new HashMap<>();

        for( int i=0;i<n;i++){
            hp.put(arr[i],i);
        }

        int maxlength=0;
        
        for(int j=1;j<n;j++){
            for(int k=j+1;k<n;k++){
                int length=solve(j,k,arr,hp);
                if( length>=3){
                    maxlength=Math.max(maxlength,length);

                }
            }

        }
        return maxlength;

        
    }
}
}