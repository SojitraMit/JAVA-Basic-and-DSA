import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.function.Predicate;

class MinPQComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1 < o2){
            return -1;
        }
        else if(o1>o2){
            return 1;
        }
        return 0;
    }
}

class MaxPQComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1 < o2){
            return 1;
        }
        else if(o1>o2){
            return -1;
        }
        return 0;
    }
}

class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        if(o1.length()<o2.length()){
            return -1;
        }
        else if(o1.length()>o2.length()){
            return 1;
        }
        return 0;
    }
}

public class PriorityQueueCollection {
    public static void main(String[] args) {
//        MaxPQComparator maxPQComparator=new MaxPQComparator();
//        PriorityQueue<Integer> pq=new PriorityQueue<>(maxPQComparator);
//        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
//        int arr[]={5,3,7,2,0};

        StringLengthComparator stringLengthComparator=new StringLengthComparator();
        PriorityQueue<String> pq=new PriorityQueue<>(stringLengthComparator);
        String arr[]={"queues","at","a","their","this"};

        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }

        while (!pq.isEmpty()){
            System.out.print(pq.remove()+"  ");
        }
    }
}
