import java.util.Scanner;

public class SumOfArray {
    public static int add(int[] arr,int length){
        if(length==0){
            return arr[0];
        }
        return arr[length] + add(arr,length-1);
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("enter size of array : ");
        int n=s.nextInt();
        int[] arr=new int[n];
        System.out.print("enter numbers of array : ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        //int sum=0;
        int ans=add(arr,n-1);
        System.out.print("sum = "+ans);
    }
}
