import java.util.Scanner;

public class AvarageMarks {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("please ,enter the name of student");
        char name = s.nextLine().charAt(0);

        System.out.println("enter the mark of sub1");
        int sub1=s.nextInt();

        System.out.println("enter the mark of sub2");
        int sub2=s.nextInt();

        System.out.println("enter the mark of sub3");
        int sub3=s.nextInt();
        int avg=(sub2+sub1+sub3)/3;
        System.out.println("the average mark of student "+name +" :"+avg);
    }

}
