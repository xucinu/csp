
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;String[] temp;
        str = br.readLine();
        temp = str.split(" ");
        int n = Integer.parseInt(temp[0]);
        int m = Integer.parseInt(temp[1]);
        int a[][]=new int[1001][1001];
        for(int i=0;i<n;i++) {
            str = br.readLine();
            temp = str.split(" ");
            for(int j=0;j<temp.length;j++) {
                a[i][j]= Integer.parseInt(temp[j]);
            }
        }
        for(int i=m-1;i>=0;i--) {
            for(int j=0;j<n;j++) {
                System.out.print(a[j][i]);
                if(j!=n-1) System.out.print(" ");
                else System.out.println();
            }
        }
    }
}