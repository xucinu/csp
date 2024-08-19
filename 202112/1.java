
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), N = sc.nextInt(), a[] = new int[n+1], sum = 0;
        for (int i = 1; i <= n; i++){
            a[i] = sc.nextInt();
            sum += (i - 1) * (a[i] - a[i-1]);
        }
        sum += n * (N - a[n]);
        System.out.println(sum);
    }
}