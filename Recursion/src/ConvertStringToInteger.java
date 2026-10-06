import java.util.Scanner;
//convert string to integer
// str="1234" To integer=1234
public class ConvertStringToInteger {
    public static int X(String str,int start,int num){
        num=(num*10) + (str.charAt(start)-48);

        if(start==str.length()-1){
            return num;
        }

        return X(str,start+1,num);
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter string : ");
        String str=s.nextLine();
        int ans=X(str,0,0);
        System.out.print("Integer : "+ans);
    }
}
