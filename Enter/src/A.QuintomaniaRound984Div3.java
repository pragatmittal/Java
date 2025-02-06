import java.util.*;

public class A.QuintomaniaRound984Div3 {
public class quintomania{
public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int t=sc.nextInt();
    while(t--){
        int n=sc.nextInt ();
        int[]notes= new int[n];
        for( int i=0;i<n;i++){
            notes[i]=sc.nextInt();
            
        }
        boolean isPerfect = true;
        for(int i=1;i<n;i++){
            int diff=Math.abs(notes[i]-notes[i-1]);
            if(diff!=5 && diff!=7){
                isPerfect=false;
                break;
            }

        }
        System.out.println(isPerfect?"YES":"NO");
        
    }
    sc.close();
    
}
}    
}