package io.github.jiangdequan;

public class RemoveAllOccurrencesofaSubstring {
    
        public String removeOccurrences(String s, String part) {
           String sb = "";
            int partLength = part.length();
            
            for (int i = 0; i < s.length(); i++) {
                sb += s.charAt(i);
                
                // Check if the last characters in sb match the 'part'
                if (sb.length() >= partLength) {
                   String lastPart=sb.substring(sb.length()-partLength);
                   if(lastPart.equals(part)){
                    sb=sb.substring(0,sb.length()-partLength);
                   }
                }
            }
            
            return sb;
    
    
        }
    
}