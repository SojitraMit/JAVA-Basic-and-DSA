import java.util.ArrayList;

public class Basic {
    public static void main(String[] args){
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        System.out.println(list1.size());
        list1.add(10);
        list1.add(25);
        list1.add(29);
        list1.add(14);
        list1.add(2,20);
        System.out.println(list1.size());

        for(int i=0;i< list1.size();i++){
            System.out.print(list1.get(i)+" ");
        }
        System.out.println();
        for(int i : list1){
            System.out.print(i+" ");
        }
//        list1.remove(1);
//        list1.set(2,12);
//        for(int i=0;i< list1.size();i++){
//            System.out.print(list1.get(i)+" ");
//        }
    }
}
