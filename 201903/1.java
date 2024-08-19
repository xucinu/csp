
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a = 0, b = 0, c = 0;
        for (int i = 1; i <= n; i++){
            int x = sc.nextInt();
            if (i == 1){
                a = x;
            }
            else if(i == n / 2 + 1 || i == n / 2 + n % 2){
                b += x;
            }
            else if (i == n){
                c = x;
            }
        }
        if (n % 2 == 0){
            double x = Math.round(b / 2.0 * 10);
            if (x % 10 == 0){
                System.out.printf("%d %d %d", Math.max(a, c), b / 2, Math.min(a, c));
            }
            else{
                System.out.printf("%d %.1f %d", Math.max(a, c), x / 10, Math.min(a, c));
            }
        }
        else{
            System.out.printf("%d %d %d", Math.max(a, c), b, Math.min(a, c));
        }
    }
}