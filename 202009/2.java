
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(), t = sc.nextInt(), xl = sc.nextInt(), yd = sc.nextInt(), xr = sc.nextInt(), yu = sc.nextInt(), sumj = 0, sumd = 0;
        for(int i = 0; i < n; i++){
            int d = 0;
            boolean flag = true, flagd = true;
            for (int j = 0; j < t; j++){
                int x = sc.nextInt(), y = sc.nextInt();
                if(x >= xl && x <= xr && y >= yd && y <= yu){
                    d++;
                }
                else{
                    d = 0;
                }
                if(flag&&d!=0){
                    sumj++;
                    flag = false;
                }
                if (flagd&&d>=k){
                    sumd++;
                    flagd = false;
                }
            }
        }
        System.out.println(sumj);
        System.out.println(sumd);
    }
}