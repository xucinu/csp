
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if (t <= 3500){
            
        }
        else if (t <= 4955){
            int c = 4955 - t;
            t = 5000 - c / 97 * 100;
        }
        else if (t <= 7655){
            int c = 7655 - t;
            t = 8000 - c / 90 * 100;
        }
        else if (t <= 11255){
            int c = 11255 - t;
            t = 12500 - c / 80 * 100;
        }
        else if  (t <= 30755){
            int c = 30755 - t;
            t = 38500 - c / 75 * 100;
        }
        else if (t <= 44755){
            int c = 44755 - t;
            t = 58500 - c / 70 * 100;
        }
        else if (t <= 61005){
            int c = 61005 - t;
            t = 83500 - c / 65 * 100;
        }
        else{
            int c = t - 61005;
            t = 83500 + c / 55 * 100;
        }
        System.out.println(t);
    }
}