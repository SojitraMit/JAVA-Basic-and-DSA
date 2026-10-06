import java.util.Scanner;

public class Diamond {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int mid = n / 2;

        // Loop to print the upper part including the middle row
        for(int i = 0; i <= mid; i++){
            // Print leading spaces
            for(int j = 0; j < mid - i; j++){
                System.out.print(" ");
            }
            // Print stars
            for(int k = 0; k < 2 * i + 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Loop to print the lower part
        for(int i = mid - 1; i >= 0; i--){
            // Print leading spaces
            for(int j = 0; j < mid - i; j++){
                System.out.print(" ");
            }
            // Print stars
            for(int k = 0; k < 2 * i + 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
