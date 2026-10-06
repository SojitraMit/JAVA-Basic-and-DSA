import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter n");
        int n=s.nextInt();

        int a=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(a%10);
                a++;
            }
            System.out.println();
        }
    }
}
