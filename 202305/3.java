
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt(), cz[][] = new int[n][k], ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                cz[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt(), y = sc.nextInt(), min = Integer.MAX_VALUE;
            for (int j = 0; j < k; j++){
                for (int l = 0; l < k; l++) {
                    min = Math.min(min, cz[x][j] + cz[y][l] + sc.nextInt());
                }
            }
            ans+=min;
        }
        System.out.println(ans);
    }
}