
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(), sum = 0, x, y = 0;
        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            y += x;
            if (y >= k){
                sum++;
                y = 0;
            }
        }
        if (y > 0){
            sum++;
        }
        System.out.println(sum);
    }
}