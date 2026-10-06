import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int a=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<a;k++){
                System.out.print("*");
            }
            a +=2;
            System.out.println();

        }
        a -=4;

        for(int i=0;i<n-1;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<a;k++){
                System.out.print("*");
            }
            a -=2;
            System.out.println();
        }
    }
}
