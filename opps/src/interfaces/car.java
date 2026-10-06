package interfaces;

public class car extends Vehicle implements VehicleInterface{
    public int speed(){
        return 15;
    }
    public int gear(){
        return 4;
    }
}
