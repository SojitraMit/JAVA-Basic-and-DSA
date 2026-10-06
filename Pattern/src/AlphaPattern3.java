import java.util.Scanner;

public class AlphaPattern3 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        for(int i=1;i<=n;i++){
            char startingchar=(char)('A'+i-1);
            for(int j=1;j<=i;j++){
                System.out.print((char)(startingchar)); //print((char)('A'+j-2+i));
            }
            System.out.println();
        }
    }
}
