
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] gs = sc.nextLine().split("");
        Map<String, Boolean> map = new HashMap<>();
        for (int idx = 0; idx < gs.length; idx++) {
            String elem = gs[idx];
            if(elem.equals(":")){
                map.put(gs[idx-1], true);
            }
            else{
                map.put(elem, false);
            }
        }
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            String s = sc.nextLine();
            String[] ls = s.split(" ");
            Map<String, String> printMap = new TreeMap<>();
            System.out.print("Case " + i + ":");
            for (int idx = 1; idx < ls.length; idx++) {
                String elem = ls[idx];
                if(elem.length()==2 && elem.charAt(0) == '-'){
                    if(map.containsKey("" + elem.charAt(1))){
                        if(map.get("" + elem.charAt(1))){
                            if(++idx<ls.length){
                                printMap.put(elem, ls[idx]);
                            }
                        }
                        else{
                            printMap.put(elem, null);
                        }
                    }
                    else{
                        break;
                    }
                }
                else{
                    break;
                }
            }
            for (Map.Entry<String, String> en : printMap.entrySet()) {
                String key = en.getKey();
                String val = en.getValue();
                System.out.print(" " + key + "" + (val!=null?(" " + val):""));
            }
            System.out.println("");
        }
    }
}