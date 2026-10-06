import java.util.Scanner;

public class CountWords {
    public static void print(String a){
        int size=a.length();
        int count=1;

        if(size==0){
            count=0;
        }
        else {
            for (int i = 0; i < size; i++) {
                if (a.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        System.out.print("Total words in sentence = "+count);
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a sentence :");
        String str=s.nextLine();
        print(str);
    }
}
