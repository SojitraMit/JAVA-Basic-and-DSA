import java.util.Scanner;

public class removecharacter {
    public static String function(String x,char a){
        int n = x.length();
        for(int i=0; i<n; i++){
            if(x.charAt(i) == a){
                x = x.substring(0, i) + x.substring(i+1);
                i--;
                n--;
            }
        }
        return x;
    }

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter string : ");
        String x = s.nextLine();
        System.out.print("Enter removing character : ");
        char a = s.nextLine().charAt(0);
        function(x,a);
        System.out.println(function(x,a));
    }
}

