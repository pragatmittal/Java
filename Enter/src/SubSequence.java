// package io.github.jiangdequan;

public class SubSequence {
/*************  ✨ Codeium Command ⭐  *************/
    /**
     * Main entry point for the program.
     * 
     * This program generates all the permutations of a given string.
     * 
     * @param args command line arguments
     */
/******  df081ae1-abfe-407a-ae82-8f67ee0e3661  *******/
    public clas static main(String[] args){
        permutation("", "abc"); 
        
    }
    static void permutation(String p, Strng up){
        if(isEmpty(up)){
            System.out.println(p);
            return;

    }
    char ch =up.charAt(0);
    for(int i=0;i<=p.length();i++){
        String first=p.substring(O, i);
        String second=p.substring(i, p.length());
        permutation(first+ch+second,up.substring(1));}


}
};