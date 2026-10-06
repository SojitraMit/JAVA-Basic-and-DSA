import java.util.Scanner;
public class Add2Num {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String str=scan.nextLine();
        System.out.println(str);

        char c=str.charAt(5);
        System.out.println(c);

        int i=scan.nextInt();
        int j=scan.nextInt();

        //float f=scan.nextFloat();

        int sum=i+j;
        System.out.println(sum);

    }
}
