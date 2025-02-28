import java.util.Scanner;

public class ClassValue {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int a = scn.nextInt();
            int[] b = new int[a];
            for (int i = 0; i < a; i++) {
                b[i] = scn.nextInt();
            }
        }
    }
} 