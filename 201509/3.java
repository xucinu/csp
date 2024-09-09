
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        sc.nextLine();
        String[] mb = new String[m];
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            mb[i] = sc.nextLine();
        }
        for (int i = 0; i < n; i++) {
            String[] s = sc.nextLine().split("\"");
            map.put(s[0].trim(), s[1].trim());
        }
        for (int i = 0; i < m; i++) {
            int l = mb[i].indexOf("{{"), ls = 0;
            while (l!=-1) { 
                System.out.print(mb[i].substring(ls, l));
                int r = mb[i].indexOf("}}", l);
                if(r!=-1){
                    String s = mb[i].substring(l+2, r).trim();
                    System.out.print(map.containsKey(s)?map.get(s):"");
                    l = mb[i].indexOf("{{", r);
                    ls = r+2;
                }
                else{
                    System.out.print(mb[i].substring(l, mb[i].length()));
                    break;
                }
            }
            System.out.println(mb[i].substring(ls));
        }
    }
}