import java.util.Scanner;
//Last index means - if x is present multiple times in the array,
// return the index at which x comes last in the array.
public class LastIndex {
    public static int find(int arr[],int startIdx,int lastIdx,int a){
        if(arr[startIdx]==a){
            lastIdx=startIdx;
        }
        if(startIdx == arr.length-1){
            return lastIdx;
        }

        int smallAns=find(arr,startIdx+1,lastIdx,a);
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
        int ans=find(arr,0,-1,a);
        //Last index means - if x is present multiple times in the array,
        // return the index at which x comes last in the array.
        System.out.print("Element last Index : "+ans);
    }
}
