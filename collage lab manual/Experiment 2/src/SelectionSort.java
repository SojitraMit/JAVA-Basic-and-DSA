import java.util.ArrayList;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter size");
        int n=s.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }

        for(int i=0;i<n-1;i++){
            int min=arr[i];
            int idx=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                    idx=j;
                }
            }
            int temp=arr[i];
            arr[i]=min;
            arr[idx]=temp;
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
