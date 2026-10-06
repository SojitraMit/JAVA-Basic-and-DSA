import java.util.Scanner;

public class FibonacciCheck {
    public static boolean check(int n){
        int a=0;
        int b=1;
        int ans=0;
        if(n==0) return true;

        while(ans<=n){
            ans=a+b;
            a=b;
            b=ans;
            if(ans==n){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number : ");
        int n=s.nextInt();

        boolean ans= check(n);
        System.out.print(ans);
    }
}
