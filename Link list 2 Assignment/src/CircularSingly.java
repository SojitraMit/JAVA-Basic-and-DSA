import java.util.Scanner;

public class CircularSingly {
    public static void print(SNode<Integer> head){
        SNode<Integer> temp = head;

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

    public static  SNode<Integer> takeInput(){
        SNode<Integer> head=null , tail=null;
        Scanner s=new Scanner(System.in);
        int data=s.nextInt();

        while (data != -1){
            SNode<Integer> newNode=new SNode<>(data);
            if(head==null){
                head=newNode;
                tail=newNode;
            }
            else{
//                SNode<Integer> temp=head;
//                while(temp.next != null){
//                    temp=temp.next;
//                }
//                temp.next=newNode;
                tail.next=newNode;
                tail=newNode; //tail=tail.next;
            }
            data=s.nextInt();
        }
        tail.next=head;
        return head;
    }

    public static SNode<Integer> insertAtFirst(SNode<Integer> head , int ele){
        SNode<Integer> newNode=new SNode<>(ele);
        SNode<Integer> temp=head;

        while (temp.next != head){
            temp=temp.next;
        }

        temp.next=newNode;
        newNode.next=head;

        return newNode;
    }

    public static SNode<Integer> insertAtLast(SNode<Integer> head , int ele){
        SNode<Integer> newNode=new SNode<>(ele);
        SNode<Integer> temp=head;

        while (temp.next != head){
            temp=temp.next;
        }

        temp.next=newNode;
        newNode.next=head;

        return head;
    }

    public static SNode<Integer> deletionAtFirst(SNode<Integer> head ){

        if(head.next==head || head==null){
            return null;
        }

        SNode<Integer> temp=head;

        while (temp.next != head){
            temp=temp.next;
        }

        temp.next=head.next;
        head=head.next;

        return head;
    }

    public static SNode<Integer> deletionAtLast(SNode<Integer> head ){

        if(head.next==head || head==null){
            return null;
        }

        SNode<Integer> temp=head;

        while (temp.next.next != head){
            temp=temp.next;
        }

        temp.next=head;

        return head;
    }

    public static void main(String args[]){
        SNode<Integer> head=takeInput();
        //head=insertAtFirst(head,5);
        //head=insertAtLast(head,5);
        //head=deletionAtFirst(head);
        head=deletionAtLast(head);
        print(head);
    }
}
