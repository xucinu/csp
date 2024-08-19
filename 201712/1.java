
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x, a = Integer.MAX_VALUE, b = Integer.MAX_VALUE;
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            if (set.contains(x)){
                System.out.println("0");
                return;
            }
            set.add(x);
        }
        for (int elem : set) {
            b = Math.min(Math.abs(elem - a), b);
            a = elem;
        }
        System.out.println(b);
    }
}