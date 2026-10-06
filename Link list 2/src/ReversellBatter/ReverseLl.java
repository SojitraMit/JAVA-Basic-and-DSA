//                              TIME COMPLEXITY = O(n^2)

package ReversellBatter;

import java.util.Scanner;

public class ReverseLl {
    public static void print(Node<Integer> head){

        while(head != null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }

    public static Node<Integer> takeInput(){
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

    public static DoubleNode Reverse2(Node<Integer> head){
        if(head.next==null || head==null){
            DoubleNode Ans=new DoubleNode();
            Ans.head=head;
            Ans.tail=head;

            return Ans;
        }

        DoubleNode FinalHead=Reverse2(head.next);
        FinalHead.tail.next=head;
        FinalHead.tail=head;
        FinalHead.tail.next=null;  //head.next = null;

        return FinalHead;
    }

    public static Node<Integer> Reverse3(Node<Integer> head){
        if(head.next==null || head==null){
            return head;
        }

        Node<Integer> reversedTail=head.next;
        Node<Integer> FinalHead=Reverse3(head.next);

        reversedTail.next=head;
        head.next=null;

        return FinalHead;
    }



    public static void main(String[] args){
        Node<Integer> head=takeInput();
//        DoubleNode Ans=Reverse2(head);
//        print(Ans.head);

        head=Reverse3(head);
        print(head);

    }
}
