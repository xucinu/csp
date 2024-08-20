
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), l = sc.nextInt(), t = sc.nextInt(), a[] = new int[n + 1], f[] = new int[n+1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < t; i++) {
            for(int j = 0; j <= n; j++){
                if(a[j] == 0){
                    f[j] = 0;
                    continue;
                }
                if(a[j] == l){
                    f[j] = 1;
                    continue;
                }
                for(int k = 0; k <= n; k++){
                    if(j != k && a[j] == a[k]){
                        f[j] = f[j] == 1 ? 0 : 1;
                        break;
                    }
                }
            }
            for(int j = 1; j <= n; j++){
                if(f[j] == 0){
                    a[j]++;
                }
                else{
                    a[j]--;
                }
            }
        }
        for (int i = 1; i <= n; i++){
            System.out.print(a[i] + " ");
        }
    }
}