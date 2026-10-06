import java.util.Scanner;

public class PowerFind {
    public static int power(int x,int n){
        if(n==1){
            return x;
        }

        return x * power(x,n-1);
    }

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("enter number : ");
        int x=s.nextInt();
        System.out.print("enter power : ");
        int n=s.nextInt();
        int ans=power(x,n);
        System.out.println(x+"^"+n+" = "+ans);
    }
}
