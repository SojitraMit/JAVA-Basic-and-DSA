package Generics;

public class Pair<T1,T2> {
    public T1 first;
    public T2 second;

    public Pair(T1 x,T2 y){
        first=x;
        second=y;
    }

    public void setFirst(T1 a){
        first=a;
    }

    public void setSecond(T2 b){
        second=b;
    }

    public T1 getFirst(){
        return first;
    }

    public T2 getSecond(){
        return second;
    }
}
