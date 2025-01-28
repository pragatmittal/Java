package io.github.jiangdequan;
import java.util.ArrayList;
import java.util.List;

public class DeleteCharacterToMakeFancyString {
   
        public String makeFancyString(String s) {
            
            List<Character> ans=new ArrayList<>();
            
            for(int i=0;i<s.length();i++){
                ans.add(s.charAt(i));
            }
            int j =0;
            while(j<ans.size()-2){
                if(ans.get(j)==ans.get(j+1)&& ans.get(j)==ans.get(j+2)){
                    ans.remove(j+2);
                }
                else{
                    j++;
                }
            }
            StringBuilder result=new StringBuilder();
            for(int i=0;i<ans.size();i++){
                result.append(ans.get(i));
            }
            return result.toString();
    
        }
    }
