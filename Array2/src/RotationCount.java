import java.util.Scanner;

public class RotationCount {
    public static int check(int[] a) {
        int size = a.length;
        int count=0;

        for(int i=0;i<size-1;i++) {
            for (int j = i+1; j < size ; j++) {
                if(a[i]>a[j]){
                    count++;
                    break;
                }
            }
        }
        return count;
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
            int ans=check(arr);
            System.out.print("Rotation = "+ans);
        }
    }
}
