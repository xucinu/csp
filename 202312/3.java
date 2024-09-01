
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(),w[] = new int[n],sj[]=new int[n-1];
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            sj[i] = sc.nextInt();
        }
    }
}