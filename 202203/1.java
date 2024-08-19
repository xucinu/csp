
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        int k = sc.nextInt(), c = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < k; i++){
            int x = sc.nextInt(), y = sc.nextInt();
            if (y!=0 && !set.contains(y)){
                c++;
            }
            set.add(x);
        }
        System.out.println(c);
    }
}