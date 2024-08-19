
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), y, result[] = new int[m], r[] = new int[100000001], max = 0, index = 0;
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < m; i++) {
            y = sc.nextInt();
            max = Math.max(max, y);
            set.add(y);
            result[i] = sc.nextInt();
            if(result[i] == 0){
                r[y+1]++;
            }
            else{
                r[y]--;
            }
        }
        for(int i = 1; i <= max; i++){
            r[i]+=r[i-1];
        }
        for (int i : set){
            if(r[index]<=r[i]){
                index = i;
            }
        }
        System.out.println(index);
    }
}