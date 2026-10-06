import java.util.Scanner;

public class Assignment {
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

    public static int FindNode(Node<Integer> head , int num){
        int pos=0;

        while (head.data != num && head.next != null){
            head=head.next;
            pos++;
        }

        if(head.data == num){
            return pos;
        }
        else{
            return -1;
        }
    }

    public static Node<Integer> AppendLastNToFirst(Node<Integer> head , int n){
        if(head==null || n==0){
            return head;
        }

        Node<Integer> temp=head;
        int length=0;
        while(temp != null){
            temp=temp.next;
            length++;
        }

        if(length==n){
            return head;
        }
        if(n>length){
            n=n-length;
        }

        int skip=length - n ;
        Node<Integer> current=head;
        Node<Integer> prev=null;

        for(int i=1;i<=skip;i++){
            prev=current;
            current=current.next;
        }

        prev.next=null;
        Node<Integer> newHead=current;

        while(current.next != null){
            current=current.next;
        }

        current.next=head;

        return newHead;
    }

    public static Node<Integer> EliminateDuplicates(Node<Integer> head){
        Node<Integer> temp=head;

        while(temp.next != null){
            if(temp.data == temp.next.data){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }

        return head;
    }

    public static void ReversPrint(Node<Integer> head){
        if(head==null){
            return;
        }

        ReversPrint(head.next);
        System.out.print(head.data + " ");
    }

    public static void main(String[] args){
        Node<Integer> head=takeInput();
        //int pos=FindNode(head,20);
        //System.out.println(pos);
        //head = AppendLastNToFirst(head, 5);
        //head=EliminateDuplicates(head);
        //ReversPrint(head);
        print(head);

    }
}
