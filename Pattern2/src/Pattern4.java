import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            int p=1;
            for(int k=1;k<=i;k++){
                System.out.print(p);
                p++;
            }
            p=p-2;
            for(int l=1;l<=i-1;l++){
                System.out.print(p);
                p--;
            }
            System.out.println();
        }
    }
}
