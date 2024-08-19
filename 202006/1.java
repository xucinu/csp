
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        List<int[]> a = new ArrayList<>(), b = new ArrayList<>();
        for (int i = 0; i < n; i++){
            int x = sc.nextInt(), y = sc.nextInt();
            if (sc.next().equals("A")){
                a.add(new int[]{x, y});
            }
            else{
                b.add(new int[]{x, y});
            }
        }
        for (int i = 0; i < m; i++){
            int s0 = sc.nextInt(), s1 = sc.nextInt(), s2 = sc.nextInt();
            boolean af = getf(s0, s1, s2, a, i), bf = getf(s0, s1, s2, b, i);
            if (af == bf){
                System.out.println("No");
                continue;
            }
            for (int j = 1; j < a.size(); j++){
                if (getf(s0, s1, s2, a, j) == bf){
                    af = !af;
                    break;
                }
            }
            if (af == bf){
                System.out.println("No");
                continue;
            }
            for (int j = 1; j < b.size(); j++){
                if (getf(s0, s1, s2, b, j) == af){
                    bf = !bf;
                    break;
                }
            }
            if (af == bf){
                System.out.println("No");
                continue;
            }
            System.out.println("Yes");
        }
    }

    public static boolean getf(int s0, int s1, int s2, List<int[]> zb, int i) {
        return s0 + s1 * zb.get(i)[0] + s2 * zb.get(i)[1] > 0;
    }
}