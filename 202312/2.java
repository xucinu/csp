
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            long n = sc.nextLong(), k = sc.nextLong(), ans = 1;
            for (int j = 2; j * j <= n; j++) {
                int temp=0;
                while (n % j == 0) {
                    temp++;
                    n /= j;
                }
                if (temp >= k){
                    ans *= Math.pow(j, temp);
                }
            }
            if (n > 2 && k <= 1){
                ans *= n;
            }
            System.out.println(ans);
        }
    }
}