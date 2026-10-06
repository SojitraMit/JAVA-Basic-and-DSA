import java.util.Scanner;

public class RemoveDuplicate {
    public static String Duplicate(String str){
        int size=str.length();

        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                if(str.charAt(i)==str.charAt(j)){
                    str=str.substring(0,j)+str.substring(j+1);
                    j--;
                    size--;
                }
                else break;
            }
        }
        return str;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        Duplicate(str);
        System.out.print(Duplicate(str));
    }
}
