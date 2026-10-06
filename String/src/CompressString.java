//WRONG
import java.util.Scanner;

public class CompressString {
    public static String compress(String str){
        int size=str.length();

        for(int i=0;i<size-1;i++){
            int count =1;
            for(int j=i+1;j<size;j++){
                if(str.charAt(i)==str.charAt(j)){
                    str=str.substring(0,j)+str.substring(j+1);
                    size--;
                    j--;
                    count++;
                }
                else break;
            }
            if(count == 1) str=str.substring(0);
            else {
                size++;
                i++;
                str=str.substring(0,i+1) + count +str.substring(i+2);
            }
        }
        return str;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        compress(str);
        System.out.print(compress(str));
    }
}
