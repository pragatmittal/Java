package io.github.jiangdequan;

import java.util.ArrayList;

public class ReturnTheArrayList {
    public static void main(String[] args){
        int[] arr={123,1,4,2,41,1,312,3,123,12,312,3,123,123,1,312,3,12,312,3,12314,2,5,3,53,6};
        ArrayList<Integer> ans = find(arr,312,0,new ArrayList<>());
        System.out.println(ans);
    }

    static ArrayList<Integer> find(int[] arr, int target, int i, ArrayList<Integer> list){
        if(i==arr.length){
            return list;
        }
        if(arr[i]==target){
            list.add(i);
        }
        return find(arr,target,i+1,list);
    }
}