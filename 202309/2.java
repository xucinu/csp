
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        double[][] cz = new double[n][2];
        cz[0][0]=1;
        for (int i = 0; i < n; i++) {
            if(sc.nextInt()==1){
                cz[i][0] = sc.nextDouble();
                if (i > 0){
                    cz[i][0] *= cz[i - 1][0];
                    cz[i][1] = cz[i-1][1];
                }
            }
            else{
                cz[i][1] = sc.nextDouble();
                if (i > 0){
                    cz[i][0] = cz[i - 1][0];
                    cz[i][1] += cz[i-1][1];
                }
            }
        }
        for (int k = 0; k < m; k++) {
            int i = sc.nextInt()-2, j = sc.nextInt()-1;
            double x = sc.nextInt(), y = sc.nextInt(),l = cz[j][0] / (i>=0?cz[i][0]:1),xz = cz[j][1] - (i>=0?cz[i][1]:0);
            double temp = x;
            x = x * Math.cos(xz) - y * Math.sin(xz);
            y = temp * Math.sin(xz) + y * Math.cos(xz);
            x *= l;
            y *= l;
            System.out.printf("%.3f %.3f\n",x,y);
        }
    }
}