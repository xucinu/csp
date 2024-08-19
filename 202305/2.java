
import java.util.Scanner;

public class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt(), d = sc.nextInt();
        int[][] q = set(n, d),k = new int[d][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                k[j][i] = sc.nextInt();
            }
        }
        int[][] v = set(n, d);
        for (int i = 0; i < n; i++) {
            int w = sc.nextInt();
            for (int j = 0; j < d; j++){
                q[i][j] *= w;
            }
        }
        long[][] x= new long[d][d], y = new long[n][d];
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                for (int l = 0; l < d; l++) {
                    x[i][j] += k[i][l] * v[l][j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                for (int l = 0; l < d; l++) {
                    y[i][j] += q[i][l] * x[l][j];
                }
            }
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < d; j++){
                System.out.print(y[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static int[][] set(int n, int d) {
        int[][] res = new int[n][d];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < d; j++){
                res[i][j] = sc.nextInt();
            }
        }
        return res;
    }
}