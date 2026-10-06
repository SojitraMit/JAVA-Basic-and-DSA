import java.net.InetAddress;

public class stackUsingLL<T> {
    private Node<T> head;
    private int size;

    public stackUsingLL(){
        head=null;
        size=0;
    }

    int size(){
        return size;
    }

    T top() throws stackEmptyException {
        if(size==0){
            stackEmptyException e=new stackEmptyException();
            throw e;
            //  throw new stackEmptyException();
        }
        return head.data;
    }

    boolean isEmpty(){
        return (size==0);  //head == null;
    }

    void push(T ele){
        Node<T> newNode=new Node<>(ele);
        newNode.next=head;
        head= newNode;
        size++;
    }

    T pop() throws stackEmptyException{
        if(size==0){
            stackEmptyException e=new stackEmptyException();
            throw e;
        }

        T temp=head.data;
        head=head.next;
        size--;
        return temp;
    }
}
