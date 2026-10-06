import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class Pair{
    int value;
    int index;
}

public class BuyTicket {

    public  static int buyTicket(int[] arr,int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        Queue<Pair> queue=new LinkedList<>();

        for(int i=0;i< arr.length;i++){
            pq.add(arr[i]);

            Pair pair=new Pair();
            pair.value=arr[i];
            pair.index=i;
            queue.add(pair);
        }

        int count=0;
        while (!queue.isEmpty()){
            if(pq.peek()==queue.peek().value){
                pq.remove();
                Pair pair=queue.poll();
                count++;

                if(pair.index==k){
                    return count;
                }
            }
            else {
                queue.add(queue.poll());
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[]={2 ,3, 2, 2 ,4};
        System.out.println(buyTicket(arr,3));
    }

}
