
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double a[] = new double[n + 1], x = 0, d = 0;
        for (int i = 1; i < n + 1; i++) {
            a[i] = sc.nextDouble();
            x += a[i];
        }
        x /= n;
        for (int i = 1; i < n + 1; i++) {
            d += Math.pow(a[i] - x, 2);
        }
        d /= n;
        for (int i = 1; i < n + 1; i++) {
            System.out.println((a[i] - x) / Math.sqrt(d));
        }
    }
}