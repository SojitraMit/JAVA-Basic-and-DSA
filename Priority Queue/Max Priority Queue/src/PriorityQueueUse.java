public class PriorityQueueUse {
    public static void main(String[] args) throws PriorityQueueEmptyException {
        PriorityQueue pq=new PriorityQueue();
        int[] arr={1,2,3,4,5};

        for(int i=0;i<5;i++){
            pq.insert(arr[i]);
        }

        while (!pq.isEmpty()){
            System.out.println(pq.removeMax());
        }
    }
}
