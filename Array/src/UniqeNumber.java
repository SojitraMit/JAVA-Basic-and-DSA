import java.util.Scanner;

public class UniqeNumber {
    public static void check(int[] arr) {
        int size = arr.length;

        for (int i = 0; i < size ; i++) {
            boolean find = false;
            for (int j = 0; j < size ; j++) {
                if(i==j){
                    continue;
                }
                if (arr[i] == arr[j]) {
                    find = true;
                    break;
                }
            }
            if (!find) {
                System.out.println("unique element is = "+arr[i]);
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
                check(arr);
            }
        }
    }

