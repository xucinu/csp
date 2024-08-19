
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), t = 0, e = 0, sum;
        boolean[] d = new boolean[n];
        for(int i = 0; i < n; i++){
            int m = sc.nextInt();
            sum = 0;
            for (int j = 0; j < m; j++){
                int x = sc.nextInt();
                if(x > 0){
                    if(x < sum){
                        d[i] = true;
                    }
                    sum = x;
                }
                else{
                    sum += x;
                }
            }
            t += sum;
        }
        sum = 0;
        for(int i = 0; i < n; i++){
            if(d[i]){
                sum++;
            }
            if(d[i] && d[(i+1)%n] && d[(i+2)%n]){
                e++;
            }
        }
        System.out.println(t + " " + sum + " " + e);
    }
}