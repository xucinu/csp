
import java.util.Scanner;

public class Main{
    static Scanner sc = new Scanner(System.in);
    static int m = sc.nextInt(), n = sc.nextInt(), q = sc.nextInt();
    static int[][] x = new int[n][m];
    static char[][] t = new char[n][m];
    public static void main(String[] args) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                t[i][j] = '.';
            }
        }
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int x1 = sc.nextInt(), y1 = sc.nextInt();
            if(l==0){
                int x2 = sc.nextInt(), y2 = sc.nextInt();
                if(x1==x2){
                    int min = Math.min(y1, y2), max = Math.max(y1, y2);
                    for (int j = min; j <= max; j++) {
                        if(x[j][x1]==2||x[j][x1]==3){
                            continue;
                        }
                        x[j][x1] += 2;
                    }
                }
                else{
                    int min = Math.min(x1, x2), max = Math.max(x1, x2);
                    for (int j = min; j <= max; j++) {
                        if(x[y1][j]==1||x[y1][j]==3){
                            continue;
                        }
                        x[y1][j] += 1;
                    }
                }
            }
            else{
                char c = sc.next().charAt(0);
                tc(x1, y1, c);
            }
        }
        for (int i = n-1; i >= 0; i--) {
            for (int j = 0; j < m; j++) {
                switch (x[i][j]) {
                    case 1:
                        System.out.print("-");
                        break;
                    case 2:
                        System.out.print("|");
                        break;
                    case 3:
                        System.out.print("+");
                        break;
                    default:
                        System.out.print(t[i][j]);
                        break;
                }
            }
            System.out.println("");
        }
    }

    public static void tc(int x1, int y1, char c) {
        if(t[y1][x1]!=c){
            t[y1][x1]=c;
            if(x1+1<t[0].length&&x[y1][x1+1]==0){
                tc(x1+1, y1, c);
            }
            if(x1-1>=0&&x[y1][x1-1]==0){
                tc(x1-1, y1, c);
            }
            if(y1+1<t.length&&x[y1+1][x1]==0){
                tc(x1, y1+1, c);
            }
            if(y1-1>=0&&x[y1-1][x1]==0){
                tc(x1, y1-1, c);
            }
        }
    }
}