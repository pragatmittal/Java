import java.util.*;
public class arrayOfObjects {
    public static void main(String[] args) throws Exception {
        Scanner in =new Scanner(System.in);

        String[] str=new String[4];

    for( int i=0;i<str.length;i++){
        str[i]=in.next();

    }
    System.out.println(Arrays.toString(str));
    }
}
