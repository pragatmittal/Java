public class LinearSearch {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
    
        int[] nums={23,34,3,524,242,2424,32,3123,13,2,323,12,312,3,12,312,312,3,12};
        int target=3123;
        System.out.println(searchit(nums,target));
    }
    static  int  searchit(int[] arr,int target){
            if( arr.length==0){
                return -1;

            }

            for(int i=0;i<arr.length;i++){
                int element=arr[i];
                if(element==target){
                    return i;

                }

    
            }
    return -1;

        }
}
