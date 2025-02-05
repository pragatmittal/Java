
public class QuickSort {
    public static void main(String[] args){
        int [] arr={432,4,242,4,24,23423,423,4,24,24};
        sort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));

    } 
    static void sort(int []nums,int low,int high){
        if(low<=high){
            return ;

        }
        int s=low;
        int e =high;
        int mid =s+(e-s)/2;
        int pivot =nums[mid];
        while(s<=e){
            while(nums[s]<pivot){
                s++;
            }
            while(nums[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp=nums[s];
                nums[s]=nums[e];
                nums[e]=temp;
                s++;
                e--;

            }
        }
        sort(nums,low,e);
        sort(nums,s,high);

    }
}