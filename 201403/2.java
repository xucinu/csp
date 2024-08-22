
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), pm[][] = new int[2560][1440];
        Map<Integer, int[]> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt();
            map.put(i+1, new int[]{x1, y1, x2, y2});
            for (int j = x1; j <= x2; j++) {
                for (int k = y1; k <= y2; k++) {
                    pm[j][k] = i+1;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt(), y = sc.nextInt();
            if(pm[x][y]==0){
                System.out.println("IGNORED");
            }
            else{
                System.out.println(pm[x][y]);
                int[] zb = map.get(pm[x][y]);
                for (int j = zb[0]; j <= zb[2]; j++) {
                    for (int k = zb[1]; k <= zb[3]; k++) {
                        pm[j][k]=pm[x][y];
                    }
                }
            }
        }
    }
}