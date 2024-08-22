
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[][] = new int[n][m];
        Map<Integer, List<int[]>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            List<int[]> ll = new ArrayList<>();
            int x = 0, j = 0;
            for (; j < m; j++) {
                a[i][j] = sc.nextInt();
                if(a[i][j]!=a[i][x]){
                    if(j-x>=3){
                        ll.add(new int[]{x,j});
                    }
                    x=j;
                }
            }
            if(j-x>=3){
                ll.add(new int[]{x,j});
            }
            if(!ll.isEmpty()){
                map.put(i, ll);
            }
        }
        for (int i = 0; i < m; i++) {
            int x = 0, j = 0;
            for (; j < n; j++) {
                if(a[j][i]!=a[x][i]){
                    if(j-x>=3){
                        for (int k = x; k < j; k++) {
                            a[k][i]=0;
                        }
                    }
                    x=j;
                }
            }
            if(j-x>=3){
                for (int k = x; k < j; k++) {
                    a[k][i]=0;
                }
            }
        }
        for (Map.Entry<Integer, List<int[]>> en : map.entrySet()) {
            int i = en.getKey();
            List<int[]> val = en.getValue();
            for (int[] elem : val) {
                for (int j = elem[0]; j < elem[1]; j++) {
                    a[i][j]=0;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
}