
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), index = 0, sum = 0;
        boolean[] h = new boolean[1000001], w = new boolean[1000001];
        for(int i = 0; i < n; i++){
            int a = sc.nextInt(), b = sc.nextInt();
            for (int j = a; j < b; j++) {
                h[j] = true;
            }
            index = Math.max(index, b);
        }
        for(int i = 0; i < n; i++){
            int a = sc.nextInt(), b = sc.nextInt();
            for (int j = a; j < b; j++) {
                w[j] = true;
            }
            index = Math.max(index, b);
        }
        for(int i = 0; i < index; i++){
            if(h[i] && w[i]){
                sum++;
            }
        }
        System.out.println(sum);
    }
}