
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), h[] = new int[n], max = 0;
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int l = i - 1, r = i + 1;
            while (l >= 0 && h[l] >= h[i]) { 
                l--;
            }
            while (r < n && h[r] >= h[i]) { 
                r++;
            }
            max = Math.max((r - l - 1) * h[i], max);
        }
        System.out.println(max);
    }
}