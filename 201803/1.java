
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,sum = 0, i = 1;
        do { 
            n = sc.nextInt();
            switch (n) {
                case 0:
                    System.out.println(sum);
                    break;
                case 1:
                    sum += 1;
                    i = 1;
                    break;
                case 2:
                    sum += 2 * i++;
                    break;
            }
        } while (n != 0);
    }
}