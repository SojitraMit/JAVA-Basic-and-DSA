import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int esum = 0;
        int osum = 0;

        while (n > 0) {
            int ld = n % 10;
            n /= 10;
            if (ld % 2 == 0) {
                esum = esum + ld;
            } else {
                osum = osum + ld;
            }
        }
        System.out.println("even sum =" + esum);
        System.out.println("odd sum =" + osum);
    }
}
