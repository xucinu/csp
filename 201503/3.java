
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), y1 = sc.nextInt(), y2 = sc.nextInt(), mounth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        long xq = 2;
        for (int i = 1850; i < y1; i++) {
            if(is(i)){
                xq+=366;
            }
            else{
                xq+=365;
            }
        }
        while (y1 <= y2) { 
            mounth[1] = is(y1) ? 29 : 28;
            for (int i = 0; i < a - 1; i++) {
                xq += mounth[i];
            }
            int f = (int) (xq%7);
            if (f==0) f=7;
            int day = 1 + (b - 1) * 7, w = c - f;
            if (w < 0) w += 7;
            day += w;
            if (day > mounth[a-1] || day < 1){
                System.out.println("none");
            }
            else{
                System.out.println(y1+"/"+String.format("%02d", a)+"/"+String.format("%02d", day));
            }
            for (int i = a - 1; i < mounth.length; i++) {
                xq += mounth[i];
            }
            y1++;
        }
    }

    public static boolean is(int i) {
        return (i % 4 == 0 && i % 100 != 0) || i % 400 == 0;
    }
}