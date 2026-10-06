import java.util.Scanner;

public class IntersectionValue {
    public static void check(int[] a,int[] b) {
        int size1 = a.length;
        int size2 = b.length;

        for (int i = 0; i < size1 ; i++) {
            for (int j = 0; j < size2; j++) {
                if (a[i] == b[j]) {
                    System.out.println("Intersecting element is = "+a[i]);
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
            int[] arr1 = new int[n];
            for (int j = 0; j < n; j++) {
                arr1[j] = s.nextInt();
            }

            System.out.print("Enter total numbers = ");
            int m = s.nextInt();
            System.out.print("Enter elements = ");
            int[] arr2 = new int[m];
            for (int j = 0; j < m; j++) {
                arr2[j] = s.nextInt();
            }
            check(arr1,arr2);
        }
    }
}
