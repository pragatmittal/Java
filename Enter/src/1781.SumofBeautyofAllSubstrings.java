package io.github.jiangdequan;

public class 1781.SumofBeautyofAllSubstrings {
    class Solution {
        public int beautySum(String s) {
            int ans=0;
            for(int i=0;i<s.length();i++){
                HashMap<Character,Integer>freq=new HashMap<>();
                for(int j=i;j<s.length();j++){
                    char ch=s.charAt(j);
                    freq.put(ch,freq.getOrDefault(ch,0)+1);
                    int max=Integer.MIN_VALUE;                
                    int min=Integer.MAX_VALUE;
                    for(int frequ:freq.values()){
                        min=Math.min(min,frequ);
                        max=Math.max(max,frequ);
                    }
                    ans+=max-min;           
    
                        }
    
                        
                }
                return ans;
                    }
    }
}