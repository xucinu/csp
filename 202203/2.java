
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt(), sum[] = new int[200001];
        for (int i = 0; i < n; i++){
            int t = sc.nextInt(), c = sc.nextInt();
            if (t > k){
                sum[Math.max(1, t-k-c+1)]++;
                sum[t-k+1]--;
            }
        }
        for (int i = 1; i < 200001; i++){
            sum[i] += sum[i-1];
        }
        for (int i = 0; i < m; i++){
            System.out.println(sum[sc.nextInt()]);
        }
    }
}