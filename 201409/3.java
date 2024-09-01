
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean is = sc.nextInt() == 1;
        char[] c = is ? s.toCharArray() : s.toLowerCase().toCharArray();
        int n = sc.nextInt(), next[] = new int[s.length()], l = 0;
        for (int i = 1; i < s.length(); i++) {
            do { 
                if (c[i] == c[l]){
                    l++;
                    next[i] = l;
                    break;
                }
                l = next[i-1];
            }while(l!=0);
        }
        for (int i = 0; i < n; i++) {
            String lls = sc.next();
            char[] llc = is ? lls.toCharArray() : lls.toLowerCase().toCharArray();
            l = 0;
            for (int j = 0; j < llc.length; j++) {
                while(llc[j] != c[l] && l != 0){
                    l = next[l-1];
                }
                if(llc[j] == c[l]){
                    l++;
                }
                if(l==c.length){
                    System.out.println(lls);
                    break;
                }
            }
        }
    }
}