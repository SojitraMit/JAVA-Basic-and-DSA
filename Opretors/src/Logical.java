import java.util.Scanner;
public class Logical {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        boolean large = (a>b) && (a>c);

        System.out.println(large);
        System.out.println((a>b) || (a>c));
        System.out.println(!(a>b));
    }
}
