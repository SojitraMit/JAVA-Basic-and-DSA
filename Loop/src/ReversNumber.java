import java.util.Scanner;

public class ReversNumber {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int rev=0;

        while(n>0){
            int ld=n%10;
            n /=10;
            rev=(rev*10)+ld;
        }
        System.out.print("revers = "+rev);
    }
}
