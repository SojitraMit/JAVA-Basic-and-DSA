import java.util.Scanner;

public class PrintSumPairs {
    public static void check(int[] a,int x) {
        int size = a.length;

        for (int i = 0; i < size -1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (a[i] + a[j]==x) {
                    if(a[i]>a[j]) {
                        System.out.println(a[j] + " " + a[i]);
                    }
                    else{
                        System.out.println(a[i] + " " + a[j]);
                    }
                }
            }
        }
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
            System.out.print("Enter required sum = ");
            int x=s.nextInt();
            check(arr,x);
        }
    }
}