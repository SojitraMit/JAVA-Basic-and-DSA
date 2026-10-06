import java.util.Scanner;

public class Relational {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        int j = s.nextInt();

        boolean eql = (i == j);
        System.out.print(eql);
    }
}
