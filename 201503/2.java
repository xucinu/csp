
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a[][] = new int[1001][2];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            a[x][0] = x + 1;
            a[x][1]++;
        }
        Arrays.sort(a, (o1, o2) -> {
            return o2[1] - o1[1];
        });
        for (int[] elem : a) {
            if(elem[0]==0){
                break;
            }
            System.out.println((elem[0] - 1) + " " + elem[1]);
        }
    }
}