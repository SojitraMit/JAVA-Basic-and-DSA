public class SNode<T> {
    T data;
    SNode<T> next;

    SNode(T data){
        this.data=data;
        next=null;
    }
}
