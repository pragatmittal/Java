
import java.util.stream.Stream;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class searchInString {
    public static void main(String[] args) {
        String name="Pragat";
        char target='g';
        System.out.println(search(name,target));
    }
    static Boolean search(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(char c=0;c<str.length();c++){
            if(target==str.charAt(c)){
                return true;
            }
           
        }
        return false;


    }
}
