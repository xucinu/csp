
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        Set<Integer> ky = new TreeSet<>(), hb = new TreeSet<>();
        Map<Integer, Set<Integer>> y = new TreeMap<>(), h = new TreeMap<>();
        Map<Integer, Integer> wz = new HashMap<>();
        for(int i = 1; i <= n; i++){
            wz.put(i, i);
        }
        for (int i = 0; i < k; i++) {
            int w = sc.nextInt(), s = sc.nextInt(), c = sc.nextInt();
            hb.add(s);
            hb.add(s+c);
            Set<Integer> ys = y.containsKey(s) ? y.get(s) : new HashSet<>(), hs = h.containsKey(s+c) ? h.get(s+c) : new TreeSet<>();
            ys.add(w);
            hs.add(w);
            y.put(s, ys);
            h.put(s+c, hs);
        }
        for(int i : hb){
            if(h.containsKey(i)){
                for(int e : h.get(i)){
                    for(int v : ky){
                        ky.remove(v);
                        wz.put(v, e);
                        break;
                    }
                }
            }
            if(y.containsKey(i)){
                for(int v : y.get(i)){
                    for (Map.Entry<Integer, Integer> en : wz.entrySet()) {
                        int key = en.getKey();
                        int val = en.getValue();
                        if (val == v){
                            ky.add(key);
                            break;
                        }
                    }
                }
            }
        }
        for(int i = 1; i <= n; i++){
            System.out.print(wz.get(i) + " ");
        }
    }
}