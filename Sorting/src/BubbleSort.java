import java.util.Scanner;

public class BubbleSort {
    public static void sorting(int input[]){
        for(int i=0;i<input.length-1;i++){
            for(int j=0;j<input.length-1-i;j++){
                if(input[j]>input[j+1]){
                    int temp=input[j];
                    input[j]=input[j+1];
                    input[j+1]=temp;
                }
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
