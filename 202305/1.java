
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<List<String>, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            List<String> s = new ArrayList<>();
            for (int j = 0; j < 8; j++) {
                s.add(sc.next());
            }
            map.put(s, map.get(s)!=null?map.get(s)+1:1);
            System.out.println(map.get(s));
        }
    }
}