import java.util.Scanner;

public class CharPattern2 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        for(int i=1;i<=n;i++){
            char startingchar=(char)('A'+i-1);
            for(int j=1;j<=n;j++){
                System.out.print((char)(startingchar+j-1)); //print((char)('A'+j-2+i));
            }
            System.out.println();
        }
    }
}
