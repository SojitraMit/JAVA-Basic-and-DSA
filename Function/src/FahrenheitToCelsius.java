import java.util.Scanner;

public class FahrenheitToCelsius {
    public static int convert(int n){
        int celsius=(int)((5.0/9)*(n-32));
        return celsius;
    }

    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("enter Starting Fahrenheit : ");
        int s=scan.nextInt();
        System.out.print("enter Ending Fahrenheit : ");
        int e=scan.nextInt();
        System.out.print("enter Size of Fahrenheit : ");
        int size=scan.nextInt();

        for(int i=s;i<=e;i=i+size){
            int ans=convert(i);
            System.out.println(i+" : "+ans);
        }
    }
}
