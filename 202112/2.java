
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), N = sc.nextInt(), a[] = new int[n+1], r = N / (n+1), f = 0, index = 0, left, right;
        long e = 0;
        for (int i = 1; i <= n; i++){
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < N;){
            left = i;
            right = Math.min(i + r - 1, N - 1);
            if (f < n && a[f + 1] <= left) f++;
            while (f < n && a[f + 1] <= right) { 
                e += Math.abs(index - f++) * (a[f] - left);
                left = a[f];
            }
            e += Math.abs(index - f) * (right - left + 1);
            i = right + 1;
            index++;
        }
        System.out.println(e);
    }
}