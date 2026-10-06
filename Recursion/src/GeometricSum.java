import java.util.Scanner;
//1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^n)
public class GeometricSum {

//    public static int power(int x,int n){
//        if(n==1){
//            return x;
//        }
//        return x * power(x,n-1);
//    }

    public static double sum(int n){
        if(n==0){
            return 1;
        }
        //return ((double)1/power(2,n)) + sum(n-1);
        return (1/Math.pow(2,n)) + sum(n-1);
    }

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n;
        System.out.print("enter number : ");
        n=s.nextInt();
        double ans=sum(n);
        System.out.print(ans);
    }
}
