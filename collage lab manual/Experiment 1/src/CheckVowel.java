import java.util.Scanner;

public class CheckVowel {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter letter");
        String a=s.next();

        String s1="aeiouAEIOU";

        if(s1.contains(a)){
            System.out.println("latter is vowel");
        }
        else{
            System.out.println("latter is constant");
        }


    }
}
