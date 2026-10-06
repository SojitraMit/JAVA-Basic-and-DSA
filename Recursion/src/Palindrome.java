import java.util.Scanner;

public class Palindrome {

    public static boolean check(String str,int start,int end){
        if(start>=end){
            return true;
        }
        if(str.charAt(start) != str.charAt(end)){
            return false;
        }

        boolean smallAns=check(str,start+1,end-1);
        return smallAns;
    }


    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter string : ");
        String str=s.nextLine();
        int length=str.length();
        boolean ans=check(str,0,length-1);
        System.out.print(ans);
    }
}
