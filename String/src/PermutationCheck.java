import java.util.Scanner;

public class PermutationCheck {
    public static boolean check(String a , String b  ){
        if(a.length() != b.length()) return false;

        for(int i=0;i<a.length();i++){
            boolean find=false;
            for(int j=0;j<b.length();j++){
                if(a.charAt(i) == b.charAt(j)){
                    find=true;
                    break;
                }
            }
            if(!find) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter string1 : ");
        String str1=s.nextLine();
        System.out.print("Enter string2 : ");
        String str2=s.nextLine();

        boolean ans=check(str1 , str2);
        System.out.print(ans);
    }
}
