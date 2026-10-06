import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter number");
        int x=s.nextInt();
        System.out.println("enter power");
        int n=s.nextInt();
        int ans=1;

        for(int i=1;i<=n;i++){
            ans *=x;
        }
        System.out.print(x+" power "+n +"= "+ ans);
    }
}
