
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x, s = sc.nextInt(), max = 0;
        for (int i = 1; i < n; i++){
            x = sc.nextInt();
            max = Math.max(max, Math.abs(x - s));
            s = x;
        }
        System.out.println(max);
    }
}