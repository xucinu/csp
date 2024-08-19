
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), l = sc.nextInt(), s = sc.nextInt(), b[][] = new int[s+1][s+1], c = 0;
        Set<List<Integer>> zb = new HashSet<>();
        for (int i = 0; i < n; i++) {
            zb.add(Arrays.asList(sc.nextInt(), sc.nextInt()));
        }
        for (int i = s; i >= 0; i--) {
            for (int j = 0; j < s+1; j++){
                b[i][j] = sc.nextInt();
            }
        }
        for (List<Integer> key : zb) {
            int i = key.get(0), j = key.get(1);
            if (i + s <= l && j  + s <= l){
                boolean flag = true;
                for (int x = 0; flag && x <= s; x++){
                    for (int y = 0; flag && y <= s; y++){
                        if(zb.contains(Arrays.asList(i + x, j + y)) != (b[x][y] == 1)){
                            flag = false;
                        }
                    }
                }
                if (flag){
                    c++;
                }
            }
            
        }
        System.out.println(c);
    }
}