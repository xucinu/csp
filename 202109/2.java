
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), i = 0, s = 0, a, x, num, max;
        Map<Integer, Integer> map = new TreeMap<>();
        do { 
            a = sc.nextInt();
            i++;
        } while (a == s && i < n);
        for(; i <= n; i++){
            if(i < n){
                x = sc.nextInt();
                if(x == a){
                    continue;
                }
            }
            else{
                x = 0;
            }
            if(s > a && x > a){
                map.put(a, map.containsKey(a) ? map.get(a) + 1 : 1);
            }
            else if(s < a && x < a){
                map.put(a, map.containsKey(a) ? map.get(a) - 1 : - 1);
            }
            s = a;
            a = x;
        }
        num = map.isEmpty() ? 0 : 1;
        max = num;
        for (Map.Entry<Integer, Integer> elem : map.entrySet()) {
            num += elem.getValue();
            max = Math.max(num, max);
        }
        System.out.println(max);
    }
}