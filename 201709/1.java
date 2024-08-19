
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = n / 50 * 5 + n / 50 * 2;
        n %= 50;
        sum += n / 30 * 3 + n / 30;
        n %= 30;
        sum += n / 10;
        System.out.println(sum);
    }
}