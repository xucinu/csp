
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), p[][] = new int[m][2], t[] = new int[m], max = 0;
        for(int i = 0; i < m; i++){
            p[i][0] = sc.nextInt() - 1;
        }
        for(int i = 0; i < m; i++){
            t[i] = sc.nextInt();
            p[i][1] = p[i][0] != -1 ? t[p[i][0]] + p[p[i][0]][1] : 1;
        }
        for(int i = 0; i < m; i++){
            max = Math.max(max, t[i] + (p[i][0] != -1 ? p[i][1] : 0));
            System.out.print(p[i][1] + " ");
        }
        if(max <= n){
            int[] map = new int[m];
            System.out.println();
            for(int i = m-1; i >= 0; i--){
                if(map[i]==0){
                    int l = n - (p[i][0]!=-1?p[i][1]-1:0) - t[i];
                    map[i]=l;
                    int x[] = p[i];
                    while (x[0] != -1){
                        int index = x[0];
                        x = p[index];
                        map[index]=map[index]!=0?Math.min(map[index], l):l;
                    }
                }
            }
            for(int i = 0; i < m; i++){
                System.out.print((map[i]+p[i][1]) + " ");
            }
        }
    }
}