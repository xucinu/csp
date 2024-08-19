
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a[] = new int[n], l, num, r;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        l = n/2;
        r = n/2;
        num = a[n/2];
        if(n % 2 == 0){
            l--;
        }
        while (l >= 0 && r < n){
            if (a[l] != num && a[r] != num){
                System.out.println(num);
                return;
            }
            else if(a[l] == a[r]){
                l--;
                r++;
            }
            else{
                System.out.println("-1");
                return;
            }
        }
        System.out.println(num);
    }
}