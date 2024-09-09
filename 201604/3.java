
import java.util.Scanner;
import java.util.Stack;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int p = sc.nextInt();
        String[] d = sc.next().split("/");
        Stack<String> ds = new Stack<>();
        for (int j = 1; j < d.length; j++) {
            ds.push(d[j]);
        }
        sc.nextLine();
        for (int i = 0; i < p; i++) {
            String s = sc.nextLine(), l[] = s.split("/");
            if(s.isEmpty()){
                System.out.println("/".concat(String.join("/", ds)));
                continue;
            }
            else if(l.length==0){
                System.out.println("/");
                continue;
            }
            Stack<String> xs = new Stack<>();
            if(l[0].isEmpty()){
                xs = new Stack<>();
            }
            else{
                for (String elem : ds) {
                    xs.push(elem);
                }
            }
            for (String ll : l) {
                if (ll.equals("..")) {
                    if(!xs.isEmpty()){
                        xs.pop();
                    }
                } else if (ll.equals(".")) {
                } else if (!ll.isEmpty()) {
                    xs.push(ll);
                }
            }
            System.out.println("/".concat(String.join("/", xs)));
        }
    }
}