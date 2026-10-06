package Generics;

public class PairUse {
    public static void main(String[] args){
        Pair<Integer,String> p=new Pair<>(4,"a");

        System.out.println(p.getFirst());
        System.out.println(p.getSecond());

        Pair<Integer,Integer> internal=new Pair<>(1,2);
        Pair<Pair<Integer,Integer>,Integer> p2= new Pair<>(internal,3);

        System.out.println(p2.getFirst().getFirst());
        System.out.println(p2.getFirst().getSecond());
        System.out.println(p2.getSecond());
    }
}
