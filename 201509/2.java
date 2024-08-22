
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt(), d = sc.nextInt(), m[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, i = 0;
        if((y%4==0&&y%100!=0)||(y%400==0)){
            m[1] = 29;
        }
        while (d > m[i]) { 
            d-=m[i];
            i++;
        }
        System.out.println(i+1);
        System.out.println(d);
    }
}