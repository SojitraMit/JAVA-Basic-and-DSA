import java.util.Scanner;

public class PrimeNumberByBreak {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        boolean divide=false;

        for(int i=2;i<n;i++){
            if(n%i==0){
                divide=true;
                break;
            }
        }
        if(divide){
            System.out.println("not prime");
        }
        else{
            System.out.println("prime number");
        }
    }
}
