import java.util.Scanner;

public class RotateArray {
    public static int[] revers(int[] arr , int a, int b) {

            for (int i = a,j=b; i <= j ; i++,j--) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
            }
        return arr;
    }

    public static void print(int[] a){
        int size=a.length;

        System.out.println("Answer array :");
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
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
            System.out.print("Enter rotation = ");
            int x=s.nextInt();
            revers(arr,0,x-1);
            revers(arr,0,n-1);
            revers(arr,0,n-x-1);
            print(arr);
        }
    }
}
