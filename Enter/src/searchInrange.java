
import java.util.stream.Stream;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class searchInrange {
    public static void main(String[] args) {
    
        
        int[] nums={23,34,3,524,242,2424,32,3123,13,2,323,12,312,3,12,312,312,3,12};
        int target=3123;
        int start=3;
        int end= 11;
        System.out.println(searchit(nums,target,start,end));
    }
    static  int  searchit(int[] arr,int target,int start,int end){
        if( arr.length==0){
            return -1;
        }

        for(int i=start;i<=end;i++){
            int element=arr[i];
            if(element==target){
                return i;

            }


        }
return -1;

    }
}
