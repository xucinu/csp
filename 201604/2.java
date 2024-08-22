
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=-1,b=0,u=-1;
        byte[][] c = new byte[15][10], f = new byte[4][4];
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 10; j++) {
                c[i][j]=sc.nextByte();
                if(t<0&&c[i][j]==1){
                    t=i;
                }
            }
        }
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++) {
                f[i][j]=sc.nextByte();
                if(f[i][j]==1){
                    if(u<0){
                        u=i;
                    }
                    b=Math.max(b, i);
                }
            }
        }
        int n = sc.nextInt()-1;
        boolean flag = true;
        for (; t < 15 && flag; t++) {
            for (int i = b; i >= u && flag; i--) {
                if(t+i-b<0){
                    continue;
                }
                for (int j = 0; j < 4 && flag; j++) {
                    if((c[t+i-b][n+j]&f[i][j])==1){
                        t--;
                        flag = false;
                    }
                }
            }
        }
        t--;
        for (int i = b; i >= u; i--) {
            if(t-i<0){
                continue;
            }
            for (int j = 0; j < 4; j++) {
                c[t+i-b][n+j]|=f[i][j];
            }
        }
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(c[i][j]+" ");
            }
            System.out.println("");
        }
    }
}