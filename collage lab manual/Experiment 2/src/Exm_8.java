import java.util.Scanner;
//Some websites impose certain rules for passwords. Write a method that checks whether a string is a valid
//password. Suppose the password rules are as follows: A password must have at least eight characters.
//A password consists of only letters and digits. A password must contain at least two digits.
//Write a program that prompts the user to enter a password and displays Valid Password if the rules are
//followed or Invalid Password otherwise.
public class Exm_8 {

    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        int digitCount = 0;
        for (char ch : password.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }
            if (Character.isDigit(ch)) {
                digitCount++;
            }
        }

        return digitCount >= 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }

    }


}
