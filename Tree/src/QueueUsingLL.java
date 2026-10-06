public class QueueUsingLL<T> {
    private Node<T> front;
    private Node<T> rear;
    int size;

    public QueueUsingLL(){
        front=null;
        rear=null;
        size=0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return (size==0);
    }

    public T front() throws QueueEmptyException{
        if(size==0){
            throw  new QueueEmptyException();
        }

        return front.data;
    }

    public void enqueue(T ele){
        Node<T> newNode=new Node<>(ele);

        if(size==0){
            front=rear=newNode;
            size++;
            return;
        }

        rear.next=newNode;
        rear=rear.next;
        size++;
    }

    public T dequeue() throws QueueEmptyException {
        if(size==0){
            throw  new QueueEmptyException();
        }

        T temp=front.data;
        front=front.next;
        size--;

        if(size==0){
            rear=null;
        }

        return temp;
    }
}
