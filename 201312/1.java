
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s[] = new int[10001], max = 0;
        for(int i = 0; i < n; i++){
            s[sc.nextInt()]++;
        }
        for(int i = 1; i < s.length; i++){
            if (s[i] > s[max]){
                max = i;
            }
        }
        System.out.println(max);
    }
}