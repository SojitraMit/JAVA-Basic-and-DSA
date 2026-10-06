import java.util.Scanner;

public class CountZero {
    public static int check(int n,int count){
        if(n<1) {
            return count;
        }
        if(n%10==0){
            count++;
        }
        return check(n/10,count);
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n;
        System.out.print("enter number : ");
        n=s.nextInt();
        int count=0;

        int ans=check(n,count);
        System.out.print(ans);
    }
}
