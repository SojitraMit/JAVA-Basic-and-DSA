public class Print_Subsequences {

    // O(2^n)
    public static void printSubsequences(String str) {

        printSubsequences(str,"");

    }
    private static void printSubsequences(String str,String output) {

        if(str.length()==0) {
            System.out.println(output);
            return ;
        }
        printSubsequences(str.substring(1), output + str.charAt(0));
        printSubsequences(str.substring(1), output);


    }

    public static void main(String[] args) {
        printSubsequences("xyz");
    }

}

