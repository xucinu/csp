
import java.util.Scanner;

public class Main{
    static class Node {
        int num;
        Node s;
        Node x;

        public Node(Node s, Node x){
            this.s = s;
            this.x = x;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        Node head = new Node(null, null), x = head;
        for (int i = 1; i <= n; i++){
            x.x = new Node(x, null);
            x = x.x;
            x.num = i;
        }
        for (int i = 0; i < m; i++){
            int p = sc.nextInt(), q = sc.nextInt();
            x = head;
            while(x.num!=p){
                x = x.x;
            }
            Node temp = x;
            if(x.x!=null){
                x = x.x;
                x.s = x.s.s;
            }
            if(x.s!=null){
                x = x.s;
                x.x = x.x.x;
            }
            while(q<0){
                x = x.s;
                q++;
            }
            while(q>0){
                x = x.x;
                q--;
            }
            temp.x = x.x;
            temp.s = x;
            x.x = temp;
            x = x.x.x;
            if(x!=null){
                x.s = temp;
            }
        }
        x = head.x;
        for (int i = 0; i < n; i++, x = x.x){
            System.out.print(x.num + " ");
        }
    }
}