import java.util.Scanner;

public class InsertRecursively {
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

    public static Node<Integer> insert(Node<Integer> head,int pos,int ele){
        if(pos==0){
            Node<Integer> newNode=new Node<>(ele);
            newNode.next=head;

            return newNode;
        }

        if(head==null){
            return head;
        }

        head.next=insert(head.next,pos-1,ele);
        return head;
    }

    public static void main(String[] args){
        Node<Integer> head=takeInput();
        head=insert(head,4,6);
        print(head);

    }
}
