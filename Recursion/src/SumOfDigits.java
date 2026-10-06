import java.util.Scanner;

public class SumOfDigits {
    public static int add(int n,int sum){
        if(n<1) {
            return sum;
        }

        sum=sum+(n%10);
        return add(n/10,sum);
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n;
        System.out.print("enter number : ");
        n=s.nextInt();
        int sum=0;

        int ans=add(n,sum);
        System.out.print("sum : "+ans);
    }
}
