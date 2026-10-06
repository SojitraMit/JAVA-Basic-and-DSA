import java.util.Scanner;

public class PrimeTowToN {
    public static boolean isprime(int n){
        int d=2;
        while(d<n) {
            if (n % d == 0) {
                return false;
            }
            d++;
        }
        return true;
    }

    public static void printprime(int n){
        for(int i=2;i<=n;i++){
            boolean notdivide=isprime(i);
            if(notdivide){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        printprime(n);
    }
}
