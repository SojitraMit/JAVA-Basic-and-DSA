package temp;
import classes_and_objects.Student;

public class StudentUse2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "abc";
        s1.setrollnumber(-123);
        System.out.print(s1.getrollnumber());
    }
}
