import java.util.Scanner;

public class PrimeNumber {
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
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        boolean prime=isprime(n);
        System.out.print(prime);
    }
}
