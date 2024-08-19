
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), cz[][]=new int[n][2];
        for(int i=0;i<n;i++) {
            cz[i][0]=sc.nextInt();
            cz[i][1]=sc.nextInt();    
        }
        for (int i = 0; i < m; i++) {
            int x=sc.nextInt(),y=sc.nextInt();
            for(int j=0;j<n;j++){
                x+=cz[j][0];
                y+=cz[j][1];
            }
            System.out.println(x+" "+y);
        }
    }
}