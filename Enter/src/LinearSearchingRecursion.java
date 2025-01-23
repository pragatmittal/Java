package io.github.jiangdequan;

public class LinearSearchingRecursion {
    public static void main(String[] args){
        int [] arr={2,3,24,66,6,45,6,868,66,323431,12,312,31,312,3,123,12};
        System.out.println(find(arr,66,0));
    }
    static boolean find (int[] arr,int target ,int i){
        if(i=arr.length){
            return false;

        }
        return arr[i]==target || find(arr,target,i+1);

    }

}