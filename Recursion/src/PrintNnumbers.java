import java.util.Scanner;

public class PrintNnumbers {

    public static void print(int n){
        if (n < 1) {
            return;            // Base case: do nothing if n is less than 1
        }
        print(n - 1);          // Recursive call with n-1
        System.out.print(n+" "); // Print the number after the recursive call
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n;
        System.out.print("enter number : ");
        n=s.nextInt();
        print(n);
    }
}
