import java.util.Scanner;

public class InsertionSort {
    public static void sorting(int input[]){
        for(int i=1;i<input.length;i++){
           int j=i;
           while(j>=1 && input[j]<input[j-1]){
               int temp=input[j-1];
               input[j-1]=input[j];
               input[j]=temp;
               j--;
            }
        }
    }

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter total numbers = ");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter elements = ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }

        sorting(arr);
        System.out.println("Sorted arr :");
        for(int j=0;j<n;j++){
            System.out.print(arr[j]+" ");
        }
    }

}
