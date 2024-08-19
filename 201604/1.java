
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 3){
            System.out.println("0");
            return;
        }
        int s = sc.nextInt(), x = sc.nextInt(), sum = 0;
        boolean b = x > s;
        for (int i = 2; i < n; i++){
            s = x;
            x = sc.nextInt();
            if (x > s != b){
                sum++;
                b = x > s;
            }
        }
        System.out.println(sum);
    }
}