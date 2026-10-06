import java.util.Scanner;

public class SecondLargest {
    public static int slarge(int[] arr ) {
        int max=Integer.MIN_VALUE;
        int size=arr.length;
        int idx=-1;

        for (int i = 0; i <size  ; i++) {
            if(arr[i]>max){
                max=arr[i];
                idx=i;
            }
        }
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            if(i==idx){
                continue;
            }
            if(arr[i]>smax){
                smax=arr[i];
            }

        }
        return smax;
    }
    
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter cases = ");
        int t = s.nextInt();

        for (int i = 1; i <= t; i++) {
            System.out.print("Enter total numbers = ");
            int n = s.nextInt();
            System.out.print("Enter elements = ");
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = s.nextInt();
            }
            int ans=slarge(arr);
            System.out.print("Second large = "+ans);
        }
    }
}
