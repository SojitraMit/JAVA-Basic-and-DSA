import java.util.Scanner;

public class Doubly {
    public static void print(Node<Integer> head){

        if(head==null){
            System.out.print("null");
        }
        else {
            while (head!= null){
                System.out.print(head.data + " ");
                head = head.next;
            }
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

        return head;
    }

    public static Node<Integer> insertAtFirst(Node<Integer> head , int ele){
        Node<Integer> newNode=new Node<>(ele);

        newNode.next=head;
        head.prev=newNode;

        return newNode;
    }

    public static Node<Integer> insertAtLast(Node<Integer> head , int ele){
        Node<Integer> newNode=new Node<>(ele);
        Node<Integer> temp=head;

        while(temp.next != null){
            temp=temp.next;
        }

        newNode.prev=temp;
        temp.next=newNode;

        return head;
    }

    public static Node<Integer> deletionAtFirst(Node<Integer> head ){

        if(head.next==null || head==null){
            return null;
        }

        head=head.next;
        head.prev=null;

        return head;
    }

    public static Node<Integer> deletionAtLast(Node<Integer> head ){

        if(head.next==null || head==null){
            return null;
        }

        Node<Integer> temp=head;
        while (temp.next.next != null){
            temp=temp.next;
        }

        temp.next=null;

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
