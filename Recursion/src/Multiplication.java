import java.util.Scanner;

public class Multiplication {
    public static int multiply(int n,int m){
        if(m==1){
            return n;
        }
//        if(m==0){
//            return 0;
//        }
        return n + multiply(n,m-1);
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter first number : ");
        int n=s.nextInt();
        System.out.print("Enter second number : ");
        int m=s.nextInt();
        int ans=multiply(n,m);
        System.out.print(ans);
    }
}
