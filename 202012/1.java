
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), y = 0;
        for (int i = 0; i < n; i++) {
            y+=sc.nextInt()*sc.nextInt();
        }
        System.out.println(Math.max(0, y));
    }
}