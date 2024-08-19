
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), jg[] = new int[n+2];
        for (int i = 1; i <= n; i++){
            jg[i] = sc.nextInt();
        }
        for (int i = 1; i <=n; i++){
            System.out.print((jg[i-1] + jg[i] + jg[i+1]) / ((i == 1 || i == n) ? 2 : 3) + " ");
        }
    }
}