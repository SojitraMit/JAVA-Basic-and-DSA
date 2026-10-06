import java.util.Scanner;

public class PalindromeString {
    public static boolean palindrome(String a){
        int size=a.length();

        for(int i=0,j=size-1;i<=j;i++,j--){
            if(a.charAt(i)==' ') i++;
            if(a.charAt(j)==' ') j--;

            if(a.charAt(i) != a.charAt(j)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a sentence :");
        String str=s.nextLine();
        boolean ans=palindrome(str);
        System.out.print(ans);
    }
}
