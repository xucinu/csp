
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),m=sc.nextInt();
        int[][] ck = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ck[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            int flag = 0;
            for (int j = 0 ; j < n && flag==0; j++){
                flag = 1;
                for(int k = 0; k < m; k++){
                    if(i==j || ck[i][k] >= ck[j][k]){
                        flag = 0;
                    }
                }
                if(flag==1){
                    System.out.println(j+1);
                }
            }
            if(flag==0){
                System.out.println(0);
            }
        }
    }
}