
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = sc.nextInt(), a[] = new int[n], sum = 0;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            if (a[i] == x){
                System.out.println(x);
                return;
            }
            sum += a[i];
        }
        x = sum - x;
        int[][] dp = new int[n+1][x+1];
        for (int i = 1; i < a.length+1; i++){
            for (int j = 1; j < x+1; j++){
                if (j < a[i-1]){
                    dp[i][j] = dp[i-1][j];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-a[i-1]]+a[i-1]);
                }
            }
        }
        System.out.println(sum - dp[n][x]);
    }
}