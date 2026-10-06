import java.util.Scanner;

public class RemoveX {
    public static String X(String str,int start){
        if(str.charAt(start)=='x'){
            str=str.substring(0,start)+str.substring(start+1);
            start--;
        }
        if(start==str.length()-1){
            return str;
        }

        return X(str,start+1);
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter string : ");
        String str=s.nextLine();
        String ans=X(str,0);
        System.out.print(ans);
    }
}