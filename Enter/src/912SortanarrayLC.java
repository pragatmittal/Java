package io.github.jiangdequan;

public class 912SortanarrayLC {
    
    public int[] sortArray(int[] nums) {
        if(nums.length==1){
            return nums;

        }
        merge(nums,0,nums.length-1);
        return nums;
        }
        private void merge(int[] arr,int s,int e ){
            if(s>=e){
                return ;
            }
            int mid=s+(e-s)/2;
            merge(arr,s,mid);
            merge(arr,mid+1,e);
            sorted(arr,s,e,mid);

        }
        private void sorted(int[] arr,int s,int e,int mid){
            int n1=mid-s+1;
            int n2=e-mid;
            int[] lefta=new int[n1];
            int[] righta=new int[n2];

            System.arraycopy(arr,s,lefta,0,n1);
            System.arraycopy(arr,mid+1,righta,0,n2);
            int i=0;
            int j=0;
            int k=s;
            while(i<n1 && j<n2 ){
                if(lefta[i]<=righta[j]){
                    arr[k]=lefta[i];
                    i++;
                
                }else{
                    arr[k]=righta[j];
                    j++;
                    
                }

k++;
            }   
            while(i<n1){
                arr[k]=lefta[i];
                i++;
                k++;
            }

            while(j<n2){
                arr[k]=righta[j];
                j++;
                k++;
            }
        }
}