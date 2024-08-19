
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), j[] = new int[4], num = 1;
        for (int i = 0; i < n; i++, num++){
            if (num % 7 == 0){
                j[i%4]++;
                n++;
            }
            else {
                int l = num;
                while (l%10!=7 && l > 0) {
                    l/=10;
                }
                if (l != 0){
                    j[i%4]++;
                    n++;
                }
            }
        }
        for (int i = 0; i < 4; i++){
            System.out.println(j[i]);
        }
    }
}