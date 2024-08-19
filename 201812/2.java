
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), y = sc.nextInt(), g = sc.nextInt(), n = sc.nextInt();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            long t = sc.nextInt();
            if (k == 0){
                sum+=t;
            }
            else{
                t-=sum%(r+y+g);
                while (t <= 0){
                    switch (k) {
                        case 1:
                            t+=g;
                            k=3;
                            break;
                        case 2:
                            t+=r;
                            k=1;
                            break;
                        case 3:
                            t+=y;
                            k=2;
                            break;
                    }
                }
                if (k == 1){
                    sum+=t;
                }
                else if (k == 2){
                    sum+=t+r;
                }
            }
        }
        System.out.println(sum);
    }
}