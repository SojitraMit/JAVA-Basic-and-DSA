import java.util.Scanner;


public class Factorial {

    public static int fact(int n){
        if(n==1){
            return 1;
        }

        return n*fact(n-1);
    }

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int ans=fact(n);
        System.out.println("factorial of "+n+" = "+ans);
    }
}
