public class AllSubstring {
    public static void print(String a) {
        for (int i = 0; i < a.length() ; i++) {
            for (int j = i; j < a.length(); j++) {
                System.out.println(a.substring(i, j + 1));
            }
        }
    }

    public static void main(String[] args) {
        String str = "xyz";
        print(str);
    }
}
