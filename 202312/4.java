
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main{
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt(), m = sc.nextInt();
        long[][] list = new long[n][5];
        for (int i = 0; i < n; i++) {
            list[i] = set();
        }
        Stack s = new Stack();
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            if(x == 1){
                int a = sc.nextInt();
                list[a-1] = set();
            }else{
                s.clear();
                int a = sc.nextInt()-1, b = sc.nextInt();
                for (int j = a; j < b; j++) {
                    if(list[j][0]==3){
                        if (!s.empty()){
                            s.pop();
                        }
                    }
                    else {
                        s.push(list[j]);
					}
                }
                long[] ans = {1,0,0,1}, num;
                for(int j = 0; j < s.size(); j++){
                    long[] temp = (long[]) s.get(j);
                    num = Arrays.copyOfRange(temp, 1, 5);
                    if(temp[0]==1){
                        ans = c(num,ans);
                    }
                    else{
                        ans = c(ans,num);
                    }
                }
                System.out.println(ans[0]+" "+ans[1]+" "+ans[2]+" "+ans[3]+" ");
            }
        }
    }

    public static long[] c(long[] a, long[] b) {
        return new long[]{((a[0]*b[0])%998244353+(a[1]*b[2])%998244353)%998244353,((a[0]*b[1])%998244353+(a[1]*b[3])%998244353)%998244353,
        ((a[2]*b[0])%998244353+(a[3]*b[2])%998244353)%998244353,((a[2]*b[1])%998244353+(a[3]*b[3])%998244353)%998244353};
    }

    public static long [] set() {
        long[] list = new long[5];
        list[0]=sc.nextInt();
        if(list[0] != 3){
            for (int j = 1; j < 5; j++) {
                list[j]=sc.nextLong();
            }
        }
        return list;
    }
}