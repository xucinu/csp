
import java.util.Scanner;
import java.util.Stack;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            String s = sc.next(), ss[] = s.split("");
            Stack s1 = new Stack(), s2 = new Stack();
            for (char elem : s.toCharArray()) {
                switch (elem) {
                    case '+':
                    case '-':
                    case 'x':
                    case '/':
                        if(s1.isEmpty()){
                            s1.push(elem);
                        }
                        else {
                            if(elem == '+' || elem == '-' || s1.peek().equals('x') || s1.peek().equals('/')){
                                s2.push(s1.pop());
                            }
                            s1.push(elem);
                        }
                        break;
                    default:
                        s2.push((int) elem - 48);
                        break;
                }
            }
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
            while(!s1.isEmpty()) {
                int num = 0;
                if(s1.peek().toString().matches("\\d")){
                    s2.push(s1.pop());
                }
                else{
                    String ll = s1.pop().toString();
                    int a = (int) s2.pop(), b = (int) s2.pop();
                    switch (ll) {
                        case "+":
                            num = a + b;
                            break;
                        case "-":
                            num = b - a;
                            break;
                        case "x":
                            num = a * b;
                            break;
                        case "/":
                            num = b / a;
                            break;
                    }
                    s2.push(num);
                }
            }
            if (s2.pop().equals(24)){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}