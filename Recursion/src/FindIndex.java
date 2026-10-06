import java.util.Scanner;

public class FindIndex {
    public static int find(int arr[],int startIdx,int a){
        if(arr[startIdx]==a){
            return startIdx;
        }
        if(startIdx == arr.length-1){
            return -1;
        }

        int smallAns=find(arr,startIdx+1,a);
        return smallAns;
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
        System.out.print("Enter finding number : ");
        int a=s.nextInt();
        int ans=find(arr,0,a);
        System.out.print("Element Index : "+ans);
    }
}
