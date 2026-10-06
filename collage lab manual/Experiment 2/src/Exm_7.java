import java.util.Scanner;

//	Write a program that prompts the user to enter two strings and displays the largest common prefix
//	of the two strings.
public class Exm_7 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter first string");
        String s1=s.nextLine();
        System.out.println("enter second string");
        String s2=s.nextLine();

        String ans= "";
        for(int i=0;i<s1.length()&&i<s2.length();i++){
            if(s1.charAt(i)==s2.charAt(i)){
                ans+=s1.charAt(i);
            }else{
                break;
            }
        }

        System.out.println("same prefix="+ans);
    }
}
