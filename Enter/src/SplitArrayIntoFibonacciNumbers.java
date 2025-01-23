package io.github.jiangdequan;

public class SplitArrayIntoFibonacciNumbers {
    public List<Integer> splitIntoFibonacci(String num) {
        List<Integer> list = new ArrayList();
        helper(num, 0, list);
        return list;
    }
    
    public boolean helper(String s, int pos, List<Integer> list){
        if(pos == s.length()){
            return list.size() > 2? true:false;
        }
        
        int n = s.length();
        int num = 0;
        for(int i=pos; i<n; i++){
            num = num*10 + (s.charAt(i)-'0');
            
            if(num < 0) return false;
            

            if(list.size()<2 || (list.get(list.size()-1) + list.get(list.size()-2)) == num ){
                list.add(num);
                if(helper(s, i+1, list)) return true;
                list.remove(list.size()-1);
            }
            
            if(i==pos && s.charAt(i)=='0') return false;
        }
        return false;
    }
}