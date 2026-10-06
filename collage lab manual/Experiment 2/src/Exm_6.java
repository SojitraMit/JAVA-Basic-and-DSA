//Write a program that prompts the user to enter a string and displays the number of vowels and
// consonants in the string.

import java.util.Scanner;

public class Exm_6 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a string");
        String a=s.nextLine();

        String b="aeiouAEIOU";
        int vow=0;
        int con=0;
        for(int i=0;i<a.length();i++){
            String c=String.valueOf(a.charAt(i));
            if(b.contains(c)){
                vow++;
            }else{
                con++;
            }
        }

        System.out.print("vowel="+vow+"  constants="+con);
    }
}
