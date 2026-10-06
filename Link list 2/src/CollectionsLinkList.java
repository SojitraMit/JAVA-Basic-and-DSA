import java.util.LinkedList;

public class CollectionsLinkList {
    public static void main(String args[]){
        LinkedList<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.addFirst(40);      
        list.add(8);

        System.out.println(list.size());
        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i) + " ");
        }
    }
}
