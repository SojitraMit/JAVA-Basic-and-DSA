import java.util.Scanner;

public class FindRecursively {
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

    public static int Find(Node<Integer> head , int ele){
        if(head==null){
            return -1;
        }

        if(head.data==ele){
            return 0;
        }

        int smallAns=Find(head.next,ele);
        if(smallAns==-1){
            return -1;
        }

        return 1+smallAns;
    }

    public static void main(String[] args){
        Node<Integer> head=takeInput();
        System.out.println("index = "+Find(head,2));
        print(head);

    }
}
