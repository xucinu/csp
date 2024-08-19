
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt(), sum = 0;
        for (int i = 0; i < n; i++){
            int x1 = Math.max(sc.nextInt(), 0),
            y1 = Math.max(sc.nextInt(), 0),
            x2 = Math.min(sc.nextInt(), a),
            y2 = Math.min(sc.nextInt(), b);
            if (x1 < x2 && y1 < y2){
                sum += (x2 - x1) * (y2 - y1);
            }
        }
        System.out.println(sum);
    }
}