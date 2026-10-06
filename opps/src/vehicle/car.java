package vehicle;

public abstract class car extends Vehicle {
    int gearNum;
    int seatNum;
//    public car(){
//        super(100);
//    }
    public car(int g,int m){
        super(m);
        gearNum=g;
        System.out.println("car contrast");
    }

    public void print(){
        System.out.println(gearNum);
        super.print();
    }
    public boolean isMotorized(){
        return false;
    }
    public abstract String getCompany();
}
