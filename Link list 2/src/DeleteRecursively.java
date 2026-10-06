import java.util.Scanner;

public class DeleteRecursively {
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

    public static Node<Integer> delete(Node<Integer> head,int ele){
        if(head==null){
            return head;
        }

        if(head.data==ele){

            return head.next;
        }

        head.next=delete(head.next,ele);
        return head;
    }

    public static void main(String[] args){
        Node<Integer> head=takeInput();
        head=delete(head,2);
        print(head);

    }
}
