import java.util.Scanner;

public class SwapAlternate {
    public static int[] swap(int input[]){
        int size=input.length;
        for(int i=0;i<size-1;i+=2){
            int j=i+1;
                int temp=input[i];
                input[i]=input[j];
                input[j]=temp;
        }
        return input;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter cases = ");
        int t=s.nextInt();

        for(int i=1;i<=t;i++){
            System.out.print("Enter total numbers = ");
            int n=s.nextInt();
            System.out.print("Enter elements = ");
            int arr[]=new int[n];
            for(int j=0;j<n;j++){
                arr[j]=s.nextInt();
            }
            int ans[]=swap(arr);

            System.out.print("Alternate Swap numbers = ");
            for(int j=0;j<n;j++){
                System.out.print(ans[j]+" ");
            }
            System.out.println();
        }
    }
}
