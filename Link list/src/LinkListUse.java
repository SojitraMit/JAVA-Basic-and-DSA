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

    public static Node<Integer> delete(Node<Integer> head,int pos){

        if(pos==0){
            head=head.next;
            return head;
        }

        Node<Integer> temp=head;
        int i=0;
        while(i<pos-1){
            temp=temp.next;
            i++;
        }

        if(temp.next==null){
            System.out.println("deletion is not possible ");
            return head;
        }
        temp.next=temp.next.next;

        return head;
    }

    public static Node<Integer> insert(Node<Integer> head,int data,int pos){
        Node<Integer> newNode=new Node<>(data);

        if(pos==0){
            newNode.next=head;
            return newNode;
        }

        Node<Integer> temp=head;
        int i=0;
        while(i<pos-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;

        return head;
    }

    public static void main(String[] args){
        Node<Integer> head=takeInput();
        //head=insert(head,80,3);
        head=delete(head,4);
        print(head);

    }
}
