
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<int[]> ac = new LinkedList<>(), bc = new LinkedList<>();
        ac.add(new int[]{30, 0});
        bc.add(new int[]{30, 0});
        boolean is = true;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            switch (s) {
                case "summon":
                    {
                        int p = sc.nextInt(), a = sc.nextInt(), h = sc.nextInt();
                        if(is){
                            ac.add(p, new int[]{h, a});
                        }
                        else{
                            bc.add(p, new int[]{h, a});
                        }
                        break;
                    }
                case "attack":
                    {
                        int a = sc.nextInt(), d = sc.nextInt(), g[] = is ? ac.get(a) : ac.get(d), h[] = is ? bc.get(d) : bc.get(a);
                        g[0]-=h[1];
                        h[0]-=g[1];
                        if(is){
                            if(g[0]<=0&&a!=0){
                                ac.remove(a);
                            }
                            if(h[0]<=0&&d!=0){
                                bc.remove(d);
                            }
                        }
                        else{
                            if(g[0]<=0&&d!=0){
                                ac.remove(d);
                            }
                            if(h[0]<=0&&a!=0){
                                bc.remove(a);
                            }
                        }
                        break;
                    }
                default:
                    is = !is;
                    break;
            }
        }
        if(ac.get(0)[0]<=0){
            System.out.println("-1");
        }
        else if(bc.get(0)[0]<=0){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
        System.out.println(ac.get(0)[0]);
        System.out.print(ac.size()-1);
        for (int i = 1; i < ac.size(); i++) {
            System.out.print(" "+ac.get(i)[0]);
        }
        System.out.println("");
        System.out.println(bc.get(0)[0]);
        System.out.print(bc.size()-1);
        for (int i = 1; i < bc.size(); i++) {
            System.out.print(" "+bc.get(i)[0]);
        }
    }
}