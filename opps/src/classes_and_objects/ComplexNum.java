package classes_and_objects;

import java.net.CookieHandler;

public class ComplexNum {
    private int real;
    private int imaginary;

    public ComplexNum(int r, int i){
        real =r;
        imaginary=i;

    }

    public void print(){
        if(imaginary<0){
            System.out.println(real+" - "+(-1)*imaginary+"i");
        }
        else {
            System.out.println(real + " + " + imaginary +"i");
        }
    }

    public int getImaginary(){
        return imaginary;
    }
    public int getReal(){
        return real;
    }

    public void setReal(int r){
        real =r;
    }
    public void setImaginary(int i){
        imaginary=i;
    }

    public void add(ComplexNum c2){
        real=real+c2.real;
        imaginary=c2.imaginary;
    }
    public void multiply(ComplexNum c2){
        int real1=(real*c2.real)-(imaginary* c2.imaginary);
        int imaginary1=(real*c2.imaginary)+(imaginary* c2.real);
        real=real1;
        imaginary=imaginary1;
    }

    public ComplexNum conjugate(){
        imaginary=(-1)*imaginary;
        ComplexNum c=new ComplexNum(real,imaginary);
        return c;
    }
    public static ComplexNum add(ComplexNum c1,ComplexNum c3){
        int newReal =c1.real+c3.real;
        int newImaginary=c1.imaginary+c3.imaginary;
        ComplexNum c=new ComplexNum(newReal,newImaginary);
        return c;
    }

}
