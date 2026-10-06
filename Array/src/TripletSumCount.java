import java.util.Scanner;

public class TripletSumCount {
    public static void check(int[] a,int x) {
        int size = a.length;
        int count = 0;

        for (int i = 0; i < size -2; i++) {
            for (int j = i + 1; j < size-1; j++) {
                for(int k=j+1;k<size;k++){
                    if (a[i] + a[j] + a[k] ==x) {
                    count++;
                    }
                }
            }
        }
        System.out.println("Total triplet = "+count);
    }
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);

            System.out.print("Enter total numbers = ");
            int n = s.nextInt();
            System.out.print("Enter elements = ");
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = s.nextInt();
            }
            System.out.print("Enter required sum = ");
            int x=s.nextInt();
            check(arr,x);
    }
}
