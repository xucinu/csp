
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x, sum = 0;
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++){
            x = sc.nextInt();
            set.add(x);
        }
        for(int e : set){
            if(set.contains(e-1)){
                sum++;
            }
        }
        System.out.println(sum);
    }
}