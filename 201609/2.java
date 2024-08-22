
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s[] = new int[20], l[] = new int[6];
        l[5] = 20;
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            for(int j = p; j <= 5; j++){
                if(l[j] > 0){
                    for(int k = 0; k < 20; k++){
                        if(s[k] + p <= 5){
                            l[5-s[k]]--;
                            while(p > 0){
                                s[k]++;
                                System.out.print(k * 5 + s[k] + " ");
                                p--;
                            }
                            l[5-s[k]]++;
                        }
                    }
                }
            }
            for (int j = 0; j < 20 && p > 0; j++){
                l[5-s[j]]--;
                while(p > 0 && s[j] < 5){
                    s[j]++;
                    System.out.print(j * 5 + s[j] + " ");
                    p--;
                }
                l[5-s[j]]++;
            }
            System.out.println("");
        }
    }
}