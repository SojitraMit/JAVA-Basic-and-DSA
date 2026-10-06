import java.util.LinkedHashSet;
import java.util.Scanner;

public class CircularDoubly {

    public static void print(Node<Integer> head){
        Node<Integer> temp = head;

        if(head==null){
            System.out.print("null");
        }
        else {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
        }
    }

    public static  Node<Integer> takeInput(){
        Node<Integer> head=null , tail=null;
        Scanner s=new Scanner(System.in);
        int data=s.nextInt();

        while (data != -1){
            Node<Integer> newNode=new Node<>(data);
            if(head==null){
                head=newNode;
                tail=newNode;
            }
            else{
//                Node<Integer> temp=head;
//                while(temp.next != null){
//                    temp=temp.next;
//                }
//                temp.next=newNode;
                tail.next=newNode;
                newNode.prev=tail;
                tail=newNode; //tail=tail.next;
            }
            data=s.nextInt();
        }
        tail.next=head;
        head.prev=tail;
        return head;
    }

    public static Node<Integer> insertAtFirst(Node<Integer> head , int ele){
        Node<Integer> newNode=new Node<>(ele);

        newNode.next=head;
        newNode.prev=head.prev;
        head.prev.next=newNode;
        head.prev=newNode;

        return newNode;
    }

    public static Node<Integer> insertAtLast(Node<Integer> head , int ele){
        Node<Integer> newNode=new Node<>(ele);

        newNode.next=head;
        newNode.prev=head.prev;
        head.prev.next=newNode;
        head.prev=newNode;

        return head;
    }

    public static Node<Integer> deletionAtFirst(Node<Integer> head ){

        if(head.next==head || head==null){
            return null;
        }

        Node<Integer> prev=head.prev;
        prev.next=head.next;
        head=head.next;
        head.prev=prev;

        return head;
    }

    public static Node<Integer> deletionAtLast(Node<Integer> head ){

        if(head.next==head || head==null){
            return null;
        }

        Node<Integer> prev=head.prev.prev;
        prev.next=head;
        head.prev=prev;

        return head;
    }

    public static void main(String args[]){
        Node<Integer> head=takeInput();
        //head=insertAtFirst(head,5);
        //head=insertAtLast(head,5);
        //head=deletionAtFirst(head);
        head=deletionAtLast(head);
        print(head);
    }
}
