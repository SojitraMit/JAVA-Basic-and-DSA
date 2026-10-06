public class PriorityQueueUse {
    public static void main(String[] args) throws PriorityQueueEmptyException {
        PriorityQueue pq=new PriorityQueue();
        int[] arr={5,4,3,2,1};

        for(int i=0;i<5;i++){
            pq.insert(arr[i]);
        }

        while (!pq.isEmpty()){
            System.out.println(pq.removeMin());
        }
    }
}
