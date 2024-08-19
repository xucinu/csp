
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x, sum = 0;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            x = sc.nextInt();
            set.add(x);
            if(set.contains(-x)){
                sum++;
            }
        }
        System.out.println(sum);
    }
}