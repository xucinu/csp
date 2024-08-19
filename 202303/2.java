
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt(), max = k;
        Map<Integer, Integer> t = new HashMap();
        for (int i = 0; i < n; i++) {
            int ti = sc.nextInt();
            t.put(ti, t.get(ti)!=null?t.get(ti)+sc.nextInt():sc.nextInt());
            max = Math.max(ti, max);
        }
        for (int i = max; i >= k; i--){
            if (i == k || t.get(i)>m){
                System.out.println(i);
                return;
            }
            m -= t.get(i);
            t.put(i-1, t.get(i-1)!=null?t.get(i-1)+t.get(i):t.get(i));
        }
    }
}