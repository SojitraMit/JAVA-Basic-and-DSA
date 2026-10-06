public class QueueUse {
    public static void main(String args[]) throws QueueEmptyException {
        QueueUsingLL<Integer> queue=new QueueUsingLL<>();

        for(int i=0;i<7;i++){
            queue.enqueue(i);
        }

        while (!queue.isEmpty()){
            System.out.println(queue.dequeue());
        }
    }
}
