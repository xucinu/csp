
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), lj[][] = new int[n][2], d[] = new int[5];
        for (int i = 0; i < n; i++){
            lj[i][0] = sc.nextInt();
            lj[i][1] = sc.nextInt();
        }
        for (int i = 0; i < n; i++){
            int c = 0, df = 0;
            for (int j = 0; j < n; j++){
                long x = lj[j][0] - lj[i][0], y = lj[j][1] - lj[i][1];
                if(x == 0){
                    if(Math.abs(y) == 1){
                        c++;
                    }
                }
                else if(y == 0){
                    if(Math.abs(x) == 1){
                        c++;
                    }
                }
                else{
                    if(Math.abs(x) + Math.abs(y) == 2){
                        df++;
                    }
                }
            }
            if(c==4){
                d[df]++;
            }
        }
        for(int i = 0; i < 5; i++){
            System.out.println(d[i]);
        }
    }
}