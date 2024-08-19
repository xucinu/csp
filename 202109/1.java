
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int n = sc.nextInt(), b, m = 0, max = 0, min = 0;
        for (int i = 0; i < n; i++){
            b = sc.nextInt();
            max += b;
            if (b != m){
                min += b;
                m = b;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}