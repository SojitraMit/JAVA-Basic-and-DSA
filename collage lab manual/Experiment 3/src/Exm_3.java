//Define a class called Cartesian Point, which has two instance variables, x and y. Provide the methods get X()
//and get Y() to return the values of the x and y values respectively, a method called move() which would take
//two integers as parameters and change the values of x and y respectively, a method called display() which would
//display the current values of x and y. Now overload the method move() to work with single parameter, which would
//set both x and y to the same values,provide constructors with two parameters and overload to work with one
//parameter as well. Now define a class called Test Cartesian Point, with the main method to test the various
//methods in the Cartesian Point class.
class Cartesian{
    int x;
    int y;

    Cartesian(int x,int y){
        this.x=x;
        this.y=y;
    }

    Cartesian(int x){
        this.x=x;
        y=x;
    }

    int getX(){
        return x;
    }

    int getY(){
        return y;
    }

    public void move(int x,int y){
        this.x=x;
        this.y=y;

        return;
    }

    void display(){
        System.out.println("x="+x);
        System.out.println("y="+y);
    }

    void move(int x){
        this.x=x;
        y=x;
    }


}

public class Exm_3 {
    public static void main(String[] args) {
        Cartesian c=new Cartesian(1,2);

    }

}
