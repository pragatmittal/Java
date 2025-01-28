package io.github.jiangdequan;
import java.ArrayList;
import java.List;

public class DeleteCharacterToMakeFancyString2 {
   
        public String makeFancyString(String s) {
            StringBuilder ans=new StringBuilder();
            int n=s.length();
            if (n == 0) return ""; // Edge case for empty string
            ans.append(s.charAt(0));
            char prev=s.charAt(0);
            int count=1;
            for(int i=1;i<n;i++){
                char curr=s.charAt(i);
                if(curr==prev){
                    count++;
    
                }
                else{
                    count =1;
                    prev=curr;
                }
                if(count<3){
                    ans.append(curr);
    
                }
    
            }
            return ans.toString();
    
        }
    
}