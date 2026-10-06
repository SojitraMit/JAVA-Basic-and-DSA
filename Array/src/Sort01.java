import java.util.Scanner;

public class Sort01 {
    public static void sort(int[] a) {
        int size = a.length;

        for (int i = 0; i < size -1; i++) {
            for (int j = i + 1; j < size; j++) {
               if(a[i]>a[j]){
                   int temp=a[i];
                   a[i]=a[j];
                   a[j]=temp;
                   break;
               }
            }
        }
    }

    public static void print(int[] a){
        int size=a.length;

        System.out.println("Sorted array :");
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
            System.out.print("Enter elements in 0 and 1 = ");
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = s.nextInt();
            }
            sort(arr);
            print(arr);
        }
    }
}
