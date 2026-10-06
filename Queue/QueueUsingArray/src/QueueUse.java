public class QueueUse {
    public static void main(String args[]) throws QueueFullException, QueueEmptyException {
        QueueUsingArray queue=new QueueUsingArray();

        for(int i=0;i<71;i++){
            queue.enqueue(i);
        }

        while (!queue.isEmpty()){
            System.out.println(queue.dequeue());
        }
    }
}
