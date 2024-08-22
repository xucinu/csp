
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] n = sc.next().split("-");
        int sum = 0, index = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < n[i].length(); j++) {
                sum+=(n[i].charAt(j) - 48) * index++;
            }
        }
        sum%=11;
        String s = sum==10 ? "X" : sum+"";
        if(n[3].equals(s)){
            System.out.println("Right");
        }
        else{
            System.out.println(n[0]+"-"+n[1]+"-"+n[2]+"-"+s);
        }
    }
}