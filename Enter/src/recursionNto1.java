public class recursionNto1 {
    public static void main(String[] args){
        fin(9);
    }
    static void fin(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fin(n-1);
    }
}