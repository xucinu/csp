
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), l = sc.nextInt(), r = sc.nextInt(), t = sc.nextInt(), a[][] = new int[n][n], h[][] = new int[n][n], sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i <= r; i++){
            for (int j = 0; j <= r; j++) {
                h[0][0] += a[i][j];
            }
        }
        if (1.0 * h[0][0] / ((r+1) * (r+1)) <= t){
            sum++;
        }
        for (int x = 0; x < n; x++){
            int x1 = Math.max(0, x - r),
            x2 = Math.min(n - 1, x + r);
            if(x != 0){
                h[x][0] = h[x-1][0];
                if(x - r > 0){
                    for(int i = 0; i <= r; i++){
                        h[x][0] -= a[x-r-1][i];
                    }
                }
                if(x + r < n){
                    for(int i = 0; i <= r; i++){
                        h[x][0] += a[x+r][i];
                    }
                }
                if (1.0 * h[x][0] / ((r + 1) *  (x2 - x1 + 1)) <= t){
                    sum++;
                }
            }
            for (int y = 0; y < n; y++) {
                if (y == 0){
                    continue;
                }
                int y1 = Math.max(0, y - r),
                y2 = Math.min(n - 1, y + r);
                h[x][y] = h[x][y-1];
                if(y - r > 0){
                    for(int i = x1; i <= x2; i++){
                        h[x][y] -= a[i][y-r-1];
                    }
                }
                if(y + r < n){
                    for(int i = x1; i <= x2; i++){
                        h[x][y] += a[i][y+r];
                    }
                }
                if (1.0 * h[x][y] / ((y2 - y1 + 1) * (x2 - x1 + 1)) <= t){
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}