import java.util.Scanner;
//WRONG CODE
public class Sort012 {
    public static void sort(int[] a) {
        int size = a.length;

        for (int i = 0; i < size; i++) {
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
            System.out.print("Enter elements in 0, 1 and 2 = ");
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = s.nextInt();
            }
            sort(arr);
            print(arr);
        }
    }
}
