package vehicle;

public abstract   class  Vehicle {
    protected String color;
    private int maxSpeed;

    public Vehicle(int m){
        maxSpeed = m;
        System.out.println("vehicle contrast");
    }

    public void print(){
        System.out.println(color);
        System.out.println(maxSpeed);
    }

    public void setMaxSpeed(int speed){
        maxSpeed=speed;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }

    public abstract boolean isMotorized();
}
