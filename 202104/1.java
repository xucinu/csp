
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), l = sc.nextInt(), h[] = new int[l];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++){
               h[sc.nextInt()]++;
            }
        }
        for (int i = 0; i < l; i++){
            System.out.print(h[i] + " ");
        }
    }
}