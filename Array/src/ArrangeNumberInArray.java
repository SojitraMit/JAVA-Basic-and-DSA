import java.util.Scanner;

public class ArrangeNumberInArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter cases = ");
        int t = s.nextInt();

        for (int i = 1; i <= t; i++) {
            System.out.print("Enter total numbers = ");
            int n = s.nextInt();
            System.out.print("Your elements = ");
                int p = 1;
                while (p <= n) {
                    if (p % 2 != 0) {
                        System.out.print(p+" ");
                    }
                    p++;
                }
                p--;
                while (p >0) {
                    if (p % 2 == 0) {
                        System.out.print(p+" ");
                    }
                    p--;
                }
                System.out.println();
        }
    }
}
