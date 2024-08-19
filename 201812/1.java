
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), y = sc.nextInt(), g = sc.nextInt(), n = sc.nextInt(), k, t, sum = 0;
        for(int i = 0; i < n; i++) {
            k = sc.nextInt();
            t = sc.nextInt();
            switch (k) {
                case 0:
                    sum += t;
                    break;
                case 1:
                    sum += t;
                    break;
                case 2:
                    sum += t;
                    sum += r;  
                    break;
            }
        }
        System.out.println(sum);
    }
}