import java.util.Scanner;

public class FindNumber {
//    public static boolean find(int[] arr,int a){
//        if(arr[0]==a){
//            return true;
//        }
//        if(arr.length==1){
//            return false;
//        }
//
//        int smallarr[]=new int[arr.length-1];
//        for(int i=1;i<arr.length;i++){
//            smallarr[i-1]=arr[i];
//        }
//        boolean smallAns=find(smallarr,a);
//        return smallAns;
//    }

    public static boolean find(int arr[],int startIdx,int a){
        if(arr[startIdx]==a){
            return true;
        }
        if(startIdx == arr.length-1){
            return false;
        }

        boolean smallAns=find(arr,startIdx+1,a);
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
        boolean ans=find(arr,0,a);
        System.out.print(ans);
    }
}
