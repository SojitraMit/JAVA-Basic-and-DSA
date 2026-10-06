import java.util.Scanner;

public class MirrorPattern2 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int spc=n+(n-2);

        for(int i=1;i<=n;i++){
            for(int j=1;j<=spc-(2*i)+2;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
