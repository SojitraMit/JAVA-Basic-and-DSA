import java.util.Scanner;

public class EvenAfterOdd {
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

    public static Node<Integer> evenAfterOdd(Node<Integer> head){
        Node<Integer> headOdd=null , headEven=null , tailOdd=null , tailEven = null;

        while (head != null) {
            if (head.data % 2 == 0) {
                if (headEven == null) {
                    headEven = head;
                    tailEven = head;
                }
                else{
                    tailEven.next=head;
                    tailEven=head;
                }
            }

            else{
                if(headOdd==null){
                    headOdd=head;
                    tailOdd=head;
                }
                else{
                    tailOdd.next=head;
                    tailOdd=head;
                }
            }
            head=head.next;
        }

        if(headEven==null){
            return headOdd;
        }
        if(headOdd==null){
            return headEven;
        }

        tailOdd.next=headEven;
        tailEven.next=null;

        return headOdd;
    }

    public static void main(String[] args){
        Node<Integer> head=takeInput();
        head=evenAfterOdd(head);
        print(head);

    }
}
