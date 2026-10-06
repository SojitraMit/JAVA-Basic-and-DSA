import java.net.StandardSocketOptions;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = 1;
        int b = 1;

        if(n==1 || n==2){
            System.out.println(a);
        }

        int ans = 0;
        for (int i = 1; i <= n - 2; i++) {
            ans = a + b;
            a = b;
            b = ans;
        }
        System.out.println(ans);
    }
}
