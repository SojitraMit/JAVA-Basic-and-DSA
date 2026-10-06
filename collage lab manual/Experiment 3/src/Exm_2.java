import org.w3c.dom.ls.LSOutput;

//Design a class named Rectangle to represent a rectangle. The class contains: Two double data fields named
//width and height that specify the width and height of the rectangle. The default values are 1 for both
//width and height.

//A no-arg constructor that creates a default rectangle.
//A constructor that creates a rectangle with the specified width and height.
//A method named getArea() that returns the area of this rectangle.
//A method named getPerimeter() that returns the perimeter.

//Write a test program that creates two Rectangle objects—one with width 4 and height 40 and the other with
// width 3.5 and height 35.9. Display the width, height, area, and perimeter of each rectangle in this
// order.

class Rectangle{
    double width;
    double height;

    public Rectangle(){
        width=1;
        height=1;
    }

    public Rectangle(double w,double h){
        width=w;
        height=h;
    }

    public double getArea(){
        return (width*height);
    }

    public double getPerimeter(){
        return 2*(width+height);
    }
}

public class Exm_2 {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(4,40);
        Rectangle r2=new Rectangle(3.5,35.9);

        System.out.println("For Rectangle 1");
        System.out.println("Width="+r1.width);
        System.out.println("height="+r1.height);
        System.out.println("area="+r1.getArea());
        System.out.println("perimeter="+r1.getPerimeter());
        System.out.println();

        System.out.println("For Rectangle 2");
        System.out.println("Width="+r2.width);
        System.out.println("height="+r2.height);
        System.out.println("area="+r2.getArea());
        System.out.println("perimeter="+r2.getPerimeter());
    }


}
