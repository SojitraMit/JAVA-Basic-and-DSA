import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        for(int i=1;i<=n;i++){
            int spc=(2*n)-2;
            for(int j=1;j<=spc-(2*i)+2;j++){
                System.out.print(" ");
            }
            int p=i;
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
