
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a[][] = new int[n][n], x = -1, y = 0, xf = 1, yf = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        while (x+xf<n&&y+yf<n) { 
            x+=xf;
            y+=yf;
            System.out.print(a[x][y] + " ");
            if(y==n-1||x==0){
                yf=-1;
                xf=1;
            }
            else if(y==0||x==n-1){
                yf=1;
                xf=-1;
            }
            if(x==0||x==n-1){
                if(y+1<n){
                    y++;
                    System.out.print(a[x][y] + " ");
                    continue;
                }
            }
            if(y==0||y==n-1){
                if(x+1<n){
                    x++;
                    System.out.print(a[x][y] + " ");
                }
            }
        }
    }
}