import java.util.Scanner;

public class BinarySearch {
    public static int search(int[] a,int x) {
        int size = a.length;
        int start = 0, end = size - 1;
        int idx=-1;

        while(start<=end){
            int mid = (start + end) / 2;
            if (a[mid]==x ){
                idx=mid;
                break;
            }
            else if(x>a[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return idx;
    }


//    public static void print(int[] a) {
//        int size = a.length;
//
//        System.out.println("Sorted array :");
//        for (int i = 0; i < size; i++) {
//            System.out.print(a[i] + " ");
//        }
//    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter total numbers = ");
        int n = s.nextInt();
        System.out.print("Enter elements  = ");
        int[] arr = new int[n];
        for (int j = 0; j < n; j++) {
            arr[j] = s.nextInt();
        }

        System.out.print("Enter cases = ");
        int t = s.nextInt();
        for (int i = 1; i <= t; i++) {
            System.out.print("Enter searching element = ");
            int x = s.nextInt();
            int ans = search(arr,x);
            System.out.println("Element index = "+ans);
        }
    }
}

