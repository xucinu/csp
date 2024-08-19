
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        int a = sc.nextInt(), b = sc.nextInt(), u[][] = new int[a][2], index = 0;
        long sum = 0;
        for(int i = 0; i < a; i++){
            u[i][0] = sc.nextInt();
            u[i][1] = sc.nextInt();
        }
        for(int i = 0; i < b; i++){
            int x = sc.nextInt(), y = sc.nextInt();
            while (index < u.length && u[index][0] < x){
                index++;
            }
            if (index == u.length){
                break;
            }
            if (u[index][0] == x){
                sum += u[index][1] * y;
            }
        }
        System.out.println(sum);
    }
}