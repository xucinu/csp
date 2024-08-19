
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s = sc.nextInt(), x, sum = 1;
        for(int i = 1; i < n; i++){
            x = sc.nextInt();
            if (x != s){
                sum++;
                s = x;
            }
        }
        System.out.println(sum);
    }
}