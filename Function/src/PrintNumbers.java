import java.util.Scanner;

public class PrintNumbers {
    public static void  print(int n) {
        if (n <= 0) {
            return;
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        print(n);
    }

}


