import java.util.Scanner;

public class SumOfCases {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter cases = ");
        int t=s.nextInt();

        for(int i=1;i<=t;i++){
            System.out.print("Enter total numbers = ");
            int n=s.nextInt();
            int sum=0;
            System.out.print("Enter elements = ");
            int arr[]=new int[n];
            for(int j=0;j<n;j++){
                arr[i]=s.nextInt();
                sum=sum+arr[i];
            }
            System.out.println("sum = "+ sum);
        }
    }
}
