
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double i = sc.nextDouble(), x = 0;
        for (int j = 0; j <= n; j++){
            int k = sc.nextInt();
            x += k * Math.pow(1+i, -j);
        }
        System.out.print(x);
    }
}