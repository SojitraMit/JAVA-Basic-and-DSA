import java.util.Scanner;

public class LinkListUse {
    public static void print(Node<Integer> head){

        while(head != null){
            System.out.print(head.data+" ");
            head=head.next;
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
                tail=newNode; //tail=tail.next;
            }
            data=s.nextInt();
        }
        return head;
    }

    public static int MidPoint(Node<Integer> head){
        Node<Integer> slow=head;
        Node<Integer> fast=head;

        while(fast.next != null && fast.next.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow.data;
    }

    // TIME COMPLEXITY = O(n^2)
    public static Node<Integer> Reverse(Node<Integer> head){
        if(head==null || head.next==null){
            return head;
        }

        Node<Integer> finalHead=Reverse(head.next);
        Node<Integer> temp=finalHead;

        while(temp.next != null){
            temp=temp.next;
        }

        temp.next=head;
        head.next=null;

        return finalHead;
    }


    public static void main(String[] args){
        Node<Integer> head=takeInput();
//        int ans=MidPoint(head);
//        System.out.print(ans);
        head=Reverse(head);
        print(head);

    }
}
