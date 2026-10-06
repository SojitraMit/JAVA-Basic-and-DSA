import java.util.Scanner;

public class PushZero {
    public static int[] push(int[] a) {
        int size = a.length;

        for(int p=0;p<size-1;p++) {
            for (int i = 0; i < size - 1; i++) {
                if (a[i] == 0) {
                    int j = i + 1;
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
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
            int ans[]=push(arr);
            print(ans);
        }
    }
}
