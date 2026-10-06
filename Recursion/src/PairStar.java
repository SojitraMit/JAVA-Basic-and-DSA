import java.util.Scanner;

public class PairStar {
    public static String pair(String str, int start) {
        if (start >= str.length() - 1) {
            return str;
        }

        if (str.charAt(start) == str.charAt(start+1) ) {
            str = str.substring(0, start+1) + "*" + str.substring(start + 1);
            start += 2;
        } else {
            start++;
        }

        // Recursively process the remaining string
        return pair(str, start);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = s.nextLine();
        String ans = pair(str, 0);
        System.out.print("Modified string: " + ans);
    }
}
