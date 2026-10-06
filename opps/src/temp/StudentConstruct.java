package temp;
import classes_and_objects.Construct;

public class StudentConstruct {
    public static void main(String[] args){
        Construct s1=new Construct("abc",10);
        Construct s2=new Construct("aabc",110);
        s1.print();
        System.out.println();
        s2.print();
        System.out.println();
        System.out.println(Construct.getstudentnum());
    }
}
