
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            x = sc.nextInt();
            map.put(x, map.containsKey(x) ? map.get(x)+1 : 1);
            System.out.print(map.get(x) + " ");
        }
    }
}