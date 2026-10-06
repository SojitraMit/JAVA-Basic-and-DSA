import java.util.Scanner;

public class AllPrimeNumber {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        for(int i=2;i<=n;i++){
            boolean divide = true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    divide=false;
                    break;
                }
            }
            if(divide) {
                System.out.println(i);
            }
        }
    }
}
