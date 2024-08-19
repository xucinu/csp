
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), sum = 0, a[] = new int[n], min = 0;
        for (int i = 0; i < n; i++){
            sum += sc.nextInt();
            for (int j = 0; j < m; j++){
                a[i] += sc.nextInt();
            }
            if (a[i] < a[min]){
                min = i;
            }
            sum += a[i];
        }
        System.out.println(sum + " " + (min+1) + " " + (-a[min]));
    }
}