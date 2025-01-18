

public class MinimumElementInArray {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        int[] arr={1,2,3,3,4,5,4645,6,46,47,76,57,6,3,-13123,24,35,36,7,575,7};
        System.out.println( min(arr));

    }
    static  int min(int [] arr){
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<mini){
                mini=arr[i];
            }

        }
        return mini;

    }
}
