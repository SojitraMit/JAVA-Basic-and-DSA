public class ReplaceCharacter {
    public static String replace(String str, char oldChar, char newChar) {
        if (str.length() == 0) {
            return "";
        }

        // Get the small answer for the substring
        String smallAns = replace(str.substring(1), oldChar, newChar);

        // If the first character matches oldChar, replace it with newChar
        if (str.charAt(0) == oldChar) {
            return newChar + smallAns;
        } else {
            return str.charAt(0) + smallAns;
        }
    }

    public static void main(String[] args) {
        String str = "abahjsaka";
        char oldChar = 'a';
        char newChar = 'x';
        String ans = replace(str, oldChar, newChar);
        System.out.print(ans);
    }
}
