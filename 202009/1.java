
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt(), index = 0;
        Map<Integer, List<Integer>> map = new TreeMap<>();
        for (int i = 0; i < n; i++){
            int xi = sc.nextInt(), yi = sc.nextInt(), jl = (x - xi) * (x - xi) + (y - yi) * (y - yi);
            List<Integer> ll = map.containsKey(jl) ? map.get(jl) : new ArrayList<>();
            ll.add(i+1);
            map.put(jl, ll);
        }
        for (Map.Entry<Integer, List<Integer>> en : map.entrySet()) {
            List<Integer> val = en.getValue();
            int i = 0;
            while (index < 3 && i < val.size()) { 
                System.out.println(val.get(i++));
                index++;
            }
        }
    }
}