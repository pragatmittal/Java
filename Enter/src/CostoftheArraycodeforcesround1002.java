public class CostoftheArraycodeforcesround1002 {
    

    static long find(long[] arr, int n){
        long cost = 0;
        for(int i = 1; i < n; i++) {
            cost += Math.abs(arr[i] - arr[i-1]);
        }
        return cost;
    }
}