import java.util.Scanner;

public class SelectionSort {
    public static void sorting(int input[]){
        for(int i=0;i<input.length-1;i++){
            int min=Integer.MAX_VALUE;                
            int minIdx=-1;
            for(int j=i;j<input.length;j++){
                if(input[j]<min){
                    min=input[j];
                    minIdx=j;
                }
            }
            if(minIdx != i){
                input[minIdx]=input[i];
                input[i]=min;
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
