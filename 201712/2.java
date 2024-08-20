
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(), num = 0;
        Deque q = new LinkedList();
        for(int i = 1; i <= n; i++){
            q.add(i);
        }
        while(q.size()!=1){
            num++;
            if(num%k==0||num%10==k){
                q.poll();
            }
            else{
                q.add(q.poll());
            }
        }
        System.out.println(q.poll());
    }
}