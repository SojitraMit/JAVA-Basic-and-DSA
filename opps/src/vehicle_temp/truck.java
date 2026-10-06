package vehicle_temp;

import vehicle.Vehicle;

public class truck extends Vehicle {
    int weight;

    public truck(int m) {
        super(m);
    }
    public boolean isMotorized(){
        return false;
    }

    public void print(){
        System.out.println(getMaxSpeed());
        System.out.println(color);
    }
}
