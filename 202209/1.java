
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[n+1], c[] = new int[n + 1];
        c[0] = 1;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            c[i+1] = c[i] * a[i];
            b[i]=(m%c[i+1])/c[i];
            System.out.print(b[i] + " ");
        }
    }
}