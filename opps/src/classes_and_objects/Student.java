package classes_and_objects;

public class Student {
    public String name;
    private int rollnumber;

    public void setrollnumber(int rn){
        if(rn<=0) return;
        rollnumber =rn;
    }
    public int getrollnumber(){
        return rollnumber;
    }
}
