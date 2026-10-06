package classes_and_objects;

public class Construct {
    public String name;
    private int rollnumber;
    //final rollnumber is permnate
    //private final int rollnumber;
    private static int numstudent;
    public Construct(String name,int n){
        this.name = name;
        rollnumber =n;
        numstudent++;
    }
    public static int getstudentnum(){
        return numstudent;
    }

    public void print(){
        System.out.print(name+":"+rollnumber);
    }
}



