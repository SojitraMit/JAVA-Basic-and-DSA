package classes_and_objects;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int n , int d){
        numerator=n;
        if(d==0){
            //ERROR
        }
        denominator=d;
        specify();
    }

    public void print(){
        if(denominator==1){
            System.out.println((numerator));
        }
        else{
            System.out.println(numerator+"/"+denominator);
        }
    }

    private void specify(){
        int gcd=1;
        int smaller =Math.min(numerator,denominator);
        for(int i=2;i<=smaller;i++){
            if(numerator%i==0 && denominator%i==0){
                gcd=i;
            }
        }
        numerator=numerator/gcd;
        denominator=denominator/gcd;
    }

    public int getNumerator(){
        return numerator;
    }
    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int n){
        numerator=n;
        specify();
    }
    public void setDenominator(int d){
        if(d==0){
            return;
        }
        denominator=d;
        specify();
    }

    public static Fraction add(Fraction f1,Fraction f2){
        int newNum = f1.numerator*f2.denominator + f2.numerator*f1.denominator;
        int newDen = f1.denominator*f2.denominator;
        Fraction f=new Fraction(newNum,newDen);
        return f;
    }

    public void add(Fraction f2){
        numerator=numerator*f2.denominator + f2.numerator*denominator;
        denominator=denominator*f2.denominator;
        specify();
    }
    public void multiply(Fraction f2){
        numerator=numerator*f2.numerator;
        denominator=denominator*f2.denominator;
        specify();
    }
}
