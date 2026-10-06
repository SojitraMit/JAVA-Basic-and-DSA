import java.util.Scanner;

public class ReplacePi {
    public static String pi(String str, int start) {
        // Base case: If we reach the end of the string, return the string
        if (start >= str.length() - 1) {
            return str;
        }

        // If we find "pi" at the current position, replace it with "3.14"
        if (str.charAt(start) == 'p' && str.charAt(start + 1) == 'i') {
            str = str.substring(0, start) + "3.14" + str.substring(start + 2);
            start += 4;  // Move past the newly added "3.14"
        } else {
            start++;
        }

        // Recursively process the remaining string
        return pi(str, start);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = s.nextLine();
        String ans = pi(str, 0);
        System.out.print("Modified string: " + ans);
    }
}
